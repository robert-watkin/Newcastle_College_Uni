/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

import java.util.ArrayList;

public class AddingIndexes {


    public static void main(String[] args) {
        AddingIndexes ai = new AddingIndexes();
        ai.checkArray();
    }

    private int checkArray(){
        int[] values = new int[]{1,2};
        if (values.length >= 2 ) {
            System.out.println(values[0] + values[1]);
        } else if (values.length == 1){
            System.out.println(values[0]);
        }else{
            return 0;
        }
        return 0;
    }
}
