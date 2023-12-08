import java.util.Scanner;

class largestOne {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int no1,no2,no3;
        System.out.println("Enter 3 no to Find Largest One");
        no1 = n.nextInt();
        no2 = n.nextInt();
        no3 = n.nextInt();
        if (no1>no2 && no1>no3){
            System.out.println("The Largest is:"+no1);
        }
        else if (no2>no1 && no2 > no3){
            System.out.println("The Largest is :"+no2);
        }
        else{
            System.out.println("The Largest is :"+no3);
        }
    }
}