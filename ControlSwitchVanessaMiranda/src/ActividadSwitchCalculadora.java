import java.util.Scanner;
    public class ActividadSwitchCalculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion;
        double a;
        double b;
        double resultado = 0;

        System.out.println("MENU");
        System.out.println("1) Sumar");
        System.out.println("2) Restar");
        System.out.println("3) Multiplicar");
        System.out.println("4) Dividir");

        System.out.print("Elige una opcion: ");
        opcion = sc.nextInt();


        System.out.print("Ingresa el valor de a: ");
        a = sc.nextDouble();

        System.out.print("Ingresa el valor de b: ");
        b = sc.nextDouble();

        switch (opcion) {

            case 1:
                resultado = a + b;
                System.out.println("Operacion: Suma");
                System.out.println("Valores: a = " + a + ", b = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 2:
                resultado = a - b;
                System.out.println("Operacion: Resta");
                System.out.println("Valores: a = " + a + ", b = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 3:
                resultado = a * b;
                System.out.println("Operacion: Multiplicacion");
                System.out.println("Valores: a = " + a + ", b = " + b);
                System.out.println("Resultado: " + resultado);
                break;

            case 4:
                System.out.println("Operacion: Division");
                System.out.println("Valores: a = " + a + ", b = " + b);

                if (b == 0) {
                    System.out.println("No se puede dividir entre cero");
                } else {
                    resultado = a / b;
                    System.out.println("Resultado: " + resultado);
                }
                break;

            default:
                System.out.println("Opcion invalida");
                break;
        }

        sc.close();
    }
    }




