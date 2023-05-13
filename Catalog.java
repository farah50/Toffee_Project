import java.io.*;
import java.util.*;
public class Catalog {

    private String line;

    //this method is to print catalog.
    public void viewCatalog() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("Catalog.txt"));
                String line = br.readLine();
                while (line != null){
                    System.out.println(line);
                    line = br.readLine();
                } 
    }
}
