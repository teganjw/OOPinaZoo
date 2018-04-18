public class Unicorn extends Animal{

    public Unicorn(String name) {
        super(name, "marshmallows");
        this.name = name;
        favoriteFood = "marshmallows";

    }

    public void sleep(String name) {
        System.out.println(name + " sleeps in a cloud");
    }

}
