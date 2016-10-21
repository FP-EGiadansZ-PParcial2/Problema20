/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema20;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2; //declaramos variables
        n1=getNum("1"); 
        n2=getNum("2");//metodos para obtener los numeros necesarios
        numAmigos(n1,n2);//determinar si son numeros amigos
    }
     public static int getNum(String d){ //obtemos numeros con este metodo
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero "+d);
        num = teclado.nextInt();
        return num;
    }
    public static void numAmigos(int num1,int num2){ 
        int suma1, suma2; //declaramos variables para la suma de sus divisores
        suma1 = 0;
        suma2 = 0;
        for(int i=1;i<num1;i++){ //ciclo for para determinar divisores del primer numero
            if(num1%i==0){  //cuando el residuo del numero entre el valor de i sea 0, añadira el valor de los divisores a la suma   
                suma1=suma1+i; 
            }
        }
        if(suma1==num2){ //condicion para que sean numeros amigos
            for(int i=1;i<num2;i++){ //mismo ciclo for pero para los divisores del segundo
                if(num2%i==0){  //mismo proceso que en el ciclo anterior
                    suma2=suma2+i;
                }
            }
        }
        if(suma2==num1){ //si la suma de los divisores del segundo es igual o no al primer numero, muestra resultados
            System.out.print("Los numeros "+num1+" y "+num2+" son amigos");   
        }else{ 
            System.out.print("Los numeros "+num1+" y "+num2+" no son amigos"); 
        }
    }
}
