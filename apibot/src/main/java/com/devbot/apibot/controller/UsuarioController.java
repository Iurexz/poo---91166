package com.devbot.apibot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbot.apibot.model.Usuario;
import com.devbot.apibot.service.UsuarioService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    private  UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    
    @PostMapping
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        usuarioService.salvar(usuario);
        return ResponseEntity.ok(usuarioService.salvar(usuario));
    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();
        
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
        return ResponseEntity.ok(usuarioService.atualizar(usuario));
    }

    // @PutMapping("/{id}")
    // public ResponseEntity<Usuario> atualizar(@PathVariable Long id, @RequestBody Usuario usuario){
    //     if(usuario.getId() != null && usuarioService.existsById(id)){
    //         return ResponseEntity.ok(usuarioService.atualizar(usuario));
    //     }else{
    //         return ResponseEntity.notFound().build();
    //     }
    
    // }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id){
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
