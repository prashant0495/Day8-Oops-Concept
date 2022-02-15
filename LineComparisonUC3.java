package day8;
import java.util.Scanner;
public class LineComparisonUC3 {
    public static void main(String [] args) {
        System.out.println("Welcome to Line \n" +
                "Comparison Computation \n" +
                "Program on Master Branch");

        double x1;
        double x2;
        double y1;
        double y2;
        double x11;
        double x22;
        double y11;
        double y22;
        Scanner length = new Scanner(System.in);

        System.out.println("Enter x1 and y1");
        x1= length.nextDouble();
        y1= length.nextDouble();

        System.out.println("Enter x2 and y2");
        x2= length.nextDouble();
        y2= length.nextDouble();
        //System.out.print("length of first line is:");
        double length1=((x2 - x1) + (y2 - y1));
        System.out.println("length of first line is:" + length1);
        // ------------***********--------------------

        System.out.println("Enter x11 and y11");
        x11= length.nextDouble();
        y11= length.nextDouble();

        System.out.println("Enter x22 and y22");
        x22= length.nextDouble();
        y22= length.nextDouble();

       double length2;
        length2 = ((x22 - x11) + (y22 - y11));
        System.out.println("length of second line is  :" +length2);

        Double  lenght1 =new Double(length1);


        System.out.println("compare output: " + lenght1.compareTo(length2));





        }



        }




    // output of two line comparison
    // 0= both line length is same
    // 1= 1st line is greater than second line
    // -1= 2nd line is greater than 2nd line