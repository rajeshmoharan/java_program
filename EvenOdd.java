import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        System.out.println("Enter any no to find Even or Odd:");
        Scanner n = new Scanner(System.in);
        int no = n.nextInt();
        if (no % 2 == 0){
            System.out.println("Even no :"+no);
        }
        else{
            System.out.println("Odd no :"+no);
        }
    }
}
