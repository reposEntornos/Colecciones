package arraylist;

import java.util.ArrayList;
import java.util.ListIterator;

public class IndicesArrayList {

	public static void main(String[] args) {

		// No especificamos el tipo de datos que almacenará
		ArrayList<Object> lista = new ArrayList<Object>();

		lista.add(3);
		lista.add(3.5);
		lista.add(1,"hola");
		lista.add(45);
		System.out.println("--- VER LISTA ---");
		visualizarLista(lista);
		
		lista.set(2, 'b');
		lista.remove(3);
		System.out.println("--- VER LISTA DESPUÉS lista.set(2, 'b') Y lista.remove(3); ---");
		visualizarLista(lista);
		
		lista.remove("hola");
		System.out.println("--- VER LISTA DESPUÉS lista.remove(\"hola\"); ---");
		visualizarLista(lista);
	}

	private static void visualizarLista(ArrayList<Object> lista) {
		ListIterator<Object> iter=lista.listIterator();
		
		while (iter.hasNext()) {
			System.out.println("En la posición " + iter.nextIndex() + " está el elemento " + iter.next());
		}
		
		System.out.println();		
	}
}
