package coleccionesCadenas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ColeccionesCadenas {

	public static void main(String[] args) {

		Collection<String> colec=new ArrayList<String>();
		
		// Insertamos unos cuantos elementos
		colec.add("hola");
		colec.add("buenos días");
		colec.add("buenas tardes");
		
		// Recorremos la colección y borramos los elementos que empiecen por b
		Iterator<String> iter = colec.iterator();
		String cadena;
		while (iter.hasNext()) {
			cadena= iter.next();
			if (cadena.charAt(0)=='b')
				iter.remove();
		}
		
		// Visualizamos la lista
		System.out.println("La lista ha quedado así:");
		iter=colec.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}		
	}
}
