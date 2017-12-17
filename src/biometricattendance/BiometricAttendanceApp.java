

package biometricattendance;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;


public class BiometricAttendanceApp extends SingleFrameApplication {


    @Override protected void startup() {
        show(new BiometricAttendanceView(this));
    }


    @Override protected void configureWindow(java.awt.Window root) {
    }


    public static BiometricAttendanceApp getApplication() {
        return Application.getInstance(BiometricAttendanceApp.class);
    }


    public static void main(String[] args) {
       launch(BiometricAttendanceApp.class, args);
   }
}
