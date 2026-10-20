package com.codewithrat;

import java.security.SecureRandom;
import java.util.Random;

public class Battle {
    static void runBattle(Player p, int ps, int ph, Enemy e, int es, int eh) {
        Random rn = new Random();
        if (p.getHp() > 0) {
            while (e.getHp() > 0 && p.getHp() > 0) {
                GameLogic.title(AnsiE.BOLD_PURPLE + "Battle" + AnsiE.RESET);
                System.out.println(AnsiE.BG_CYAN + "Player Hp: " + p.getHp() + " | " + e.getName() + " HP: " + e.getHp()
                        + AnsiE.RESET);

                GameLogic.choicePrint("Attack", "Defend/heal");
                int c = GameLogic.getChoice();
                GameLogic.clearConsole();

                if (c == 1) {
                    System.out.println("You attack " + e.getName());

                    int dm = ps + rn.nextInt(5);
                    e.takeDamage(dm);

                    System.out.println(e.getName() + " takes " + dm + " Damage!");

                    GameLogic.anyToCont();
                    GameLogic.clearConsole();
                }

                if (c == 2) {
                    System.out.println("You defend ");

                    int dm = ph + rn.nextInt(5);
                    p.heal(dm);

                    System.out.println(p.getName() + " heals " + dm + " Hp!");
                    GameLogic.anyToCont();
                    GameLogic.clearConsole();
                }

                if (c == 3) {
                    System.out.println("you quit and run away like a coward!");
                    System.exit(0);
                }

                GameLogic.clearConsole();

                SecureRandom ra = new SecureRandom();
                
                int ran = ra.nextInt(6) + 0;
                if (ran != 3) {
                    System.out.println(e.getName() + " Attacks " + p.getName());
                    int dam = rn.nextInt(5) + es;
                    p.takeDamage(dam);
                    System.out.println(p.getName() + " takes " + dam + "Damage");
                    GameLogic.anyToCont();
                    GameLogic.clearConsole();
                }
                else if (ran == 3) {
                    int heal = rn.nextInt(5)+eh;
                    System.out.println(e.getName() + " heals " + heal + "hp!");

                GameLogic.anyToCont();
                GameLogic.clearConsole();
            }
                
            
            }
        }
        GameLogic.clearConsole();
        if (p.getHp() > 0) {
            System.out.println("You defeated " + e.getName() + "!");
        }
        if (p.getHp() <= 0) {
            System.out.println(p.getName() + " died, \nGAME OVER");
            System.exit(0);
        }
    }
}