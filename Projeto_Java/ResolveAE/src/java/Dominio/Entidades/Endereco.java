package Dominio.Entidades;

/**
 *
 * @author 20161BSI0314
 */
public class Endereco {

    private int id;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    private Cep cep;

    public Endereco(){}

    public Endereco(String rua, String bairro, String cidade, String estado, int cep){
        this.setRua(rua);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.cep = new Cep(cep);
    }

    public Endereco(int id, String rua, String bairro, String cidade, String estado, int cep){
        this.setRua(rua);
        this.setBairro(bairro);
        this.setCidade(cidade);
        this.setEstado(estado);
        this.cep = new Cep(cep);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {

        if (id < 1) Util.throwExceptNumeroInferior("id", 1);

        this.id = id;
    }

    //PREENCHIDO A PARTIR DO CEP INFORMADO
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {

        if (Util.isStringValida(rua)) this.rua = rua;

        else Util.throwExceptCampoVazio("rua");
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {

        if (Util.isStringValida(bairro)) this.bairro = bairro;

        else Util.throwExceptCampoVazio("bairro");
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {

        if (Util.isStringValida(cidade)) this.cidade = cidade;

        else Util.throwExceptCampoVazio("cidade");
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {

        if (Util.isStringValida(estado)) this.estado = estado;

        else Util.throwExceptCampoVazio("estado");
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return String.format(
                "CEP:\t\t%d;\nLogradouro:\t%s;\nBairro:\t\t%s;\nCidade:\t\t%s;\nEstado:\t\t%s;",
                this.cep.getCep(), this.getRua(), this.getBairro(), this.getCidade(), this.getEstado());
    }
}