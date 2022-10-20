package model;

public class Usuario {
    
    private String nomeUsuario;
    private String cpfUsuario;
    private Endereco enderecoUsuario;
     private Pedido pedido;

    public Usuario(String nomeUsuario, String cpfUsuario, Endereco enderecoUsuario, Pedido pedido) {
        this.nomeUsuario = nomeUsuario;
        this.cpfUsuario = cpfUsuario;
        this.enderecoUsuario = enderecoUsuario;
        this.pedido = pedido;
    }

    public void setNomeUsuario(String nomeUsuario) { this.nomeUsuario = nomeUsuario; }
    public String getNomeUsuario() { return nomeUsuario; }

    public void setCpfUsuario(String cpfUsuario) { this.cpfUsuario = cpfUsuario; }
    public String getCpfUsuario() { return cpfUsuario; }

    public void setEnderecoUsuario(Endereco enderecoUsuario) {this.enderecoUsuario = enderecoUsuario;}
    public Endereco getEnderecoUsuario() { return enderecoUsuario; }

    public void setPedido(Pedido pedido) {this.pedido = pedido;}
    public Pedido getPedido() {return pedido;}
}