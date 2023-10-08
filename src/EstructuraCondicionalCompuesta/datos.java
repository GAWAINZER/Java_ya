package EstructuraCondicionalCompuesta;
import java.util.Scanner;
public class datos {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int num1,num2;
        System.out.println("Ingrese un numero: ");
        num1= teclado.nextInt();
        System.out.println("Ingrese un numero: ");
        num2= teclado.nextInt();
        if (num1>num2){
            System.out.println("El numero mayor es: "+num1);
        }else{
            System.out.println("El numero mayor es: "+num2);
        }
    }
}
/* >  (mayor)
<  (menor)
>= (mayor o igual)
<= (menor o igual)
== (igual)
!= (distinto
* */