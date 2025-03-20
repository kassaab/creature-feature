//Abraham Kassa
import java.io.*;
import java.lang.Thread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Hero myHero = new Hero("Hero",23,5,0,"Conan","Barbarian");
        Monster myMonster = new Monster("Dragon",12,10,200,"fierce");
        boolean gameOn = true; //continue until someone's is dead

        while (gameOn){
            if(!myMonster.isAlive() || !myHero.isAlive()){//someone's dead, game over!
                if(myHero.isAlive()) {//time for gold!
                    myHero.setGold(myHero.getGold() + myMonster.getGold());
                    String output = "Our Hero " + myHero.getName() + " got " + myMonster.getGold() + " gold and now has a total of " + myHero.getGold() + " gold.";
                    System.out.println(output);
                }

                gameOn = false;
                break;
            }else{//continue
                System.out.println(myHero.defends(myMonster.attacks()));
                System.out.println(myMonster.defends(myHero.attacks()));
                Thread.sleep(1000);
            }

        }

    }//end constructor
}//end Main
