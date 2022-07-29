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
        ViewFlowerType = new javax.swing.JComboBox<>();
        ViewData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ViewTotalGained = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        ViewTotalSold = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        ViewTotalStock = new javax.swing.JTextArea();
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
        SavedMSG = new javax.swing.JLabel();

        Tab.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setForeground(new java.awt.Color(153, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel2.setText("Type of Flower");

        ViewFlowerType.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        ViewFlowerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type", "Coral Sunset", "Sarah Bernhardt", "Red Charm" }));
        ViewFlowerType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewFlowerType.setPreferredSize(new java.awt.Dimension(206, 36));
        ViewFlowerType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewFlowerTypeActionPerformed(evt);
            }
        });

        ViewData.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        ViewData.setText("View Data");
        ViewData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ViewData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDataActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel1.setText("Total Gained");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Total Sold");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel5.setText("Total Stock");

        ViewTotalGained.setEditable(false);
        ViewTotalGained.setColumns(6);
        ViewTotalGained.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ViewTotalGained.setRows(1);
        ViewTotalGained.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane2.setViewportView(ViewTotalGained);

        ViewTotalSold.setEditable(false);
        ViewTotalSold.setColumns(6);
        ViewTotalSold.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ViewTotalSold.setRows(1);
        ViewTotalSold.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane3.setViewportView(ViewTotalSold);

        ViewTotalStock.setEditable(false);
        ViewTotalStock.setColumns(6);
        ViewTotalStock.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        ViewTotalStock.setRows(1);
        ViewTotalStock.setPreferredSize(new java.awt.Dimension(60, 20));
        jScrollPane4.setViewportView(ViewTotalStock);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ViewFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(ViewData, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(292, 292, 292)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ViewFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addComponent(ViewData)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        Tab.addTab("View Data", jPanel1);

        jPanel2.setForeground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel3.setText("Type of Flower");

        AddFlowerType.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AddFlowerType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Type", "Coral Sunset", "Sarah Bernhardt", "Red Charm" }));
        AddFlowerType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
        AddSavedData.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddSavedData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddSavedDataActionPerformed(evt);
            }
        });

        AddAmountGained.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        AddAmountGained.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        AddAmountGained.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        AddAmountGained.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddAmountGainedActionPerformed(evt);
            }
        });

        AddAmountSold.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N

        ErrorGained.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ErrorGained.setForeground(new java.awt.Color(255, 51, 51));
        ErrorGained.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                ErrorGainedComponentHidden(evt);
            }
        });

        ErrorSold.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ErrorSold.setForeground(new java.awt.Color(204, 0, 0));

        SavedMSG.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        SavedMSG.setForeground(new java.awt.Color(0, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(246, 246, 246)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(185, 185, 185))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel6))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(AddFlowerType, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(SavedMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ErrorSold, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AddAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AddAmountGained, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ErrorGained, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(AddSavedData)
                .addGap(342, 342, 342))
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
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddAmountGained, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ErrorGained, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(AddAmountSold, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(ErrorSold, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AddSavedData)
                .addGap(18, 18, 18)
                .addComponent(SavedMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
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


//Chooses certain method based on the Flower Type the user has pciked in the VIEW section
    
    private void ViewFlowerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewFlowerTypeActionPerformed
    String flowertype = ViewFlowerType.getSelectedItem().toString();
    if (flowertype == "Coral Sunset")
    {PeonyPeopleStocktaker.Coralload();}
    
    else if (flowertype == "Red Charm")
    {PeonyPeopleStocktaker.Redload();}
    
    else if (flowertype == "Sarah Bernhardt")
    {PeonyPeopleStocktaker.Sarahload();}
        
    }//GEN-LAST:event_ViewFlowerTypeActionPerformed

    private void AddFlowerTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddFlowerTypeActionPerformed

    }//GEN-LAST:event_AddFlowerTypeActionPerformed

    private void AddSavedDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddSavedDataActionPerformed
   
        ErrorSold.setText("");
        ErrorGained.setText("");
        SavedMSG.setText("");
        //Loctaes inputed numbers for Amount Gained and Amount Sold
    
    //Boundry Setting: Only allows positive numbers to be entered, if anything else is eneterd an Error msg appears
        String AmountGainedString = AddAmountGained.getText();
        
        boolean GainedCheck = AmountGainedString.matches(".*[a-zA-Z-.].*");
        if (GainedCheck == true){
            ErrorGained.setText("Error: Only positive whole numbers are to be entered");
        }
       
        String AmountSoldString = AddAmountSold.getText();
        
        boolean SoldCheck = AmountSoldString.matches(".*[a-zA-Z-.].*");
        if (SoldCheck == true){
            ErrorSold.setText("Error: Only positive whole numbers are to be entered");
        }
       
     
        int AmountGained = Integer.parseInt(AmountGainedString);
        int AmountSold = Integer.parseInt(AmountSoldString); 
        
        
        
        //Chooses certain method based on the Flower Type the user has pciked in the ADD section
        String flowertype = AddFlowerType.getSelectedItem().toString();
        
        if (flowertype == "Coral Sunset"){
        try {
            CoralloadAdd(AmountGained, AmountSold);
            SavedMSG.setText("Data successfully printed into coral.txt");
          
        } catch (IOException ex) {
            Logger.getLogger(StocktakerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
  
        if (flowertype == "Red Charm"){
        try {
            RedloadAdd(AmountGained, AmountSold);
            SavedMSG.setText("Data successfully printed into red.txt");
        } catch (IOException ex) {
            Logger.getLogger(StocktakerGUI.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
        
        if (flowertype == "Sarah Bernhardt"){
        try {
            SarahloadAdd(AmountGained, AmountSold);
            SavedMSG.setText("Data successfully printed into sarah.txt");
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
    
    
    private void ViewDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDataActionPerformed
        //Prints data loaded from text files to GUI View section
        
        String flowertype = ViewFlowerType.getSelectedItem().toString();
    if (flowertype == "Coral Sunset")
    {ViewTotalGained.setText(PeonyPeopleStocktaker.showCoralGained());    
        ViewTotalSold.setText(PeonyPeopleStocktaker.showCoralSold());
    ViewTotalStock.setText(PeonyPeopleStocktaker.showCoralStock());} 
    
    else if (flowertype == "Red Charm")
    {ViewTotalGained.setText(PeonyPeopleStocktaker.showRedGained());    
        ViewTotalSold.setText(PeonyPeopleStocktaker.showRedSold());
    ViewTotalStock.setText(PeonyPeopleStocktaker.showRedStock());}
    
    else if (flowertype == "Sarah Bernhardt")
    {ViewTotalGained.setText(PeonyPeopleStocktaker.showSarahGained());    
        ViewTotalSold.setText(PeonyPeopleStocktaker.showSarahSold());
    ViewTotalStock.setText(PeonyPeopleStocktaker.showSarahStock());}
        
    }//GEN-LAST:event_ViewDataActionPerformed

    private void ErrorGainedComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_ErrorGainedComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_ErrorGainedComponentHidden

    private void AddAmountGainedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddAmountGainedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AddAmountGainedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddAmountGained;
    private javax.swing.JTextField AddAmountSold;
    private javax.swing.JComboBox<String> AddFlowerType;
    private javax.swing.JButton AddSavedData;
    private javax.swing.JLabel ErrorGained;
    private javax.swing.JLabel ErrorSold;
    private javax.swing.JLabel SavedMSG;
    private javax.swing.JTabbedPane Tab;
    private javax.swing.JButton ViewData;
    private javax.swing.JComboBox<String> ViewFlowerType;
    private javax.swing.JTextArea ViewTotalGained;
    private javax.swing.JTextArea ViewTotalSold;
    private javax.swing.JTextArea ViewTotalStock;
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
