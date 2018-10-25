public class InsertionSort
{

    static int[] InsertionSorter(int[] guestArray)
    {
        int target;
        int hole;

        for(int i=1; i<guestArray.length; i++)
        {
            target = guestArray[i];
            hole = i;

            while(hole >0 && guestArray[i-1] > target)
            {
                guestArray[i] = guestArray[i-1];
                hole--;
            }

            if(hole != i)
            {
                guestArray[hole] = target;
            }
        }
        return guestArray;
    }


    public static void main(String[] args) 
    {
        int[] myArray = {8,3,4,2,10,5};

        InsertionSorter(myArray);
        for(int i=0; i<myArray.length; i++)
        {
            System.out.print(myArray[i] + "|");
        }
    }
}