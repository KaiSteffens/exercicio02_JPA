package com.example.exercicio01_jpa.Repository;

import com.example.exercicio01_jpa.Entity.Endereco;
import com.example.exercicio01_jpa.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
