
public class CreditCard{
   //variables
   private String cardNumber;
   private boolean validCard;
   private int errorCode;
  
   // constructor
   public CreditCard(String creditCardNumber){
       cardNumber = creditCardNumber;
       validCard = true;      
       errorCode = 0;
   } 
   // check criteria
   public void check(){

       // first digit must be a 4
       if(cardNumber.charAt(0) != '4'){
           validCard = false;
           errorCode = 1;
           return;
       }
      
       //The fourth digit must be one greater than the fifth digit
       if(Integer.parseInt(cardNumber.substring(3, 4)) != Integer.parseInt(cardNumber.substring(4, 5)) + 1){
           validCard = false;
           errorCode = 2;
           return;
       }
      
       // product of the first, fifth, and ninth digits must be 24
       if(Integer.parseInt(cardNumber.substring(0, 1)) * Integer.parseInt(cardNumber.substring(4, 5)) * Integer.parseInt(cardNumber.substring(8, 9)) != 24){
           validCard = false;
           errorCode = 3;
           return;
       }
      
       //sum of all digits must be evenly divisible by 4
       int sum = 0;      
       for(int i = 0; i < cardNumber.length(); i++)
           sum = sum + Character.getNumericValue(cardNumber.charAt(i));
          if(sum % 4 != 0){
            validCard = false;
            errorCode = 4;
            return;
          }
      
       // sum of the first four digits must be one less than the sum of the last four digits
       int sumOfFirstFour = 0;
       int sumOfLastFour = 0;
      
       for(int i = 0; i < 4; i++)
           sumOfFirstFour = sumOfFirstFour + Character.getNumericValue(cardNumber.charAt(i));    
       for(int i = 0, j = cardNumber.length() - 1; i < 4; i++, j--)
           sumOfLastFour = sumOfLastFour + Character.getNumericValue(cardNumber.charAt(j));
       if(sumOfFirstFour != sumOfLastFour - 1){
           validCard = false;
           errorCode = 5;
           return;
        }
      
       //you treat the first two digits as a two-digit number, and the seventh and eight digits as a two digit number, their sum must be 100
       if(Integer.parseInt(cardNumber.substring(0, 2)) + Integer.parseInt(cardNumber.substring(6, 8)) != 100){          
           validCard = false;
           errorCode = 6;
           return;
        }
   }
   //return isValid to tester
   public boolean isValid()
   {      
       return validCard;
   }

   //returning getErrorCode to tester
   public int getErrorCode()
   {
       return errorCode;
   } 
} 
}