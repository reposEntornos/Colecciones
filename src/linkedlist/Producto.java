package linkedlist;

public class Producto {

	private String nombre;
	private String marca;
	private double precio;
	
	public Producto() {
		super();
	}
	
	public Producto(String nombre, String marca, double precio) {
		super();
		this.nombre = nombre;
		this.marca = marca;
		this.precio = precio;
	}
	
	/**
	 * Asignar un nuevo precio al producto
	 * @param precioNuevo
	 */
	public void modificarPrecio (double precioNuevo) {
		precio = precioNuevo;
	}
	
	public void mostrarProducto () {
		System.out.println(nombre + " de " + marca + ". Precio: " + precio);
	}
}
