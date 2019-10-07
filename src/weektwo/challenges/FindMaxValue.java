/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

public class FindMaxValue {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int z = 12;

        if ((x > y) && (x > z)){
            System.out.println(x + " is the largest");
        } else if ((y > x) && (y > z)){
            System.out.println(y + " is the largest");
        }else if ((z > x) && (z > y)){
            System.out.println(z + " is the largest");
        }
        // OR

        int max = Math.max(Math.max(x,y),z);
        System.out.println(max + " is the largest");
    }
}
