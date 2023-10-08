package EstructuraCondicionalSimple;

import java.util.Scanner;
public class pagoConImpuesto {
    public static void main(String[] args) {
        float sueldo;
        double pagar;
        double impuesto=0.035;
        Scanner teclado=new Scanner(System.in);
        System.out.print("ingresar sueldo del trabajador :");
        sueldo= teclado.nextFloat();
        if (sueldo>3000){
            System.out.println("El salario ingrasado es mayor de 3000, el trabajador debe pagar impuestos por salarios del 3,5%. ");
            pagar=sueldo*impuesto;
            System.out.println("El impuesto a pagar es de: "+pagar);
        }else{
        }
    }
}

