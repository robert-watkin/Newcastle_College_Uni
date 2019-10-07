/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

import java.util.ArrayList;

public class EvenOdd {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int x = 1; x <= 6; x++){
            numbers.add(x);
        }

        int odd = 0;
        int even = 0;

        for (Integer num : numbers){
            if (num % 2 == 0){
                System.out.println(num + " EVEN");
                even++;
            }else{
                System.out.println(num + " ODD");
                odd++;
            }
        }
        System.out.println("ODD NUMBERS : " + odd + "\nEVEN NUMBERS : " + even);
    }
}
