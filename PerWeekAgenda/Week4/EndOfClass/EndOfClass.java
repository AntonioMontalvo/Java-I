
import java.util.Arrays;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class EndOfClass {
        //method to convert millisecond
        public static long[] getDaysHoursMinutes(long milliseconds){
            long millisecondsTime = 86400000;//one day
            long seconds = milliseconds / 1000 % 60;
            long minutes = milliseconds / (60 * 1000) % 60;
            long hours = milliseconds / (60 * 60 * 1000);
            long days = milliseconds / (24* 60 * 60 * 1000);

            return new long[]{days, hours, minutes, seconds};
        }

        public static void main(String[] args) {

            try{
                //Date needs to be un try catch
                //Grabbing the date from Date()
                Date rightNow = new Date();
                DateFormat myFormat  = new SimpleDateFormat();//using default pattern for my format

                long nowInMillis = rightNow.getTime(); //convert current time to milliseconds
                System.out.println("Current time default pattern");
                System.out.println(myFormat.format(rightNow));
                System.out.println("convert current time to milliseconds");
                System.out.println(nowInMillis);
                //Parsing  end time
                String endTime =  "10/14/2019, 9:30 PM";//using default time patter
                Date classEnds = myFormat.parse(endTime); //parse time
                long endInMillis = classEnds.getTime(); //convert time to milliseconds
                System.out.println("End of class time");
                System.out.println(classEnds);
                System.out.println("convert classEnds time to milliseconds");
                System.out.println(endInMillis);

                //difference in between two times
                long diffRes =endInMillis - nowInMillis;
                System.out.println("Difference in milliseconds "+diffRes);
                System.out.println(Arrays.toString(getDaysHoursMinutes(diffRes)));
                //write final sentence here

            }
            catch(Exception e){
                //The handling for the code
                System.out.println(e);
            }
            /*
            Test values
            1000;//one second
            60000;//one minute
            3600000;//one one hour
            86400000;//one day
             */



            //////////////////////
            //FORMAT NOW DATE AND ELECTION DATE AS DEFAULT
            //THEN GETTIMEMILLIS() / DIFF .
            System.out.println("Tester");
            System.out.println(Arrays.toString(getDaysHoursMinutes(6000L)));
        }
}
