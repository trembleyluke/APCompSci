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
                System.out.println();
            }
        }
    }
}
