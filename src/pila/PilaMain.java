package pila;

public class PilaMain {

	public static void main(String[] args) {
		
		Pila p = new Pila();
		System.out.println("Cima:"+ p.cima());
		for (int i=1; i<=5; i++) {
			p.apilar(i);
		}
		System.out.println("Cima:"+ p.cima());
		p.desapilar();
		System.out.println("Cima:"+ p.cima());
	}
}
