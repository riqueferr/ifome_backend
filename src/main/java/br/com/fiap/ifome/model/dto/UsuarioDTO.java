package br.com.fiap.ifome.model.dto;

import br.com.fiap.ifome.model.entity.UsuarioEntity;

import java.util.Date;

public class UsuarioDTO {

    private Long id;
    private Integer cpf;
    private Integer rg;
    private String nomeCompleto;
    private Integer celular;
    private String sexo;
    private String email;
    private String dtNascimento;
    private String dtCadastro;
    private String senha;


//    public UsuarioDTO(UsuarioEntity) {
//        this.id = id;
//        this.cpf = cpf;
//        this.rg = rg;
//        this.nomeCompleto = nomeCompleto;
//        this.celular = celular;
//        this.sexo = sexo;
//        this.email = email;
//        this.dtNascimento = dtNascimento;
//        this.dtCadastro = dtCadastro;
//        this.senha = senha;
//    }

    public UsuarioDTO(UsuarioEntity usuarioEntity) {
        this.id = usuarioEntity.getId();
        this.cpf = usuarioEntity.getCpf();
        this.rg = usuarioEntity.getRg();
        this.nomeCompleto = usuarioEntity.getNomeCompleto();
        this.celular = usuarioEntity.getCelular();
        this.sexo = usuarioEntity.getSexo();
        this.email = usuarioEntity.getEmail();
        this.dtNascimento = usuarioEntity.getDtNascimento();
        this.dtCadastro = usuarioEntity.getDtCadastro();
        this.senha = usuarioEntity.getSenha();
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
