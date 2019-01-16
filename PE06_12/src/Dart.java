import java.util.Scanner;

public class Dart {
    public static boolean [] dartThrow(int k, int t){
        boolean [] booleanArray = new boolean[t];
        for(int i = 0; i < t; i++){
        double xCoord = Math.random() * k;
        double yCoord = Math.random() * k;
        if((Math.pow(xCoord,2) + Math.pow(yCoord,2)) <= k){
            booleanArray[i] = true;
        }
        else{
            booleanArray [i] = false;
        }
       }
       return booleanArray;
    }
    public static double piEstimater(boolean [] h, int t){
        int trueCounter = 0;
        for(int i = 0; i < h.length; i++){
            if(h[i] == true){
                trueCounter++;}}
        return 4 * ((double)trueCounter / t);
    }
    public static void printer(double [] a){
        System.out.println("Pi Estimation");
        for(int i = 0; i < a.length; i++){
            System.out.print("Trial [" + i + "]: pi=");
            System.out.printf("%6f\n", a[i]);}}
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int radius = 1;
        int darts;
        int trials;
        System.out.println("Enter the number of darts ");
        darts = in.nextInt();
        System.out.println("Enter the number of trials ");
        trials = in.nextInt();
        double [] arrayOfEstimates = new double [trials];
        int i = 0;
        for(double a : arrayOfEstimates){
           boolean [] hitCounter = dartThrow(radius, darts);
           double piEstimate = piEstimater(hitCounter, darts);
           arrayOfEstimates[i] = piEstimate;
           i++; }
        printer(arrayOfEstimates);
    }
}