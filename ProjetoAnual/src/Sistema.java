//import java.util.ArrayList;
//import java.util.List;
public class Sistema {
    public static void run(){
        Usuario usuario1 = new Usuario("João", "jpsocio45@gmail.com", "01/01/2000");
        Conta conta1 = new Conta(usuario1, "senha12355");
        Usuario usuario2 = new Usuario("Maria","gordolazuado@spotcred.com.br", "09/10/1985");
        Conta conta2 = new Conta(usuario2, "fefe6969xoxo");
        Jogo jogo_dbd = new Jogo("Dead By Daylight",EnumTipoDeJogo.HORROR, EnumPlataforma.PC, 1, "Jogo pra irritar o gordola", 100.00);
        System.out.println(conta1);
        System.out.println(conta2);
        conta1.depositar(100);
        System.out.println(conta1);
        System.out.println("\n");
        System.out.println(jogo_dbd);
        double desconto = jogo_dbd.getPreco()-(jogo_dbd.gerarDesconto(jogo_dbd));        
        System.out.println("Desconto: " + "R$ " + desconto);
    }
    public static boolean comprarJogo(Conta conta, Jogo jogo){
        if(conta.getSaldo() < jogo.getPreco() || conta.getSaldo() < 0)
            System.out.println("Saldo insuficiente!");
            return false;
        conta.setSaldo(conta.getSaldo() - jogo.getPreco());
        System.out.println("Compra realizada com sucesso!");
            return true;
        
    }
}
