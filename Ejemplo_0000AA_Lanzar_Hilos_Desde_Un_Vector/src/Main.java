
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		THilo[] vectHilos = new THilo[5];

		for (int i=0;i<vectHilos.length;i++){
			vectHilos[i] = new THilo(i+1);
		    vectHilos[i].start();

		}

		/*podemos observar que no podemos saber qu� hilo se ejecutar� antes. Ahora �podr�amos hacer que el hilo principal
		 * (El del Main) se ejecute siempre al final?
		 * Hay que tener en cuenta que todos los hilos incluido el del main se destruyen al finalizar su �ltima instrucci�n
		 * en el caso de los hilos del vector se destruir�n al terminar su ejecuci�n en el run(), pero el del main se des
		 * truir� al terminar su ejecuci�n del System.out.println de abajo....
		 * Por tanto si queremos que el hilo del Main no se destruya y que espere al resto de los hilos tendr�amos que
		 * utilizar el m�todo join de la clase Thread (que necesita un try catch).....por tanto con el m�todo join
		 * el hilo principal se ejutar� siempre despu�s del que hace el join
		 * .Si hubiesemos puesto el join dentro del for de arriba no conseguiriamos programaci�n paralela ya que el hilo del
		 * main no avanzar�a hasta que no terminara el hilo lanzado*/

	     try {
			vectHilos[0].join();
			vectHilos[1].join();
			vectHilos[2].join();

			/*Con esto */

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}




		System.out.println("Soy el hilo principal (el del Main)");

	}

}
