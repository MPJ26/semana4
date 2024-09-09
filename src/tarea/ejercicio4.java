package tarea;
import java.util.Scanner;
public class ejercicio4 {
    public static void main (String[] args){
        int numero;
        String mes="";
        Scanner lectura=new Scanner (System.in);
        //entrada de datos 
        System.out.print("Ingresar un numero entero entre 1 y 12: ");
        numero=lectura.nextInt();
        //porceso de datos
        switch (numero){
            case 1:mes="enero";break;
            case 2:mes="febrero";break;
            case 3:mes="marzo";break;
            case 4:mes="abril";break;
            case 5:mes="mayo";break;
            case 6:mes="junio";break;
            case 7:mes="julio";break;
            case 8:mes="agosto";break;
            case 9:mes="setiembre";break;
            case 10:mes="octubre";break;
            case 11:mes="noviembre";break;
            case 12:mes="diciembre";break;
        }   
        //SALIDA DE DATOS
        System.out.println("El numero que ingreso en ingles es: " +mes );
    }
}
