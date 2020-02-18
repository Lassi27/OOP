public class Animal {
    private String favouriteFood = "";
    private String name = "";
    public static int population;

    public Animal( String name, String favouriteFood) {
        this.favouriteFood = favouriteFood;
        this.name = name;
        population++;
    }

    public void sleep(String name){
        System.out.println(name + " sleeps for 8 hours");
    }

    public void eat( String food) {
        System.out.println(name + " eats " + food);
        if (food == favouriteFood) {
            System.out.println("YUM!!" + name + " wants more " + food);
        } else {
            sleep(name);
        }
    }

}

