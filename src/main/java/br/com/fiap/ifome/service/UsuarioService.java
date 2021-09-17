package br.com.fiap.ifome.service;

import br.com.fiap.ifome.model.dto.UsuarioDTO;
import br.com.fiap.ifome.model.entity.UsuarioEntity;

import java.util.List;
import java.util.stream.Collectors;

public class UsuarioService {

    public static List<UsuarioDTO> converter(List<UsuarioEntity> usuario) {
        return usuario.stream().map(UsuarioDTO::new).collect(Collectors.toList());
    }
}
