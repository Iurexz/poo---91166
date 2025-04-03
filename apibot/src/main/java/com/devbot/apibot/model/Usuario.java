package com.devbot.apibot.model;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
@Table(name = "tab_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O campo nome é obrigatório")
    private String nome;  
    @NotBlank(message = "O campo email é obrigatório")
    @Email(message = "O campo email deve ser um email válido") 
    private String email;  
    @NotBlank(message = "O campo senha é obrigatório") 
    @Size(min = 3, message = "O campo senha deve ter no mínimo 3 caracteres")
    private String senha;


    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;    
    
}
