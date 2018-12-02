package Dominio.Entidades;

import javax.persistence.*;

@Entity
@Table(name = "endereco")
public class Endereco implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
//
//    @Column(name = "cep")
//    private int cepNumero;

    @Column(name = "fk_usuario")
    private int fkUsuario;

//    @Column(name = "fk_bairro")
//    private int fkBairro;

    @Transient
    private String bairro;

    @Transient
    private String cidade;

    @Transient
    private String estado;

    @Transient
    private Cep cep;
//
//    @OneToOne(fetch = FetchType.LAZY, targetEntity = Bairro.class)
//    @JoinColumn(name = "fk_bairro", referencedColumnName = "id", insertable = false, updatable = false)
//    private Bairro bairroObj;


    public Endereco() {}

//TODO apagar se não houver uso
    // public Endereco(String bairro, String cidade, String estado,
//                    int cep){
//        this.setBairro(bairro);
//        this.setCidade(cidade);
//        this.setEstado(estado);
//        this.cep = new Cep(cep);
//    }

    public Endereco(String bairro, String cidade, String estado,
                    int cep, int fkUsuario){
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.cep = new Cep(cep);
        this.setFkUsuario(fkUsuario);
    }

    public Endereco(int id, String bairro, String cidade,
                    String estado, int cep, int fkUsuario){
        this.setId(id);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.cep = new Cep(cep);
        this.setFkUsuario(fkUsuario);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    public int getFkUsuario() {
        return fkUsuario;
    }

    public void setFkUsuario(int fkUsuario) {
        this.fkUsuario = fkUsuario;
    }

    @Override
    public Endereco clone() throws CloneNotSupportedException {
        Endereco endereco = (Endereco) super.clone();
        endereco.setCep(this.cep.clone());
        return endereco;
    }
//    public void setFkBairro(int fkBairro) {
//        this.fkBairro = fkBairro;
//    }
//    /**
//     * Método responsável por preencher os atributos quando a persistência é
//     * feita com ORM hibernate, pois seu funcionamento é diferente do uso do SQL hard.
//     */

//    @PostLoad
//    private void hibernateConstruir() {
//        setCep(new Cep(cepNumero));
//        setBairro(this.bairroObj.getNome());
//        this.fkBairro = this.bairroObj.getId();
//        setCidade(this.bairroObj.getCidade().getNome());
//        setEstado(this.bairroObj.getCidade().getEstado().getNomeExtenso());
//    }

    @Override
    public String toString() {

        String enderecoStr = "\nID:\t\t\t" + getId();
        enderecoStr += "\nBairro:\t\t" + getBairro();
        enderecoStr += "\nCidade:\t\t" + getCidade();
        enderecoStr += "\nEstado:\t\t" + getEstado();
        enderecoStr += "\nCEP:\t\t" + getCep().getCep();
        enderecoStr += "\nFK_usuario:\t" + getFkUsuario();

        return enderecoStr;
    }
}
