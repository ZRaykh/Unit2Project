import java.util.Scanner;
public class EquationRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Collecting initial coordinate points in (x,y) format
        System.out.println("Please input your first set of coordinate points in the form of \"(x,y)\":");
        String pointOne = s.nextLine();
        System.out.println("Please input your second set of coordinate points in the form of \"(x,y)\":");
        String pointTwo = s.nextLine();

        //Isolating the coordinate points into xOne, yOne, xTwo, and yTwo

        int comma = pointOne.indexOf(",");
        double xOne = Double.parseDouble(pointOne.substring(1, comma));
        double yOne = Double.parseDouble(pointOne.substring(comma + 1, pointOne.length() - 1 ));

        comma = pointTwo.indexOf(",");
        double xTwo = Double.parseDouble(pointTwo.substring(1, comma));
        double yTwo = Double.parseDouble(pointTwo.substring(comma + 1, pointTwo.length() - 1 ));

        //Creating new object "equation"
        LinearEquation equation = new LinearEquation(xOne,yOne,xTwo,yTwo,pointOne,pointTwo);
        System.out.println(equation);

        //Asking user for any x coordinate
        System.out.println("Please input any x value you wish to calculate the y value for:");
        double xThree = s.nextDouble();

        //Printing out the x, y value coordinates
        equation.coordinates(xThree);
    }
}
