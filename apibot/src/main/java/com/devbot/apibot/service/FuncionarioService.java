package com.devbot.apibot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.devbot.apibot.model.Funcionario;
import com.devbot.apibot.repository.FuncionarioRepository;

@Service
@Validated
public class FuncionarioService {
    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioService(FuncionarioRepository funcionarioRepository) {
        this.funcionarioRepository = funcionarioRepository;
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();

    }

    public Funcionario salvar(Funcionario funcionario) {
        if (funcionarioRepository.findByCpf(funcionario.getCpf()).isPresent()) {
            throw new RuntimeException("CPF já cadastrado");
        }
        return funcionarioRepository.save(funcionario);
    }

    public Funcionario atualizar (Funcionario funcionario) {
        Funcionario funcionarioAtualizar = funcionarioRepository.findByCpf(funcionario.getCpf())
                .orElseThrow(() -> new IllegalArgumentException("Funcionário não encontrado"));

        funcionarioAtualizar.setNome(funcionario.getNome());
        funcionarioAtualizar.setCpf(funcionario.getCpf());
        funcionarioAtualizar.setRg(funcionario.getRg());
        funcionarioAtualizar.setMatricula(funcionario.getMatricula());
        funcionarioAtualizar.setDataNascimento(funcionario.getDataNascimento());
        funcionarioAtualizar.setSexo(funcionario.getSexo());
        funcionarioAtualizar.setSetor(funcionario.getSetor());
        funcionarioAtualizar.setSalario(funcionario.getSalario());
        funcionarioAtualizar.setTelefone(funcionario.getTelefone());
        funcionarioAtualizar.setEmail(funcionario.getEmail());
        funcionarioAtualizar.setEndereco(funcionario.getEndereco());


        return funcionarioRepository.save(funcionarioAtualizar);

    }


    public void excluir(String cpf) {
        Funcionario funcionario = funcionarioRepository.findByCpf(cpf)
                .orElseThrow(() -> new RuntimeException("Funcionário não encontrado"));
        funcionarioRepository.deleteById(funcionario.getId());

    }
    // Método Lambda
}
