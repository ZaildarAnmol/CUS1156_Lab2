/* Lab: 2
* Class: CUS1156
* Author: ANMOL SINGH
* Date: 09/02/2023
* THIS class counts the number of distinct elements in an ArrayList<String>.
*/


import java.util.ArrayList;

public class UniqueWords
{
   /**
    * Counts the number of unique strings in a list.
    * @param list ArrayList of strings to be examined.
    * @return Number of unique strings in the list.
    */
	
	// this countUnique method manually checks for duplicates by comparing each element with all previous elements. 
   public static int countUnique(ArrayList<String> list)
   {
      int count = 0;

      for (int i = 0; i < list.size(); i++)
      {
         boolean UniqueNumber = true;
         for (int j = 0; j < i; j++)
         {
            if (list.get(i).equals(list.get(j)))
            {
               UniqueNumber = false;
               break; 
            }
         }

         if (UniqueNumber)
         {
            count++;
         }
      }

      return count;
   }
   
// ----------------------------------------------------------------

   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");

      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
