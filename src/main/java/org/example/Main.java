package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean seguir = true;

        while (seguir) {
            System.out.println("¿Qué vehículo entra?");
            System.out.println("1. Coche");
            System.out.println("2. Moto");
            System.out.println("3. Camión");
            System.out.println("4. Tractor");
            System.out.println("5. Grúa");
            System.out.print("Seleccione un número: ");
            int tipo = Integer.parseInt(scanner.nextLine());

            System.out.print("Ingrese la matrícula: ");
            String matricula = scanner.nextLine();

            System.out.print("Ingrese el color: ");
            String color = scanner.nextLine();

            System.out.print("Ingrese la marca: ");
            String marca = scanner.nextLine();

            Vehiculo vehiculo = null;

            switch (tipo) {
                case 1:
                    vehiculo = new Coche(matricula, color, marca);
                    break;
                case 2:
                    vehiculo = new Moto(matricula, color, marca);
                    break;
                case 3:
                    vehiculo = new Camion(matricula, color, marca);
                    break;
                case 4:
                    vehiculo = new Tractor(matricula, color, marca);
                    break;
                case 5:
                    vehiculo = new Grua(matricula, color, marca);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    continue;
            }

            if (vehiculo != null) {
                vehiculo.reparar();
            }

            System.out.print("¿Desea seguir? (s/n): ");
            String opcion = scanner.nextLine();
            seguir = opcion.equalsIgnoreCase("s");
        }

        scanner.close();
        System.out.println("Gracias por usar el sistema de taller.");
    }
}
