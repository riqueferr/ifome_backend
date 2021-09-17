package br.com.fiap.ifome.model.dto;

import br.com.fiap.ifome.model.entity.UsuarioEntity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsuarioForm {

    private Integer cpf;
    private Integer rg;
    private String nomeCompleto;
    private Integer celular;
    private String sexo;
    private String email;
    private String dtNascimento;
    private String dtCadastro;
    private String senha;


    public Integer getCpf() {
        return cpf;
    }

    public Integer getRg() {
        return rg;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public Integer getCelular() {
        return celular;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEmail() {
        return email;
    }

    public String getDtNascimento() {
        return dtNascimento;
    }

    public String getDtCadastro() {
        return dtCadastro;
    }

    public String getSenha() {
        return senha;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public void setDtCadastro(String dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public UsuarioEntity converter() {
        return new UsuarioEntity(cpf, rg, nomeCompleto, celular, sexo, email, dtNascimento,
                dtCadastro = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")), senha);
    }
}
