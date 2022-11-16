package Tema_5;
import java.util.Scanner;


/**
 * Escriviu aquí una descripcìó de la classe Entrega_arrays_2
 * 
 * @author (el vostre nom) 
 * @version (un número de versió o la data)
 */
public class Entrega_arrays_2 {
    public static void Act1(){
        double array[] = new double[100];
        for(int i = 0; i<100 ; i++){
            array[i]=Math.random();
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el valor R.");
        double n = s.nextDouble();
        int sum = 0;
        for(int i = 0; i<100 ; i++){
            if(array[i]>=n){
                sum++;
            }
        }
        System.out.println( sum + " valors son iguals a R");
    }
    public static void Act2(){
        int array[] = new int[100];
        for(int i = 0; i<100 ; i++){
            array[i]=(int) (1 + Math.random()*10);
        }
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el valor N.");
        int n = s.nextInt();
        for(int i = 0; i<100 ; i++){
            if(array[i]==n){
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    public static void Act3(){
        Scanner s = new Scanner(System.in);
        System.out.println("Introdueix el valor N.");
        int n = s.nextInt();
        double max = 0, min = 0, sum = 0;
        int baix = 0, dalt = 0;
        double array[] = new double[n];
        for(int i = 0; i<n;i++){
            System.out.print("Introduce una altura: ");
            double x = s.nextDouble();
            if(i == 0){
               max = x;
               min = x;
            }
            if(x>max){
                max = x;
            }
            if(x<min){
                min = x;
            }
            array[i]=x;
            sum += x;
        }
        double mit = sum/n;
        for(int i = 0; i<n;i++){
            if(array[i]>mit){
                dalt++;
            }
            if(array[i]<mit){
                baix++;
            }
        }
        System.out.println("Mitjana: " + mit);
        System.out.println("Maxim: " + max);
        System.out.println("Minim: " + min);
        System.out.println("Damunt de la mitja: " + dalt);
        System.out.println("Baix de la mitja: " + baix);
    }
}
