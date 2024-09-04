import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {  
    
    //Clase scanner que nos permite que el usuario escriba    
    Scanner scanner = new Scanner(System.in);


    // Declaraciones y asignaciones
    String palabraSecreta = "inteligencia";
    int intentosMaximos = 10;
    int intentos = 0;
    boolean palabraAdivinada = false;

    //Arreglos
    char[] letrasAdivinadas = new char[palabraSecreta.length()];
    
    //Estructura de control de tipo interactiva
    for (int i = 0; i < letrasAdivinadas.length; i++) {
        letrasAdivinadas[i] = '_';
        System.out.println(letrasAdivinadas[i]);
    }

    //Estructura de control de tipo interactiva

    while (!palabraAdivinada && intentos < intentosMaximos) {
        System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));

        System.out.println("Por favor introduce una letra");

        //Usamos la clase scanner para pedir una letra
        char letra = Character.toLowerCase(scanner.next().charAt(0));

        boolean letraCorrecta = false;

        //Estrucutra de control: Iterativa (Bucle)
        for (int i = 0; i < palabraSecreta.length(); i++) {
        // Estructua de control : condicional
        if (palabraSecreta.charAt(i)== letra) {
            letrasAdivinadas[i] = letra;
            letraCorrecta = true;    
        }    
            
        }

        if (!letraCorrecta) {
            intentos++;
            System.out.println("Incorrecto Te quedan " + (intentosMaximos - intentos) + "" + " intentos.");
        }

        if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
            palabraAdivinada = true;
            System.out.println("Felicidades has adivinado la palabra secreta: " + palabraSecreta);   
        }

        

    }
        if (!palabraAdivinada) {
         System.out.println("Ups, Te quedaste sin intentos!! GAME OVER!!");
    }
        scanner.close();

    }
}
