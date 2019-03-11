import java.util.Random;

public class Mage extends PlayerCharacter{
    private int wisdom;

    public Mage(String newName){
        name = newName;
        Random rand = new Random();

        strength = 7 + (rand.nextInt(6)+1);
        intelligence = 15 + (rand.nextInt(6)+1);
        agility = 8 + (rand.nextInt(6)+1);
        wisdom = 10 + (rand.nextInt(6)+1);

        mp = mpmax = intelligence + wisdom*2;
        hp = hpmax = strength;
    }
    public void showStats(){
        System.out.printf("%s, a Mage\n", name);
        super.showStats();
        System.out.printf(" WIS: %3d\n",wisdom);

    }
}

