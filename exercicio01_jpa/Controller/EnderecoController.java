package com.example.exercicio01_jpa.Controller;

import com.example.exercicio01_jpa.Entity.Endereco;
import com.example.exercicio01_jpa.Service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/sistema")
@RestController
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @PostMapping("/endereco/")
    public Endereco salvarEndereco(@RequestBody Endereco endereco) {
        return enderecoService.salvarEndereco(endereco);
    }

    @GetMapping("/endereco/{id}")
    public Endereco buscarenderecoPorId(@PathVariable long id) {
        return enderecoService.buscarEndereco(id);
    }


    @GetMapping("/enderecos/")
    public List<Endereco> ListarEnderecos() {
        return enderecoService.buscarEndereco();
    }


    @PutMapping("atualizar/{id}")
    public Endereco atualizarEndereco(@PathVariable Long id, @RequestBody Endereco endereco) {
        return enderecoService.atualizarEndereco(id, endereco);
    }

    @DeleteMapping("excluir/{id}")
    public void excluirendereco(@PathVariable long id) {
        enderecoService.apagarEndereco(id);
    }

    @GetMapping("/cidade/{cidade}")
    public List<Endereco> buscarEnderecoPorCidade(@PathVariable("cidade") String cidade) {
        List<Endereco> endereco = enderecoService.buscarEnderecoPorCidade(cidade);

        if (endereco != null) {
            return endereco;

        } else {
            throw new RuntimeException("cidade não encontrada");
        }
    }
    @GetMapping("/cep/{cep}")
    public List<Endereco> buscarEnderecoPorCep(@PathVariable("cep") String cep) {
        List<Endereco> endereco = enderecoService.buscarEnderecoPorCep(cep);

        if (endereco != null) {
            return endereco;

        } else {
            throw new RuntimeException("cep não encontrado");
        }
    }
    @GetMapping("/rua/{rua}")
    public List<Endereco> buscarEnderecoPorRua(@PathVariable String rua) {
        List<Endereco> endereco = enderecoService.buscarEnderecoPorRua(rua);

        if (endereco != null) {
            return endereco;

        } else {
            throw new RuntimeException("cep não encontrado");
        }
    }
}





