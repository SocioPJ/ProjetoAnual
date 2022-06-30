
public class Sistema {
    public static void run(){
        Usuario usuario1 = new Usuario("João", "jpsocio45@gmail.com", "01/01/2000");
        Conta conta1 = new Conta(usuario1, "senha12355");
        Usuario usuario2 = new Usuario("Maria","gordolazuado@spotcred.com.br", "09/10/1985");
        Conta conta2 = new Conta(usuario2, "fefe6969xoxo");
        System.out.println(conta1);
        System.out.println(conta2);
        conta1.depositar(100);
        System.out.println(conta1);
        conta1.visualizarSaldo();
    }
}