//import java.util.ArrayList;
//import java.util.List;
public class Sistema {
    public static void run(){
        Usuario usuario1 = new Usuario("João", "jpsocio45@gmail.com", "01/01/2000");
        Conta conta1 = new Conta(usuario1, "senha12355", 0);
        Usuario usuario2 = new Usuario("Maria","gordolazuado@spotcred.com.br", "09/10/1985");
        Conta conta2 = new Conta(usuario2, "fefe6969xoxo", 0);
        Jogo Dead_by_Daylight = new Jogo("Dead By Daylight",EnumTipoDeJogo.HORROR, EnumPlataforma.PC, EnumQuantidadeJogadores.MULTIPLAYER, "Jogo pra irritar o gordola", 100.00);
        Jogo Phasmophobia = new Jogo("Phasmophobia",EnumTipoDeJogo.HORROR, EnumPlataforma.PC, EnumQuantidadeJogadores.MULTIPLAYER , "Um jogo de terror pra você fazer tudo e seu amigo HERJO ficar no caminhão moscando e se cagando de medo", 35.90);
        Phasmophobia.visualizarInfJogo();
        Dead_by_Daylight.visualizarInfJogo();
        System.out.println("Desconto: " + Dead_by_Daylight.gerarDesconto());
        
    }

}
