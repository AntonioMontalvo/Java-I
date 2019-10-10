public class SortArray {
    public static void main(String[] args){
        int[] ages= {24, 36, 14, 35, 22, 37, 42, 25};
        int[] ages2= {24, 36, 14, 35, 22, 37, 42, 25};

        System.out.println("SORT SMALLEST TO HIGHEST.");
        //SORT SMALLEST TO HIGHEST
        int [] tempHold= new int[1];//create holder array
        System.out.print("The original array");
        for (int i = 0; i < ages.length ; i++) {
            System.out.print(" "+ages[i]);
        }

        for(int i = 0; i < ages.length-1; i++){//at every index in the array
            for(int j = 0; j < ages.length-1; j++){//against all other cases
                if (ages[j] > ages[j+1]){//test the condition
                    tempHold[0] = ages[j];//grab the number and put it on hold
                    ages[j] = ages[j+1];//make  both the same
                    ages[j+1] = tempHold[0];// swap the value
                }
            }
        }

        System.out.print(" ");
        System.out.print(" Swapped values");
        for (int i = 0; i < ages.length ; i++) {
            System.out.print(" "+ages[i]);
        }

        System.out.println(" ");
        System.out.println("SORT HIGHEST TO SMALLEST.");
        //SORT HIGHEST TO SMALLEST
        int [] tempHold2= new int[1];//create holder array
        System.out.print("The original array");
        for (int i = 0; i < ages2.length ; i++) {
            System.out.print(" "+ ages2[i]);
        }

        for(int i = ages2.length-2; i > -1; i--){//at every index in the array
            for(int j = ages2.length-2; j > -1; j--){//against all other cases
                if (ages2[j] < ages2[j+1]){//test the condition
                    tempHold2[0] = ages2[j];//grab the number and put it on hold
                    ages2[j] = ages2[j+1];//make  both the same
                    ages2[j+1] = tempHold2[0];// swap the value
                }
            }
        }

        System.out.print(" ");
        System.out.print(" Swapped values");
        for (int i = 0; i < ages.length ; i++) {
            System.out.print(" "+ages2[i]);
        }


    }

}


