package cola;

import java.util.LinkedList;

public class Cola {

	// Se puede indicar Object y así la clase se puede utilizar con 
	// diferentes tipos de datos
	private LinkedList<Object> cola;
	
	public Cola() {
		this.cola = new LinkedList<>();
	}
	
	public void encolar(Object elemento) {
		cola.add(elemento);
	}
	
	public Object desencolar() {
		return cola.remove();
	}
	
	public Object frente() {
		return cola.peek();
	}
}
