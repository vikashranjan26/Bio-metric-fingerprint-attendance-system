

package biometricattendance;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import gnu.io.*;
import java.io.*;
import java.util.*;
import java.lang.*;
import java.math.BigInteger;

public class FingerMain implements SerialPortEventListener {



    SerialPort              serialPort;
    InputStream             inputStream;
    OutputStream            outputStream;
    CommPortIdentifier      portIdentifier;
    boolean                 debug;             
    static String[]         portNames;
    static boolean          portOpen;
    static int              baud,databits,parity,stopbits;


int count=1;
public int flag=1;
int chk;
int chk1;
int chk2;
int numBytes;
public FingerMain()
{
            debug = false;                 
        portOpen = false;              
        portNames = new String[10];     
        baud = 9600;                    
        databits = 8;                  
        parity = 0;                     
        stopbits = 1;                   
        findPorts();                    
        initwritetoport();
}
 private void findPorts() {
         Enumeration<CommPortIdentifier> portEnum =
                CommPortIdentifier.getPortIdentifiers();
        int portCount = 0;

        while ( portEnum.hasMoreElements() ) {
            portIdentifier = portEnum.nextElement();

            
            
            if(portCount < portNames.length &&
                    portIdentifier.getPortType() == portIdentifier.PORT_SERIAL)
            {
                
                portNames[portCount] = portIdentifier.getName();
                portCount++;
            }
        }
     }


          public void res()
     {
         flag=1;
         count=1;
         //System.out.println("flag reset in res");
        // System.out.println(flag);
     }
 public void test(String sa)
     {
        // System.out.println(sa);
     }
     public void RS232Setup(String portName) {
        Enumeration<CommPortIdentifier> portEnum =
                CommPortIdentifier.getPortIdentifiers();
        // System.out.println(portName);
        if(portOpen) {                          //close any currently open port
            try {
                inputStream.close();
            }
            catch(IOException e) {exceptionReport(e);}
            serialPort.notifyOnDataAvailable(false);
            serialPort.close();
            serialPort.removeEventListener();
        }
        portOpen = false;                   //clear the portOpen flag

        while ( portEnum.hasMoreElements() ) {
            portIdentifier = portEnum.nextElement();

           if(portIdentifier.getName().equals(portName)
                    && portIdentifier.getPortType() == portIdentifier.PORT_SERIAL)
           {
               //gui.setjlStatus(portName + " found.");
               try {    //try to open the port
                        serialPort = (SerialPort)portIdentifier.open("CommUtil", 2000);
                        portOpen = true;        //if successful, update the portOpen flag
                        break;
               }
               catch (PortInUseException e) {
                    //gui.setjlStatus("Port "  + portIdentifier.getName() + " is in use.");
                }
               catch (Exception e) {
                   //gui.setjlStatus("Failed to open port " +  portIdentifier.getName());
                }
           }
        }   

       
        if(portOpen) {
        try {
                 inputStream = serialPort.getInputStream();
        }
        catch (IOException e) {exceptionReport(e);}

        try {
                serialPort.addEventListener(this);
        }
        catch (TooManyListenersException e) {exceptionReport(e);}

        // activate the DATA_AVAILABLE notifier
        serialPort.notifyOnDataAvailable(true);

        try {
            
            serialPort.setSerialPortParams(baud, databits, stopbits, parity);
            //update to gui to display current status
            /*gui.setjlStatus(portName,
                            serialPort.getBaudRate(),
                            serialPort.getParity(),
                            serialPort.getDataBits(),
                            serialPort.getStopBits(),
                            portOpen);*/
            //update the gui open/close port button
            //gui.setjbOpenClose(portOpen);
        }
        catch (UnsupportedCommOperationException e) {exceptionReport(e);}
        initwritetoport();
        }

    }   


    public void serialEvent(SerialPortEvent event) {
        switch (event.getEventType()) {
      case SerialPortEvent.BI:
      case SerialPortEvent.OE:
      case SerialPortEvent.FE:
      case SerialPortEvent.PE:
      case SerialPortEvent.CD:
      case SerialPortEvent.CTS:
      case SerialPortEvent.DSR:
      case SerialPortEvent.RI:
      case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
         break;
      case SerialPortEvent.DATA_AVAILABLE:

         try {

                // read data
             //System.out.println("data in Serial Port");
             //System.out.println("flag value");
             //System.out.println(flag);
             switch(flag)
             {
                 case 1:
                        System.out.println("count value is"+count);
                        //System.out.println("case1");
                        numBytes = inputStream.read();
                        System.out.println(numBytes);
                        if(count==10)
                        {
                            if (numBytes==0)
                            {
                                System.out.println("Success command 1");
                                //System.out.println(numBytes);
                                chk=1;
                                flag=2;
                            }
                            else
                            {
                                chk=0;
                                System.out.println("fail command 1");
                                flag=1;
                                String str= "EF";
                                int i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                char c = (char)i;
                                //System.out.println("Char:="+ c);
                                //System.out.println("Test");
                               // System.out.println(String.format("%1$02x", (c & 0xFFFF)));
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "03";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "05";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                            }
                        }
                        count++;
                        //System.out.println(count);
                        inputStream.close();
                        //gui.setjtaReceived(Integer.toString(numBytes));
                        if ((chk==1)&&(count>10))
                        {
                                count=1;
                                //System.out.println("chk");
                                String str= "EF";
                                int i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                char c = (char)i;
                                //System.out.println("Char:="+ c);
                                //System.out.println("Test");
                               // System.out.println(String.format("%1$02x", (c & 0xFFFF)));
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "04";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "02";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "08";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                               // System.out.println("Send Second Command");
                        }


                //System.out.println(numBytes);

                //System.out.println(readBuffer);
                //send the received data to the GUI
                //String result = new CharArrayReader(ch,0,numBytes);
                //String result = new String(readBuffer,0,numBytes);
                //System.out.println(numBytes);
               // System.out.println(result);
               // System.out.println(result.getBytes());

                //System.out.println(String.format("%02x", new BigInteger(result.getBytes(/*YOUR_CHARSET?*/))));

                break;
                     case 2:
                         System.out.println("count value is"+count);
                         //System.out.println("case2");
                        numBytes = inputStream.read();
                         System.out.println(numBytes);
                        if(count==12)
                        {
                            if (numBytes==0)
                            {
                                System.out.println("Success in second command");
                                flag=3;
                                chk1=1;
                            }
                            else
                            {
                                System.out.print("fail in second Command");
                                flag=1;
                                chk1=0;
                                String str= "EF";
                                int i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                char c = (char)i;
                                //System.out.println("Char:="+ c);
                                //System.out.println("Test");
                                //System.out.println(String.format("%1$02x", (c & 0xFFFF)));
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "03";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "05";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                            }
                        }
                        count++;

               // System.out.println(numBytes);

                //System.out.println(readBuffer);
                //send the received data to the GUI
                //String result = new CharArrayReader(ch,0,numBytes);
                //String result = new String(readBuffer,0,numBytes);
                //System.out.println(numBytes);
               // System.out.println(result);
               // System.out.println(result.getBytes());

                //System.out.println(String.format("%02x", new BigInteger(result.getBytes(/*YOUR_CHARSET?*/))));

                if ((chk1==1)&&(count>12))
                        {
                                count=1;
                                String str= "EF";
                                int i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                char c = (char)i;
                                //System.out.println("Char:="+ c);
                               // System.out.println("Test");
                                //System.out.println(String.format("%1$02x", (c & 0xFFFF)));
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                                //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                               //System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "FF";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                                //System.out.println("Decimal:="+ i);
                                c = (char)i;
                               // System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "08";
                                i= Integer.parseInt(str,16);
                               // System.out.println("Decimal:="+ i);
                                c = (char)i;
                              //  System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "1B";
                                i= Integer.parseInt(str,16);
                              //  System.out.println("Decimal:="+ i);
                                c = (char)i;
                              //  System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                              //  System.out.println("Decimal:="+ i);
                                c = (char)i;
                              //  System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                              //  System.out.println("Decimal:="+ i);
                                c = (char)i;
                              //  System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                             //  System.out.println("Decimal:="+ i);
                                c = (char)i;
                              //  System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                              //  System.out.println("Decimal:="+ i);
                                c = (char)i;
                             //   System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "01";
                                i= Integer.parseInt(str,16);
                              //  System.out.println("Decimal:="+ i);
                                c = (char)i;
                             //   System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "00";
                                i= Integer.parseInt(str,16);
                             //   System.out.println("Decimal:="+ i);
                                c = (char)i;
                            //    System.out.println("Char:="+ c);
                                writetoport(c);
                                str= "27";
                                i= Integer.parseInt(str,16);
                            //    System.out.println("Decimal:="+ i);
                                c = (char)i;
                            //    System.out.println("Char:="+ c);
                                writetoport(c);
                                //System.out.println("Send Third Command");
                        }
             
                             //System.out.println(count);
                //System.out.println(numBytes);

                //System.out.println(readBuffer);
                //send the received data to the GUI
                //String result = new CharArrayReader(ch,0,numBytes);
                //String result = new String(readBuffer,0,numBytes);
                //System.out.println(numBytes);
               // System.out.println(result);
               // System.out.println(result.getBytes());

                //System.out.println(String.format("%02x", new BigInteger(result.getBytes(/*YOUR_CHARSET?*/))));
                inputStream.close();
                //gui.setjtaReceived(Integer.toString(numBytes));
                break;
                case 3:
                    System.out.println("count value is"+count);
                        //System.out.println("case3");
                        numBytes = inputStream.read();

                        System.out.println(numBytes);
                        if(count==12)
                        {

                            if (numBytes==0)
                            {
                                System.out.print("Success in third command");
                                   System.out.println(numBytes);
                                flag=3;
                                chk2=1;
                            }
                            else
                            {
                                System.out.print("fail in third Command");
                               // System.out.print(numBytes);
                                
                                chk2=0;

                            }
                        }
                         
                        if ((chk2==1)&&(count==14))
                        {
                            
                            java.awt.Frame parent = null;
                            Attendance at=new Attendance(parent);
                            //System.out.println("object");
                        try {
                            at.Dat(Integer.toString(numBytes));
                            System.out.println(" data send");
                            System.out.println(numBytes);
                            } catch (Exception ex) {
                                Logger.getLogger(FingerMain.class.getName()).log(Level.SEVERE, null, ex);
                                }
                           //System.out.print(numBytes);
                        }
                        else if((chk2==0)&&(count==14))
                        {
                            java.awt.Frame parent = null;
                            Attendance at=new Attendance(parent);
                            //System.out.println("object");
                        try {
                            at.Dat(Integer.toString(0));
                            System.out.println(" data send");
                            System.out.println(numBytes);
                            } catch (Exception ex) {
                                Logger.getLogger(FingerMain.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        }
                        count++;
               
                //System.out.println(numBytes);
                inputStream.close();
                //System.out.println(readBuffer);
                //send the received data to the GUI
                //String result = new CharArrayReader(ch,0,numBytes);
                //String result = new String(readBuffer,0,numBytes);
                //System.out.println(numBytes);
               // System.out.println(result);
               // System.out.println(result.getBytes());

                //System.out.println(String.format("%02x", new BigInteger(result.getBytes(/*YOUR_CHARSET?*/))));
                //gui.setjtaReceived(Integer.toString(numBytes));

             }

         }
         catch (IOException e) {exceptionReport(e);}
         break;

      }
    }   
     public void initwritetoport() {

        if(portOpen) {
        try {
            
            outputStream = serialPort.getOutputStream();
        } catch (IOException e) {exceptionReport(e);}

        try {
            
            serialPort.notifyOnOutputEmpty(true);
        } catch (Exception e) {
            exceptionReport(e);
            System.exit(-1);
        }
      }
      }     
          public void writetoport(char outString) {

      try { if(portOpen)


                outputStream.write(outString);
      }
      catch (IOException e) {exceptionReport(e);}
    }

    public void exceptionReport(Exception e) {
        if(debug) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }
}
