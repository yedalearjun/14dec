class SuperClass {
    private String superString;

    // Parameterized constructor in the superclass
    public SuperClass(String superString) {
        this.superString = superString;
    }

    // Getter method to retrieve the value of superString
    public String getSuperString() {
        return superString;
    }
}

// Subclass inheriting from SuperClass
class SubClass extends SuperClass {
    private String subString;

    // Parameterized constructor in the subclass
    public SubClass(String superString, String subString) {
        // Calling the constructor of the superclass
        super(superString);
        this.subString = subString;
    }

    // Getter method to retrieve the value of subString
    public String getSubString() {
        return subString;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Creating an object of the SubClass
        SubClass subObj = new SubClass("Superclass String", "Subclass String");

        // Accessing the values using getters
        System.out.println("Superclass String: " + subObj.getSuperString());
        System.out.println("Subclass String: " + subObj.getSubString());
    }
}
