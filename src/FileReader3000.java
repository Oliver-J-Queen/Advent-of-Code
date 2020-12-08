import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader3000 {

    public ArrayList<String> getInput(String filename){
        try {
            ArrayList<String> input = new ArrayList<>();
            File file = new File("ressources/" + filename);
            Scanner scan = new Scanner(file);

            while(scan.hasNextLine()){
                input.add(scan.nextLine());
                //System.out.println(scan.nextLine());
            }
            
            scan.close();
            return input;
        } catch (Exception e) {
            //TODO: handle exception
        }
        return null;
    }

    public static void main(String[]args) {
        
    }
}