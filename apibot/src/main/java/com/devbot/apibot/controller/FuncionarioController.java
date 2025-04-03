package com.devbot.apibot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devbot.apibot.model.Funcionario;
import com.devbot.apibot.service.FuncionarioService;

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
@RequestMapping("/funcionario")
public class FuncionarioController {
    
        private  FuncionarioService funcionarioService;

        public FuncionarioController(FuncionarioService funcionarioService){
            this.funcionarioService = funcionarioService;
        }



        @GetMapping
        public List<Funcionario> listarTodos(){
            return funcionarioService.listarFuncionarios();
        }

        @PostMapping
        public ResponseEntity<String> salvar(@Valid @RequestBody Funcionario funcionario){
            funcionarioService.salvar(funcionario);
            String mensagem = "Funcionário " + funcionario.getNome() + " cadastrado com sucesso";
            return ResponseEntity.status(HttpStatus.CREATED).body(mensagem);
        }

        @PutMapping("/{cpf}")
        public ResponseEntity<Funcionario> atualizar(@Valid @RequestBody Funcionario funcionario){
            funcionarioService.atualizar(funcionario);
            return ResponseEntity.ok().body(funcionario);
        }

        @DeleteMapping("/{cpf}")
        public ResponseEntity<String> excluir(@PathVariable String cpf){
            funcionarioService.excluir(cpf);
            String mensagem = "Funcionário com CPF " + cpf + " excluído com sucesso";
            return ResponseEntity.status(HttpStatus.OK).body(mensagem);
        }
        
}


