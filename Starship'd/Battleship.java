import java.util.Random;

public class Battleship extends Starship implements IsOffense{

    public Battleship(String newName){
        Random rand = new Random();
        hull = rand.nextInt(2001)+3000;
        shield = rand.nextInt(501)+1500;
        beam = rand.nextInt(1001)+4000;
        torp = rand.nextInt(11)+40;
        name = newName;
    }

    public void showStats(){
        System.out.println(name + ":   Hull: " + hull + "   Shield: " + shield + "   Beam: " + beam + "   Torpedoes: " + torp );
    }
}
