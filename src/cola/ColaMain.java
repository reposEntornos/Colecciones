package cola;

public class ColaMain {

	public static void main(String[] args) {
		Cola c = new Cola();
		System.out.println("Frente:"+ c.frente());
		for (int i=1; i<=5; i++) {
			c.encolar(i);
		}
		System.out.println("Frente:"+ c.frente());
		c.desencolar();
		System.out.println("Frente:"+ c.frente());
	}
}
