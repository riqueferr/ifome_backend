package br.com.fiap.ifome.model.dto;

import br.com.fiap.ifome.model.entity.UsuarioEntity;

import java.util.Date;

public class UsuarioDTO {

    private Integer id;
    private Integer cpf;
    private Integer rg;
    private String nomeCompleto;
    private Integer celular;
    private String sexo;
    private String email;
    private Date dtNascimento;
    private Date dtCadastro;
    private String senha;

    public UsuarioDTO() {
    }

    public UsuarioDTO(Integer id, Integer cpf, Integer rg, String nomeCompleto, Integer celular, String sexo, String email, Date dtNascimento, Date dtCadastro, String senha) {
        this.id = id;
        this.cpf = cpf;
        this.rg = rg;
        this.nomeCompleto = nomeCompleto;
        this.celular = celular;
        this.sexo = sexo;
        this.email = email;
        this.dtNascimento = dtNascimento;
        this.dtCadastro = dtCadastro;
        this.senha = senha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public Date getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Date dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
