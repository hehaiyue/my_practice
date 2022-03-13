package practice;

public class List {
	   public static void main(String[] args) {
		   int[] myList = new int[5];
		   for(int x = 0; x < 5; x = x+1) {
			   myList[x] = x ;
		       }
		   for(int element: myList)
		   {
		       System.out.println(element);
		   }
}
}
