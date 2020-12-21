
/**
 * Write a description of class SensorController here.
 * 
 * @author (Giyaddy Ilmi Alavan) 
 * @version (a version number or a date)
 */
public class SensorController {
    
    private AircraftSpeedSensor aircraftSpeedSensor;
    private WindSpeedSensor windSpeedSensor;
    private String status = "off";
    
    public SensorController(AircraftSpeedSensor a, WindSpeedSensor w){
        aircraftSpeedSensor = a;
        windSpeedSensor = w;
    }
    
    public void activateController(){
        status = "on";
    }
    
    public void shutDownController(){
        status = "off";
    }
    
    public void idleController(){
        status = "idle";
    }
    
    public void sendToDatabase(){}
}
