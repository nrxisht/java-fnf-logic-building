The main() method is static, so it cannot directly call an instance method.
Therefore, we create an object of the Main class using `new Main()`
and call checkEvenOdd() through the object reference.
Alternatively, checkEvenOdd() could be declared static, allowing it to be
called directly without creating an object.

There are two ways to call a method from the static main() method:

1. Instance method: Create an object using `new Main()` and call the
   method through the object reference, e.g., obj.checkEvenOdd(4).

2. Static method: Declare the method as `static` and call it directly
   using the class name, e.g., Main.checkEvenOdd(4), without creating
   an object.

Since main() is static, it cannot directly call an instance method
without an object. Static methods belong to the class, while instance
methods are invoked on objects.
------------------------------------------------------------------------------------
Explains the use of the ternary operator "?:" in Java.
The ternary operator evaluates a condition and returns one of two values.
It cannot select between void method calls, such as System.out.println(),
because void methods do not return values. Use the ternary operator to select a value.
------------------------------------------------------------------------------------
When we do (digit)/10 on integers, the quotient comes as 0 as this operation on integers
skips the fractional part.
--------------------------------------------------------------------------------------
Variable Initialization in Java

- A local variable must be assigned a value before it is used.
- It is not necessary to assign a value when declaring the variable.

int digit;       // Declaration
digit = 5;       // Assignment
System.out.println(digit);  // Valid

Example in a loop:

int digit;

while (number > 0) {
    digit = number % 10;  // Assigned before use
    sum += digit;
    number /= 10;
}
Initialize a variable at declaration only when needed. If you assign a value before using it, 
a separate initial value is unnecessary.
--------------------------------------------------------------------------------------
A palindrome question can also be solved by reversing half of the number and compating both half. 
Slightly more efficient.
--------------------------------------------------------------------------------------
Use a += 10 only when we have only 1 value to express-operate to a.
If we have an expression inplace of 10, avoid this operator as,
rev *= 10 + (num%10) is equivalent to
rev = rev * (10 + (num%10)) --> rev = rev * 10 + rev * (num%10), not rev = rev * 10 + (num%10)
--------------------------------------------------------------------------------------
For solving Factorial problem, Loop is a better approach than recursion because Each recursive call 
uses stack memory. For a sufficiently large input, you can get a StackOverflowError. 
Also, long cannot store arbitrarily large factorials.
The key lesson is that an optimization doesn't always improve Big-O complexity. 
Here, the main benefit of iteration is reducing auxiliary space from (O(n) to O(1)