import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int u;
        int t;
        int opcion;

        Scanner y = new Scanner(System.in);

        System.out.println("Por favor ingrese operación a realizar" +
                "\n1.Suma" +
                "\n2.Resta" +
                "\n3.Multiplicaicón" +
                "\n4.División");
        opcion = y.nextInt();
        System.out.println("Ingresar primer parametro:");
        u = y.nextInt();
        System.out.println("Ingresar segundo parametro:");
        t = y.nextInt();

        calculadora operacion = new calculadora(u,t);

        if (opcion == 1){
            operacion.hacer_suma(u,t);
            System.out.println(operacion.respuesta_suma());
        }else if (opcion == 2){
            operacion.hacer_resta(u,t);
            System.out.println(operacion.respuesta_resta());
        }else if (opcion == 3){
            operacion.hacer_multiplicacion(u,t);
            System.out.println(operacion.respuesta_multiplicacion());
        }else {
            operacion.hacer_division(u,t);
            System.out.println(operacion.respuesta_division());
        }
    }
}