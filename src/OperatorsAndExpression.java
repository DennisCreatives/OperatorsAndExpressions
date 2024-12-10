public class OperatorsAndExpression {
    // Operators and Expressions

    public static void main (String[] args) {
        // 1. Arithmetic
        // Java provides several arithmetic operators to perform mathematical operations on numerical values.
        // These operators are:
        int x = 10;
        int y = 3;

        // 1. Addition (+) - adds two values
        int sum = x + y;
        System.out.println("The sum is: " + sum);

        // 2. Subtraction (-) - subtracts the second value from the first value
        int difference = x - y;
        System.out.println("The difference is: " + difference);

        // 3. Multiplication (*) - multiplies two values
        int product = x * y;
        System.out.println("The product is: " + product);

        // 4. Division (/) - Divides the first value by the second value
        double quotient = (double) x / (double) y;
        System.out.println("The quotient is : " + quotient);

        // 5. Modulus (%) - Returns the remainder after dividing the first value by second value
        int modulus = x % y;
        System.out.println("The modulo is: " + modulus);

        // B. Relational Operators
        // Are used to compare two values and return a boolean result (true or false)
        // The relational operators in Java are:
        // 1. Equal to (==): Checks if the two values are equal.
        boolean isEqualTo = (x == y);
        System.out.println("Is 10 == 3? " + isEqualTo);

        // 2. Not Equal To (!=): Checks if the two values are not equal
        boolean notEqualTo = (x != y);
        System.out.println("Is 10 != 3? " + notEqualTo);

        // 3. Greater Than (>): Checks if the first value is greater than the second value
        boolean isGreaterThan = (x > y);
        System.out.println("Is 10 > 3? " + isGreaterThan);

        // 4. Less Than (<): Checks if the first value is less than the second value
        boolean isLessThan = (x < y);
        System.out.println("Is 10 < 3? " + isLessThan);

        // 5. Greater than or equal to (>=): checks if the first value is greater than or equal to the second value
        boolean isGreaterThanOrEqualTo = (x >= y);
        System.out.println("Is 10 >= 3? " + isGreaterThanOrEqualTo);

        // 6. Less Than or Equal to (<=): checks if the first value is less than or equal to the second value
        boolean isLessThanOrEqualTo = (x <= y);
        System.out.println("Is 10 <= 3? " + isLessThanOrEqualTo);

        // 3. Logical Operators
        // are used to combine or negate boolean expressions.
        // Logical operators in Java are:
        boolean a = true;
        boolean b = false;

        // 1. Logical AND (&&): Returns true if both operands are true, otherwise false.
        boolean logicalAnd = a && b;
        System.out.println(logicalAnd); // return false

        // 2. Logical OR (||): return true if at least one operand is true, otherwise false
        boolean logicalOr = a || b;
        System.out.println(logicalOr); // return true

        // 3. Logical NOT (!): Negates the boolean value of the operand (returns true if the operand is false, false if the operand is true).
        boolean logicalNot = !a;
        System.out.println(logicalNot); // returns false

        // 4. Assignment Operators
        // are used to assign values to variables. The basic assignment operator in Java is the equal sign (=). Additionally, Java provides compound  assignment operators that combine an arithmetic operator with an assignment.

        // 1. Simple assignment (=): Assigns the value on the right operand to the left operand
         int num = 10;
        System.out.println(num); // return 10

        // 2. Addition Assignment (+=): Adds the value on the right operand to the left operand and assign the result to the left operand
        num += 5; // num = num + 5;
        System.out.println(num); // returns 15

        // 3. Subtraction Assignment (-=): Subtracts the value on the right operand to the left operand and assign the result to the left operand
        num -= 3; // num = num - 3;
        System.out.println(num); // returns 12

        // 4. Multiplication Assignment (*=): multiplies the value on the right operand to the left operand and assign the result to the left operand
        num *= 2; // num = num * 2
        System.out.println(num); // returns 24

        // 5. Division Assignment (/=): Divides the value on the right operand to the left operand and assign the result to the left operand
        num /= 4; // num = num / 4
        System.out.println(num); // returns 6

        // 6. Modulus Assignment (%=): Calculates the modulus of the left operand divided by the right operand and assigns the result to the left operand
        num %= 3; // num = num % 3
        System.out.println(num); // returns 0

        // Operator Precedence (BODMAS)

        // Increment and Decrement Operators
        // increment Operator (++): increments a value by 1
        int myNum = 19;
        System.out.println(myNum++); // returns 19
        System.out.println(myNum); // returns 20

        int myNumber = 10;
        System.out.println(++myNumber); // returns 11

        // Decrement (--): decrements a value by 1
        int num1 = 12;
        System.out.println(num1--); // returns 12
        System.out.println(num1--); // returns 11
        System.out.println(--num1 + num1--); // returns 9 + 9 = 18

        // challenge 1:
        // write a Java program that checks if a given number is odd or even using the modulus operator
        // NB: don't use if statements
        int givenNumber = 13;

        boolean result = givenNumber % 2 == 0;
        System.out.println(result); // true for even, false for odd

        // write a Java program that takes radius of a circle and then outputs the circumference and area of that circle.

        double radius = 7;
        double pi = 3.14159;

        // compute the perimeter and area
        double circumference;
        double area;

        circumference = pi * (radius + radius);
        area = pi * radius * radius;

        // output the results
        System.out.println("The circumference and area of a circle whose radius is " + radius + "cm is " + circumference + "cm and " + area + "cm\u221E respectively.");
        // Next -> Control Flow Structures
    }
}
