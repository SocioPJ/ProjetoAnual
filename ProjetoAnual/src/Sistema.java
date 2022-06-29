public class Sistema {
    public static void run(){
        Usuario usuario1 = new Usuario("João", "jpsocio45@gmail.com", "01/01/2000", 1180882687);
        Conta conta1 = new Conta(usuario1, "senha12355");
        System.out.println(conta1);
    }
}