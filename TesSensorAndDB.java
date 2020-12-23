
/**
 * Write a description of class TesSensorAndDB here.
 * 
 * @author (Hilal Mubarrak) 
 * @version (a version number or a date)
 */
public class TesSensorAndDB
{
   public static void main(String[] args){
       
       Aircraft pesawat = new Aircraft("A300-100", 30, 11, 2.4, 150);
       Wind angin = new Wind(14, 9, "FRONT");
       
       AircraftSpeedSensor sensor_pesawat = new AircraftSpeedSensor();
       sensor_pesawat.setAircraftData(pesawat);
       sensor_pesawat.showDataInfo();
 
       WindSpeedSensor sensor_angin = new WindSpeedSensor();
       sensor_angin.setWindData(angin);
       sensor_angin.showDataInfo();
       
       SensorController kontroler = new SensorController(sensor_pesawat, sensor_angin);
       
       DBAccessor db = DBAccessor.getInstance();
       db.authorize("123456789", "password");
       db.saveToDB(kontroler.getAircraftData(), kontroler.getWindData());
   }
}
