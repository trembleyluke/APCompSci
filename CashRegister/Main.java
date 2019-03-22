import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Items> inventory = new ArrayList<>();
        inventory.add(new Items("apple",4372,0.48,"Fruit",100,false));
        inventory.add(new Items("cereal",5293,6.75,"Breakfast",27,true));
        inventory.add(new Items("Cookies",2843,4.50,"Dessert",30,true));

        int theCode;
        for(Items x : inventory){
            if(theCode == x.code){
                System.out.println("the code: "+theCode+" is for "+x.item);
            }
        }
    }
}
