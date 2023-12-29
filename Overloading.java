class Over{
    // int parameter method
    public void add(int a,int b){
        System.out.println("A:"+a+"B:"+b);
    }
    // byte parameter method
    public void add(byte a,byte b){
        System.out.println("Byte data type :"+a+" "+b);
    }

    public void add(int a,int b,int c){
        System.out.println("A:" +a+"b"+b+"c"+c);
    }

    // double parameter requiered
     public void add(double a, double b){
        System.out.println("double data:"+a+" "+b);
    }
}
public class Overloading {
    public static void main(String[] args) {
        Over r = new Over();
        r.add(10, 20);
        r.add(10, 20, 30);
        r.add(130, 180);
        r.add(50, 60);
    }    
}
