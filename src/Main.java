import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        menu();
        int userChoice = scanner.nextInt();
        while (userChoice < 1 || userChoice > 6) {
            System.out.println("Wrong choice try again");
            userChoice = scanner.nextInt();
        }
        if (userChoice == 1) {
            System.out.println("Enter x1 value");
            int x1 = scanner.nextInt();
            System.out.println("Enter y1 value");
            int y1 = scanner.nextInt();
            System.out.println("Enter x2 value");
            int x2 = scanner.nextInt();
            System.out.println("Enter y2 value");
            int y2 = scanner.nextInt();
            int x=x1-x2;
            int y=y1-y2;
            printDistanceBetweenTwoPoints(x,y);
        }
        if (userChoice == 2) {
            System.out.println("Enter first petiole");
            int firstPetiole = scanner.nextInt();
            System.out.println("Enter second petiole");
            int secondPetiole = scanner.nextInt();
            printDistanceBetweenTwoPoints(firstPetiole, secondPetiole);
        }
        if (userChoice == 3) {
            System.out.println("Enter a Circle's radius");
            int radius = scanner.nextInt();
            circumferenceAndAreaOfaCircle(radius);
        }

        if (userChoice == 4) {

            System.out.println("Enter a petiole's size: ");
            int size = scanner.nextInt();
            square(size);
        }

        if (userChoice == 5) {
            System.out.println("Enter a first petiole's size: ");
            int first = scanner.nextInt();
            System.out.println("Enter a second petiole's size: ");
            int second = scanner.nextInt();
            if (first != second) {
                rectangle(first, second);
            } else square(first);

        }
        menu();

        if (userChoice == 6)
            System.out.println("GoodBye");
    }
    public static void menu (){
        System.out.println("Choose option:");
        System.out.println("1- distance between two points");
        System.out.println("2- Over-length of straight triangle");
        System.out.println("3- circumference and area of a circle");
        System.out.println("4- calculate square's area ");
        System.out.println("5- calculate rectangle's area");
        System.out.println("6- exit");
        System.out.println();
    }

    public static void printDistanceBetweenTwoPoints (int x, int y){

        System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
    }

    public static void circumferenceAndAreaOfaCircle(int radius){
        System.out.println("The circumference is: " + 2*Math.PI*radius);
        System.out.println("The Area is: " + Math.PI*radius*radius);
    }

    public static void square (int size){
        System.out.println(size*size);
    }

    public static void rectangle (int first, int second){
        System.out.println(first*second);
    }
}