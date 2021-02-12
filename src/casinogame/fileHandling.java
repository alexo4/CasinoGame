
package casinogame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;


public class fileHandling {
    
    public static String folderDirectory = System.getProperty("user.dir") + "\\usersList.txt";
    
    public static ArrayList<usersObject> readFile(){
        ArrayList<usersObject> usersList = new ArrayList<>();
        String lineFromFile;
        try{
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while((lineFromFile = read.readLine()) != null){
                String[] usersDetails = lineFromFile.split(", ");
                usersObject a = new usersObject(usersDetails[0],usersDetails[1], Integer.parseInt(usersDetails[2]));
                usersList.add(a);
                
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        return usersList;
    }
    
    public static void writeFile(ArrayList<usersObject> usersList) {

        try {
            FileWriter writeToFile = new FileWriter(folderDirectory, false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for (int i = 0; i < usersList.size(); i++) {
                printToFile.println(usersList.get(i).toString());
            }
            printToFile.close();
            writeToFile.close();
            } catch (Exception e) {
            System.out.println("Error: " + e);
               
            }
    }
    
}
