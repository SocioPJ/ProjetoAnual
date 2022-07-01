public class Contador {
    public static int horas_jogadas;

    public static void main (String args[])
	{	int i;
		
		for(i = 1; i < 20; i++)
		{	try
			{	//Tenta pausar em 1000 milisegundos.
				Thread.sleep(1000);
			} 
			catch (InterruptedException e)
			{	//Erro na execução.
				System.out.println("ERRO");
			}
			
			//Mostra a contagem.
			System.out.println("Contando:" + i);
		}
	}

    public static int getHoras_jogadas() {
        return 0;
    }
}
