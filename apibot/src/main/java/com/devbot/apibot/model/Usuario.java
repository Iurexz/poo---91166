package com.devbot.apibot.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Entity
@Data
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
    
    
    
}
