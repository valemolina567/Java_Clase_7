/*
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        // Crear instancia de Neymar
        Neymar neymar = new Neymar();

        // FORMA 1: UTILIZANDO EL BUFFEREDREADER br
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Leer cadenas de caracteres.
        String var1; // Creamos una variable para leer.
        System.out.println("Nombre (Forma 1): ");
        var1 = br.readLine(); // Leemos la entrada como cadena.
        neymar.setNombre(var1); // Asignamos la variable leída con el setter.

        // Cambiar una cadena de caracteres a un integer.
        System.out.println("Edad (Forma 1): ");
        String var2 = br.readLine(); // Leemos la entrada como cadena.
        int edad = Integer.parseInt(var2); // Convertimos la cadena a un entero.
        neymar.setEdad(edad); // Asignamos la edad usando el setter.

        // FORMA 2: UTILIZANDO EL SCANNER sc
        Scanner sc = new Scanner(System.in);

        // Leer el nombre.
        System.out.print("Nombre (Forma 2): ");
        String var3 = sc.nextLine(); // Leer una línea completa como cadena.
        neymar.setNombre(var3); // Asignamos la variable leída con el setter.

        // Leer la edad como un entero.
        System.out.print("Edad (Forma 2): ");
        int edad1 = sc.nextInt(); // Leer un entero directamente.
        neymar.setEdad(edad1); // Asignamos la edad usando el setter.

        // FORMA 3: Utilizando JOptionPane para ventanas emergentes
        String nombre8 = JOptionPane.showInputDialog(null, "Nombre del jugador");
        neymar.setNombre(nombre8);
        neymar.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, "Edad del jugador")));

        // Mostrar un mensaje
        JOptionPane.showMessageDialog(null, "Atención!");

        // Cerrar recursos
        sc.close();
    }
}
*/
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        // Crear instancia de Leer
        Leer datos = new Leer();

        // FORMA 3: Utilizando JOptionPane para ventanas emergentes
        String nombre8 = JOptionPane.showInputDialog(null, "Ingrese su nombre:");
        datos.setNombre(nombre8);  // Asignamos el nombre

        String edadInput = JOptionPane.showInputDialog(null, "Ingrese su edad:");
        int edad8 = Integer.parseInt(edadInput); // Convertimos la edad de String a int
        datos.setEdad(edad8);  // Asignamos la edad

        // Mostrar la información ingresada
        JOptionPane.showMessageDialog(null, "Jugador: " + datos.getNombre() + "\nEdad: " + datos.getEdad());

        // Mostrar los datos en una ventana emergente
        /*JOptionPane.showMessageDialog(null,
                "Nombre: " + datos.getNombre() + "\nEdad: " + datos.getEdad());
        */

        // Imprimir los datos en la consola
        System.out.println("Nombre: " + datos.getNombre());
        System.out.println("Edad: " + datos.getEdad());
    }
}