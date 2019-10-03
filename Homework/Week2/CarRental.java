import java.awt.*;

//        Driver must be 18 or older
//        Base fee is $20 per day
//        Drivers under 21 years of age pays extra fee $57 per day
//        Drivers between 21-24 years of age pays additional $20 per day
public class CarRental {

    public int age19To21Fee = 57;
    public int age21To24Fee = 20;


    public int getCorrectFee(int baseFee, int adjustFee){
        int res = baseFee + adjustFee;
        return res;
    }

    public String  displayMessage(int age, int fee){
        System.out.println("You are "+age+" so four fee is " + fee  );
        return null;
    }

    public void correctFee(int age) {
        if (age <= 17) {
            String deny = "Sorry, you are to young to rent a car!";
            System.out.println(deny);
        } else if (age < 21) {
            displayMessage(age, getCorrectFee(20, age19To21Fee));

        } else if (age <= 24) {
            displayMessage(age, getCorrectFee(20, age21To24Fee));
        } else {
            displayMessage(age, getCorrectFee(20, 0));
        }
    }

    public static void main(String[] arg) {
        CarRental myRentA = new CarRental();
        myRentA.correctFee(16);
        myRentA.correctFee(18);
        myRentA.correctFee(21);
        myRentA.correctFee(22);
        myRentA.correctFee(23);
        myRentA.correctFee(24);
        myRentA.correctFee(25);
    }
}