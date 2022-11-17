package Tema_5;
import java.util.Scanner;


/**
 * Escriviu aquí una descripcìó de la classe Arrays_3
 * 
 * @author (el vostre nom) 
 * @version (un número de versió o la data)
 */
public class Arrays_3 {
    public static void Act1(){
        int array1[] = new int[100];
        int cont = 0;
        for(int i = 1; i<11;i++){
            for(int j = 1; j<i+1;j++){
               array1[cont]=i;   
               System.out.print(i + ", ");
            }
        }
        
    }
    public static void Act2(){
        Scanner s = new Scanner(System.in);
        int array1[] = new int[10];
        int array2[] = new int[10];
        int cont = 0;
        for(int i = 0; i<20 ;i++){
            System.out.println("Introdueix un enter");
            int x = s.nextInt();
            if(i<10){
                    array1[i] = s.nextInt();
            }
            if(i == 10){
                System.out.println("Cambi de array");
            }
            if(i>=10){
                    array2[cont] = s.nextInt();
                    cont++;
            }
        }
        if(array1==array2){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("Son diferentes");
        }
    }
}
