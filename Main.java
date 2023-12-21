 class ConstructorChaining {
    private int x;
    private int y;

    // Default constructor
    public ConstructorChaining() {
        // Calling the second constructor with an argument value of 20
        this(20);
        System.out.println("Inside Default Constructor");
    }

    // Parameterized constructor with one argument
    public ConstructorChaining(int x) {
        this.x = x;
        System.out.println("Inside Parameterized Constructor with x = " + x);
    }

    // Parameterized constructor with two arguments
    public ConstructorChaining(int x, int y) {
        // Calling the default constructor
        this();
        this.y = y;
        System.out.println("Inside Parameterized Constructor with x = " + x + " and y = " + y);
        System.out.println("Sum of x and y: " + (x + y));
    }

    public static void main(String[] args) {
        // Creating an object and calling the third constructor
        ConstructorChaining obj = new ConstructorChaining(11, 12);
    }
}