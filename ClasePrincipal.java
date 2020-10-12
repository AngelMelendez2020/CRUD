import java.util.List;
import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        Acciones obj = new Acciones();

        int opcion;
        Scanner leer = new Scanner(System.in);
        do {
            System.out.println("1.- Insertar nombres en la tabla: ");
            System.out.println("2.- Leer la lista: ");
            System.out.println("3.- Actualizar la lista: ");
            System.out.println("4.- Borrar elementos o eliminar lista completa: ");
            System.out.println("5.- Salir");

            System.out.println("¿Qué quieres hacer?: ");
            opcion = leer.nextInt();

            switch (opcion) {

                case 1:

                    obj.insertar();

                    break;

                case 2:
                    
                    obj.mostrar();
                    
                    break;
                    
                case 3:
                    System.out.println("¿Desea continuar? 1.- Si 2.- No");
                    opcion = leer.nextInt();

                    if (opcion == 1) {
                        obj.actualizar();
                    }
                    break;

                case 4:

                    obj.Eliminar();

                    break;

            }

        } while (opcion != 0 && opcion != 5);

    }
}
