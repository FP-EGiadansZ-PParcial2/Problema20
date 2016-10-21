/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n=getNum(); //variable y metodo para obtener numero de datos en la sucesion
        muestraFibo(n); //calcula y muestra los datos deseados de la sucesion de Fibonacci
    }
    public static int getNum(){ //pedimos numero por teclado
        int numer;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el numero de datos de la sucesion de Fibonacci que deseas visualizar ");
        numer=teclado.nextInt();
        return numer;
    }
    
   public static void muestraFibo(int numer){
        System.out.println("Los primeros " +numer +" numeros de la sucesion Fibonacci son ");
        int dato1=0,dato2=1; /*inicializamos dos variables porque son las que necesita
        la sucesion de Fibonacci para iniciar*/
        System.out.println("\n" +dato1); //mostramos el primer dato de la sucesion (0)
        for(int i=2;i<=numer;++i){ /*iniciamos un ciclo for para sumar automaticamente
            los numeros "posteriores" de la sucesion*/ 
         System.out.print("\t" +dato2);
            dato2=dato1+dato2; //condiciones para que funcione el ciclo en la sucesion
            dato1=dato2-dato1;   
        }
    }
}
