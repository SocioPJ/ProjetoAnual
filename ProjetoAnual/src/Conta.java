import java.util.Random;

public class Conta {
    private Usuario usuario;
    private String senha;
    private double saldo;
    private int numeroDaConta = Conta.gerarNumeroDaConta();
    
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
    public double getSaldo() {
        return saldo;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void visualizarSaldo() {
        System.out.println("Saldo atual na conta " + getNumeroDaConta() + " é de R$ " + getSaldo());
    }
    public boolean depositar(double valor){
        if(valor < 0) 
            return false;
        this.saldo += valor;
        return true;
    }
    public boolean comprar(String jogo){
        if(this.saldo < 0)
            return false;
        this.saldo -= jogo.getPreco();
        return true;
    }
    public static int gerarNumeroDaConta() {
        Random random = new Random();
        int numero = random.nextInt(10000);
        return numero;
    }
    @Override
    public String toString() {
        System.out.println("==========| Conta |==========");
        return    "\nUsuario : " + usuario
                + "\nSaldo : " + "R$ " + saldo
                + "\nNumero da conta : " + numeroDaConta;

    }
}