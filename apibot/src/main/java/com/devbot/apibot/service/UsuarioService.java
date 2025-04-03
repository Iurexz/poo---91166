package com.devbot.apibot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.devbot.apibot.model.Usuario;
import com.devbot.apibot.repository.UsuarioRepository;

import jakarta.validation.Valid;

@Service
@Validated
public class UsuarioService {
    
        private final UsuarioRepository usuarioRepository;

        public UsuarioService(UsuarioRepository usuarioRepository) {
            this.usuarioRepository = usuarioRepository;
        }

        public List<Usuario> listarUsuarios() {

            return usuarioRepository.findAll();
        }

        public Usuario salvar(@Valid Usuario usuario) {
                if (usuarioRepository.findByEmail(usuario.getEmail()).isPresent()) {
                    throw new RuntimeException("Email já cadastrado");
                }
            return usuarioRepository.save(usuario);
        }

        public Usuario atualizar(@Valid Usuario usuario) {
                Usuario usuarioAtualizar = usuarioRepository.findById(usuario.getId())
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));

                usuarioAtualizar.setNome(usuario.getNome());
                usuarioAtualizar.setEmail(usuario.getEmail());      
                usuarioAtualizar.setSenha(usuario.getSenha());
                
                return usuarioRepository.save(usuarioAtualizar);
                
        }




        public void excluir(String email) {
                Usuario usuario = usuarioRepository.findByEmail(email)
                        .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
                usuarioRepository.deleteById(usuario.getId());
                
        }
        
}
