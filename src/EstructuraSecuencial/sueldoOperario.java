package EstructuraSecuencial;
//sólo participan operaciones, entradas y salidas
import java.util.Scanner;
public class sueldoOperario {
    public static void main(String[] args) { // Todo programa constituido por una única clase debe tener definida la función main:

        Scanner teclado=new Scanner(System.in);
        int horasTrabajadas;
        float costoHora;
        float sueldo;
        System.out.print("Ingresar las horas trabajadas: ");
        horasTrabajadas=teclado.nextInt();
        System.out.print("Ingresar valor hora: ");
        costoHora=teclado.nextFloat();
        sueldo=horasTrabajadas*costoHora;
        System.out.print("El sueldo a pagar al trabajador es de: "+sueldo);

    }
}
