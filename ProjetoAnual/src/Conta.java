import java.util.Arrays;
import java.util.Random;

public class Conta {
    private Usuario usuario;
    private String senha;
    private double saldo = 0;
    private int numeroDaConta = Conta.gerarNumeroDaConta();
    private int quantidade_jogos = 0;
    private String[] jogos_conta = new String[10];
    private int horas_jogadas = 0;
    
    
    public Conta(Usuario usuario, String senha, double saldo) {
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
    public int getQuantidade_jogos() {
        return quantidade_jogos;
    }
    public String[] getJogos_conta() {
        return jogos_conta;
    }
    public int getHoras_jogadas() {
        return horas_jogadas;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void setQuantidade_jogos(int quantidade_jogos) {
        this.quantidade_jogos = quantidade_jogos;
    }
    
    public void setJogos_conta(String[] jogos_conta) {
        this.jogos_conta = jogos_conta;
    }
    public void setHoras_jogadas(int horas_jogadas) {
        this.horas_jogadas = horas_jogadas;
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

    public void visualizarJogos() {
        if (getQuantidade_jogos() == 0) {
            System.out.println("Não há jogos na conta");
        } else {
            System.out.println("Jogos na conta: ");
            for (int i = 0; i < getQuantidade_jogos(); i++) {
                System.out.println(getJogos_conta()[i]);
            }
        }
        
    }
    public static int gerarNumeroDaConta() {
        Random random = new Random();
        int numero = random.nextInt(10000);
        return numero;
    }

    public void jogarJogo(Jogo jogo){
        boolean contem = Arrays.stream(jogos_conta).anyMatch(jogo.getNome()::equals); // Procura se o jogo já está na conta
        if (contem == false)
        {
            System.out.println("Você não possui esse jogo");
        }
        else 
        {
            
        }
    }

    
    
    
    @Override
    public String toString() {
        System.out.println("==========| Conta |==========");
        return    "\nUsuario : " + usuario
                + "\nSaldo : " + "R$ " + saldo
                + "\nNumero da conta : " + numeroDaConta;

    }
    
}