
/**
 * Write a description of class Wind here.
 * 
 * @author (M. Hilal Mubarrak) 
 * @version (a version number or a date)
 */

enum Wind_Direction{
    LEFT, RIGHT, FRONT, BEHIND;
}

public class Wind{
    
    private int windSpeed;
    private Wind_Direction windDirection;
    private int windTraceSpeed;
    
    public Wind(int windSpeed, int windTraceSpeed, String windPath){
        this.windSpeed = windSpeed;
        this.windDirection = Wind_Direction.valueOf(windPath);
        this.windTraceSpeed = windTraceSpeed;
    }
    
    public void WindInformation(){
        
        System.out.println("Wind Information : ");
        System.out.println("Speed : "+windSpeed);
        System.out.println("Wind Direction : "+windDirection);
        System.out.println("Wind Trace Speed : "+windTraceSpeed);
    }
}
