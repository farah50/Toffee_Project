import java.io.*;
import java.util.*;
public class Items {
    public void Catalog() {
        try {
            FileWriter fr = new FileWriter("Catalog.txt");
            PrintWriter pr = new PrintWriter(fr , true);
          
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



}
