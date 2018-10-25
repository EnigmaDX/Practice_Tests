/**
 * Question: Given a string, check if all of its characters are unique
 * 2 methods
 */

public class UniqueCharsInString {

    /**
     * method 1: create array of booleans representing total nuum of chars in ASCII
     * for each char found, turn its ASCII int index value to true to indicate that its
     * been found already.
     * if an index of a char's ASCII int is true, then it's been found already
     */
    static boolean isUniqueChars(String str) {
        if(str.length() > 128) return false; //ASCII chars are 128 in total
      
        boolean[] char_set = new boolean[128];

        for(int i = 0; i < str.length(); i++) 
        {
          
          //convert char to ASCII int form
          int val = str.charAt(i);

          if(char_set[val]) //if value at char's index is false, then it's already been seen before
          {
            return false;
          }
          char_set[val] = true;
        }
        return true;
      }


      //method 2: compare each char in string with each other
      static boolean isUniqueChars2(String str)
      {
        if(str.length() > 128){ return false;} //ASCII chars are 128 in total

        for(int i=0; i<str.length(); i++)
        {
            for(int j=i+1; j<str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j)){return false;}
            }
        }
        return true;

      }


      
    public static void main(String[] args) 
    {
        System.out.println("Method 1: " + isUniqueChars("false"));

        System.out.println("Method 2: " + isUniqueChars2("falsee"));
    }
}