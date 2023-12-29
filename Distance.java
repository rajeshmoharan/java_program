public class Distance {
     int feet;
     int inches;

    // Constructor to assign values to the distance object
    public Distance(int ft, int in) {
        
        this.feet = ft;
        this.inches = in;
    }

    // diplay distance method
    public void displayDistance() {
        System.out.println(feet + " feet " + inches + " inches");
    }

    public static void main(String[] args) {
       
        // first object
         Distance distance1 = new Distance(5, 8);

        //  distance1.displayDistance();

        //  Distance dt = new Distance(10, 12);
        //  Distance dt1 = dt;
        //  dt1.displayDistance();

        // Distance dt4 = new Distance(distance1.feet, distance1.inches);
        // dt4.displayDistance();

        // // Create the second object and assign it as a reference variable to another object reference variable
        Distance distance2 = new Distance(3, 6);
        Distance distance3 = distance2;

        // // Create a third object, which is a clone of the first object
        Distance distance4 = new Distance(distance1.feet, distance1.inches);

        // Display the distances
        System.out.println("Distance 1:");
        distance1.displayDistance();

        System.out.println("\nDistance 2:");
        distance2.displayDistance();

        System.out.println("\nDistance 3 (reference to Distance 2):");
        distance3.displayDistance();

        System.out.println("\nDistance 4 (clone of Distance 1):");
        distance4.displayDistance();
    }
}
