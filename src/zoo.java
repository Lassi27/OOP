public class zoo {
    public static void main(String[] args) {
        Tiger tigger = new Tiger("Tigger");


        Bear pooh = new Bear ("pooh" );


        Unicorn Rarity = new Unicorn ("Rarity");


        Girrafe Gemma = new Girrafe ("Gemma");


        Bee Stinger = new Bee("Stinger");

        Zookeeper Zoebot = new Zookeeper ("Zoebot");
        Animal[] Animal ={
                tigger, pooh, Rarity, Gemma, Stinger
        };
        Zoebot.feedAnimals(Animal, "hamburgers");
    }


}
