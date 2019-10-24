class While
{
    //The condition that defines the loop may be any valid Bolean expression. The program runs while the condition is true.

    public String getDay(String day){
        return day;
    }

    public static void main(String[] args){
        String dayOfTheWeek = "Monday";
		int counter = 0;
        While checkDay = new While();

        while(counter < 2){ //here the condition is for counter being less than 2
        	if(checkDay.getDay("Monday") == dayOfTheWeek){ 
       		 System.out.println("Yes today is Monday");
    		}
    		counter++;
        }
    }
}