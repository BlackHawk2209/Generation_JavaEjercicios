import java.util.List;
import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class Colecciones {
	
	public static void main(String[] args) {
		/*La coleccion Set  no puede contener elementos duplicados
		 * Solo tiene los metodos heredados de collection 
		 * 
		 * Existen diferentes tipos de implementaciones
		 * 
		 * HashSet: Esta implementacion almacena los elementos en una tabla hash.
		 * Es la que mejor rendimiento tiene
		 * 
		 * HashSet - 
		 * TreeSet - 
		 * LinkedHashSet - Respeta el orden de insercion
		 */
	/*	Set<String> frutas = new HashSet();
		frutas.add("Mango");
		frutas.add("Manzana");
		frutas.add("Durazno");
		frutas.add("Pera");
		frutas.add("Cereza");
		frutas.add("Mandarina");
		frutas.add("Carambola");
		frutas.add("Maracuya");
		frutas.add("Platano");

		for(String fruta: frutas) {
			System.out.println(fruta);
		} 
		/*System.out.println(frutas.contains("Mango")); //Revisamos si tiene un mango regresa true/false*/
		
		/*
		 * La interfaz List define una sucesion de elementos
		 * Si admite elementos duplicados 
		 * Añade nuevos metodos que podemos usar 
		 * Acceso posicional a elementos: manejan posiciones desde la posicion 0
		 * Busqueda de elementos :
		 * Rango de operacion: ciertas operaciones de donde a donde
		 * 
		 * Tenemos el ArrayList y el LinkedList
		 * 
		 */
		
		List<String> frutas2 = new ArrayList<String>();
		frutas2.add("Mango");
		frutas2.add("Manzana");
		frutas2.add("Durazno");
		frutas2.add("Pera");
		frutas2.add("Cereza");
		frutas2.add("Mandarina");
		frutas2.add("Carambola");
		frutas2.add("Maracuya");
		frutas2.add("Platano");
		frutas2.add("Mango");
		
		for(String f: frutas2) {
			System.out.println(f);
		}
		
		int pera= frutas2.indexOf("Pera");
		System.out.println(pera);
		System.out.println(frutas2.get(pera));
		
		List<Integer> agenda = new ArrayList<Integer>();
		agenda.add(123);
		agenda.add(874);
		agenda.add(778);
		
		for (Integer a: agenda) {
			System.out.println(a);
		}
		
		//LinkedList  mejor rendimiento para insertar o eliminar datos
		List<String> animales = new LinkedList<String>();
		animales.add("Perro");
		animales.add("Gato");
		animales.add("Conejo");
		animales.add("Tortuga");
		animales.add("Oso");
		animales.add("Quetzal");
		
		
		/*
		 * La interfaz mapa asocia claves a valorres
		 * No puede contener claves duplicadas
		 * y cada una clave solo puede tener un valor asociado
		 * 
		 *  HashMap
		 *  TreeMap
		 *  LinkedMap
		*/
		
		Map diccionario = new HashMap();  //NO RESPETA UN ORDEN ESPECIFICO. TreeMap SI ORDENA ALFABETICO
		// put= insertar     diccionario.put(clave, valor);
		diccionario.put("elemento1", "Carlos Eduardo");
		diccionario.put(34, "Algo");
		diccionario.put(232323, "sdsdsdf");
	//	System.out.println(diccionario.get("elemento1")); //Imprime Carloseduardo imprime lo que es los datos de la llave que definimos
		
	/*	for(Iterator<Map.Entry<Integer, String>> entries = diccionario.entrySet().iterator(); entries.hasNext(); ) {
			Map.Entry<Integer, String> entry = entries.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		*/
		for(Map.Entry<String, String> entry : diccionario.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		
	}
	
	
}
