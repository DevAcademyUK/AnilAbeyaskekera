package animals;


public class dog {



    private String name;
    private String size;
    private int age;
    private String breed;

    public dog(String name, String size, int age, String breed) {
        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
    }

    public String bark(String size) {
        String bark = "";
        if (size.equalsIgnoreCase("small")) {
            bark = "yap yap yap!";
        } else if (size.equalsIgnoreCase("medium")) {
            bark = "woof woof!";
        } else {
            bark = "WOOF! WOOF!";
        }

        return bark;
    }

    public String play(String breed) {
        String playing = "";
        if (breed.equalsIgnoreCase("poodle")) {
            playing = "Oh Dear, I dont't think so, one could not possibly engage in such activities";
        } else if (breed.equalsIgnoreCase("")) {
            playing = "Yeah, yeah, throw the stick!";
        } else if (breed.equalsIgnoreCase("Border Collie")) {
            playing = "Sheep!";
        }
        return playing;
    }

    public String beHuman(String name, int age, String breed) {
        return "Hello human, I'm " + name + " and I am a " + age + " year old " + breed + ", what breed are you?";
    }

   /* public void createDog() {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the dog's name?");
        String name = myScanner.nextLine();
        System.out.println("How big is the dog?");
        String size = myScanner.nextLine();
        System.out.println("How old is the dog?");
        int age = myScanner.nextInt();
        System.out.println("What breed is the dog?");
        String breed = myScanner.nextLine();
        dog myDog = new dog(name, size, age, breed);

        myDog.bark(size);
        myDog.play(breed);
        myDog.beHuman(name, age, breed);
    } */

}
