package EstructuraCondicionalesAnidadas;
//es anidada cuando por la rama del verdadero o el falso de una estructura condicional hay otra estructura condicional.
import java.util.Scanner;
public class notasDeEstudiante {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    float nota1,nota2,nota3,promedio,notasTotal;
        System.out.print("Ingrese la nota 1 :");
        nota1= teclado.nextFloat();
        System.out.print("Ingrese la nota 2 :");
        nota2= teclado.nextFloat();
        System.out.print("Ingrese la nota 3 :");
        nota3= teclado.nextFloat();
        notasTotal=(nota1+nota2+nota3);
        promedio=(notasTotal/3);
        if (promedio>=7){
            System.out.println("El estudiante ha sido | promocionado |");
        }else{
            if (promedio>4 & promedio<7){
                System.out.println("El estudiante tiene desempeño regular");
            }else{
                System.out.println("El estudiante ha sido | reprobado |");
            }
        }
    }
}
