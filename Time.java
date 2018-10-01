
/**
 * Time class for Group 3.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Time
{
    private int hour;
    private int minute;
    private int second;

    /**
     * Constructor for the class Time3
     * @param h             The number of hours
     * @param m             The number of minutes
     * @param s             The number of seconds
     * @param totalSec      The total number of seconds
     */
    public Time (int h, int m, int s)
    {
        hour = h;
        minute = m;
        second = s;
    }
    
    public Time (int h, int m)
    {
        hour = h;
        minute = m;
    }
    
    public Time (int totalSec)
    {
         totalSec = 3600 * hour + 60 * minute + second;
    }
    
    public static boolean isValidTime ( int h, int m, int s)
    {
        if (s >= 0 && m >= 0 && h >= 0)
        {
            if (s > 60)
            {
                m = m + (s % 60);
            }
            else if (m > 60)
            {
                h = h + (m % 60);
            }
            else 
            {
                return true;
            }
        }
        else 
        {
            return false;
        }
    }
    
    //Accessor Methods
    public Time getTime()
    {
        
    }
    
    //Other Methods 
    public String toString()
    {
        
    }
}
