package tarea;
import java.util.Scanner;
public class ejercicio2 {
        public static void main (String[] args){
        int numero;
        String romano="";
        Scanner lectura=new Scanner (System.in);
        //entrada de datos 
        System.out.print("Ingresar un numero entero entre 1 y 10: ");
        numero=lectura.nextInt();
        //porceso de datos
        switch (numero){
            case 1:romano="I";break;
            case 2:romano="II";break;
            case 3:romano="III";break;
            case 4:romano="IV";break;
            case 5:romano="V";break;
            case 6:romano="VI";break;
            case 7:romano="VII";break;
            case 8:romano="VIII";break;
            case 9:romano="IX";break;
            case 10:romano="X";break;
        }   
        //SALIDA DE DATOS
        System.out.println("El numero que ingreso en romanos es: " +romano );
    }
}
