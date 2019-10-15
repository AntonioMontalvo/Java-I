/*Package java.util in Module java.base contains the classes we need to work with time.
Specifically he class Date represents a specific instant in time, with millisecond precision.
Coordinated Universal Time (abbreviated to UTC) is the primary time standard by which the world regulates clocks and time. The most modern GMT Greenwich Mean Time is often used as synonym*/

//Let's talk about Date(). Allocates a Date object and initializes it so that it represents the time at which it was allocated, measured to the nearest millisecond.

/*SimpleDateFormat is a concrete class for formatting and parsing dates in a locale-sensitive manner. It allows for formatting (date → text), parsing (text → date), and normalization.
SimpleDateFormat allows you to start by choosing any user-defined patterns for date-time formatting. However, you are encouraged to create a date-time formatter with either getTimeInstance, getDateInstance, or getDateTimeInstance in DateFormat. Each of these class methods can return a date/time formatter initialized with a default format pattern. You may modify the format pattern using the applyPattern methods as desired. For more information on using these methods, see DateFormat.*/


import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
// import java.time.LocalDate;

public class Dates{

    public static long [] getDaysHoursMinutes (long milliseconds){
        long millisecondsTime = 86400000;//one day
        long seconds = milliseconds / 1000 % 60;  
        long minutes = milliseconds / (60 * 1000) % 60; 
        long hours = milliseconds / (60 * 60 * 1000);
        long days = milliseconds / (24* 60 * 60 * 1000);
  
        long temperatures[] = {days, hours, minutes, seconds};

          return temperatures;
        }

    public static void main(String[] args){
        //FORMATTING (date → text)
        // SimpleDateFormat extends from DateFormat
        DateFormat latin24 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");

        DateFormat verbose = new SimpleDateFormat("hh 'o''clock' a, zzzz");
        DateFormat simple = new SimpleDateFormat("EEE, MMM d, ''yy");

        DateFormat clock = new SimpleDateFormat("h:mm a");
        //GRabbing the date from Date()
        Date rightNow = new Date();
        System.out.println(latin24.format(rightNow));
        System.out.println(verbose.format(rightNow));

        // An Alternative would be using the Calendar class
        Calendar calendarNow = Calendar.getInstance();
        long currentTimeInMilliseconds = calendarNow.getTimeInMillis();
        
        System.out.println( currentTimeInMilliseconds +" From Calendar time in milliseconds");
        
        System.out.println(latin24.format(calendarNow.getTime()));
        System.out.println(clock.format(calendarNow.getTime()));

        //PARSING (text -> DATE)
        /*Creating my own format:
         Time zone = z
         Day name in week = E
         Day in month = d
         Month in year = L
         Year = Y
         Era designator = G;
        */
        DateFormat myReligiuos = new SimpleDateFormat("'In this day of the Lord' E',' d/L/Y ','G.");
        System.out.println(myReligiuos.format(calendarNow.getTime()));

        //A LITTLE BIT OF FUN
        //parser must be in a try catch
        DateFormat angloDate = new SimpleDateFormat("MM/dd/yyyy");
        
        try{
            //The code you are trying to exception handle
            Date electionDay = angloDate.parse("11/03/2020");
            System.out.println(electionDay);
        }
        catch(Exception e){
            //The handling for the code
            System.out.println(e);
        }

        //LETS DO SOME MATH
        //calculate days to election day. This is mostly a MATH problem.
        //long millisecondsTime = 1000;//one second
        //long millisecondsTime = 60000;//one minute
        //long millisecondsTime = 3600000;//one one hour


        long [] arrayOftime = getDaysHoursMinutes(33367890861l);

        System.out.println(arrayOftime[0]);

        // System.out.println("There are " + seconds + " seconds in " + millisecondsTime + " milliseconds");
        //  System.out.println("There are " + minutes + " minutes in " + millisecondsTime + " milliseconds");
        //   System.out.println("There are " + hours + " hours in " + millisecondsTime + " milliseconds");
        // System.out.println("There are " + days + " days in " + millisecondsTime + " milliseconds");


        try{
            //The code you are trying to exception handle
            Date electionDay = angloDate.parse("11/03/2020");
            long timeAtVoteDay = electionDay.getTime();

            long timeToELectionDayFromToday = timeAtVoteDay - currentTimeInMilliseconds; 

            System.out.println("Milliseconds at election date" + timeAtVoteDay);

            System.out.println("Difference in milliseconds from now until election day " + timeToELectionDayFromToday);
        }
        catch(Exception e){
            //The handling for the code
            System.out.println(e);
        }
     }
}




