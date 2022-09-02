
package test.peonypeoplestocktaker;

//Crestes new Coral object for Corallist Arraylist
// add context about sold and gained regrading flower
public class Coral {

    private int Sold;
    private int Gained;
    
public Coral(int Sold, int Gained)
{
 this.Sold = Sold;
 this.Gained = Gained;
}

public int GetSold(){
    return this.Sold;
}
        
public int GetGained() {
    return this.Gained;
}
public void setSold(int Sold){
  this.Sold = Sold;
  }
public void setGained(int Gained){
  this.Gained = Gained;
  }
}
