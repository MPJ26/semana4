package tarea;
import java.util.Scanner;
public class ejercicio1 {
    public static void main (String[] args){
        int numero;
        String palabra="";
        Scanner lectura=new Scanner (System.in);
        //entrada de datos 
        System.out.print("Ingresar un numero entero entre 1 y 5: ");
        numero=lectura.nextInt();
        //porceso de datos
        switch (numero){
            case 1:palabra="uno";break;
            case 2:palabra="dos";break;
            case 3:palabra="tres";break;
            case 4:palabra="cuatro";break;
            case 5:palabra="cinco";break;
           
        }   
        //SALIDA DE DATOS
        System.out.println("El numero que ingreso es: " +palabra );
    }
}
