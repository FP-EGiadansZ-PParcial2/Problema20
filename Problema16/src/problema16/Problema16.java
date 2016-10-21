/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema16;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n1,n2,n3; //declaramos variables para los 3 numeros que se piden
        n1=getNum("primer"); //utilizamos el mismo metodo para pedir los 3 numeros
        n2=getNum("segundo");
        n3=getNum("tercer");
        compara(n1,n2,n3); //comparamos para ver cual es el mayor y mostramos
        
    }
    public static double getNum(String d){ //Pedimos el numero a utilizar
        double num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el "+d+" numero");
        num=teclado.nextDouble();
        return num;
    }
    public static void compara(double num1,double num2,double num3){ /*Hacemos
        comparaciones por fases para determinar el numero mas grande*/
        double numero;
        if (num1>num2){
            numero=num1;
        }else{ numero=num2;}
        if (numero>num3){
            System.out.println("El numero mayor es "+numero); //mostramos el numero mayor
        }else{ System.out.println("El numero mayor es "+num3);
        
        }
    }
        
      
}
