public class App {
    public static void main(String[] args) throws Exception {
        Conta conta = new Conta("Joao","12/12/12","jp@hotmail.com","Brasil",123456789);
        System.out.println(conta.getNome());
    }
    public void visualizarConta(Conta conta){
        System.out.println("ID da conta:" + conta.getIdConta());
        System.out.println("Nome:" + conta.getNome());
        System.out.println("Data de nascimento:" + conta.getData_nascimento());
        System.out.println("Email:" + conta.getEmail());
        System.out.println("Pais:" + conta.getPais());
        System.out.println("Telefone:" + conta.getTelefone());
    }
}
