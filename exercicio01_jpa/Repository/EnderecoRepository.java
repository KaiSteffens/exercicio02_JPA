package com.example.exercicio01_jpa.Repository;

import com.example.exercicio01_jpa.Entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.parser.Entity;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long>{

}
