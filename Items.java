import java.io.*;
import java.util.*;
public class Items {
    public void Catalog() {
        try {
            FileWriter fr = new FileWriter("Catalog.txt");
            PrintWriter pr = new PrintWriter(fr , true);
            pr.println("ID:     " + "Item:              " + "Price: ");
            pr.println("1       " + "Chocolate Cake     " + "250.00 L.E. ");
            pr.println("2       " + "Red velvet Cake    " + "300.00 L.E. ");
            pr.println("3       " + "Strawberry Cake    " + "200.00 L.E. ");
            pr.println("4       " + "Galaxy Cake        " + "500.00 L.E. ");
            System.out.println("Built Successfully");
            pr.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
