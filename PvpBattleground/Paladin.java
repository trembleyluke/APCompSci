import java.util.Random;

public class Paladin extends PlayerCharacter{
    private int wisdom;
    private int constitution;

    public Paladin(String newName){
        name = newName;
        Random rand = new Random();

        strength = 10 + (rand.nextInt(6)+1);
        intelligence = 15 + (rand.nextInt(6)+1);
        agility = 5 + (rand.nextInt(6)+1);
        constitution = 10 + (rand.nextInt(6)+1);
        wisdom = 10 + (rand.nextInt(6)+1);

        mp = mpmax = intelligence + wisdom*2;
        hp = hpmax = strength + constitution*2;
    }
    public void showStats(){
        System.out.printf("%s, a Paladin\n", name);
        super.showStats();
        System.out.printf(" WIS: %3d CON: %3d\n",wisdom, constitution);
    }
}
