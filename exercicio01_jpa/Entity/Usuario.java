package com.example.exercicio01_jpa.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Usuario {
    @Id
    private Long id;
    private String nome;

    @ManyToOne
    private Endereco endereco;
}
