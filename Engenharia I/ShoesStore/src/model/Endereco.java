package model;

public class Endereco {


    private String cep;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;
    private String complemento;

    public Endereco(String cep, String estado, String cidade, String bairro, String rua, int numero, String complemento) {
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public void setCep(String cep) {this.cep = cep; }
    public String getCep() {return cep;}

    public void setEstado(String estado) {this.estado = estado; }
    public String getEstado() {return estado;}

    public void setCidade(String cidade) {this.cidade = cidade; }
    public String getCidade() {return cidade;}

    public void setBairro(String bairro) {this.bairro = bairro; }
    public String getBairro() {return bairro;}

    public void setRua(String rua) {this.rua = rua; }
    public String getRua() {return rua;}

    public void setNumero(int numero) {this.numero = numero; }
    public int getNumero() {return numero;}

    public void setComplemento(String complemento) {this.complemento = complemento; }
    public String getComplemento() {return complemento;}
}