//IT25101601Q5
// Create class
class Calculator {

    // Method to add two integers and return the result
    public int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers and return the result
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to return the square of a number
    public int square(int a) {
        return a * a;
    }
}

public class IT25101601Q5 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // 1. Calculate: (3 * 4 + 5 * 7)^2
        // expression 1: (3*4) + (5*7)
        int term1 = calc.multiply(3, 4);
		
        int term2 = calc.multiply(5, 7);
		
        int sum1 = calc.add(term1, term2);
		
        int result1 = calc.square(sum1);
		
        System.out.println("Result of expression 1: " + result1);

        // 2. Calculate: (4 + 7)^2 + (8 + 3)^2
        // expression 2: (4+7)^2 + (8+3)^2
        int sum2 = calc.add(4, 7);
		
        int square1 = calc.square(sum2);
        
        int sum3 = calc.add(8, 3);
		
        int square2 = calc.square(sum3);
        
        int result2 = calc.add(square1, square2);
		
        System.out.println("Result of expression 2: " + result2);
    }
}