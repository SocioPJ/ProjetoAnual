import java.util.Random;

public class Usuario {
    private String nome_usuario;
    private String email_usuario;
    private final String data_nascimento;
    private int cpf = Usuario.gerarCPF();
    public Usuario(String nome_usuario, String email_usuario, String data_nascimento) {
        this.nome_usuario = nome_usuario;
        this.email_usuario = email_usuario;
        this.data_nascimento = data_nascimento;
        
    }
    public String getNome_usuario() {
        return nome_usuario;
    }
    public String getEmail_usuario() {
        return email_usuario;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public int getCpf() {
        return cpf;
    }
    public void setNome_usuario(String nome_usuario) {
        this.nome_usuario = nome_usuario;
    }
    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    

    public static int gerarCPF() {
        Random random = new Random();
        int gerador = random.nextInt(90000000);
        return gerador;
    }
   
    @Override
    public String toString() {
        return "" + nome_usuario
                + "\nEmail : " + email_usuario
                + "\nData de nascimento : " + data_nascimento
                + "\nCPF : " + cpf;
    }
}