/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import java.util.Scanner;
import paquete3.Informacion;
import paquete1.Mensaje;


/**
 *
 * @author reroes
 */
public class Demo002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // variable donde almaceno el valor que ingresa el usuario
        short valor;
        // lectura del numero
        System.out.println("Ingrese un valor:");
        System.out.println("a) Del 1 al 5: Mensaje Original");
        System.out.println("b) Menor a 1 o Mayor a 5: Mensaje en Mayusculas");
        valor = sc.nextShort();
        // variables donde se encuentra el mensaje original
        String mensaje = Mensaje.obtenerMensaje();
        int habitantes = Informacion.obtenerHabitantes() ;
        // verifica que el numero sea del 1 al 5
        if (valor >= 1 && valor <=5) {
            System.out.printf(" %scon %d\n ", mensaje
                ,habitantes ); // imprime el mensaje original
        } else { // si el numero es menor a 1 o mayor a 5 
            mensaje = mensaje.toUpperCase(); // convertimos el mensaje a mayus.
            System.out.printf(" %scon %d\n ", mensaje
                ,habitantes ); // imprimo el mensaje en mayusculas
        }
        
        
        
        
        // usar printf;
        
        
    }
    
}
