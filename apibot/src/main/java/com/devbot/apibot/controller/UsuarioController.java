package com.devbot.apibot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbot.apibot.model.Usuario;
import com.devbot.apibot.service.UsuarioService;

import jakarta.validation.Valid;

import java.util.List;

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
    public ResponseEntity<Usuario> salvar(@Valid @RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.salvar(usuario));
    }
    
    @PutMapping 
    public ResponseEntity<Usuario> atualizar(@Valid @RequestBody Usuario usuario){
        
    }

   
}
