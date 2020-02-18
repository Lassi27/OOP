public class Girrafe extends Animal {
    private String name = "";

    public Girrafe(String name) {
        super(name, "leaves");
        this.name=name;
    }

    public void eat( String food) {
        System.out.println(name + " eats " + food);
        if (food == "leaves") {
            System.out.println("YUM!!" + name + " wants more " + food);
        } else {
            System.out.println("YUCK!!" + name + " will not eat " + food);
        }
    }

}

