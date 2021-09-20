package br.com.fiap.ifome.model.entity;

import br.com.fiap.ifome.model.dto.UsuarioDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Data
@Table(name = "TB_ENDERECO")
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoEntity {

    public EnderecoEntity(Integer nrEndereco, Integer nrCep, String dsEndereco, String dsLogradouro, String dsComplemento, String dsBairro, String dsCidade, String dsEstado, String dsReferencia, Long usuario) {
        this.nrEndereco = nrEndereco;
        this.nrCep = nrCep;
        this.dsEndereco = dsEndereco;
        this.dsLogradouro = dsLogradouro;
        this.dsComplemento = dsComplemento;
        this.dsBairro = dsBairro;
        this.dsCidade = dsCidade;
        this.dsEstado = dsEstado;
        this.dsReferencia = dsReferencia;
        this.usuario = usuario;
    }

    @Id
    @SequenceGenerator(name="sq_endereco", sequenceName="sq_endereco", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="sq_endereco")
    @Column(name = "ID_ENDERECO")
    private Long id;

    @Column(name = "NR_ENDERECO")
    private Integer nrEndereco;

    @Column(name = "NR_CEP")
    private Integer nrCep;

    @Column(name = "DS_ENDERECO")
    private String dsEndereco;

    @Column(name = "DS_LOGRADOURO")
    private String dsLogradouro;

    @Column(name = "DS_COMPLEMENTO")
    private String dsComplemento;

    @Column(name = "DS_BAIRRO")
    private String dsBairro;

    @Column(name = "DS_CIDADE")
    private String dsCidade;

    @Column(name = "DS_ESTADO")
    private String dsEstado;

    @Column(name = "DS_REFERENCIA")
    private String dsReferencia;

    @Column(name = "ID_USUARIO")
    private Long usuario;

}