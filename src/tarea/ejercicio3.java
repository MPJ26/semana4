package tarea;
import java.util.Scanner;
public class ejercicio3 {
        public static void main (String[] args){
        int numero;
        String ingles="";
        Scanner lectura=new Scanner (System.in);
        //entrada de datos 
        System.out.print("Ingresar un numero entero entre 1 y 6: ");
        numero=lectura.nextInt();
        //porceso de datos
        switch (numero){
            case 1:ingles="one";break;
            case 2:ingles="two";break;
            case 3:ingles="tree";break;
            case 4:ingles="four";break;
            case 5:ingles="five";break;
            case 6:ingles="six";break;
        }   
        //SALIDA DE DATOS
        System.out.println("El numero que ingreso en ingles es: " +ingles );
    }      
}
