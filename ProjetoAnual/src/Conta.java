public class Conta {
    //Atributos:
    private String nome;
    private String data_nascimento;
    private String email;
    private String pais;
    private int telefone;
    private int idConta;

    //Construtor:
    public Conta(String nome, String data_nascimento, String email, String pais, int telefone) {
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.email = email;
        this.pais = pais;
        this.telefone = telefone;
        
    }
    //Getters:
    public int getIdConta() {
        return idConta;
    }
    public String getNome() {
        return nome;
    }
    public String getData_nascimento() {
        return data_nascimento;
    }
    public String getEmail() {
        return email;
    }
    public String getPais() {
        return pais;
    }
    public int getTelefone() {
        return telefone;
    }
    //Setters:
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public void setIdConta(int idConta){
        this.idConta = idConta;
    }
    //Métodos:
    public void visualizarConta() {
        System.out.println("ID da conta:" + idConta);
        System.out.println("Nome:" + nome);
        System.out.println("Data de nascimento:" + data_nascimento);
        System.out.println("Email:" + email);
        System.out.println("Pais:" + pais);
        System.out.println("Telefone:" + telefone);
    }
}
