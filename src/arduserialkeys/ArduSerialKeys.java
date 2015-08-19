/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduserialkeys;

/**
 *
 * @author Dakky
 */
public class ArduSerialKeys extends Thread{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        application = new MainScreen();
        application.setVisible(true);
        new Thread(new ArduSerialKeys()).start();
    }
    
    private static MainScreen application;

    @Override
    public void run() {
        while(true){
            try {
                application.updateSerial();
                Thread.sleep(50);
            } catch (Exception ex) {
                System.out.println("Not updated.");
            }
        }
    }
    
}
