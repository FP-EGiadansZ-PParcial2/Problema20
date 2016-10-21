/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema13;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[]serie = new int[30];
        int p;
        serie = llenaPosic(serie);
        p = calcProm(serie);
        muestra(serie,p);
    }
    public static int[] llenaPosic(int[]s){ //Llenaremos el arreglo pidiendo los datos por posicion
        Scanner entrada = new Scanner(System.in);
        int i=0;
        while(i < s.length){  
            System.out.println("Introduce un dato para la posicion [" +i +"]");
            s[i]=entrada.nextInt();
            i++;
        }
    return s;
    }
    public static int calcProm(int[] s){ //calcularemos el promedio de los datos dados
        int prom=0,n=0; //variables para el promedio y la cantidad de datos contabilizados
        for (int i=1; i<s.length; i++){ //establecemos que el for dejara de sumar cuando se llegue a la ultima posicion
            prom = s[i]+prom; //Aqui se van sumando los datos 
            ++n; //Se lleva cuenta del numero de datos
        }
            prom=prom/n;
        System.out.println("El promedio de los datos obtenidos es " +prom);
        return prom;
    }
    public static void muestra(int[]s, int prom){ //Veremos cuantos datos estan por encima y debajo del promedio
        int x1=0, x2=0; //variables que registran calificaciones por encima y debajo del promedio
        for(int i=0;i<s.length;i++)
            if(s[i]<prom){ //para calificaciones por encima del promedio 
                x1++;
            }else{
                //Para las que estan por debajo 
                x2++;
            }
        System.out.println("Hay " +x1 +" calificaciones por encima del promedio");
        System.out.println("Hay " +x2 +" calificaciones por debajo del promedio");
    }
}