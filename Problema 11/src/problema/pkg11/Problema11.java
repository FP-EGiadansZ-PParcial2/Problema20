/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema.pkg11;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nRoma= {"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        //creamos una base de datos de los numeros romanos existentes
        int[] nNorm= {1,4,5,9,10,40,50,90,100,400,500,900,1000}; 
        //damos los valores equivalentes de cada numero romano en sistema decimal
        int n=getNum(); //pedimos el numero que deseamos convertir
        convertirNumero(n,nRoma,nNorm); //llevamos a cabo la conversion
    }
    public static int getNum(){ //pedimos numero por teclado
        int num;
        Scanner teclado=new Scanner(System.in);
        System.out.println("¿Que numero deseas convertir a Romano?");
        num=teclado.nextInt();
        return num;
    }
    public static void convertirNumero(int num,String[]nRoma, int[]nNorm){
        String r=""; //Se declara una cadena
            for(int i=nNorm.length-1;i>=0;i--){//Volteamos el arreglo para iniciar por el numero mayor, tomando como referencia la posicion final del arreglo
                int divide=num/nNorm[i];/*creamos una variable que nos permita saber si y cuantas veces podemos dividir el numero inicial entre la posicion
                sabiendo cuantas veces, podemos determinar el primer numero de la posicion*/
                while(divide>0){ 
                    r=r+nRoma[i]; //Aqui es donde asignamos el valor en romano al numero obtenido
                    divide--; 
                }
                num=num%nNorm[i]; //En este punto podemos reducir la cantidad de cifras del numero inicial y repetir eel proceso con el resto del numero
            }
           System.out.print(r); 
    }
}
