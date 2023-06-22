package com.example.exercicio01_jpa.Repository;

import com.example.exercicio01_jpa.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;
import java.util.List;

@Repository

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

        @Query("SELECT e FROM Endereco e WHERE e.cidade = ?1")
        List<Endereco> findByCidade(String cidade);
        List<Endereco> findByCep(String Cep);
        List<Endereco> findAllByRua(String Rua);
}
