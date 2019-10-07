/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

public class LoadingBars {
    public static void main(String[] args) {
        LoadingBars lb = new LoadingBars();
        lb.fillBar();
    }

    private void fillBar(){
        int maxGap = 50;
        int currentGap = maxGap;
        String currentGap = setSpace(currentGap);
        while (true){
            Thread.sleep(25);
            System.out.println("\r|"+equals+currentGap+"|");
        }
    }

    private void bouncingBall() {

        boolean movingRight = true;
        int left = 0;
        int right = 19;
        String leftSpace;
        String rightSpace;
        while (true) {
            try {
                Thread.sleep(75);
            } catch (Exception e){

            }
            leftSpace = setSpace(left);
            rightSpace = setSpace(right);
            System.out.print("\r|" + leftSpace + "O" + rightSpace + "|");
            if (movingRight){
                left++;
                right--;
            }else{
                right++;
                left--;
            }
            if (right == 19){
                movingRight = true;
            } else if(left == 19){
                movingRight = false;
            }
        }
    }

    private String setSpace(int x) {
        String space = "";
        for (int y = 1; y <= x; y++){
            space += " ";
        }
        return space;
    }
}
