

package biometricattendance;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

public class StudentReg extends javax.swing.JDialog {
    FingerAdd main=new FingerAdd();
    public String StudReg;
    public StudentReg(java.awt.Frame parent) {
        super(parent);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
    }



    @Action public void closeAboutBox() {
        dispose();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        javax.swing.JLabel appTitleLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(biometricattendance.BiometricAttendanceApp.class).getContext().getActionMap(StudentReg.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setName("versionLabel"); // NOI18N

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setName("vendorLabel"); // NOI18N

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setName("homepageLabel"); // NOI18N

        appDescLabel.setName("appDescLabel"); // NOI18N

        imageLabel.setName("imageLabel"); // NOI18N

        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(biometricattendance.BiometricAttendanceApp.class).getContext().getResourceMap(StudentReg.class);
        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jLabel4.setText(resourceMap.getString("jLabel4.text")); // NOI18N
        jLabel4.setName("jLabel4"); // NOI18N

        jLabel5.setText(resourceMap.getString("jLabel5.text")); // NOI18N
        jLabel5.setName("jLabel5"); // NOI18N

        jLabel6.setText(resourceMap.getString("jLabel6.text")); // NOI18N
        jLabel6.setName("jLabel6"); // NOI18N

        jTextField2.setName("jTextField2"); // NOI18N

        jTextField3.setName("jTextField3"); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        jComboBox1.setName("jComboBox1"); // NOI18N

        jScrollPane1.setName("jScrollPane1"); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setName("jTextArea1"); // NOI18N
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox2.setName("jComboBox2"); // NOI18N

        jButton1.setAction(actionMap.get("save")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jButton2.setAction(actionMap.get("Update")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setAction(actionMap.get("Delete")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        jButton4.setAction(actionMap.get("ClearItems")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N

        jTextField4.setText(resourceMap.getString("jTextField4.text")); // NOI18N
        jTextField4.setEnabled(false);
        jTextField4.setName("jTextField4"); // NOI18N

        appTitleLabel1.setFont(appTitleLabel1.getFont().deriveFont(appTitleLabel1.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel1.getFont().getSize()+4));
        appTitleLabel1.setText(resourceMap.getString("appTitleLabel1.text")); // NOI18N
        appTitleLabel1.setName("appTitleLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addGap(51, 51, 51)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                            .addComponent(jComboBox1, 0, 365, Short.MAX_VALUE)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(63, 63, 63)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(vendorLabel)
                                            .addComponent(homepageLabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(versionLabel)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(46, 46, 46)
                                                .addComponent(appDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jButton2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButton3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(closeButton))))
                                    .addComponent(jComboBox2, 0, 357, Short.MAX_VALUE))))
                        .addGap(22, 22, 22))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(appTitleLabel1)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 377, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(appTitleLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(appDescLabel))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(versionLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vendorLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(homepageLabel))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(closeButton)
                                .addComponent(jButton4)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton1))))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       

    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:+
         try{
Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select * from tblbranch");

        while (rs.next())
        {
            String Branch = rs.getString("branch_name");
            jComboBox2.addItem(Branch);

        }


rs.close();
st.close();
}
  catch(Exception e){}
         try{
Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select max(student_id) from tblstudent");


        while (rs.next())
        {
            System.out.println("test");
            String id = rs.getString("max(student_id)");
            int nid=Integer.parseInt(id)+1;
            jTextField4.setText(Integer.toString(nid));

        }


rs.close();
st.close();
con.close();
}
  catch(Exception e){}


    }//GEN-LAST:event_formWindowActivated
    @Action
    public void save() throws Exception {
                StudReg=getId();                
    main.GetString(StudReg);
                main.res();
        //System.out.println("scan");
        if(Main.portOpen) {
            //System.out.println("close");
            main.serialPort.close();
            main.serialPort.removeEventListener();
            Main.portOpen = false;

             /*setjlStatus("COM1",
                            Main.baud,
                            Main.parity,
                            Main.databits,
                            Main.stopbits,
                            Main.portOpen);*/
        }
        else
        {
           System.out.println("port Opened");

            main.RS232Setup("COM1");
             System.out.println("port Opened");

            String str= "EF";
            int i= Integer.parseInt(str,16);
            //System.out.println("Decimal:="+ i);
            char c = (char)i;
            //System.out.println("Char:="+ c);
           // System.out.println("Test");
           // System.out.println(String.format("%1$02x", (c & 0xFFFF)));
            main.writetoport(c);
            str= "01";
            i= Integer.parseInt(str,16);
            //System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "FF";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "FF";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "FF";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "FF";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "01";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
            //System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "00";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "03";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "01";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
            //System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "00";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            str= "05";
            i= Integer.parseInt(str,16);
           // System.out.println("Decimal:="+ i);
            c = (char)i;
           // System.out.println("Char:="+ c);
            main.writetoport(c);
            //System.out.println("data Send commnd1");
           /* setjlStatus(jcbPort.getSelectedItem().toString(),
                            Main.baud,
                            Main.parity,
                            Main.databits,
                            Main.stopbits,
                            Main.portOpen);*/



        }
       int student_id=Integer.parseInt(jTextField4.getText());
        String student_name=jTextField2.getText();
        int reg_no=Integer.parseInt(jTextField3.getText());
        String sex=String.valueOf(jComboBox1.getSelectedItem());
         String address=jTextArea1.getText();
         String branch=String.valueOf(jComboBox2.getSelectedItem());
        //System.out.print(sex);
        


Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();


ResultSet rs= st.executeQuery("Select * from tblstudent where student_id="+student_id+"" );
if (rs.next())
{

    JOptionPane.showMessageDialog(null,"Cannot insert " );
     ClearItems();
}
else{
int i= st.executeUpdate("Insert into tblstudent(student_id,student_name,reg_no,sex,address,branch) values("+student_id+",'"+student_name+"',"+reg_no+",'"+sex+"','"+address+"','"+branch+"')");
JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
st.close();
con.close();
ClearItems();
}
        }
    

    @Action
    public void ClearItems() {
          jTextField4.setText("");
        jTextField2.setText("");
          jTextField3.setText("");
        jTextArea1.setText("");




    }

    @Action
    public void Update() {
             String str = JOptionPane.showInputDialog(null, "Enter Id: ",
                            "Biometric Attendance", 1);
         int student_id=Integer.parseInt(str);
        String student_name=jTextField2.getText();
           int reg_no=Integer.parseInt(jTextField3.getText());
        String sex=String.valueOf(jComboBox1.getSelectedItem());
         String address=jTextArea1.getText();
         String branch=String.valueOf(jComboBox2.getSelectedItem());

try{
Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();

ResultSet rs= st.executeQuery("Select * from tblstudent where student_id="+student_id+"" );

if (rs.next())
{
    int i= st.executeUpdate("update tblstudent set branch_name='"+student_name+"',reg_no="+reg_no+",sex='"+sex+"',address='"+address+"',branch='"+branch+"' where student_id="+student_id+"");
JOptionPane.showMessageDialog(null,"Data is successfully Updated into the database." );
st.close();
con.close();
ClearItems();
}
else
{
    JOptionPane.showMessageDialog(null,"No Record Found" );
     ClearItems();
}

}
catch(Exception e){
System.out.println(e);
}


    }

    @Action
    public void Delete() {
         {
             String str = JOptionPane.showInputDialog(null, "Enter Id: ",
                            "Biometric Attendance", 1);
             int student_id =Integer.parseInt(str);

try{
Connection con = null;
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select * from tblstudent where student_id="+student_id+"" );

if (rs.next())
{
int i= st.executeUpdate("delete from tblstudent where student_id="+student_id+"");
st.executeUpdate("delete from tblattendance where student_id="+student_id+"");
JOptionPane.showMessageDialog(null,"Data is successfully deleted from the database." );
st.close();
con.close();
 ClearItems();

}
else{
    JOptionPane.showMessageDialog(null,"no record found");
     ClearItems();
}
}
catch(Exception e){
System.out.println(e);
}


    }
    }
                public String getId()
                {
                    int nid=0;
                    try{
                    Connection con = null;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
                    Statement st = con.createStatement();
                    ResultSet rs= st.executeQuery("Select max(student_id) from tblstudent");


                    while (rs.next())
                     {

                        String id = rs.getString("max(student_id)");
                        nid=Integer.parseInt(id)+1;

                            System.out.println("id is "+nid);
                            
                      }


                        rs.close();
                        st.close();
                        con.close();
}
  catch(Exception e){}
                   
return(Integer.toString(nid));
                }
    @Action
    public void test() {
        
     main.serialPort.close();
     main.res();

    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
    
}
