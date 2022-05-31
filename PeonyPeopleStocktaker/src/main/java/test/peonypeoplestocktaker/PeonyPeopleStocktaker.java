package test.peonypeoplestocktaker;
import java.io.*;
import java.util.Scanner;  
import java.util.ArrayList; 

public class PeonyPeopleStocktaker {
   
static ArrayList<Coral> Coral = new ArrayList<Coral>();
static ArrayList<Sarah> Sarah = new ArrayList<Sarah>();
static ArrayList<Red> Red = new ArrayList<Red>();

 public static void main( String args[] )
{
 // Creates the gui window            
javax.swing.JFrame window = new javax.swing.JFrame("PeonyPeople");
window.getContentPane().add(new StocktakerGUI());
window.setVisible(true);
window.pack();
window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);

 
    

}




}

