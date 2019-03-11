import java.util.Random;

public class Fighter extends PlayerCharacter {
    private int constitution;

    public Fighter(String newName){
        name = newName;
        Random rand = new Random();

        strength = 15 + (rand.nextInt(6)+1);
        intelligence = 7 + (rand.nextInt(6)+1);
        agility = 8 + (rand.nextInt(6)+1);
        constitution = 10 + (rand.nextInt(6)+1);

        mp = mpmax = 0;
        hp = hpmax = strength*2 + constitution*2;
    }
    public void showStats(){
        System.out.printf("%s, a Fighter\n", name);
        super.showStats();
        System.out.printf(" CON: %3d\n",constitution);

    }
}
