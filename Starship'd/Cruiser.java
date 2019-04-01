import java.util.Random;

public class Cruiser extends Starship implements IsOffense{

    public Cruiser(String newName){
        Random rand = new Random();
        hull = rand.nextInt(501)+2000;
        shield = rand.nextInt(501)+2000;
        beam = rand.nextInt(1001)+3000;
        torp = rand.nextInt(16)+20;
        name = newName;
    }

    public void showStats(){
        System.out.println(name + ":   Hull: " + hull + "   Shield: " + shield + "   Beam: " + beam + "   Torpedoes: " + torp );
    }
}
