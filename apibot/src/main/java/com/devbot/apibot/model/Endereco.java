package com.devbot.apibot.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Table(name = "tab_endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo logradouro é obrigatório")
    private String logradouro;

    @NotBlank(message = "O campo número é obrigatório")
    private String numero;

    @NotBlank(message = "O campo complemento é obrigatório")
    private String complemento;

    @NotBlank(message = "O campo bairro é obrigatório")
    private String cep;

    @NotBlank(message = "O campo cidade é obrigatório")
    private String cidade;

    @NotBlank(message = "O campo uf é obrigatório")
    @Size(min = 2, max = 2, message = "O campo uf deve ter 2 caracteres")
    private String uf;
}
