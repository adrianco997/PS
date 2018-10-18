
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		THilo h1 = new THilo(1);
		THilo h2 = new THilo(2);
		THilo h3 = new THilo(3);
		h1.start();
		h2.start();
		h3.start();

		/*Todos los hilos ejecutar�n su run a la vez. No hay forma de saber cu�l se ejecutar� antes y cual despu�s
		  El main le va diciendo al sistema operativo oye lanza un hilo h1 y luego el h2...esas llamadas al SO llevan
		  su tiempo y adem�s los hilos no se tienen que ejecutar cuando se lanzan es por eso que se ejecuta a veces
		  el hilo 2 antes que el hilo 1.

		   NO sabemos nunca el orden de ejecuci�n de los hilos.

		   En este ejemplo el main se ejecuta en su propio hilo y �ste lanza los hilos h1 h2 h3. Esto significa que el
		   main le dice al SO oye ejecuta esto cuando puedas. Estos hilos h1 h2 h3 ser�n hilos secundarios, el principal
		   es el que ejecuta el public static main()*/


		System.out.println("Hilo del main sigue su ejecuci�n de forma paralela al resto de los hilos");

	}

}
