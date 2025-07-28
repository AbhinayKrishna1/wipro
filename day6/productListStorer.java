package Lab7_Arrays_And_Collections.programs;
import java.util.ArrayList; 
import java.util.Collections; 


public class productListStorer {
	
	    public static void main(String[] args) {

	        ArrayList<String> productNames = new ArrayList<>();

	        productNames.add("Laptop");
	        productNames.add("Mouse");
	        productNames.add("Keyboard");
	        productNames.add("Monitor");
	        productNames.add("Webcam");
	        productNames.add("Headphones");
	        productNames.add("Printer");

	        System.out.println("Original Product Names (in ArrayList):");
	        for (String product : productNames) {
	            System.out.println(product);
	        }

	     
	        Collections.sort(productNames);

	        System.out.println("\nSorted Product Names (Alphabetical Order in ArrayList):");
	        for (String product : productNames) {
	            System.out.println(product);
	        }
	    }
}
