package wrapperclasses;

public class Sumwithrecursive 
{

    public static int sumOfDigits(int num) {
        
      if(num==0) 
    	  return 0;
      
      else
      return num % 10 + sumOfDigits(num/10);
   }

   public static void main(String[] args) {

     int s= sumOfDigits(1234);
     System.out.println(s);
   }

	}


