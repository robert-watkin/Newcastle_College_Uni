/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

import java.util.Scanner;

public class QuizGame {
    private int score;

    public static void main(String[] args) {
        QuizGame qg = new QuizGame();
        qg.startGame();
    }

    private void startGame() {
        while(true) {
            score = 0;
            askQuestion("Which number is the largest? ", "45", "12", "54", "46", "3");
            System.out.println("Current Score : " + score);
            askQuestion("Who created SpaceX? ", "Richard Branson", "Elon Musk", "Ya Nan", "Iggle Piggle", "2");
            System.out.println("Current Score : " + score);
            askQuestion("Noot Noot?", "Thomas the Tank Engine", "Rudolf", "Pingu", "I don't understand", "3");
            System.out.println("Current Score : " + score);
            if (score == 3) {
                break;
            }
        }
    }

    private void askQuestion(String question, String answer1, String answer2, String answer3, String answer4, String answer) {
        System.out.println(question);
        System.out.println("1 - " +  answer1);
        System.out.println("2 - " + answer2);
        System.out.println("3 - " + answer3);
        System.out.println("4 - " + answer4);

        Scanner sc = new Scanner(System.in);
        String userAnswer = sc.nextLine();

        if (userAnswer.equalsIgnoreCase(answer)){
            score++;
            System.out.println("CORRECT");
            System.out.println();
        }else{
            System.out.println("INCORRECT");
            System.out.println();
        }
    }
}
