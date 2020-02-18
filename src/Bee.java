public class Bee extends Animal {
    private String name = "";
    public Bee (String name){
        super(name,"Pollen");
        this.name =name;
    }



    public void eat( String food) {
        System.out.println(name + " eats " + food);
        if (food == "Pollen") {
            System.out.println("YUM!!" + name + " wants more " + food);
            System.out.println(name + " never sleeps");
        } else {
            System.out.println("YUCK!!" + name + " will not eat " + food);
        }
    }



}
