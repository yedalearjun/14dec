class Outer {
    private static String outerMessage = "Outer class message";

    // Static inner class
    static class Inner {
        void show() {
            // Accessing the outer class's static variable
            System.out.println("Message from inner class: " + outerMessage);
        }
    }

    void outerMethod() {
        // Creating an object of the inner class
        Inner innerObject = new Inner();
        // Calling the show() method using the inner class object
        innerObject.show();
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of the outer class
        Outer outerObject = new Outer();

        // Calling the outerMethod() which, in turn, calls the inner class method
        outerObject.outerMethod();

        // Creating an object of the inner class using the outer class
        Outer.Inner innerObject = new Outer.Inner();

        // Calling the show() method using the inner class object
        innerObject.show();
    }
}