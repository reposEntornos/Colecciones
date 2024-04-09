package linkedlist2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ArrayList {

	static LinkedList<Persona> link1 = new LinkedList<Persona>();
	static List<Persona> list1 = new ArrayList<Persona>();
	
	public static void main(String[] args) {

		
		// Crear objetos personas que luego añadiremos a la lista
		Persona p1,p2,p3,p4,p5;
		p1 = new Persona("Antón", "Carlos", LocalDate.of(1950, 5, 30) );
		p2 = new Persona("Martinez", "Luis", LocalDate.of(1980, 12, 8) );
		p3 = new Persona("Pérez", "Marta", LocalDate.of(2000, 8, 20) );
		p4 = new Persona("Lopez", "Sara", LocalDate.of(1960, 10, 30) );
		p5 = new Persona("Gutierrez", "Pedro", LocalDate.of(2002, 6, 7) );
				
		// Insertamos personas en ambas colecciones, de manera que haya uno en común
		link1.add(p1);
		link1.add(p2);
		link1.add(p3);
		list1.add(p3);
		list1.add(p4);
		list1.add(p5);
		
		mostrarLinked();
		mostrarArrayList();
		
		// Añade al LinkedList todas las personas que tiene la segunda colección (ArrayList)
		link1.addAll(list1);
		
		System.out.println("---Después de añadir al LinkedList todo el ArrayList");
		mostrarLinked();
		mostrarArrayList();
		
		// Borra del LinkedList todas las personas que no estén en el ArrayList
		for (int i=0; i<link1.size(); i++) {
			// Comparo el elemento de la posición i del LinkedList con todos 
			// los elementos del ArrayList (iterator)
			
			Iterator<Persona> it = list1.iterator();
			boolean contiene=false;
			
			while (it.hasNext() && !contiene) {
				contiene=it.next().getApellido().equals(link1.get(i).getApellido());
			}
			
			if (!contiene) {
				link1.remove(i);
				i--;
			}
		}
		
		System.out.println("---Después de borrar del LinkedList los que no están en el ArrayList");
		mostrarLinked();
		mostrarArrayList();
		
		// Borra todas las personas de la primera colección
		Iterator<Persona> itLink = link1.iterator();
		while (itLink.hasNext()) {
			itLink.next();
			itLink.remove();
		}
		mostrarLinked();
		mostrarArrayList();

	}

	private static void mostrarArrayList() {
		System.out.println(" *** El ArrayList contiene:");
		for (Persona p2: list1) {
			System.out.println(p2.getApellido());
		}
		System.out.println();
	}

	private static void mostrarLinked() {
		System.out.println(" *** El LinkedList contiene:");
		for (Persona p1: link1) {
			System.out.println(p1.getApellido());
		}
		System.out.println();
	}

	
}
