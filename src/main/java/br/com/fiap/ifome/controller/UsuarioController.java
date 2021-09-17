package br.com.fiap.ifome.controller;

import br.com.fiap.ifome.model.dto.UsuarioDTO;
import br.com.fiap.ifome.model.dto.UsuarioForm;
import br.com.fiap.ifome.model.entity.UsuarioEntity;
import br.com.fiap.ifome.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    UsuarioRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<UsuarioDTO> cadastrar(@RequestBody @Valid UsuarioForm usuarioForm, UriComponentsBuilder uriBuilder) {
        UsuarioEntity usuarioEntity = usuarioForm.converter();

        repository.save(usuarioEntity);
        URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarioEntity.getId()).toUri();

        return ResponseEntity.created(uri).body(new UsuarioDTO(usuarioEntity));
    }




    @GetMapping("/listar")
    public List<UsuarioEntity> getAllUsuarios(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDTO> buscarPorId(@PathVariable("id") Long id){
        UsuarioEntity u = repository.buscarPorId(id);
        if(u  != null){
            return ResponseEntity.ok(new UsuarioDTO(u));
        }
        return ResponseEntity.notFound().build();
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUsuario(@PathVariable Long id){
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }
}


