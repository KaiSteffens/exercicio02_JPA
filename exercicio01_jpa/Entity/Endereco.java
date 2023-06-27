package com.example.exercicio01_jpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String rua;
    String cidade;
    String estado;
    String cep;

    @OneToMany(mappedBy = "endereco")
    private List<Usuario> usuarios;

    }


