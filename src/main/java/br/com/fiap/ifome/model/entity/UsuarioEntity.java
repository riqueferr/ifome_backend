package br.com.fiap.ifome.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Table(name = "TB_USUARIO")
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioEntity {

    public UsuarioEntity(Integer cpf, Integer rg, String nomeCompleto, Integer celular, String sexo, String email, String dtNascimento, String dtCadastro, String senha) {
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

    @Id
    @SequenceGenerator(name="sq_test", sequenceName="sq_test", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sq_test")
    @Column(name = "ID_USUARIO")
    private Long id;

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
    private String dtNascimento;

    @Column(name = "DT_CADASTRO")
    private String dtCadastro;

    @Column(name = "DS_SENHA")
    private String senha;

}
