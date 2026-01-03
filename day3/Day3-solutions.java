//Exercise 1: Arithmetic Operations

public class ArithmeticOperations {
    public static void main(String[] args) {
        int a = 20;
        int b = 5;

        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        int remainder = a % b;

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
    }
}


//Exercise 2: Swapping Values

public class SwapValues {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Swapping using arithmetic operators
        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("After swapping:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

//Exercise 3: Area and Perimeter of a Rectangle

public class Rectangle {
    public static void main(String[] args) {
        double length = 15.5;
        double width = 10.0;

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
    }
}


//Exercise 4: Convert Celsius to Fahrenheit

public class TemperatureConversion {
    public static void main(String[] args) {
        double celsius = 25.0;

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println(celsius + " Celsius is equal to " + fahrenheit + " Fahrenheit.");
    }
}

//Exercise 5: Simple Interest Calculation

public class SimpleInterest {
    public static void main(String[] args) {
        double principal = 10000;
        double rate = 5; // Interest rate per year in percentage
        double time = 3; // Time in years

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + simpleInterest);
    }
}

//Exercise 6: Calculate the Average
public class AverageCalculator {
    public static void main(String[] args) {
        double num1 = 8.5;
        double num2 = 6.7;
        double num3 = 9.2;

        double average = (num1 + num2 + num3) / 3;

        System.out.println("Average: " + average);
    }
}



