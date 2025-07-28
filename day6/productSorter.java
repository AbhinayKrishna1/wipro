package Lab7_Arrays_And_Collections.programs;

import java.util.Arrays;

public class productSorter {
	public static void main(String[] args) {
        String[] productNames = {
            "Laptop",
            "Mouse",
            "Keyboard",
            "Monitor",
            "Webcam",
            "Headphones",
            "Printer"
        };

        System.out.println("Original Product Names:");
        for (String product : productNames) {
            System.out.println(product);
        }

        Arrays.sort(productNames);

        System.out.println("\nSorted Product Names (Alphabetical Order):");
        for (String product : productNames) {
            System.out.println(product);
        }
    }
}
