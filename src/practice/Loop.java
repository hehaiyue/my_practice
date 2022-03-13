package practice;

public class Loop {
	   public static void main(String[] args) {
		      int x = 1;
		      int s = 0;
		      while( x < 10 ) {
		    	 s = s+x;
		         System.out.print("value of s : " + s+"\n" );
		         x++;

			  int s2 = 0;
		      for(int x2 = 1; x2 < 10; x2 = x2+1) {
		    	  s2 = s2+ x2;
		          System.out.print("value of s : " + s2 +"\n");

		       }
		      }
		   }
}
