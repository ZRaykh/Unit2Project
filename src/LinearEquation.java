import java.nio.file.DirectoryStream;
import java.text.DecimalFormat;
public class LinearEquation {

    DecimalFormat d = new DecimalFormat("0.00");
    //Double variables initialized
    private double xOne;
    private double yOne;
    private double xTwo;
    private double yTwo;

    //Coordinate point variables initialized
    private String pointOne;
    private String pointTwo;

    //Creating public class: LinearEquation
    public LinearEquation (double xOne, double yOne, double xTwo, double yTwo, String pointOne, String pointTwo) {
        this.xOne = xOne;
        this.yOne = yOne;
        this.xTwo = xTwo;
        this.yTwo = yTwo;
        this.pointOne = pointOne;
        this.pointTwo = pointTwo;
    }

    //slope calculator for the program's use | formula: y2 - y1 / x2 - x1
    public double slopeNumerical(){
        double slope = (yTwo - yOne) / (xTwo - xOne);
        return slope;
    }

    //Slope calculator with a fractional slope format!
    public String slopeFractional(){
        double rise = (yTwo - yOne);
        double run =  (xTwo - xOne);
        String slopeFraction = d.format(rise) + "/" + d.format(run);
        return slopeFraction;
    }

    //Y Intercept calculator via slope formula : y = mx + b | converted to: y - mx = b
    public double yIntercept(){
        double yInter = yOne - (slopeNumerical() * xOne);
        return yInter;
    }

    //Returns the Slope Intercept Form
    public String makeEquation(){
        String equation = "y = " + slopeFractional() + "(x) + " + d.format(yIntercept());
        return equation;
    }

    //Returns the distance between two points
    public String distance(){
        double distance = Math.sqrt(Math.pow((xTwo - xOne),2) + Math.pow((yTwo - yOne),2));
        distance = Math.round(distance * 100);
        distance /= 100;
        return d.format(distance);
    }

    //Returns the calculated values, ordered and formatted
    public String toString(){
        String output = "First coordinate points: " + pointOne + "\nSecond coordinate points: " + pointTwo
                + "\nSlope of the line: " + d.format(slopeNumerical()) + "\nY-intercept: " + d.format(yIntercept())
                + "\nSlope intercept form: " + makeEquation() + "\nDistance between points: " + distance();
        return output;
    }
}
