public class Bee extends Animal{

    public Bee(String name) {
        super(name, "pollen");
        this.name = name;
        favoriteFood = "pollen";

    }

    public void sleep(String name) {
        System.out.println(name + " never sleeps");
    }

    public void eat(String food) {
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + name + " wants more " + food);
            sleep(name);
        }else{
            System.out.println("YUCK!!! " + name + " will not eat " + food);
        }

    }

}
