import java.util.ArrayList;

public class zoo {

    public static void main(String[] args) {

        Animal tigger = new Tiger("Tigger");
        tigger.eat("meat");

        Animal pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

        Animal rarity = new Unicorn("Rarity");
        rarity.eat("marshmallows");
        rarity.sleep("Rarity");

        Animal gemma = new Giraffe("Gemma");
        gemma.eat("meat");
        gemma.eat("leaves");

        Animal stinger = new Bee("Stinger");
        stinger.eat("ice cream");
        stinger.eat("pollen");

        Zookeeper allyn = new Zookeeper("Allyn");

        ArrayList<Animal> animals = new ArrayList<Animal>();
        animals.add(tigger);
        animals.add(pooh);
        animals.add(rarity);
        animals.add(gemma);
        animals.add(stinger);

        allyn.feedAnimals(animals, "marshmallows");

    }

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }

    String favoriteFood = "bacon";

    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
        }else{
            sleep(name);
        }
    }

}