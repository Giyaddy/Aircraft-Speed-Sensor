/**
 * Write a description of class AircraftSpeedData here.
 * 
 * @author (M. Hilal Mubarrak) 
 * @version (a version number or a date)
 */
public class Aircraft{
   //seluruh atribut ini menyimpan datanya
   private String aircraft_type;
   private int flaps;
   private int slats;
   private double trim_tab;
   private int takeoff_speed;
   
   public Aircraft(String aircraft_type, int flaps, int slats, double trim_tab, int takeoff_speed){
     this.aircraft_type = aircraft_type;
     this.flaps = flaps;
     this.slats = slats;
     this.trim_tab = trim_tab;
     this.takeoff_speed = takeoff_speed;
   }
   
   public void aircraftInformation(){
       
       System.out.println("Data from the aircraft : ");
       System.out.println("Aircraft Type "+aircraft_type);
       System.out.println("Flaps : "+flaps);
       System.out.println("Slats : "+slats);
       System.out.println("Trim Tab : "+trim_tab);
       System.out.println("Take-Off Speed : "+takeoff_speed);
   }
   
   public String getAllData(){
       String s = aircraft_type+","+flaps+","+slats+","+trim_tab+","+takeoff_speed+",";
       return s;
   }
}