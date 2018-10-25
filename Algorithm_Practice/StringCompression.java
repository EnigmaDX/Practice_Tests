/**
 * String compression algorithm
 */
class StringCompression
{

    static void compressString(String theString)
    {
        char[] strArray = theString.toCharArray();

        int consecCount = 1;
        String compressedString = "";

        for(int i=0; i<strArray.length; i++)
        {
            if(!(i+1 >=strArray.length) && (strArray[i] == strArray[i+1]))
            {
                consecCount++;
            }
            else
            {
                compressedString = compressedString + strArray[i] + String.valueOf(consecCount);
                consecCount = 1;
            }
        }

        System.out.println("Original String: " + theString);
        System.out.println("Compressed String: " + compressedString);
    }



    public static void main(String[] args) 
    {
        
        String myString = "ooooaqjjjhejsvxjjjsssbbvss";

        compressString(myString);
    }
}