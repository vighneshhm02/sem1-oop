package prog4;
import java.util.Scanner;

abstract class Printer {
 abstract void configuration();
 abstract void display();
}

class DotMatrix extends Printer {
 @Override
 void configuration() {
     System.out.println("DotMatrix Configuration: Slow speed");
 }
 @Override
 void display() {
     System.out.println("This is DotMatrix Display");
 }
}

class LaserJet extends Printer {
 @Override
 void configuration() {
     System.out.println("LaserJet Configuration: High speed");
 }
 @Override
 void display() {
     System.out.println("This is LaserJet Display");
 }
}

public class AbstractionDemo {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Printer printer;

     System.out.println("1. DotMatrix");
     System.out.println("2. LaserJet");

     System.out.print("Choose printer type: ");
     int choice = sc.nextInt();

     switch (choice) {
             case 1:
                 printer = new DotMatrix();
                 printer.configuration();
                 printer.display();
                 break;
             case 2:
                 printer = new LaserJet();
                 printer.configuration();
                 printer.display();
                 break;
             default:
                 System.out.println("Enter a valid choice");
     }
     sc.close();
 }
}
