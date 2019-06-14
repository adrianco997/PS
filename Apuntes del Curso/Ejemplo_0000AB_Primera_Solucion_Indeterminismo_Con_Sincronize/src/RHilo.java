
public class RHilo implements Runnable{

	private static int cont = 0;
	private static Object obj = new Object();
	
	@Override
	public void run()
	{
		/*hay que proveer de exclusi�n mutua sobre la variable cont. Esto lo podemos conseguir con synchronized. Lo que
		 * conseguimos es impedir que dos hilos accedan a la vez a la misma variable compartida.
		 * el synchornized siempre lleva una variable est�tica...podr�amos hacerlo sobre cualquier objeto...
		 * En el ejemplo del sync..dentro del for lo que hacen los hilos al preguntar por el cerrojo obj y preguntan
		 * al cerrojo obj hay alguien dentro? si lo hay no puede entrar y se queda en la cola...el problema es que 
		 * si lo hacemos dentro del for los hilos se quedan dentro del for esperando.
		 * Cuando alg�n hilo libera el cerrojo de los hilos que estaban esperando en la cola...se produce una condici�n de
		 * concurso y aquel m�s r�pido entrar�.
		 * Consideraciones:
		 * 	1. El cerrojo debe ser est�tico.
		 *  2. Cada vez que dormimos los hilos y los despertamos, esto lleva un tiempo y gasto de recursos...deber�amos
		 *  intentar reducir el n�mero de veces que se duermen y despiertan los hilos...si metemos todo el bucle for 
		 *  dentro del syncronized funcionar� mejor
		 * el problema ser�a  d�nde poner el syncrho..dentro o fuera del for...*/
		synchronized(obj){
			for (int i = 0; i<1000; i++)//cada uno de los hilos dar� 1000 vueltas. ah� se producir� indeterminaci�n
			{
				//synchronized(obj)//con esto controlamos la excllusi�n mutua..pero �y si lo hubiesemos puesto fuera del for?
				//{
					cont++;
				//}
			}
		}
	}
	
	public static int getCont()
	{
		return cont;
	}

}
