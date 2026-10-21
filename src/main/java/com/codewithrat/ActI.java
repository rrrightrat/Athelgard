package com.codewithrat;

public class ActI {
    public static void StartActI(){
        
        Player py = new Player("Rover",30,30);
        GameLogic.title("Act - I");
        GameLogic.printD("Rover","Where am i?");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            GameLogic.printD("Rover","How did i get here?");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Goblin","errr....");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Rover","What is that? What IS THIS PLACE!?");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Goblin","errr.... (attcks Rover)");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Rover","AHH! GET AWAY!");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Tutorial","Athelgard is a game full of fights. Let's get you ready for your first fight!");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.title("Tutorial");
            System.out.println(AnsiE.YELLOW+"To perform a action, enter the no. in the braces of the corresponding action. for example to perform [1] Attack, you need to enter 1. "+
            "\n\nActions: Attack, heal, quit. "+"\n\nNote: Game Progress does not save!"+AnsiE.RESET);
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            Enemy e1 = new Enemy("Goblin",20,20);
            Battle.runBattle(py,3,3,e1,1,2);
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Rover","How did i do that? Is.. is it dead?");
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Rover","What is this? a map?");
            
            GameLogic.anyToCont();
            GameLogic.clearConsole();
            
            GameLogic.printD("Rover","Seacoast Village? Guess that\'s where im going.");
    }
    public static void StartActII(){
        
        GameLogic.title("Act - 2: Seacoast Village");
        
        GameLogic.printD("Rover","So this is the village? Why is it so barren?");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","Hello? Do i know you?");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","I don\'t think so. Why is this place so barren?");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","It\'s that monster.. the Null they call it. A creature that possesses the power to absorb anything. The prism shard that has kept us safe for years is now stolen by the yellow stone bandits.");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","What even is this place?");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","You are in Athelgard, a place known for its prosperity. Sir please help us defeat the Bandits and get back our prism shard.");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","My inner self tells me to help you and i shall do so.");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","take this sword with you.");
        
        System.out.println(AnsiE.BG_GREEN+"\nEquiped sword! +5 strength!"+AnsiE.RESET);
        
        Player py = new Player("Rover",50,50);
        
        Enemy e2 = new Enemy("Yellowstone Bandits",70,70);
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        Battle.runBattle(py,20,8,e2,12,7);
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Yellowstone bandit","Stop! don\'t kill us! here is the shard!");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","It\'s your own good you gave it right away.");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover (to himself)","Now let\'s take this back to the village.");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","You.. You did it, you brought it back! the bandits are defeated! Wha.. What is your name sir?");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","It\'s Rover.");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","R.. ROVER? You are the person The Null is looking for! He invites you to the Fallen tombs!");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","ME? how does it know me?");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Villager","I don\'t know but you must go! take my son Mike with you, he is a potion maker. He will help you in your battles! MIKE! COME HERE!");
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
        
        GameLogic.printD("Rover","So to the Fallen Tombs now? Fine, I have nowhere else to go.");
        
        System.out.println(" ");
        
        System.out.println(AnsiE.BOLD_GREEN+"You and Mike depart for the Fallen Tombs!"+AnsiE.RESET);
        
        GameLogic.anyToCont();
        GameLogic.clearConsole();
    }
    public static void StartActIII(){
        GameLogic.title("Act 3 - The Mountain of Zues");
        
        System.out.println(" ");
        GameLogic.printD("console","Still in Development!");
    }
} 