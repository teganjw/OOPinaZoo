public class Giraffe extends Animal{


    public Giraffe(String name) {
        super(name, "leaves");
        this.name = name;
        favoriteFood = "leaves";

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
