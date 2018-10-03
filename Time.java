
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
    
    public static boolean isValidTime (int h, int m, int s)
    {
        boolean ans = false;
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
                ans = true;
            }
        }
        else 
        {
            ans = false;
        }
        return ans;
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
        return 3600 * hour + 60 * minute + second;
    }
    
    
    //Other Methods 
    public String toString()
    {
        /*if (hour < 10)
        {
            String hour = "0" + hour;
        }
        if (minute < 10)
        {
            String minute = "0" + minute;
        }
        if (second < 10)
        {
            String second = "0" + second;
        }*/
        String ans = hour + ":" + minute + ":" + second;
        return ans;
    }
}
