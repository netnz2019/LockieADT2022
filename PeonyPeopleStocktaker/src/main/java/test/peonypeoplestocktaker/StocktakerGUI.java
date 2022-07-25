package test.peonypeoplestocktaker;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import static test.peonypeoplestocktaker.PeonyPeopleStocktaker.Corallist;
import static test.peonypeoplestocktaker.PeonyPeopleStocktaker.Redlist;
import static test.peonypeoplestocktaker.PeonyPeopleStocktaker.Sarahlist;

//StocktakerGUI Class:  Holds details of GUI, Recognises actions preformed in GUI to then run certain methods,
//Prints collected varibles onto GUI, Locates and loads data from certain text files, Manipulates collected data,
//Clears certain textfiles, Prints manipulated varibales to text files
public class StocktakerGUI extends javax.swing.JPanel {
 
     StocktakerGUI() {
        initComponents();
    }
      
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tab = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        VeiwFlowerType = new javax.swing.JComboBox<>();
        VeiwData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        VeiwTotalGained = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        VeiwTotalSold = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        VeiwTotalStock = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AddFlowerType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        AddSavedData = new javax.swing.JButton();
        AddAmountGained = new javax.swing.JTextField();
        AddAmountSold = new javax.swing.JTextField();
        ErrorGained = new javax.swing.JLabel();
        ErrorSold = new javax.swing.JLabel();

        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Type of Flower");

        VeiwFlowerType.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        VeiwFlowerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flower Type", "Coral Sunset", "Sarah Bernhardt", "Red Charm" }));
        VeiwFlowerType.setPreferredSize(new java.awt.Dimension(206, 36));
        VeiwFlowerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiwFlowerTypeActionPerformed(evt);
            }
        });

        VeiwData.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        VeiwData.setText("View Data");
        VeiwData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VeiwDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Total Gained");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Total Sold");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("Total Stock");

        VeiwTotalGained.setEditable(false);
        VeiwTotalGained.setColumns(6);
        VeiwTotalGained.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        VeiwTotalGained.setRows(1);
        VeiwTotalGained.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane2.setViewportView(VeiwTotalGained);

        VeiwTotalSold.setEditable(false);
        VeiwTotalSold.setColumns(6);
        VeiwTotalSold.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        VeiwTotalSold.setRows(1);
        VeiwTotalSold.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane3.setViewportView(VeiwTotalSold);

        VeiwTotalStock.setEditable(false);
        VeiwTotalStock.setColumns(6);
        VeiwTotalStock.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        VeiwTotalStock.setRows(1);
        VeiwTotalStock.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane4.setViewportView(VeiwTotalStock);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(VeiwFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(VeiwData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(VeiwFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(VeiwData)
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4))
                .addGap(73, 73, 73))
        );

        Tab.addTab("View Data", jPanel1);

        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("Type of Flower");

        AddFlowerType.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AddFlowerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Flower Type", "Coral Sunset", "Sarah Bernhardt", "Red Charm" }));
        AddFlowerType.setPreferredSize(new java.awt.Dimension(170, 45));
        AddFlowerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddFlowerTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("Amount Gained");

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel7.setText("Amount Sold");

        AddSavedData.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AddSavedData.setText("Save Data");
        AddSavedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSavedDataActionPerformed(evt);
            }
        });

        AddAmountGained.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        AddAmountSold.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        ErrorGained.setForeground(new java.awt.Color(255, 51, 51));
        ErrorGained.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ErrorGainedComponentHidden(evt);
            }
        });

        ErrorSold.setForeground(new java.awt.Color(204, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AddFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(AddSavedData))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(217, 217, 217)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ErrorGained, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(93, 93, 93)
                                    .addComponent(AddAmountGained, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(ErrorSold, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(108, 108, 108)
                                    .addComponent(AddAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AddFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(AddAmountGained, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorGained, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(AddAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ErrorSold, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(86, 86, 86)
                .addComponent(AddSavedData)
                .addGap(23, 23, 23))
        );

        Tab.addTab("Add Data", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Tab)
        );
    }// </editor-fold>//GEN-END:initComponents


//Chooses certain method based on the Flower Type the user has pciked in the VEIW section
    
    private void VeiwFlowerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiwFlowerTypeActionPerformed
    String flowertype = VeiwFlowerType.getSelectedItem().toString();
    if (flowertype == "Coral Sunset")
    {PeonyPeopleStocktaker.Coralload();}
    
    else if (flowertype == "Red Charm")
    {PeonyPeopleStocktaker.Redload();}
    
    else if (flowertype == "Sarah Bernhardt")
    {PeonyPeopleStocktaker.Sarahload();}
        
    }//GEN-LAST:event_VeiwFlowerTypeActionPerformed

    private void AddFlowerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlowerTypeActionPerformed

    }//GEN-LAST:event_AddFlowerTypeActionPerformed

    private void AddSavedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSavedDataActionPerformed
    //Loctaes inputed numbers for Amount Gained and Amount Sold
    
    //Boundry Setting: Only allows positive numbers to be entered, if anything else is eneterd an Error msg appears
        String AmountGainedString = AddAmountGained.getText();
        
        boolean GainedCheck = AmountGainedString.matches(".*[a-zA-Z-].*");
        if (GainedCheck == true){
            ErrorGained.setText("Error: Only positive numbers are to be entered");
        }
       
        String AmountSoldString = AddAmountSold.getText();
        
        boolean SoldCheck = AmountSoldString.matches(".*[a-zA-Z-].*");
        if (SoldCheck == true){
            ErrorSold.setText("Error: Only positive numbers are to be entered");
        }
       
     
        int AmountGained = Integer.parseInt(AmountGainedString);
        int AmountSold = Integer.parseInt(AmountSoldString); 
        
        
        
        //Chooses certain method based on the Flower Type the user has pciked in the ADD section
        String flowertype = AddFlowerType.getSelectedItem().toString();
        
        if (flowertype == "Coral Sunset"){
        try {
            CoralloadAdd(AmountGained, AmountSold);
          
        } catch (IOException ex) {
            Logger.getLogger(StocktakerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
  
        if (flowertype == "Red Charm"){
        try {
            RedloadAdd(AmountGained, AmountSold);
          
        } catch (IOException ex) {
            Logger.getLogger(StocktakerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
        
        if (flowertype == "Sarah Bernhardt"){
        try {
            SarahloadAdd(AmountGained, AmountSold);
          
        } catch (IOException ex) {
            Logger.getLogger(StocktakerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
        
    }//GEN-LAST:event_AddSavedDataActionPerformed
 //Coral Section
    
 //Loads coral.txt which holds the necessary data   
public static void CoralloadAdd(int AmountGained, int AmountSold) throws IOException{

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
AddCoral(AmountGained, AmountSold);


}


// Adds the inputed amount to the amount stored coral.txt
    public static String AddCoral(int AmountGained, int AmountSold) throws IOException{
      String TotalCoralGainedAdd = "";
      String TotalCoralSoldAdd = "";
    for(Coral coral:Corallist){
       int NewCoralGained = coral.GetGained() + AmountGained;
       int NewCoralSold = coral.GetSold() + AmountSold;
       TotalCoralGainedAdd = Integer.toString(NewCoralGained);
       TotalCoralSoldAdd = Integer.toString(NewCoralSold);
    }
      clearCoral(); 
      PrintToCoral(TotalCoralGainedAdd, TotalCoralSoldAdd);
      return TotalCoralGainedAdd;
    }     
    
    
    //Wipes the coral.txt file so data can be replaced
    public static void clearCoral()
{
    try{
    FileWriter fw = new FileWriter("C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\coral.txt", false);
    PrintWriter pw = new PrintWriter(fw, false);
    pw.flush();
    pw.close();
    fw.close();
    }catch(Exception exception){
        System.out.println("Exception have been caught");
    }
}
    //Prints new manipulated data to coral.txt
    public static String PrintToCoral(String TotalCoralSoldAdd, String TotalCoralGainedAdd) throws IOException{
     FileWriter fw = null;
     BufferedWriter bw = null;
     PrintWriter pw = null;
     
     try {
            fw = new FileWriter("C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\coral.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);          
            pw.print(TotalCoralGainedAdd);
            pw.print(",");
            pw.print(TotalCoralSoldAdd);
           
           
            System.out.println("Data successfully printed into file");
            pw.flush();

        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {
            }
    }
        return null;
     
    }
    
    
 //Red Section
    
 //Loads red.txt which holds the necessary data
 public static void RedloadAdd(int AmountGained, int AmountSold) throws IOException{

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
AddRed(AmountGained, AmountSold);


}


// Adds the inputed amount to the amount stored red.txt
    public static String AddRed(int AmountGained, int AmountSold) throws IOException{
      String TotalRedGainedAdd = "";
      String TotalRedSoldAdd = "";
    for(Red red:Redlist){
       int NewRedGained = red.GetGained() + AmountGained;
       int NewRedSold = red.GetSold() + AmountSold;
       TotalRedGainedAdd = Integer.toString(NewRedGained);
       TotalRedSoldAdd = Integer.toString(NewRedSold);
    }
      clearRed();
      PrintToRed(TotalRedGainedAdd, TotalRedSoldAdd);
      return TotalRedGainedAdd;
    }     
    
    
    //Wipes red.txt file so data can be replaced
    public static void clearRed()
{
    try{
    FileWriter fw = new FileWriter("C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\red.txt", false);
    PrintWriter pw = new PrintWriter(fw, false);
    pw.flush();
    pw.close();
    fw.close();
    }catch(Exception exception){
        System.out.println("Exception have been caught");
    }
}
    //Prints new manipulated data to coral.txt
    public static String PrintToRed(String TotalRedSoldAdd, String TotalRedGainedAdd) throws IOException{
     FileWriter fw = null;
     BufferedWriter bw = null;
     PrintWriter pw = null;
     
     try {
            fw = new FileWriter("C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\red.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);          
            pw.print(TotalRedGainedAdd);
            pw.print(",");
            pw.print(TotalRedSoldAdd);
           
            System.out.println("Data successfully printed into file");
            pw.flush();

        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {
            }
    }
        return null;
     
    }
   
     
  //Sarah Section
    
 //Loads sarah.txt which holds the necessary data   
   public static void SarahloadAdd(int AmountGained, int AmountSold) throws IOException{

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
AddSarah(AmountGained, AmountSold);


}


// Adds the inputed amount to the amount stored sarah.txt
    public static String AddSarah(int AmountGained, int AmountSold) throws IOException{
      String TotalSarahGainedAdd = "";
      String TotalSarahSoldAdd = "";
    for(Sarah sarah:Sarahlist){
       int NewSarahGained = sarah.GetGained() + AmountGained;
       int NewSarahSold = sarah.GetSold() + AmountSold;
       TotalSarahGainedAdd = Integer.toString(NewSarahGained);
       TotalSarahSoldAdd = Integer.toString(NewSarahSold);
    }
      clearSarah(); 
      PrintToSarah(TotalSarahGainedAdd, TotalSarahSoldAdd);
      return TotalSarahGainedAdd;
    }     
    
    
    //Wipes red.txt file so data can be replaced
    public static void clearSarah()
{
    try{
    FileWriter fw = new FileWriter("C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\sarah.txt", false);
    PrintWriter pw = new PrintWriter(fw, false);
    pw.flush();
    pw.close();
    fw.close();
    }catch(Exception exception){
        System.out.println("Exception have been caught");
    }
}
    //Prints new manipulated data to coral.txt
    public static String PrintToSarah(String TotalSarahSoldAdd, String TotalSarahGainedAdd) throws IOException{
     FileWriter fw = null;
     BufferedWriter bw = null;
     PrintWriter pw = null;
     
     try {
            fw = new FileWriter("C:\\Users\\nzloc\\OneDrive\\Documents\\GitHub\\LockieADT2022\\PeonyPeopleStocktaker\\src\\main\\java\\test\\peonypeoplestocktaker\\sarah.txt", true);
            bw = new BufferedWriter(fw);
            pw = new PrintWriter(bw);          
            pw.print(TotalSarahGainedAdd);
            pw.print(",");
            pw.print(TotalSarahSoldAdd);
           
            System.out.println("Data successfully printed into file");
            pw.flush();

        } finally {
            try {
                pw.close();
                bw.close();
                fw.close();
            } catch (IOException io) {
            }
    }
        return null;
     
    }
    
    
    private void VeiwDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VeiwDataActionPerformed
        //COMMENT
        
        String flowertype = VeiwFlowerType.getSelectedItem().toString();
    if (flowertype == "Coral Sunset")
    {VeiwTotalGained.setText(PeonyPeopleStocktaker.showCoralGained());    
        VeiwTotalSold.setText(PeonyPeopleStocktaker.showCoralSold());
    VeiwTotalStock.setText(PeonyPeopleStocktaker.showCoralStock());} 
    
    else if (flowertype == "Red Charm")
    {VeiwTotalGained.setText(PeonyPeopleStocktaker.showRedGained());    
        VeiwTotalSold.setText(PeonyPeopleStocktaker.showRedSold());
    VeiwTotalStock.setText(PeonyPeopleStocktaker.showRedStock());}
    
    else if (flowertype == "Sarah Bernhardt")
    {VeiwTotalGained.setText(PeonyPeopleStocktaker.showSarahGained());    
        VeiwTotalSold.setText(PeonyPeopleStocktaker.showSarahSold());
    VeiwTotalStock.setText(PeonyPeopleStocktaker.showSarahStock());}
        
    }//GEN-LAST:event_VeiwDataActionPerformed

    private void ErrorGainedComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ErrorGainedComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorGainedComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddAmountGained;
    private javax.swing.JTextField AddAmountSold;
    private javax.swing.JComboBox<String> AddFlowerType;
    private javax.swing.JButton AddSavedData;
    private javax.swing.JLabel ErrorGained;
    private javax.swing.JLabel ErrorSold;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JButton VeiwData;
    private javax.swing.JComboBox<String> VeiwFlowerType;
    private javax.swing.JTextArea VeiwTotalGained;
    private javax.swing.JTextArea VeiwTotalSold;
    private javax.swing.JTextArea VeiwTotalStock;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration//GEN-END:variables
}
