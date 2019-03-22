import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        ArrayList<PlayerCharacter> players = new ArrayList<PlayerCharacter>();
        players.add(new Fighter("robert"));
        players.add(new Mage("John"));
        players.add(new Paladin("Walter"));
        players.add(new Priest("Henry"));

        for(PlayerCharacter x : players){
            if(x instanceof Priest){
                System.out.println("Here is a Priest:");
                x.showStats();
                x.die();
                System.out.println();
            }else if(x instanceof Paladin){
                System.out.println("Here is a Paladin:");
                x.showStats();
                x.die();
                System.out.println();
            }else if(x instanceof Mage){
                System.out.println("Here is a Mage:");
                x.showStats();
                x.die();
                System.out.println();
            }else if(x instanceof Fighter){
                System.out.println("Here is a Fighter");
                x.showStats();
                x.die();
                System.out.println();
            }
        }
    }
}
