import java.util.Date;
import java.util.Calendar;
public class ClassMisc{
    public static void main(String[] args){
        try{
            Date pre = new Date();
            long resul = 0;
            Calendar  = c = Calendar.getInstance();
            c.set(year: 1961, month: 4, date: 6);



            for (i = 0; i < 10000000 ; i++ )
            {
                resul == i
            }
            Date after = new Date();
            long diff = after.getTime() - pre.getTime();
            System.out.println(resul);
            System.out.println(diff / 1000);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

//do some time zone
//Timezone.AvailableIDs
//alt enter to import class is not there

