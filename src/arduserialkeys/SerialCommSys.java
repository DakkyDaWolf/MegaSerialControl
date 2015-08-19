package arduserialkeys;

import jssc.*;

/**
 *
 * @author Dakky 「ダッキ」
 */
public class SerialCommSys {
    private SerialPort thePort;
    private String[] ports;
    private int baud;
    private String portName;
    private String bufferText;
    

    public SerialCommSys(){
        baud = 9600;
        bufferText = "";
    }
    
    public String[] getPorts(){
        ports = new String[SerialPortList.getPortNames().length];
        ports = SerialPortList.getPortNames();
//        for(String port : ports){
//            System.out.println(port);
//        }
        return ports;
    }
    
    public String getSerialText() throws SerialPortException{
        if(thePort != null){
            while(thePort.getInputBufferBytesCount() > 0){   
                bufferText += thePort.readString();
            }
                return bufferText;
        }
        else return "none";
    }
    
    public void clearBuffer(){
        bufferText = "";
    }
    
    
    public void connectPort(String porty){
        portName = porty;
        try{
        if(thePort != null && thePort.isOpened())
            thePort.closePort();
        thePort = new SerialPort(portName);
        thePort.openPort();
        setParameters();
        }
        catch(Exception e){
            System.out.println("shet. no openclose");
            e.printStackTrace();
        }
        
    }
    
    public void writeData(String text){
        try{
            thePort.writeString(text);
        }
        catch(Exception spe){
            
        }
    }
    
    public void writeData(int num){
        try{
            thePort.writeString(String.valueOf(num));
        }
        catch(Exception spe){
            
        }
    }
    
    public void writeData(int[] nums){
        try{
            String newString = String.valueOf(nums[0]);
            for(int i = 1; i < nums.length; i++){
                newString += "," + String.valueOf(nums[i]);
            }
            thePort.writeString(newString);
        }
        catch(Exception spe){
            
        }
    }
    
    public void serialEvent(SerialPortEvent serialPortEvent) throws SerialPortException {
    }
    
    public void setBaud(int baudRate){
        baud = baudRate;
        connectPort(portName);
    }
    
    private void setParameters(){
        if(thePort != null){
            try{
            thePort.setParams(baud, 8, 1, 0);
            }
            catch(Exception e){
                System.out.println("fuq. no params.");
                e.printStackTrace();
            }
        }
    }

   
    public static void main(String[] args){
        SerialCommSys serialCommSys;
        serialCommSys = new SerialCommSys();
    }
}