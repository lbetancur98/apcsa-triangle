import java.util.Scanner;

public class triangle {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a height of a triangle : ");
        double triangleHeight = in.nextDouble() ;
        in.nextLine();

        System.out.print("Enter a base of a triangle : ");
        double triangleBase = in.nextDouble() ;
        in.nextLine();


        double triangleArea = (triangleBase * triangleHeight) / 2;

        

        System.out.printf("The area of a triangle with a height and base of %,.1f and %,.1f is %,.1f.", triangleHeight, triangleBase, triangleArea);



        in.close();
    }
}