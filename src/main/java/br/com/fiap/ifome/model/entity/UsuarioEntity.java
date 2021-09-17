package br.com.fiap.ifome.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "USUARIO_PFISICA")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO")
    private Integer id;

    @Column(name = "NR_CPF")
    private Integer cpf;

    @Column(name = "NR_RG")
    private Integer rg;

    @Column(name = "DS_NOME_COMPLETO")
    private String nomeCompleto;

    @Column(name = "NR_CELULAR")
    private Integer celular;

    @Column(name = "DS_SEXO")
    private String sexo;

    @Column(name = "DS_EMAIL")
    private String email;

    @Column(name = "DT_NASCIMENTO")
    private Date dtNascimento;

    @Column(name = "DT_CADASTRO")
    private Date dtCadastro;

    @Column(name = "DS_SENHA")
    private String senha;

    public UsuarioEntity(Integer id, Integer cpf, Integer rg, String nomeCompleto, Integer celular, String sexo, String email, Date dtNascimento, Date dtCadastro, String senha) {
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

    public UsuarioEntity() {
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
