/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema18;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n1,n2,n3,may,min; //declaramos variables a utilizar
        n1 = getNum("1");
        n2 = getNum("2");
        n3= getNum("3"); //usamos un solo metodo para obtener los 3 numeros
        may = comparaMay(n1,n2,n3);//compararemos para obtener el mayor
        min = calcMin(n1,n2,n3,may); //hacemos el calculo del minimo comun multiplo
        muestra(min);
    }
    public static int getNum(String d){ //obtemos numero con este metodo
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero "+d);
        num = teclado.nextInt();
        return num;
    }
    public static int comparaMay(int n1, int n2, int n3){
        int m1=0; //Realizamos la comparacion para obtener el numero mayor y guardarlo en una variable
        if(n1>n2&&n1>n3){
            m1 = n1;
        }else if(n2>n1&&n2>n3){
            m1 = n2;
        }else if(n3>n1&&n3>n2)
            m1 = n3;
        return m1;
    }
    public static int calcMin (int n1, int n2, int n3, int m1){
        int m2 = 0;
        for (int i=m1;i<=m1 && i>1;i--){ //Este for nos sirve para encontrar finalmente el mcd
            if (n1%i==0 && n2%i==0 && n3%i==0){ //si todos son divisibles entre el, se tomara como el resultado
                m2 = i; //asignamos ese mcd a una variable
            }   
        }
        return m2;
    }
    public static void muestra(int m2){ //mostramos el resultado del metodo anterior
        System.out.println("El minimo comun divisor de numeros dados es " +m2);
    }    
    
}
