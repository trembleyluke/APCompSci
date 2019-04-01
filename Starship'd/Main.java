import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] names = new String[]{"Reliant","Enterprise","Yorktown","Saratoga","Voyager","Discovery","Constitution","Constellation","Grissom","Defiant","Intrepid","Britaan","Stargazer","Yamato","Galaxy","Ambassador","Nimitz","Equinox","Relativity","Challenger"};

        ArrayList<Starship> ships = new ArrayList<>();

        for(int i = 0; i <20; i++){
            if (i<5){
                ships.add(new Escort(names[i]));
            }else if (5<= i && i<10){
                ships.add(new Frigate(names[i]));
            }else if (10<= i && i<15){
                ships.add(new Cruiser(names[i]));
            }else if (15<= i && i<20){
                ships.add(new Frigate(names[i]));
            }
        }
        for(Starship x : ships){
            x.showStats();
        }

    }

}
