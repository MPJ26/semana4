package Programa;
import java.util.Scanner;
public class Programa2 {
    public static void main (String[] args){
        int numero;
        String diasem="";
        Scanner lectura=new Scanner (System.in);
        //entrada de datos 
        System.out.print("Ingresar un numero[1-7]: ");
        numero=lectura.nextInt();
        //porceso de datos
        switch (numero){
            case 1:diasem="Lunes";break;
            case 2:diasem="Martes";break;
            case 3:diasem="Miercoles";break;
            case 4:diasem="Jueves";break;
            case 5:diasem="Viernes";break;
            case 6:diasem="Sabado";break;
            case 7:diasem="Domingo";break;
        }   
        //SALIDA DE DATOS
        System.out.println("El nombre del día de la semana es: " +diasem );
    }
}
