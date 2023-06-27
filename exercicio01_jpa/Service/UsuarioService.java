package com.example.exercicio01_jpa.Service;

import com.example.exercicio01_jpa.Entity.Usuario;
import com.example.exercicio01_jpa.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired

    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
