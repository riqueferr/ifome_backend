package br.com.fiap.ifome.controller;

import br.com.fiap.ifome.model.dto.UsuarioDTO;
import br.com.fiap.ifome.model.entity.UsuarioEntity;
import br.com.fiap.ifome.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;



@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    UsuarioRepository repository;

    @PostMapping
    @Transactional
    public UsuarioEntity cadastrar(@RequestBody UsuarioEntity usuarioEntity) {
        return repository.save(usuarioEntity);
    }
}
