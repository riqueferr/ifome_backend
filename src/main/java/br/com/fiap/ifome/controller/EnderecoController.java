package br.com.fiap.ifome.controller;

import br.com.fiap.ifome.model.dto.EnderecoDto;
import br.com.fiap.ifome.model.dto.EnderecoForm;
import br.com.fiap.ifome.model.entity.EnderecoEntity;
import br.com.fiap.ifome.repository.EnderecoRepository;
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
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoRepository repository;

    @PostMapping
    @Transactional

    public ResponseEntity<EnderecoDto> cadastrar(@RequestBody @Valid EnderecoForm enderecoForm, UriComponentsBuilder uriBuilder) {
        EnderecoEntity enderecoEntity = enderecoForm.converter();

        repository.save(enderecoEntity);
        URI uri = uriBuilder.path("/endereco/{id}").buildAndExpand(enderecoEntity.getId()).toUri();

            return ResponseEntity.created(uri).body(new EnderecoDto(enderecoEntity));
    }

    @GetMapping("/listar")
    public List<EnderecoEntity> getAllEndereco(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoDto> buscarPorId(@PathVariable ("id") Long id) {
        EnderecoEntity e = repository.buscarporId(id);
        if(e  != null){
            return ResponseEntity.ok(new EnderecoDto(e));
        }
        return ResponseEntity.notFound().build();
    }

    @Transactional
    @DeleteMapping("/{id}")
    public ResponseEntity deleteUsuario(@PathVariable Long id) {
        repository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}
