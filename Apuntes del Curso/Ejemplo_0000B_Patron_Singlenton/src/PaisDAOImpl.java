import java.awt.List;
import java.util.ArrayList;

public class PaisDAOImpl {
	
	private ArrayList paises = null;
	public static PaisDAOImpl instancia = null;
	
	public ArrayList getPaises()
	{
		if (paises == null) //con esta comprobaci�n estamos aplicando el patr�n singlenton
			//si no lo pusieramos crear�a otra vez la lista y meter�a los datos y ocupar�a doble en memoria
			//de est forma el m�todo al comprobar que no esta vacio devolveria directamente la lista que se llen� 
			//la  primera vez que se instanci�
		{
			paises = new ArrayList(); 
			Pais p1 = new Pais("PERU");
			Pais p2 = new Pais("MEXICO");
			Pais p3 = new Pais("COLOMBIA");
			
			paises.add(p1);
			paises.add(p2);
			paises.add(p3);
		}
		return paises;
	}
	
	/*necesitamos un m�todo que me retorne una �nica instancia de esa clase..hay q implementar el patr�n singlenton aqu�*/
	
	
	
	public static  synchronized PaisDAOImpl getInstance()
	{
		//los hilos entran a la vez y ejecutan la lista....hay que poner el synchronize para indicar que no se entre aqu�
		/*
		  m�s de un hilo a la vez...como el elemento es static no podemos poner sinchronize(this...) hay que poner 
		  en su lugar synchronize(Main.class)*/
		//synchronized(Main.class){ //esto tb funciona, pero como lo he puesto en el m�todo...eso tb vale
			if (instancia == null)
			{
					instancia = new PaisDAOImpl();
					System.out.println("Se ha creado la instancia...");
			}
		//}
		return instancia;
	}
	
	private PaisDAOImpl()
	{}

}
