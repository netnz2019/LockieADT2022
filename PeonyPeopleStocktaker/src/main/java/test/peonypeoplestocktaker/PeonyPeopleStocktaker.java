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
import static test.peonypeoplestocktaker.PeonyPeopleStocktaker.Corallist;
import static test.peonypeoplestocktaker.PeonyPeopleStocktaker.showCoralGained;
import static test.peonypeoplestocktaker.PeonyPeopleStocktaker.showCoralSold;

public class PeonyPeopleStocktaker {
   
//Creates Arraylist of each type of flower
static ArrayList<Sarah> Sarahlist = new ArrayList<Sarah>();
static ArrayList<Red> Redlist = new ArrayList<Red>();
static ArrayList<Coral> Corallist = new ArrayList<Coral>();

 public static void main( String args[]) 
{
 // Creates the gui window            
javax.swing.JFrame window = new javax.swing.JFrame("PeonyPeople");
window.getContentPane().add(new StocktakerGUI());
window.setVisible(true);
window.pack();
window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
}

//Coral section
 
// Loads the coral.txt file which stores the data
public static void Coralload(){

String filename = "C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\coral.txt";
File coral = new File(filename);

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
showCoralGained();
showCoralSold();
}

// Prints the amount gained for the Coral flower
public static String showCoralGained(){
  String CoralGained = "";
    for(Coral coral:Corallist){
    CoralGained = Integer.toString(coral.GetGained()); 
   }
    return CoralGained;
 }
// Prints amount sold for the Coral flower
public static String showCoralSold(){
  String CoralSold = "";
    for(Coral coral:Corallist){
    CoralSold = Integer.toString(coral.GetSold());
  }
    return CoralSold;
}
// Prints the total stock for the Coral flower
public static String showCoralStock(){
  String CoralStock = "";
  for(Coral coral:Corallist){
  int CoralTotal = coral.GetGained() - coral.GetSold();
  CoralStock = Integer.toString(CoralTotal);
}
        return CoralStock;
}



     
//Red section 
 
// Loads the red.txt file which stores the data       
public static void Redload(){

String filename = "C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\red.txt";
File red = new File(filename);

try{

Scanner fileScan = new Scanner(red);
while(fileScan.hasNextLine()){

String[] eachItem = fileScan.nextLine().split(",");

try{
   int sold = Integer.parseInt(eachItem[0].trim());
   int gained = Integer.parseInt(eachItem[1].trim());

Redlist.add(new Red(sold, gained));
}catch(NumberFormatException e){

System.out.println(" ignoring this line - couldn't parse ");
}
}
}catch(FileNotFoundException e){
System.out.println(" File not found ");
System.exit(1); 
}
showRedGained();
showRedSold();
}
// Prints the amount gained for the Red flower
public static String showRedGained(){
  String RedGained = "";
    for(Red red:Redlist){
    RedGained = Integer.toString(red.GetGained());
    System.out.print(red.GetGained());
   }
    return RedGained;
 }
// Prints the amount sold for the Red flower
public static String showRedSold(){
  String RedSold = "";
    for(Red red:Redlist){
    RedSold = Integer.toString(red.GetSold());
  }
    return RedSold;
}
// Prints the total stock for the Red flower
public static String showRedStock(){
  String RedStock = "";
  for(Red red:Redlist){
  int RedTotal = red.GetGained() - red.GetSold();
  RedStock = Integer.toString(RedTotal);
}
        return RedStock;
}
//Sarah section
 
// Loads the sarah.txt file which stores the data
public static void Sarahload(){

String filename = "C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\sarah.txt";
File sarah = new File(filename);

try{

Scanner fileScan = new Scanner(sarah);
while(fileScan.hasNextLine()){

String[] eachItem = fileScan.nextLine().split(",");

try{
   int sold = Integer.parseInt(eachItem[0].trim());
   int gained = Integer.parseInt(eachItem[1].trim());

Sarahlist.add(new Sarah(sold, gained));
}catch(NumberFormatException e){

System.out.println(" ignoring this line - couldn't parse ");
}
}
}catch(FileNotFoundException e){
System.out.println(" File not found ");
System.exit(1); 
}
showSarahGained();
showSarahSold();
}
// Prints the amount gained for the Sarah flower
public static String showSarahGained(){
  String SarahGained = "";
    for(Sarah sarah:Sarahlist){
    SarahGained = Integer.toString(sarah.GetGained());
    System.out.print(sarah.GetGained());
   }
    return SarahGained;
 }
// Prints the amount sold for the Sarah flower
public static String showSarahSold(){
  String SarahSold = "";
    for(Sarah sarah:Sarahlist){
    SarahSold = Integer.toString(sarah.GetSold());
  }
    return SarahSold;
}
// Prints the total stock for the Sarah flower
public static String showSarahStock(){
  String SarahStock = "";
  for(Sarah sarah:Sarahlist){
  int RedTotal =sarah.GetGained() - sarah.GetSold();
  SarahStock = Integer.toString(RedTotal);
}
        return SarahStock;
}




}


        
