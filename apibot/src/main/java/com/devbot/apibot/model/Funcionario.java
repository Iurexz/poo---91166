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
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
@Table(name = "tab_funcionario")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome não pode estar em branco")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres")
    private String nome;

    @NotBlank(message = "O CPF não pode estar em branco")
    @Pattern(regexp = "\\d{11}", message = "O CPF deve conter exatamente 11 dígitos")
    private String cpf;

    @NotBlank(message = "O RG não pode estar em branco")
    @Size(min = 7, max = 20, message = "O RG deve ter entre 7 e 20 caracteres")
    private String rg;

    @NotBlank(message = "A matrícula não pode estar em branco")
    @Size(min = 5, max = 20, message = "A matrícula deve ter entre 5 e 20 caracteres")
    private String matricula;

    @NotBlank(message = "A data de nascimento não pode estar em branco")
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "A data de nascimento deve estar no formato YYYY-MM-DD")
    private String dataNascimento;

    @Enumerated(EnumType.STRING)
    private Sexo sexo;

    @Enumerated(EnumType.STRING)
    private Setor setor;

    private Double salario;

    @NotBlank(message = "O telefone não pode estar em branco")
    @Pattern(regexp = "\\d{10,15}", message = "O telefone deve conter entre 10 e 15 dígitos")
    private String telefone;

    @NotBlank(message = "O email não pode estar em branco")
    @Email(message = "O email deve ser válido")
    private String email;

    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;    
}
