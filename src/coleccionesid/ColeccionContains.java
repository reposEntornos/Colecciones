package coleccionesid;

import java.util.ArrayList;
import java.util.Collection;

public class ColeccionContains {

	public static void main(String[] args) {
		
		Collection<Persona> colec=new ArrayList<Persona>();
		
		// Insertamos unos cuantos elementos de tipo Integer
		colec.add(new Persona("Pablo", 33));
		colec.add(new Persona("María", 18));
		colec.add(new Persona("Pilar", 40));
		Persona per= new Persona("Pilar", 40);
		
		System.out.println("Está esa persona en la colección? " + colec.contains(per));
	}
}
