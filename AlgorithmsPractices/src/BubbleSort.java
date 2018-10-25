import java.util.Arrays;

public class BubbleSort
{

    public static int[] bubbleSort(int[] myArray)
    {
        int count = myArray.length;

        for(int i=0; i < count-1; i++)
        {
            for(int j=0; j < count-i-1; j++)
                {
                    if(myArray[j] > myArray[j+1])
                    {
                        int temp = myArray[j];
                        myArray[j] = myArray[j+1];
                        myArray[j+1] = temp;
                    }
                }
        }
        return myArray;
    }

    public static void main(String[] args) 
    {
        int[] myArray = {8,3,4,2,10,5};
        
        bubbleSort(myArray);

        for(int i=0;i<myArray.length; i++)
        {
            System.out.print(myArray[i] + ",");
        }
    }
}