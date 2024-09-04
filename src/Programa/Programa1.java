package Programa;
import java.util.Scanner;
public class Programa1 {
   public static void main (String[] args){
        //declarar variables
        int n1,n2,r,opc;
        Scanner lectura=new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingrese número 1: ");
        n1=lectura.nextInt();
        System.out.print("Ingrese número 2: ");
        n2=lectura.nextInt();
        System.out.print("Indica la operación a realizar[1(+), 2(-), 3(*), 4(/)]:");
        opc=lectura.nextInt();
        //procesar datos
        r=0;
        switch (opc) {
            case 1:
                r=n1+n2;
                break;
            case 2:
                r=n1-n2;
                break;
            case 3:
                r=n1*n2;
                break;                   
        } 
        //salida de datos
        System.out.println("Resultado");  
        System.out.println("El resultado de la operación es: "+r);
   }
}
