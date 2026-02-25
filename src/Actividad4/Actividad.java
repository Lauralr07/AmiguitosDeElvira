package Actividad4;

public class Actividad {


    public static void main(String[] args) {
        String nombre = "Ana";

        saludar(nombre);
        System.out.println("Número de caracteres: " + contarCaracteres(nombre));
        System.out.println("En mayúsculas: " + convertirMayusculas(nombre));
        System.out.println("¿Empieza por vocal? " + empiezaPorVocal(nombre));
    }

    // Método 1: saluda a la persona
    public static void saludar(String nombre) {
        System.out.println("Buenos días mi estimado/a, " + nombre + "!");
    }

    // Método 2: devuelve cuántos caracteres tiene el nombre
    public static int contarCaracteres(String texto) {
    	if(texto == null) {
    		System.out.println("El texto es nulo");
    		return 0;
    	}
        return texto.length();
    }

    // Método 3: convierte el texto a mayúsculas
    public static String convertirMayusculas(String texto) {
        return texto.toUpperCase();
    }

    // Método 4: comprueba si empieza por vocal
    public static boolean empiezaPorVocal(String texto) {
        if (texto == null) {
            return false;
        }

        texto = texto.trim();
        if (texto.isEmpty()) {
            return false;
        }

        char primera = Character.toLowerCase(texto.charAt(0));
        return primera == 'a' || primera == 'e' || primera == 'i' || primera == 'o' || primera == 'u';
    }

    // Hola Raúl :D

}



