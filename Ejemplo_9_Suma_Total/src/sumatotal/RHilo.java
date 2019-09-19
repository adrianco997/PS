package sumatotal;
public class RHilo implements Runnable{

	private int id;
	private static Object cerrojo= new Object();

	public RHilo(int id)
	{
		this.id= id;

	}


	private int cont_private =0; //privada y de cada uno de los hilos
	public static int cont=0; //variable compartida por todos los hilos

	@Override
	public void run()
	{
		for (int i=0;i<20000;i++)//todos los hilos ejecutar�n este for a la vez
		{
			cont_private++; //todos los hilos terminar�n con esta variable a 20000
		}
		synchronized(cerrojo){ //al salir del for valdr�n 20000 y se sumar�n a lo que ya tenga cont...soluci�n muy eficinete
			cont+=cont_private;
		}
	}

}