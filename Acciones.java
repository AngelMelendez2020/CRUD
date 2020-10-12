package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Acciones {

    List<String> Lista = new ArrayList<String>();
    Scanner leer = new Scanner(System.in);
    String in1, in2, in3;
    int hola;
    int hola2;

    public void insertar() {
        System.out.print("Inserte 3 diferentes nombres en la lista: ");
        Lista.add(leer.nextLine());
        Lista.add(leer.nextLine());
        Lista.add(leer.nextLine());

        System.out.println("");
    }

    public void mostrar() {
        System.out.println("Los nombres que has ingresaste son: " + Lista);

        System.out.println("");
    }

    public void actualizar() {
        System.out.println("**************Ingresa los datos que quieres actualizar***********");
        System.out.println("");

        System.out.println("Ingresa el dato que quieres actualizar en la posición 1: ");
        in1 = leer.nextLine();
        Lista.set(0, in1);

        System.out.println("Ingresa el dato que quieres actualizar en la posición 2: ");
        in2 = leer.nextLine();
        Lista.set(1, in2);

        System.out.println("Ingresa el dato que quieres actualizar en la posición 3: ");
        in3 = leer.nextLine();
        Lista.set(2, in3);

        System.out.println("La lista se ha actualizado a: " + Lista);

        System.out.println("");
    }

    public void Eliminar() {
        System.out.println("");

        if (Lista.size() == 0) {
            System.out.println("La lista está vacía, ingrese datos en la opción 1");
        } else {
            System.out.println("La lista es: " + Lista);

            System.out.println("1.-Eliminar un elemento de la lista   2.- Eliminar lista completa 3.-Salr al menú principal ");
            hola = leer.nextInt();
            if (hola == 1) {
                System.out.println("¿Cuál elemento quieres eliminar de la lista?");
                hola2 = leer.nextInt();
                Lista.remove(hola2 - 1);
                System.out.println("Los elementos de la lista ahora son: " + Lista);
                if (hola == 2) {
                    Lista.clear();

                } else {

                }

            }

        }

    }

}
