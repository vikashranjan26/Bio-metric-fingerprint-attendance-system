

package biometricattendance;


import com.sun.xml.internal.ws.wsdl.writer.document.Port;
import gnu.io.SerialPort;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import org.jdesktop.application.Action;

public class Attendance extends javax.swing.JDialog {
   public String Date;
   public String session;
   public String tdate;
   public String time;
   int flag=1;
    Main main1;
    FingerMain main=new FingerMain();
    Dimension wndSize;
    Toolkit theKit;
    public Attendance(java.awt.Frame parent) {
        super(parent);
        initComponents();
        flag=1;
        getRootPane().setDefaultButton(closeButton);
    }

    @Action public void closeAboutBox() {
        main.serialPort.close();
        dispose();
        
    }
     @Action
     public void Save() throws Exception {
 tdate =(jTextField1.getText().toString());
  time=jTextField2.getText();
   session=jTextField3.getText();
    int student_id=1;
    Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
         
ResultSet rs1= st.executeQuery("select * from tblstudent where student_id="+student_id+"");
if (rs1.next())
{
    JOptionPane.showMessageDialog(null,"valid id");




ResultSet rs= st.executeQuery("Select * from tblattendance where student_id=("+student_id+") and (session_name='"+session+"') and (date='"+tdate+"')" );
if (rs.next())
{

    JOptionPane.showMessageDialog(null,"Already entered " );
    


}



else{
int i= st.executeUpdate("Insert into tblattendance values('"+tdate+"','"+time+"','"+session+"',"+student_id+")");
JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
st.close();
con.close();
         
        jTextField2.setText("");
          jTextField3.setText("");
         jTextField1.setText("");
dispose();

    }
}
else {
     JOptionPane.showMessageDialog(null,"invalid Id " );
     
}
     }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appTitleLabel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

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

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(biometricattendance.BiometricAttendanceApp.class).getContext().getActionMap(Attendance.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
        closeButton.setName("closeButton"); // NOI18N

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setName("versionLabel"); // NOI18N

        imageLabel.setName("imageLabel"); // NOI18N

        appTitleLabel1.setFont(appTitleLabel1.getFont().deriveFont(appTitleLabel1.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel1.getFont().getSize()+4));
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(biometricattendance.BiometricAttendanceApp.class).getContext().getResourceMap(Attendance.class);
        appTitleLabel1.setForeground(resourceMap.getColor("appTitleLabel1.foreground")); // NOI18N
        appTitleLabel1.setText(resourceMap.getString("appTitleLabel1.text")); // NOI18N
        appTitleLabel1.setName("appTitleLabel1"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.setName("jTextField1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jTextField2.setEnabled(false);
        jTextField2.setName("jTextField2"); // NOI18N

        jLabel3.setText(resourceMap.getString("jLabel3.text")); // NOI18N
        jLabel3.setName("jLabel3"); // NOI18N

        jTextField3.setEnabled(false);
        jTextField3.setName("jTextField3"); // NOI18N

        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setAction(actionMap.get("portClose")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(versionLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(closeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(appTitleLabel1)
                    .addContainerGap(367, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(versionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(closeButton)
                    .addComponent(jButton1))
                .addContainerGap(85, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(appTitleLabel1)
                    .addContainerGap(275, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened


    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
               Date dt = new  Date();
                SimpleDateFormat ft = new SimpleDateFormat ("dd-MMM-yyyy");
                SimpleDateFormat tmft = new SimpleDateFormat ("hh:mm:ss");

        jTextField1.setText((ft.format(dt) ));
        tdate=ft.format(dt);
        jTextField2.setText(tmft.format(dt));
        time=tmft.format(dt);
        
        try{
Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select * from tblcurrentsession");

        if (rs.next())
        {
           jTextField3.setText( rs.getString("Session_name"));
           session=jTextField3.getText();


        }


rs.close();
st.close();
con.close();
}
  catch(Exception e){}
    }//GEN-LAST:event_formWindowActivated

    public void Dat(String s) throws Exception

    {
Date dt = new  Date();
                SimpleDateFormat ft = new SimpleDateFormat ("dd-MMM-yyyy");
                SimpleDateFormat tmft = new SimpleDateFormat ("hh:mm:ss");


        tdate=ft.format(dt);

        time=tmft.format(dt);


Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select * from tblcurrentsession");

        if (rs.next())
        {
           jTextField3.setText( rs.getString("Session_name"));
           session=jTextField3.getText();


        }


rs.close();
st.close();
con.close();
    int student_id=Integer.parseInt(s);
con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
st = con.createStatement();

ResultSet rs1= st.executeQuery("select * from tblstudent where student_id="+student_id+"");
if (rs1.next())
{
   // JOptionPane.showMessageDialog(null,"valid id");

    


rs= st.executeQuery("Select * from tblattendance where student_id=("+student_id+") and (session_name='"+session+"') and (date='"+tdate+"')" );
if (rs.next())
{

    JOptionPane.showMessageDialog(null,"Already entered " );
    main.serialPort.close();
    main.res();
    //main.serialPort.close();
dispose();
}



else{
int i= st.executeUpdate("Insert into tblattendance values('"+tdate+"','"+time+"','"+session+"',"+student_id+")");
JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
main.serialPort.close();
main.res();
st.close();
con.close();
          
        jTextField2.setText("");
          jTextField3.setText("");
         jTextField1.setText("");
dispose();

    }
}
else {
     JOptionPane.showMessageDialog(null,"invalid Id " );
     main.serialPort.close();
     main.res();
     
}


        
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        System.out.println("Scan");
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
           // System.out.println("port Opened");

            main.RS232Setup("COM1");
            
            
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
    }//GEN-LAST:event_jButton2ActionPerformed

    @Action
    public void test() {
        test ts=new test();
        ts.check("COM1");


        
    }

    @Action
    public void portClose() {
        
        main.serialPort.close();
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
    
}
