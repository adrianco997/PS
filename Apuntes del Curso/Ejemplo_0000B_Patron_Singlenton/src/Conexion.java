
public class Conexion {

	/*perseguimos tener una �nica instancia de una  clase en particular, en este caso es la clase Conexion*/
	
	private static Conexion instancia = null;
	
	public static Conexion getInstance(){
		if (instancia == null){//no se ha instanciado a�n
			instancia = new Conexion();
		}
		return instancia;
	}
	
	//es necesario agregar un constructor privado para que no haya instancias posteriores que la creen
	private Conexion()
	{
		
	}
}
