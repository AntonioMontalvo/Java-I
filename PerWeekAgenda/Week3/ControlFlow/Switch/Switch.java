class Switch
{
    //Besr for compering a value against multiple alternatives.
    public static void main(String[] args)
    {
        int i;

        for ( i = 0; i < 10 ; i++)
        {
            switch (i)
            {
            case 3:
                System.out.println("Case number " + i + " has been approved");
                break;
            case 5:
                System.out.println("Case number " + i + " has been approved");
                break;
            case 33:
                System.out.println("Case number " + i + " has been approved");
                break;
            case 0:
                System.out.println("Case number " + i + " has been approved");
                break;
            case 9:
                System.out.println("Case number " + i + " has been approved");
                break;
            default:
                System.out.println("What??? Where is my approval? My case is number " + i + " I want mine now!!!");
            }
        }

    }
}