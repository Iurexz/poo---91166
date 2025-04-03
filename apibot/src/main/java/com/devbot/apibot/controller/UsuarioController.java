package com.devbot.apibot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbot.apibot.model.Usuario;
import com.devbot.apibot.service.UsuarioService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;







@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    private  UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    
    
    @GetMapping
    public List<Usuario> listarTodos(){
        return usuarioService.listarUsuarios();
        
    }

   @PostMapping
    public ResponseEntity<String> salvar(@Valid @RequestBody Usuario usuario){
        usuarioService.salvar(usuario);
        String mensagem = "Usuário " + usuario.getNome() + " cadastrado com sucesso";
        return ResponseEntity.status(HttpStatus.CREATED).body(mensagem);
    }
    
    @PutMapping 
    public ResponseEntity<Usuario> atualizar(@Valid @RequestBody Usuario usuario){
        usuarioService.atualizar(usuario);
        return ResponseEntity.ok().body(usuario);
    }

    @DeleteMapping("/{email}")
    public ResponseEntity<String> excluir(@PathVariable String email){
        usuarioService.excluir(email);
        return ResponseEntity.ok().body("Usuário excluido com sucesso");
    }
   
}
