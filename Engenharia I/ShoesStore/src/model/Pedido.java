package model;

public class Pedido{

    private int idPedido;
    private Tenis tenis;
    private Usuario dadosUsuario;

    public Pedido(int idPedido, Tenis tenis, Usuario dadosUsuario) {
        this.idPedido = idPedido;
        this.tenis = tenis;
        this.dadosUsuario = dadosUsuario;
    }


    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Tenis getTenis() {
        return tenis;
    }

    public void setTenis(Tenis tenis) {
        this.tenis = tenis;
    }

    public Usuario getDadosUsuario() {
        return dadosUsuario;
    }

    public void setDadosUsuario(Usuario dadosUsuario) {
        this.dadosUsuario = dadosUsuario;
    }
}