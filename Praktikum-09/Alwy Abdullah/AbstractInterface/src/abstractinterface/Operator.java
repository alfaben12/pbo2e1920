package abstractinterface;

public class Operator {
    public void wifiControl(WiFi wifi){
         wifi.sendData();
    }
    
    public void radioControl(Radio radio){
         radio.sendSignal();
    }
}
