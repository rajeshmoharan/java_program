import java.util.Scanner;

public class primeCheck {
    public static void main(String[] args) {
        int no, temp = 1;
        System.out.println("Enter no to Check Prime :");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        for (int i=2; i<no; i++){
            if (no % i == 0){
                temp++;
            }
        }
        if (temp > 1){
            System.out.println("The no is not Prime :"+no);
        }
        else{
            System.out.println("The no is Prime"+no);
        }
    }
}
