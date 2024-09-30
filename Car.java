// A simple Java class with a parameterized constructor
class Car {
    // Instance variables
    String model;
    String color;
    int year;

    // Parameterized constructor
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
 
    public static void main(String[] args) {
        // Creating an object using the parameterized constructor
        Car myCar = new Car("Toyota Camry", "Red", 2023);

        // Displaying the details of the car
        myCar.displayDetails();
    }
}