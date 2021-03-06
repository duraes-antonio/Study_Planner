package Dominio.Entidades;

import Dominio.Enum.ESubtipoServico;
import Dominio.Enum.ETipoServico;
import Dominio.Util.Util;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "servico")
public class Servico implements Comparable<Servico>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "titulo", length = 175)
    private String titulo;

    @Column(name = "descricao", length = 1500)
    private String descricao;

    @Transient
    private ETipoServico tipo;

    @Transient
    private List<ESubtipoServico> subtipos;

    @Column(name = "valor")
    private double valor;

    @Column(name = "fk_usuario")
    private int fkUsuario;

    @Column(name = "fk_tipo_servico")
    private int fkTipoServico;

    @Column(name = "fk_contrato")
    private int fkContrato;

    @ManyToMany
    @JoinTable(
            name="servico_subtipo_servico",
            joinColumns={@JoinColumn(name="fk_servico")},
            inverseJoinColumns={@JoinColumn(name="fk_subtipo_servico")}
            )
    private Collection<SubtipoServico> subtiposServico = new ArrayList<>();

    public Servico() {}

    public Servico(int id, String titulo, String descricao, double valor, int fkTipoServico,
                   int fkUsuario, int fkContrato) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setValor(valor);
        this.setFkTipoServico(fkTipoServico);
        this.setFkUsuario(fkUsuario);
        this.setFkContrato(fkContrato);
    }

    public Servico(String titulo, String descricao, List<ESubtipoServico> subtipos,
                   double valor, int fkTipoServico, int fkUsuario, int fkContrato) {
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setSubtipoServico(subtipos);
        this.setValor(valor);
        this.setFkTipoServico(fkTipoServico);
        this.setFkUsuario(fkUsuario);
        this.setFkContrato(fkContrato);
    }

    public Servico(int id, String titulo, String descricao,
                   List<ESubtipoServico> subtipos, double valor, int fkTipoServico,
                   int fkUsuario, int fkContrato) {
        this.setId(id);
        this.setTitulo(titulo);
        this.setDescricao(descricao);
        this.setSubtipoServico(subtipos);
        this.setValor(valor);
        this.setFkTipoServico(fkTipoServico);
        this.setFkUsuario(fkUsuario);
        this.setFkContrato(fkContrato);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {

        if (!Util.isStringValida(titulo)) Util.throwExceptCampoVazio("título");

        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {

        if (!Util.isStringValida(descricao)) Util.throwExceptCampoVazio("descrição");

        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {

        if (valor < 0) Util.throwExceptNumeroInferior("preço", 0);

        this.valor = valor;
    }

    public ETipoServico getTipo() {
        return tipo;
    }

    public void setTipo(ETipoServico tipo) {
        this.tipo = tipo;
    }

    public List<ESubtipoServico> getSubtipos() {
        return subtipos;
    }

    public void setSubtipoServico(List<ESubtipoServico> subtipos) {
        this.subtipos = subtipos;
    }

    public void addSubtipoServico(ESubtipoServico subtipo) {

        if (this.subtipos == null) {
            this.subtipos = new ArrayList<>();
        }

        this.subtipos.add(subtipo);
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    private void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    public int getFkTipoServico() {
        return fkTipoServico;
    }

    public void setFkTipoServico(int fkTipoServico) {
        this.tipo = ETipoServico.getById(fkTipoServico);
        this.fkTipoServico = fkTipoServico;
    }

    public int getFkContrato() {
        return fkContrato;
    }

    public void setFkContrato(int fkContrato) {
        this.fkContrato = fkContrato;
    }

    @Override
    public String toString() {

        String servicoStr = "\nID:\t\t\t\t\t" + getId();
        servicoStr += "\nTítulo:\t\t\t\t" + getTitulo();
        servicoStr += "\nDescrição:\t\t\t" + getDescricao();
        servicoStr += "\nTipo:\t\t\t\t" + getTipo().getTipo();

        for (int i = 0; i < getSubtipos().size(); i++) {
            servicoStr += String.format("\nSubtipo %d:\t\t\t%s", i+1, getSubtipos().get(i).getSubtipo());
        }

        servicoStr += "\nValor:\t\t\t\t" + getValor();
        servicoStr += "\nFK_usuario:\t\t\t" + getFkUsuario();
        servicoStr += "\nFK_tipo_servico:\t" + getFkTipoServico();
        servicoStr += "\nFK_contrato:\t\t" + getFkContrato();

        return servicoStr;
    }

    @Override
    public int compareTo(Servico servico) {
        return Integer.compare(getId(), servico.getId());
    }
}
