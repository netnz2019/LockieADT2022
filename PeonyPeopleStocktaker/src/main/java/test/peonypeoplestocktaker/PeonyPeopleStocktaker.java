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
        import java.util.*; 

public class PeonyPeopleStocktaker {
   

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

String filename = "C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\coral.txt";
File coral = new File(filename);
ArrayList<Coral> Corallist = new ArrayList<Coral>();

try{

Scanner fileScan = new Scanner(coral);

while(fileScan.hasNextLine()){

String[] eachItem = fileScan.nextLine().split(",");

try{
   int sold = Integer.parseInt(eachItem[0].trim());
   int gained = Integer.parseInt(eachItem[1].trim());

Corallist.add(new Coral(sold, gained));
}catch(NumberFormatException e){

System.out.println(" ignoring this line - couldn't parse ");
}
}
}catch(FileNotFoundException e){
System.out.println(" File not found ");
System.exit(1); 
}
showCoral(Corallist);
}

public static void showCoral(ArrayList<Coral> Corallist){
  for(Coral coral:Corallist){
    System.out.println(coral.GetSold());
    System.out.println(coral.GetGained());
    String CoralGained = Integer.toString(coral.GetGained());
    
  }}}
        

 



     
     
       
   

        


        
