package com.sysrs.jobreadiness.corejava.java8;
/**
 * LambdaExpression Allow you to write anonymous functions in a concise and expressive way.  
 *
 */

//Define a functional interface with a single abstract method
interface MyFunction {
 void doString(String s);
}

public class LambdaExpressionDemo {
 public static void main(String[] args) {
     // Traditional way: using an anonymous class
     MyFunction anonymousClass = new MyFunction() {
         @Override
         public void doString(String s) {
             System.out.println("Anonymous class: " + s);
         }
     };
     anonymousClass.doString("Hello from anonymous class");

     // Using lambda expression
     MyFunction lambdaExpression = (s) -> System.out.println("Lambda expression: " + s);
     lambdaExpression.doString("Hello from lambda expression");

     // Another example: a lambda expression with multiple parameters
     // Here, the type of parameters is inferred, but you can also explicitly specify the types.
     MyFunction multiParamLambda = (a) -> System.out.println("Multi-param Lambda: " + a);
     multiParamLambda.doString("Hello with multiple parameters");

     // You can also use existing functional interfaces from the Java API
     // Here, we use the Runnable interface
     Runnable myRunnable = () -> System.out.println("Hello from Runnable lambda");
     new Thread(myRunnable).start();
 }
}
