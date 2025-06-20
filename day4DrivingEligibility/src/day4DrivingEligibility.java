import java.util.Scanner;


public class drivingEligibility {
    public static void main(String[] args ) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter your age");
          int age = input.nextInt();
        System.out.print("Do you have a driver's license? (true or false): ");
        boolean hasLicense = input.nextBoolean();

        if   (age>=18 && hasLicense){
                System.out.println("You can drive");}
        else if (age>=18 && !hasLicense) {
            System.out.println("You are old enough,but you need a driving license");
        }
        else {
            System.out.println("You cant drive");
        }
    }
}

