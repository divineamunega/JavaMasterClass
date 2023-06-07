public class FirstClass {
    public static void main(String[] args) {
        System.out.println("Hello Divine");

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80;
        if(topScore <   100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and less than 100");
        }


        String makeOfCar = "Volskswagen";
        boolean isDomestic = makeOfCar == "VolksSwagen" ? false : true;

        if(isDomestic) {
            System.out.println("This car is domestic to our country");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

        double myValue1 = 20.00;
        double myValue2 = 80.00;
        double ans = (100 * (myValue2 + myValue1)) % 40.0;
        boolean isRemainder0 = ans == 0;
        System.out.println(isRemainder0);

        if(!isRemainder0){
            System.out.println("got some remainder");
        }
    }
}
