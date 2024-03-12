package com.npi.projeto.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.npi.projeto.model.Usuario;

@Service
public interface UsuarioService {
    public Usuario addUsuario(Usuario usuario);

    public Usuario getUsuarioById(long id);

    public List<Usuario> getUsuarios();

    public void deleteUsuario(long id);

    public Usuario updateUsuario(Usuario usuario);
}
