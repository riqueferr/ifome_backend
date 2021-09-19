package br.com.fiap.ifome.service;

import br.com.fiap.ifome.model.dto.EnderecoDto;
import br.com.fiap.ifome.model.entity.EnderecoEntity;

import java.util.List;
import java.util.stream.Collectors;

public class EnderecoService {

    public static List<EnderecoDto> converter(List<EnderecoEntity> endereco) {
        return endereco.stream().map(EnderecoDto::new).collect(Collectors.toList());
    }
}
