/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JKTV20Task4ArtjomKivonen;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author pupil
 */
public class JKTV20Task4ArtjomKivonen {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int[] numbers=new int[100];
        int count10=0;
        int summ = 0;
        double average;
        Random random=new Random();
        for(int i = 0; i<numbers.length; i++) {
            count10++;
            while(numbers[i] %2 == 0 || numbers[i] == 0){
                numbers[i] = random.nextInt(100);
            }
            //System.out.print(numbers[i] + " ");
            if(count10==10){
                //System.out.println("");
                count10=0;
            }
        
        }
        Arrays.sort(numbers);
        for(int i = 0; i<numbers.length; i++) {
            count10++;
            System.out.print(numbers[i] + " ");
            summ=summ+numbers[i];
            if(count10==10){
                System.out.println("");
                count10=0;}
        }
        average=summ/numbers.length;
        System.out.println("Среднее арифметическое="+average);
        


    }
    
}
