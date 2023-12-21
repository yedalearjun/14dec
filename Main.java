 class CuboidVolumeCalculator {
    // Method to calculate the volume of a cuboid
    public static double calculateCuboidVolume() {
        // Dimensions of the cuboid (you can replace these with actual values)
        double length = 5.0;
        double breadth = 3.0;
        double height = 2.0;

        // Calculate the volume
        double volume = length * breadth * height;

        // Return the calculated volume
        return volume;
    }

    public static void main(String[] args) {
        // Call the method to calculate cuboid volume
        double result = calculateCuboidVolume();

        // Display the result
        System.out.println("Volume of the cuboid: " + result);
    }
}