package practice;

public class ifelse {
	   public static void main(String args[]){
		      char input_char = 'a';
		      System.out.printf("%c: %d \n", input_char, judge(input_char));

		   }
	    public static int judge(char letter) {
		      if( letter == 'a') {
			         return 1;
			      }else if( letter == 'b' ){
			    	  return 2;
			      }else if( letter == 'c' ){
			    	  return 3;
			      }else{
			    	  return 4;
			      }
	       }
}