package com.devbot.apibot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.devbot.apibot.model.Usuario;
import com.devbot.apibot.repository.UsuarioRepository;

@Service

public class UsuarioService {
    
        private final UsuarioRepository usuarioRepository;

        public UsuarioService(UsuarioRepository usuarioRepository) {
                this.usuarioRepository = usuarioRepository;
        }

        public Usuario salvar(Usuario usuario) {
                try {
                       return usuarioRepository.save(usuario);
                } catch (Exception error) {
                        throw new RuntimeException("Erro ao salvar usuário: " + error.getMessage());
                }
                
        }

        public List<Usuario> listar() {
                return usuarioRepository.findAll();
        }

        public Usuario atualizar(Usuario usuario) {
                try {
                        return usuarioRepository.save(usuario);
                } catch (Exception error) {
                        throw new RuntimeException("Erro ao atualizar usuário: " + error.getMessage());
                }
                
        }

        public void deletar(Long id) {
                usuarioRepository.deleteById(id);
        }

        public boolean existsById(Long id) {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'existsById'");
        }
}
