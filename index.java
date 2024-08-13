public class CalculatePower {

    public static void main(String[] args) {

        int base = -5;
        int exponent = 3;
        int result = 1;

        try {

            // Check if base is negative
            if (base &lt; 0) {
                throw new Exception("The data must be 0 or greater than 0");
            }

            // Check if exponent is negative
            if (exponent &lt; 0) {
                throw new Exception("The data must be 0 or greater than 0");
            }

            // Calculate power using a for loop
            for (int exp = 0; exp &lt; exponent; exp++) {
                result = base * result;
            }
            System.out.println("The result of " + base + " raised to " + exponent + " is: " + result);
            result = 1;

            // Calculate power using a while loop
            while (exponent &gt; 0) {
                result = result * base;
                exponent--;
            }
            exponent = 3;
            System.out.println("The result of " + base + " raised to " + exponent + " is: " + result);
                    
        } catch (Exception ex) {
            System.out.println("The following error has occurred:\n" + ex.getMessage() + ".\nThe program will terminate.");
        }

    }

}