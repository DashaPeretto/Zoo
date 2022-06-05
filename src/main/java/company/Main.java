package company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("Welcome to the Zoo! Let's learn something new about our residents");

       // Scanner s = new Scanner(System.in);
int number;


       // int number = s.nextInt();
        do {
            System.out.println("Please chose someone from the list:\nBirds:\n1.Parrot\n2.Ostrich\nFish:\n3.Dolphin\n4.Ramp Fish\nAnimals:\n5.Monkey\n6.Tiger");
            Scanner s = new Scanner(System.in);
            number = s.nextInt();
            switch (number) {

                case 1:
                    Bird1 parrot = new Bird1("parrot", "breaths using the lungs", "flies");
                    parrot.showName();
                    parrot.howBreathe();
                    parrot.howMove();
                    parrot.Talk();
                    break;
                case 2:
                    Bird2 ostrich = new Bird2("ostrich", "breaths using the lungs", "runs");
                    ostrich.showName();
                    ostrich.howBreathe();
                    ostrich.howMove();
                    ostrich.special();
                    break;
                case 3:
                    Fish dolphin = new Fish("dolphin", "breaths using the lungs", "swims");
                    dolphin.showName();
                    dolphin.howBreathe();
                    dolphin.howMove();
                    dolphin.brain();
                    break;
                case 4:
                    Fish2 rampFish = new Fish2("ramp fish", "breaths using gills", "swims");
                    rampFish.showName();
                    rampFish.howBreathe();
                    rampFish.howMove();
                    rampFish.shape();
                    break;
                case 5:
                    Animal1 monkey = new Animal1("monkey", "breaths using the lungs", "climbs trees");
                    monkey.showName();
                    monkey.howBreathe();
                    monkey.howMove();
                    monkey.favoriteFood();
                    break;
                case 6:
                    Animal2 tiger = new Animal2("tiger", "breaths using the lungs", "sneaks");
                    tiger.showName();
                    tiger.howBreathe();
                    tiger.howMove();
                    tiger.size();
                    break;
                case 0:
                    System.out.println("Thank you for visiting our Zoo, see you again soon");
                    break;
                default:
                    System.out.println("Unexpected value");
            }
        } while (number!=0);
    }
}





