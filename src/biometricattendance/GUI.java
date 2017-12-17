

package biometricattendance;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;

public class GUI extends javax.swing.JFrame 
{

    Main main;
    Dimension wndSize;
    Toolkit theKit;


    public GUI(Main main)
    {
        super();
        this.main = main;
        
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
           
        }
        catch(Exception e){System.out.println(e);}
        theKit = this.getToolkit();
        wndSize = theKit.getScreenSize();
        this.setBounds(wndSize.width/2 - 232,wndSize.height/2-239,432,469);
        initComponents();
        jtaSent.grabFocus();       
    }   

    GUI(JFrame mainFrame) {
        throw new UnsupportedOperationException("Not yet implemented");
    }


    public void setjtaReceived(String string) {        
        jtaReceived.append( string );                
    }


    public void setjlStatus(String text) {
        jlStatus.setText(text);
    }


    public void setjlStatus(String name,
                            int baud,
                            int parity,
                            int databits,
                            int stopbits,
                            boolean status){
        String st = null;
        if(status) st = "OPEN";
        else st = "CLOSED";
        jlStatus.setText( name + " Baud: " +
                            baud + ", Parity: " +
                            parity + ", Databits: " +
                            databits + ", Stopbits: " +
                            stopbits + ", Status: " +
                            st);
    }


    public void setjbOpenClose(boolean status) {
        if(status)
            jbOpenClose.setText("Close COM port");
        else
            jbOpenClose.setText("Open COM port");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaSent = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtaReceived = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jbOpenClose = new javax.swing.JButton();
        jbClear = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jcbPort = new JComboBox(Main.portNames);
        jPanel7 = new javax.swing.JPanel();
        jcbBitRate = new javax.swing.JComboBox();
        jPanel3 = new javax.swing.JPanel();
        jlStatus = new javax.swing.JLabel();
        jlCopyright = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmFile = new javax.swing.JMenu();
        jmiExit = new javax.swing.JMenuItem();
        jmHelp = new javax.swing.JMenu();
        jmiHelp = new javax.swing.JMenuItem();
        jmiAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Serial Port Terminal");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(2, 1));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Send to port", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        jtaSent.setColumns(20);
        jtaSent.setLineWrap(true);
        jtaSent.setRows(5);
        jtaSent.setToolTipText("Type text to send, press Enter to send.");
        jtaSent.setWrapStyleWord(true);
        jtaSent.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtaSentKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtaSent);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Received from port", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N

        jScrollPane2.setHorizontalScrollBar(null);

        jtaReceived.setColumns(20);
        jtaReceived.setLineWrap(true);
        jtaReceived.setRows(5);
        jtaReceived.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jtaReceived);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 453, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel5Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 138, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 80));

        jbOpenClose.setFont(new java.awt.Font("Tahoma", 0, 12));
        jbOpenClose.setText("Open COM Port");
        jbOpenClose.setPreferredSize(new java.awt.Dimension(105, 23));
        jbOpenClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbOpenCloseActionPerformed(evt);
            }
        });

        jbClear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbClear.setText("Clear");
        jbClear.setToolTipText("Clear all text.");
        jbClear.setPreferredSize(new java.awt.Dimension(105, 23));
        jbClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbClearActionPerformed(evt);
            }
        });

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Port", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        jPanel6.setPreferredSize(new java.awt.Dimension(140, 60));

        jcbPort.setToolTipText("Select a port to open.");
        jcbPort.setPreferredSize(new java.awt.Dimension(100, 20));
        jcbPort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPortActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jcbPort, 0, 86, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jcbPort, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select Baud Rate", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 10))); // NOI18N
        jPanel7.setPreferredSize(new java.awt.Dimension(140, 56));

        jcbBitRate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "300", "600", "1200", "2400", "9600", "14400", "19200", "38400", "57600", "115200", "128000", " " }));
        jcbBitRate.setSelectedIndex(4);
        jcbBitRate.setPreferredSize(new java.awt.Dimension(100, 20));
        jcbBitRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbBitRateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jcbBitRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jcbBitRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbOpenClose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, 0, 58, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbClear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbOpenClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setPreferredSize(new java.awt.Dimension(400, 50));

        jlStatus.setFont(new java.awt.Font("Tahoma", 0, 12));
        jlStatus.setText("No COM port selected.  Please select a port from the \"Select Port\" box.");
        jlStatus.setPreferredSize(new java.awt.Dimension(350, 14));

        jlCopyright.setText("Copyright (c) 2010 John Radabaugh");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(139, Short.MAX_VALUE)
                .addComponent(jlCopyright)
                .addGap(152, 152, 152))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jlStatus, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlCopyright))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jmFile.setText("File");

        jmiExit.setText("Exit");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jmFile.add(jmiExit);

        jMenuBar1.add(jmFile);

        jmHelp.setText("Help");

        jmiHelp.setText("Help");
        jmiHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHelpActionPerformed(evt);
            }
        });
        jmHelp.add(jmiHelp);

        jmiAbout.setText("About");
        jmiAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAboutActionPerformed(evt);
            }
        });
        jmHelp.add(jmiAbout);

        jMenuBar1.add(jmHelp);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jbOpenCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbOpenCloseActionPerformed

        if(Main.portOpen) {
            main.serialPort.close();
            main.serialPort.removeEventListener();
            jbOpenClose.setText("Open COM port");
            Main.portOpen = false;

            setjlStatus(jcbPort.getSelectedItem().toString(),
                            Main.baud,
                            Main.parity,
                            Main.databits,
                            Main.stopbits,
                            Main.portOpen);
        }
        else
        {
            main.RS232Setup(jcbPort.getSelectedItem().toString());
            jbOpenClose.setText("Close COM port");

            setjlStatus(jcbPort.getSelectedItem().toString(),
                            Main.baud,
                            Main.parity,
                            Main.databits,
                            Main.stopbits,
                            Main.portOpen);
        }
    }//GEN-LAST:event_jbOpenCloseActionPerformed


    private void jtaSentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtaSentKeyReleased
        
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String s=jtaSent.getText();

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
            jtaSent.setText("");

        }
    }//GEN-LAST:event_jtaSentKeyReleased



    private void jbClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbClearActionPerformed
        jtaSent.setText("");
        jtaReceived.setText("");
        jtaSent.grabFocus();
    }//GEN-LAST:event_jbClearActionPerformed



    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        if(Main.portOpen) {
            try {
                main.inputStream.close();
                main.outputStream.close();
            }
            catch(IOException e){
                main.exceptionReport(e);
            }
            main.serialPort.close();
            main.serialPort.removeEventListener();
        }
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed


    private void jcbBitRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbBitRateActionPerformed
        Main.baud = new Integer(jcbBitRate.getSelectedItem().toString()).intValue();
    }//GEN-LAST:event_jcbBitRateActionPerformed


    private void jcbPortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPortActionPerformed
         main.RS232Setup(jcbPort.getSelectedItem().toString());
    }//GEN-LAST:event_jcbPortActionPerformed

  
    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        
        if(Main.portOpen) {
            try {
                main.inputStream.close();
                main.outputStream.close();
            }
            catch(IOException e){
                main.exceptionReport(e);
            }
            main.serialPort.close();
            main.serialPort.removeEventListener();
        }
        System.exit(0);
    }//GEN-LAST:event_jmiExitActionPerformed

   
    private void jmiHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHelpActionPerformed
        if( java.awt.Desktop.isDesktopSupported() ) {
            Desktop desktop = java.awt.Desktop.getDesktop();
            if( desktop.isSupported( java.awt.Desktop.Action.BROWSE ) )
                try {
                    URI uri = new URI( "http:///breezeelectronics.net/comportterminalhelp.html" );
                    desktop.browse( uri );
                }
                catch ( Exception e ) {
                    JOptionPane.showMessageDialog(null, "Sorry, unable to open Help.");
                }
            else {  // desktop browsing not supported
                JOptionPane.showMessageDialog(null, "Browser not supported.");
            }
        }
        else {  //Desktop is not supported
            JOptionPane.showMessageDialog(null, "Browser not supported.");
        }       
    }//GEN-LAST:event_jmiHelpActionPerformed

    
   
    private void jmiAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAboutActionPerformed
         main.about.setVisible(true);
    }//GEN-LAST:event_jmiAboutActionPerformed


    public String getjcbPortSetting() {
        return jcbPort.getSelectedItem().toString();
    }

    //Netbeans generated variables
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton jbClear;
    private javax.swing.JButton jbOpenClose;
    private javax.swing.JComboBox jcbBitRate;
    private javax.swing.JComboBox jcbPort;
    private javax.swing.JLabel jlCopyright;
    private javax.swing.JLabel jlStatus;
    private javax.swing.JMenu jmFile;
    private javax.swing.JMenu jmHelp;
    private javax.swing.JMenuItem jmiAbout;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiHelp;
    private javax.swing.JTextArea jtaReceived;
    private javax.swing.JTextArea jtaSent;
    // End of variables declaration//GEN-END:variables

}
