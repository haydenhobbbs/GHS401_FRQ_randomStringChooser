package P5E_Project_RandomStringChooser_Template;
private ArrayList<String>();
public class RandomStringChooser
   {
   public RandomStringChooser(String [] wordArray){
           words = new ArrayList<String>();
           
           for(String singleWord : wordArray){
               words.add(singleWord);
           }
       }
       
       public String getNext(){
           if(words.size() > 0){
               return words.remove((int)(Math.random()*words.size()));
           }
           return "None";
       }    
   public String toString()
      {
      String output = new String();
      
      for( String word : wordList )
         {
         output += word + ", ";    
         } // end for
         
      return output;
      } // end method toString
   } // end RandomStringChooser
