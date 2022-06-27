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
ArrayList<String> Coral = new ArrayList<String>();

try{
Scanner fileScan = new Scanner(coral);
while(fileScan.hasNextLine()){
Coral.add(fileScan.nextLine());
}}

catch(FileNotFoundException e){
System.out.println(" File not found ");
System.exit(1); 
}
for(String eachName:Coral){
System.out.println(eachName);
}
}


}

 



     
     
       
   

        



