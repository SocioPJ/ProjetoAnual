public class Conta {
    private Usuario usuario;
    private String senha;
    public Conta(Usuario usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public String getSenha() {
        return senha;
    }
    @Override
    public String toString() {
        System.out.println("==========| Conta |==========");
        return "Senha : " + senha
                + "\nUsuario : " + usuario;

    }
}