/*
Lab 13 Group 5
@author Sunia, Jacob
@author Murakami, Andressa
 */
import java.util.*;

public class Main {
    public static void main(String [] args){
        Puppy p = new Puppy();
        System.out.println("Congratulations on your new puppy!");
        interact(p);
    }

    /*interact - gives the options to the user on what to do with the puppy
     * @param p the puppy
     */
    public static void interact(Puppy p)
    {
        int SENTINEL = -1;
        do{
            System.out.println("What would you like to do?\n1. Feed\n2. Play\n3. Quit");

            int choice = CheckInput.getIntRange(1,3);
            if(choice==1){
                p.eatSwitch();
            }
            if(choice==2){
                p.playSwitch();
            }
            else if(choice ==3){
                SENTINEL++;
            }
        } while(SENTINEL != 0);

    }
}