
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Thread[] hilos = new Thread[1000];

				for (int i=0;i <hilos.length; i++){

					hilos[i] = new Thread(new RHilo());
					hilos[i].start();
				}

				/*El problema es que se va a ejecutar la linea de abajo cuando todab�a se est�n
				 * ejecutando los hilos que lanz�...adem�s incluso aunque lo solucionemos con
				 * un join...los hilos podr�an acceder al mismo tiempo a la variable cont*/

				/*Soluci�n parcial, sigue sin funcionar incluso con el for de abajo*/
				for (int i=0;i <hilos.length; i++){
					try {
						hilos[i].join();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				/*la raz�n por la cual ni con el join funcione es por el indeterminismo y esto
				ocurre cuando dos o m�s hilos intentan escribir en una variable compartida
				se produce indeterminaci�n, �Por qu� ocurre est? porque si 3 hilos accedieron
				a la vez y leyeron la variable a la vez con un valor por ejemplo 100, al incrementar
				el valor escribir�n 101 y no lo que corresponder�a "103". */
				System.out.println("El valor de cont es "+ RHilo.getCont());
	}

}
