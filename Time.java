
/**
 * Time class for Group 3.
 *
 * @author Ella Kazazic and Patty Gannon
 * @version 2018-10
 */
public class Time
{
    private int hour;
    private int minute;
    private int second;
    private int totalSec;

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
        totalSec = 3600 * h + 60 * m + s;
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
    
    public static boolean isValidTime (int h, int m, int s)
    {
        return(h >= 0 && h < 24 &&
               m >= 0 && m < 60 &&
               s >= 0 && s < 60);
    }
    
    public static boolean isValidTime (int h, int m)
    {
        return(h >= 0 && h < 24 &&
               m >= 0 && m < 60);
    }
    
    //Accessor Methods
    public int getHours()
    {
        return hour;
    }
    
    public int getMins()
    {
        return minute;
    }
    
    public int getSecs()
    {
        return second;
    }
    
    public int getTotalSecs()
    {
        return totalSec;
    }
    
    
    //Other Methods 
    
    public int compareTo (Time other)
    {
        return (this.getTotalSecs() - other.getTotalSecs());
    }
    
    public String toStringAmPm()
    {
        if (hour > 12)
        {
            hour = hour - 12;
        }
        return "" + hour;
    }
    
    private String write2digits (int n)     //uhhhhhhhh??
    {
        hour = n;
        if (n < 10) {
            return "0" + n;
        }
        else
        {
            return "" + n;      //the "" turns the integer n into a string
        }
    }

    public String toString()
    {
        String stringHours = write2digits (hour);
        String stringMinutes = write2digits (minute);
        String stringSeconds = write2digits (second);
        return stringHours + ":" + stringMinutes + ":" + stringSeconds;
    }
}
