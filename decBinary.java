import java.util.Scanner;
public class decBinary {
    public static void main(String[] args) {
        System.out.println("Enter Decimal no");
        Scanner s = new Scanner(System.in);
        int no = s.nextInt();
        System.out.println("Binary is :"+Integer.toBinaryString(no));
    }
}
