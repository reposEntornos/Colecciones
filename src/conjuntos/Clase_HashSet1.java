package conjuntos;

import java.util.HashSet;

public class Clase_HashSet1 {

	public static void main(String[] args) {

		// Declaro un HashSet con todos los profesores
		HashSet<String> conjuntoProfesores = new HashSet<>();
		conjuntoProfesores.add("María Jesús");
		conjuntoProfesores.add("Juan Carlos");
		conjuntoProfesores.add("Tamara");
		conjuntoProfesores.add("Elena");
		
		System.out.println(conjuntoProfesores);
		
		// El método contains devuelve true si el elemento existe, si existe lo borra
		System.out.println(conjuntoProfesores.contains("Tamara"));
		if (conjuntoProfesores.contains("Tamara"))
			conjuntoProfesores.remove("Tamara");
		System.out.println(conjuntoProfesores.contains("Tamara"));
		System.out.println("El HashSet tiene " + conjuntoProfesores.size() + " elementos");	

		// Visualizar los elementos del conjunto
	}
}
