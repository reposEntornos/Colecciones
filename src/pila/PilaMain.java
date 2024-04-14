package pila;

public class PilaMain {

	public static void main(String[] args) {
		// Crear un objeto Pila
		Pila p = new Pila();

		// Mostramos la cima de la pila antes de insertar, nos dará null porque está vacía
		System.out.println("Cima:"+ p.cima());
		for (int i=1; i<=5; i++) {
			p.apilar(i);
		}
		System.out.println("Cima:"+ p.cima());
		p.desapilar();
		System.out.println("Cima:"+ p.cima());
	}
}
