package test.peonypeoplestocktaker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Scanner;  
import java.util.ArrayList; 
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PeonyPeopleStocktaker {
   
static ArrayList<Coral> Coral = new ArrayList<Coral>();
static ArrayList<Sarah> Sarah = new ArrayList<Sarah>();
static ArrayList<Red> Red = new ArrayList<Red>();

 public static void main( String args[]) 
{
 // Creates the gui window            
javax.swing.JFrame window = new javax.swing.JFrame("PeonyPeople");
window.getContentPane().add(new StocktakerGUI());
window.setVisible(true);
window.pack();
window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);



}
 
 public static void Coralload(){
  
     try{
          FileInputStream fileIn = new FileInputStream("Coral.txt");
          ObjectInputStream in = new ObjectInputStream(fileIn);
          Coral = (ArrayList) in.readObject();
          in.close();
          fileIn.close();
       }catch(IOException ioe){
          ioe.printStackTrace();
          return;
       }catch(ClassNotFoundException c){
          System.out.println("Class not found");
          c.printStackTrace();
          return;}
 }
        
        
public static void CoralAppend()throws IOException{
FileWriter fw = null;
        BufferedWriter bw = null;
        PrintWriter pw = null;

        try {
            fw = new FileWriter("Coral.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);

            pw.println("");
            pw.println("");
            pw.println("");

            
            pw.flush();

        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {
            }
    

}

}}



