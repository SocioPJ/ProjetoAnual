//import java.util.ArrayList;
//import java.util.List;
public class Sistema {
    public static void run(){
        Usuario usuario1 = new Usuario("João", "jpsocio45@gmail.com", "01/01/2000");
        Conta conta1 = new Conta(usuario1, "senha12355", 0);
        Usuario usuario2 = new Usuario("Maria","gordolazuado@spotcred.com.br", "09/10/1985");
        Conta conta2 = new Conta(usuario2, "fefe6969xoxo", 0);
        Jogo jogo_dbd = new Jogo("Dead By Daylight",EnumTipoDeJogo.HORROR, EnumPlataforma.PC, 1, "Jogo pra irritar o gordola", 100.00);
        conta1.depositar(1000);
        System.out.println(conta1);
        System.out.println(jogo_dbd);
        System.out.println("\n");
        Sistema.comprarJogo(conta1, jogo_dbd);
        System.out.println(conta1);
        Sistema.comprarJogo(conta2, jogo_dbd);
        conta2.depositar(75);
        System.out.println(conta2);
        conta1.visualizarJogos();
        
        
    }
    public static void comprarJogo(Conta conta, Jogo jogo){
        if(conta.getSaldo() < jogo.getPreco() || conta.getSaldo() < 0){
            System.out.println("Saldo insuficiente!");
        }
        else{
            conta.setSaldo(conta.getSaldo() - jogo.getPreco());
            conta.setQuantidade_jogos(conta.getQuantidade_jogos() + 1);
            conta.getJogos_conta()[conta.getQuantidade_jogos() - 1] = jogo.getNome();
            System.out.println("Compra realizada com sucesso!");
            System.out.println("Saldo atual: " + "R$ " + conta.getSaldo());
        }
            
            
        
    }
}
