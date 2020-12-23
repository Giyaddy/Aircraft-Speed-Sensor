
/**
 * Write a description of class SensorController here.
 * 
 * @author (Giyaddy Ilmi Alavan) 
 * @version (a version number or a date)
 */
public class SensorController {
    
    private static AircraftSpeedSensor aircraftSpeedSensor;
    private static WindSpeedSensor windSpeedSensor;
    private String status = "off";
    
    //membuat object sensor controller dan mengaktifkannya
    public SensorController(AircraftSpeedSensor a, WindSpeedSensor w){
        aircraftSpeedSensor = a;
        windSpeedSensor = w;
        this.status = "on";
    }
    
    //untuk mengaktifkan ulang controller
    public void activateController(){
        this.status = "on";
    }
    
    //untuk memadamkan controller
    public void shutDownController(){
        this.status = "off";
    }
    
    //untuk mengubah controller ke mode diam/tunggu
    public void idleController(){
        this.status = "idle";
    }
    
   public static Aircraft getAircraftData(){
       Aircraft a = aircraftSpeedSensor.sendToController();
       return a;
   }
    
   public static Wind getWindData(){
      Wind w = windSpeedSensor.sendToController();
      return w;
   }
}
