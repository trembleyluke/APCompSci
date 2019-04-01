import java.util.Random;

public class Escort extends Starship implements IsDefense {

    public Escort(String newName){
        Random rand = new Random();
        hull = rand.nextInt(251)+1000;
        shield = rand.nextInt(1001)+2500;
        beam = rand.nextInt(501)+2500;
        torp = rand.nextInt(11)+10;
        name = newName;
    }

    public void showStats(){
        System.out.println(name + ":   Hull: " + hull + "   Shield: " + shield + "   Beam: " + beam + "   Torpedoes: " + torp );
    }

}
