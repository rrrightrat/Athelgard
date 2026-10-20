package com.codewithrat;

import java.util.Scanner;

public class GameLogic {
    //clear console method
    public static void clearConsole(){
        for(int a= 1; a < 160; a++){
            System.out.println("  ");
        }
    }
    //Anything to continue method
    public static void anyToCont(){
        System.out.print("Enter anything to continue: ");
        Scanner sc = new Scanner(System.in);
        String b = sc.nextLine();
    }
    //Choice Print method
    public static void choicePrint(String a, String b){
        System.out.println("1. " + a);
        System.out.println("2. " + b);
        System.out.println("3. Quit");
    }
    //title print method
    public static void title(String c){
        System.out.println("================================");
        System.out.println("     "+AnsiE.BOLD_PURPLE+ c +AnsiE.RESET);
        System.out.println("================================");
    }
    //input choice method
    public static int getChoice(){
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int t = 1;
        for(t = 1; t<2; t++){
            try{
                System.out.print("Your choice: ");
                 a = sc.nextInt();
            }catch(Exception e){
                t = 1;
            }
        }
        return a ;
    }
    //dialogue print method
    public static void printD(String n,String D){
        System.out.println(AnsiE.BOLD_CYAN+"> "+n +AnsiE.RESET+" - "+ D);
    }
}