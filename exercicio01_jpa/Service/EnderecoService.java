package com.example.exercicio01_jpa.Service;

import com.example.exercicio01_jpa.Entity.Endereco;
import com.example.exercicio01_jpa.Repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository enderecoRepository;

    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public Endereco buscarEndereco(Long id) {
        return enderecoRepository.findById(id).get();
    }

    public List<Endereco> buscarEndereco() {
        return enderecoRepository.findAll();
    }

    public Endereco atualizarEndereco(Long id, Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    public void apagarEndereco(Long id) {
        if (enderecoRepository.existsById(id)) {
            enderecoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Endereço não encontrado");
        }
    }


    public List<Endereco> buscarEnderecoPorCidade(String cidade) {
        List<Endereco> endereco = enderecoRepository.findByCidade(cidade);

        if (endereco != null) {
            return endereco;
        } else {
            throw new RuntimeException("cidade não encontrada");
        }
    }

    public List<Endereco> buscarEnderecoPorCep(String cep) {
        List<Endereco> endereco = enderecoRepository.findByCep(cep);

        if (endereco != null) {
            return endereco;

    } else {
            throw new RuntimeException("cep não encontrado");
        }
    }
    public List<Endereco> buscarEnderecoPorRua(String rua) {
        List<Endereco> endereco = enderecoRepository.findAllByRua(rua);

        if (endereco != null) {
            return endereco;
        } else {
            throw new RuntimeException("rua não encontrada");
        }
    }
}














