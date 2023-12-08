
import java.util.Scanner;

class fact {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter No to find Factorial");
        int no = n.nextInt();
        int fact = 1;
        for (int i=1; i<=no; i++){
            fact = fact * i;
        }
        System.out.println("The Factorial of the no is :"+fact);
    }
}
