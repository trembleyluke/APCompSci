import java.util.Random;

public class Frigate extends Starship implements IsDefense {

    public Frigate(String newName){
        Random rand = new Random();
        hull = rand.nextInt(501)+1500;
        shield = rand.nextInt(501)+2000;
        beam = rand.nextInt(1001)+2500;
        torp = rand.nextInt(11)+20;
        name = newName;
    }

    public void showStats(){
        System.out.println(name + ":   Hull: " + hull + "   Shield: " + shield + "   Beam: " + beam + "   Torpedoes: " + torp );
    }
}
