package br.com.fiap.ifome.model.dto;
import br.com.fiap.ifome.model.entity.EnderecoEntity;

public class EnderecoDto {


    private Long id;
    private Integer nrEndereco;
    private Integer nrCep;
    private String dsEndereco;
    private String dsLogradouro;
    private String dsComplemento;
    private String dsBairro;
    private String dsCidade;
    private String dsEstado;
    private String dsReferencia;
    private Long usuario;

    public EnderecoDto(EnderecoEntity enderecoEntity){
        this.id = enderecoEntity.getId();
        this.nrEndereco = enderecoEntity.getNrEndereco();
        this.nrCep = enderecoEntity.getNrCep();
        this.dsEndereco = enderecoEntity.getDsEndereco();
        this.dsLogradouro = enderecoEntity.getDsLogradouro();
        this.dsComplemento = enderecoEntity.getDsComplemento();
        this.dsBairro = enderecoEntity.getDsBairro();
        this.dsCidade = enderecoEntity.getDsCidade();
        this.dsEstado = enderecoEntity.getDsEstado();
        this.dsReferencia = enderecoEntity.getDsReferencia();
        this.usuario = enderecoEntity.getUsuario();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNrEndereco() {
        return nrEndereco;
    }

    public void setNrEndereco(Integer nrEndereco) {
        this.nrEndereco = nrEndereco;
    }

    public Integer getNrCep() {
        return nrCep;
    }

    public void setNrCep(Integer nrCep) {
        this.nrCep = nrCep;
    }

    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    public String getDsLogradouro() {
        return dsLogradouro;
    }

    public void setDsLogradouro(String dsLogradouro) {
        this.dsLogradouro = dsLogradouro;
    }

    public String getDsComplemento() {
        return dsComplemento;
    }

    public void setDsComplemento(String dsComplemento) {
        this.dsComplemento = dsComplemento;
    }

    public String getDsBairro() {
        return dsBairro;
    }

    public void setDsBairro(String dsBairro) {
        this.dsBairro = dsBairro;
    }

    public String getDsCidade() {
        return dsCidade;
    }

    public void setDsCidade(String dsCidade) {
        this.dsCidade = dsCidade;
    }

    public String getDsEstado() {
        return dsEstado;
    }

    public void setDsEstado(String dsEstado) {
        this.dsEstado = dsEstado;
    }

    public String getDsReferencia() {
        return dsReferencia;
    }

    public void setDsReferencia(String dsReferencia) {
        this.dsReferencia = dsReferencia;
    }

    public Long getUsuario() {
        return usuario;
    }

    public void setUsuario(Long usuario) {
        this.usuario = usuario;
    }

}