import  java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    	
    	System.out.println("Enter number of bikes");
    	Scanner in = new Scanner(System.in);
    	int bikeNum = in.nextInt();
    	
    	int j = 0;
    	Scanner in2 = new Scanner(System.in);
    	String[] bikeArray = new String[bikeNum] ;    	
    	while(j < bikeNum) {
    		System.out.println("Enter bike Information");
    	    String bikeInfo = in2.nextLine();
    	    bikeArray[j] = bikeInfo;
    	    j++;
//
    	  }

    		
    	BikePart newBikes = new BikePart(bikeArray);

    	
    	
    }  	
}