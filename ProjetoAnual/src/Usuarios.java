public class Usuarios {
    private String nome;
    private String senha;
    private String email;
    private Conta conta;

    //Getters:
    public String getNome() {
        return nome;
    }
    //Retorna nome da conta
    public String getSenha() {
        return senha;
    }
    
    public int getConta() {
        return this.conta.getIdConta();
    }
    //Construtor da Classe
    public Usuarios(String nome, String senha, String email) {
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.conta = new Conta("Joao","12/12/12","jpsocio@hotmail.com","Brasil",123456789);
    }

    //Verifica as credenciais do usuario
    public boolean verificarUsuario(String email, String senha){
        if(senha.equals(this.senha) && email.equals(this.email)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Usuarios{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                ", email='" + email + '\'' +
                ", conta=" + conta +
                '}';
    }
}