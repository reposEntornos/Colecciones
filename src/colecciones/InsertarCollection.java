package colecciones;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class InsertarCollection {

	// Insertamos datos en una colección y posteriormente los visualizamos
	
	public static void main(String[] args) {
		
		// Collection es una interfaz con lo cual no se puede instanciar
		// Por ello, utilizamos una de las clases que implementan Collection
		Collection<Integer> colec=new ArrayList<Integer>();
		
		// Insertamos unos cuantos elementos de tipo Integer
		colec.add(25);
		colec.add(50);
		colec.add(38);
		
		// Defino un iterator para recorrer la colección y visualizar los datos
		Iterator<Integer> iterador = colec.iterator();
		while (iterador.hasNext()) {
			System.out.println("El dato es " + iterador.next());
		}
	}

}
