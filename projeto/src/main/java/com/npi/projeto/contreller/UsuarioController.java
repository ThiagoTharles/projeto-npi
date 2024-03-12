package com.npi.projeto.contreller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.npi.projeto.model.Usuario;
import com.npi.projeto.service.UsuarioService;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/addusr")
    public String addUsuario(@RequestBody Usuario usuario){
        usuarioService.addUsuario(usuario);
        return "usuario adicionado";
    }

    @GetMapping("/usuario/{id}")
    public Usuario getUsuarioById(@PathVariable ("id") long id){
        return usuarioService.getUsuarioById(id);
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioService.getUsuarios();
    }

    @DeleteMapping("/usuario/{id}")
    public String deleteUsuario(@PathVariable ("id") long id){
        usuarioService.deleteUsuario(id);
        return "usuario deletado";
    }

    @PutMapping("/usuario")
    public Usuario updateUsuario(@RequestBody Usuario usuario){
        return usuarioService.updateUsuario(usuario);
    }

}
