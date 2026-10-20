package com.codewithrat;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String cyan = "\033[1;36m";
        String reset = "\033[0m";

        String banner = "          █████╗    \n"
                + "         ██╔══██╗   \n"
                + "         ███████║   \n"
                + "         ██╔══██║   \n"
                + "         ██║  ██║thelgard   \n"
                + "         ╚═╝  ╚═╝";

        System.out.println(cyan + banner);
        System.out.println("  A   T   H   E   L   G   A   R   D" + reset);
        System.out.println("        " + AnsiE.BG_GREEN + "Version 2 Snapshot 2" + AnsiE.RESET);

        int C;
        System.out.println(AnsiE.BOLD_RED + "[1] Start \n[Any] Quit" + AnsiE.RESET);
        C = GameLogic.getChoice();
        if (C == 1) {
            GameLogic.clearConsole();

            ActI.StartActI();
            GameLogic.anyToCont();
            GameLogic.clearConsole();

            ActI.StartActII();
        } else if (C != 2) {
            GameLogic.clearConsole();
            System.out.println(AnsiE.BOLD_RED + "You Quit");
            System.exit(0);
        }
    }
}