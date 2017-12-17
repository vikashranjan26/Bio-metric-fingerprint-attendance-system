

package biometricattendance;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdesktop.application.Action;
import java.*;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.xml.soap.Text;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Branch extends javax.swing.JDialog {

    public Branch(java.awt.Frame parent) {
        super(parent);
        initComponents();
        getRootPane().setDefaultButton(closeButton);
    }

    @Action public void closeAboutBox() {
        dispose();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        closeButton = new javax.swing.JButton();
        javax.swing.JLabel versionLabel = new javax.swing.JLabel();
        javax.swing.JLabel vendorLabel = new javax.swing.JLabel();
        javax.swing.JLabel homepageLabel = new javax.swing.JLabel();
        javax.swing.JLabel appDescLabel = new javax.swing.JLabel();
        javax.swing.JLabel imageLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        javax.swing.JLabel appTitleLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("aboutBox"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(biometricattendance.BiometricAttendanceApp.class).getContext().getActionMap(Branch.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
        org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application.getInstance(biometricattendance.BiometricAttendanceApp.class).getContext().getResourceMap(Branch.class);
        closeButton.setText(resourceMap.getString("closeButton.text")); // NOI18N
        closeButton.setFocusPainted(false);
        closeButton.setName("closeButton"); // NOI18N

        versionLabel.setFont(versionLabel.getFont().deriveFont(versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
        versionLabel.setName("versionLabel"); // NOI18N

        vendorLabel.setFont(vendorLabel.getFont().deriveFont(vendorLabel.getFont().getStyle() | java.awt.Font.BOLD));
        vendorLabel.setName("vendorLabel"); // NOI18N

        homepageLabel.setFont(homepageLabel.getFont().deriveFont(homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
        homepageLabel.setName("homepageLabel"); // NOI18N

        appDescLabel.setName("appDescLabel"); // NOI18N

        imageLabel.setName("imageLabel"); // NOI18N

        jButton1.setAction(actionMap.get("save")); // NOI18N
        jButton1.setText(resourceMap.getString("jButton1.text")); // NOI18N
        jButton1.setName("jButton1"); // NOI18N

        jLabel1.setText(resourceMap.getString("jLabel1.text")); // NOI18N
        jLabel1.setName("jLabel1"); // NOI18N

        jLabel2.setText(resourceMap.getString("jLabel2.text")); // NOI18N
        jLabel2.setName("jLabel2"); // NOI18N

        jButton2.setAction(actionMap.get("Update")); // NOI18N
        jButton2.setText(resourceMap.getString("jButton2.text")); // NOI18N
        jButton2.setName("jButton2"); // NOI18N

        jButton3.setAction(actionMap.get("Delete")); // NOI18N
        jButton3.setText(resourceMap.getString("jButton3.text")); // NOI18N
        jButton3.setName("jButton3"); // NOI18N

        jButton4.setAction(actionMap.get("ClearItems")); // NOI18N
        jButton4.setText(resourceMap.getString("jButton4.text")); // NOI18N
        jButton4.setName("jButton4"); // NOI18N

        jTextField1.setText(resourceMap.getString("jTextField1.text")); // NOI18N
        jTextField1.setEnabled(false);
        jTextField1.setName("jTextField1"); // NOI18N

        jTextField2.setName("jTextField2"); // NOI18N

        appTitleLabel1.setFont(appTitleLabel1.getFont().deriveFont(appTitleLabel1.getFont().getStyle() | java.awt.Font.BOLD, appTitleLabel1.getFont().getSize()+4));
        appTitleLabel1.setText(resourceMap.getString("appTitleLabel1.text")); // NOI18N
        appTitleLabel1.setName("appTitleLabel1"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(imageLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(versionLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vendorLabel)
                            .addComponent(homepageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appDescLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButton1)
                                        .addComponent(jLabel1))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton2)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton3)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(closeButton))
                                        .addComponent(jTextField1))))))
                    .addComponent(appTitleLabel1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(appTitleLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(appDescLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(versionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendorLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(homepageLabel))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(closeButton))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        try {
            // TODO add your handling code here:
            Connection con = null;
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select max(branch_id) from tblbranch");
            while (rs.next()) {

                String id = rs.getString("max(branch_id)");
                int nid = Integer.parseInt(id) + 1;
                jTextField1.setText(Integer.toString(nid));
            }
            rs.close();
            st.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(Branch.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Branch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    

    @Action
    public void ClearItems() {
        jTextField1.setText("");
        jTextField2.setText("");

    }

    @Action
    public void Update()
    {
                     String str = JOptionPane.showInputDialog(null, "Enter Id: ",
                            "Biometric Attendance", 1);
        int value1=Integer.parseInt(str);
        String value2=jTextField2.getText();
try{
Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();

ResultSet rs= st.executeQuery("Select * from tblbranch where branch_id="+value1+"" );

if (rs.next())
{
    int i= st.executeUpdate("update tblbranch set branch_name='"+value2+"' where branch_id="+value1+"");
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
         {              String str = JOptionPane.showInputDialog(null, "Enter Id: ",
                            "Biometric Attendance", 1);
             int value1=Integer.parseInt(str);
        String value2=jTextField2.getText();
try{
Connection con = null;
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();
ResultSet rs= st.executeQuery("Select * from tblbranch where branch_id="+value1+"" );

if (rs.next())
{
int i= st.executeUpdate("delete from tblbranch where branch_id="+value1+"");
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

       
    }}

    @Action
    public void save() throws Exception  {

           int branch_id=Integer.parseInt(jTextField1.getText());
           
        String branch_name=jTextField2.getText();
        System.out.println("branch name"+branch_name);
        
        Connection con = null;
Class.forName("com.mysql.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/biometricattendance", "root", "");
Statement st = con.createStatement();


ResultSet rs= st.executeQuery("Select * from tblbranch where branch_id="+branch_id+"" );
if (rs.next())
{

    JOptionPane.showMessageDialog(null,"Cannot insert " );
     ClearItems();
}
else{
int i= st.executeUpdate("Insert into tblbranch(branch_id,branch_name) values("+branch_id+",'"+branch_name+"')");
JOptionPane.showMessageDialog(null,"Data is successfully inserted into the database." );
st.close();
con.close();
ClearItems();
}
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
    
}