package model;

public  class Tenis {

    private int idTenis;
    private Descricao descricao;
    private int quantidade;

    public Tenis(int idTenis, Descricao descricao, int quantidade) {
        this.idTenis = idTenis;
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public int getIdTenis() {
        return idTenis;
    }

    public void setIdTenis(int idTenis) {
        this.idTenis = idTenis;
    }

    public Descricao getDescricao() {
        return descricao;
    }

    public void setDescricao(Descricao descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

//    public int addQuantidade(int quantidade ) {
//        this.quantidade = quantidade;
//    }
//
//    public int removeQuantidade(int quantidade ) {
//        this.quantidade = quantidade;
//    }
}