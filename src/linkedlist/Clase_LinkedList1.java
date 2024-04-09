package linkedlist;

import java.util.LinkedList;
import java.util.ListIterator;

public class Clase_LinkedList1 {

	public static void main(String[] args) {

		LinkedList<Producto> misProductos = new LinkedList<Producto>();
		
		Producto producto1, producto2, producto3, producto4;
		
		producto1 = new Producto("Detergente", "Ariel", 10.55);
		producto2 = new Producto("Leche", "Pascual", 2);
		producto3 = new Producto("Donuts", "Panrico", 1.75);
		producto4 = new Producto("Mayonesa", "Hellmans", 2.19);
		
		misProductos.add(producto1);
		misProductos.add(producto2);
		misProductos.add(producto2);
		misProductos.add(producto4);
		misProductos.add(producto3);
		misProductos.addFirst(producto2);
		
		// También se puede añadir la propia lista así misma
		// misProductos.addAll(misProductos);
		
		// Cambiar el precio al último producto
		misProductos.getLast().modificarPrecio(4.5);
		
		// Recorrer la lista con un ListIterator
		ListIterator<Producto> lit = misProductos.listIterator();
		
		while (lit.hasNext()) {
			((Producto) lit.next()).mostrarProducto();
		}
		
	}

}
