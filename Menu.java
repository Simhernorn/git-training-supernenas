package git-training-supernenas;

import java.util.Scanner;

public class Menu {

    private Scanner scanner = new Scanner(System.in);

    public void mostrarMenu() {
        System.out.println("======================");
        System.out.println("    MENU PRINCIPAL    ");
        System.out.println("======================");
        System.out.println();
        System.out.println("Equipo: Supernenas");
        System.out.println();
        System.out.println("1. Ver miembros");
        System.out.println("2. Ver tecnologias");
        System.out.println("3. Ver informacion del proyecto");
        System.out.println("0. Salir");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                Miembros miembros = new Miembros();
                miembros.mostrarMiembros();
                break;
            case 2:
                Tecnologias tecnologias = new Tecnologias();
                tecnologias.mostrarTecnologias();
                break;
            case 3:
                Info info = new Info();
                info.mostrarInfo();
                break;
            case 0:
                System.out.println("Saliendo del programa...");
                break;
            default:
                System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");
        }

        scanner.close();
    }
}