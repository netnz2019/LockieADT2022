
package test.peonypeoplestocktaker;

//Crestes new Red object for Redlist Arraylist        
public class Red {
    private int Sold;
    public int Gained;
    
public Red(int Sold, int Gained)
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

