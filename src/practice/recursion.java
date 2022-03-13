package practice;

public class recursion {
    public static void main(String[] args) {
        for (int counter = 0; counter <= 10; counter++){
            System.out.printf("µÚ%d¸öÊý: %d \n", counter, fibonacci(counter));
        }
    }
 
    public static int fibonacci(int number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return (fibonacci(number - 2) + fibonacci(number - 1));
    }
}
