import java.util.Scanner;

public class Main {

public static void main(String[] args) {

int choice;
float ans;
float inchesToCentimeters;
float inchesToMeters;
float inchesToKilometers;
float feetToCentimeters;
float feetToMeters;
float feetToKilometers;

Scanner scan = new Scanner(System.in);

System.out.println("What would you like to do?: ");
System.out.println("1. Inches to M/CM/KM\n" +
                   "2. Feet to M/CM/KM");
choice = scan.nextInt();

System.out.println("What is the number you would like to convert?");
ans = scan.nextFloat();


if (choice == 1) {

inchesToCentimeters = (float) (ans*2.54);
inchesToMeters = (float) (ans*0.0254);
inchesToKilometers = (float) (ans / 39370.1);

System.out.println(ans + " inches is " + inchesToCentimeters + " CM");
System.out.println(ans + " inches is " + inchesToMeters + " M");
System.out.println(ans + " inches is " + inchesToKilometers + " KM");


}

if (choice == 2) {

feetToCentimeters = (float) (ans*30.48);
feetToMeters = (float) (ans*0.3048);
feetToKilometers = (float) (ans / 3280.84);

System.out.println(ans + " feet is " + feetToCentimeters + " CM");
System.out.println(ans + " feet is " + feetToMeters + " M");
System.out.println(ans + " feet is " + feetToKilometers + " KM");

}

    }
}
