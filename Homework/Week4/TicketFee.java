/*
I parked for 4 hours 10 minutes at the 3rd Street Promenade, the rates are defined by:
First 90 minutes free, $1.25 for the next hour, $1.85 each additional 30 minutes, $17.50 daily maximum
Write code that using this logic will tell me how much I will pay
* */

public class TicketFee
{

    public static void CalculateFee(int hours, int minutes)
    {
        //TIME
        int hoursPerDay = 24;
        int minutesPerHour = 60;
        int halfHour = minutesPerHour / 2;
        int totalTime = (hours * minutesPerHour) + minutes;

        //FEES
        double firstHourTier = 1.25;
        double halfHourTier = 1.85;
        double dayTier = 17.50;
        double finalFee = 0.0;
        String freeFee = "Your total amount is $0, you are FREE! to go.";
        String pay = "Your total amount is $ ";

        //LOGIC
        if( minutes > minutesPerHour)
        {
            System.out.println("Sorry bro!, too many minutes per hour. Check your input!");
        }
        else if(totalTime < minutesPerHour + halfHour)
        {
            System.out.println(freeFee);
        }
        else if (totalTime <= minutesPerHour * 2 + halfHour)
        {
            System.out.println(pay + " " + firstHourTier );
        }
        else if (totalTime > minutesPerHour * 2 + halfHour)
        {
            int minAfterTwoAndHalfHours = totalTime - (minutesPerHour * 2 + halfHour);
            int minutesToBlocks = (minAfterTwoAndHalfHours / halfHour);
            int blocksOf30Min = (int) Math.round(minutesToBlocks) + 1;
            finalFee = (halfHourTier * blocksOf30Min) + firstHourTier;
            //LOGIC
            if(finalFee < dayTier && hours < hoursPerDay)
            {
                System.out.println(pay +  String.format("%.2f", finalFee));
            }
            else if (finalFee > dayTier && hours < hoursPerDay)
            {
                System.out.println(pay + dayTier);
            }
            else if(hours >= hoursPerDay)
            {
                int numOfDays = (hours / hoursPerDay) + 1;
                System.out.println(pay + (dayTier * numOfDays));
            }
        }
    }

    public static void main(String[] args)
    {

        CalculateFee(24, 10);
             }
}
