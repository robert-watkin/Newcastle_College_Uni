/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LogIn {

    private boolean isLoggedIn;

    public static void main(String[] args) {
        LogIn l = new LogIn();
        while(true) {
            l.startApp();
        }
    }

    public LogIn() {
        this.isLoggedIn = false;
    }

    private void startApp(){
        while (!isLoggedIn){
            login();
        }

        while (isLoggedIn){
            menu();
        }
    }

    private void menu() {
        System.out.println("--- Logged In ---");
        System.out.println("1 - print password");
        System.out.println("2 - print current time");
        System.out.println("3 - logout");
        System.out.println("Select a number from the menu above");

        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            try {
                choice = Integer.parseInt(sc.nextLine());
                break;
            } catch (Exception e){
                System.out.println("Please enter a number");
            }
        }

        switch (choice){
            case 1:
                System.out.println("Password12");
                break;
            case 2:
                SimpleDateFormat formatter= new SimpleDateFormat("HH:mm:ss z");
                Date date = new Date(System.currentTimeMillis());
                System.out.println(formatter.format(date));

                break;
            case 3:
                this.isLoggedIn = false;
                break;
            default:
                System.out.println("Incorrect menu input detected");
        }
    }



    private void login(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your username :");
        String username = sc.nextLine();
        System.out.println("Please enter your password :");
        String password = sc.nextLine();

        if (username.equalsIgnoreCase("ADMIN") && password.equals("Password12")){
            isLoggedIn = true;
        }
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }
}
