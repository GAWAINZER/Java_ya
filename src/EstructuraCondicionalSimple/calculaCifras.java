package EstructuraCondicionalSimple;
import java.util.Scanner;
public class calculaCifras {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero entero de N cantidad de cifras, se identificaran las tres primeras cifras:");
        numero= teclado.nextInt();
        if ((numero>=0 && numero<10)||(numero<=0 && numero>-10)){
            System.out.println("el numero tiene 1 digito");
        } else if ((numero>=10 && numero<100) || (numero<=-10 && numero>-100)) {
            System.out.println("el numero tiene 2 digitos");
        } else if ((numero>=100 && numero<1000) || (numero<=-100 && numero>-1000)) {
            System.out.println("el numero tiene 3 digitos");
        }else {
            System.out.println("el numero tiene mas de 3 digitos");

        }
    }
}
