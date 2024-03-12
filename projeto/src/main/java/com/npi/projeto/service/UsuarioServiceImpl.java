package com.npi.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.npi.projeto.model.Usuario;
import com.npi.projeto.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioRepository usuarioRepository;

    @SuppressWarnings("null")
    @Override
    public Usuario addUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario getUsuarioById(long id) {
        return usuarioRepository.findById(id).get();
    }

    @Override
    public List<Usuario> getUsuarios() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public void deleteUsuario(long id) {
        usuarioRepository.deleteById(id);
    }

    @SuppressWarnings("null")
    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }


}
