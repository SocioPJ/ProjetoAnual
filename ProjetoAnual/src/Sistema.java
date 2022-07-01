//import java.util.ArrayList;
//import java.util.List;
public class Sistema {
    public static void run(){
        Usuario usuario1 = new Usuario("João", "jpsocio45@gmail.com", "01/01/2000");
        Conta conta1 = new Conta(usuario1, "senha12355", 0);
        Usuario usuario2 = new Usuario("Maria","gordolazuado@spotcred.com.br", "09/10/1985");
        Conta conta2 = new Conta(usuario2, "fefe6969xoxo", 0);
        Jogo Dead_by_Daylight = new Jogo("Dead By Daylight",EnumTipoDeJogo.HORROR, EnumPlataforma.PC, EnumQuantidadeJogadores.MULTIPLAYER, "Jogo pra irritar o gordola", 100.00);
        Jogo Phasmophobia = new Jogo("Phasmophobia",EnumTipoDeJogo.RPG, EnumPlataforma.PC, EnumQuantidadeJogadores.MULTIPLAYER , "Um jogo de terror pra você fazer tudo e seu amigo HERJO ficar no caminhão moscando e se cagando de medo", 35.90);
        conta1.depositar(100);
        conta2.depositar(200);
        conta2.visualizarSaldo();
        Sistema.comprarJogo(conta2, Dead_by_Daylight);
        conta2.visualizarSaldo();
        conta2.jogarJogo(Dead_by_Daylight);
        
        
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
