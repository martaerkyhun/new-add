package student1;

import java.util.Scanner;


Public class classcanner{

   public static void main(String[] args) {
   
    Scanner in = new Scanner(System.in);

    System.out.println("pls enter your name ");
    String name = in.nextLine();

    System.out.println("Pls enter your salary: ");
    int salary = in.nextInt();

    System.out.println("Pls enter your bonus: ");
    double bonus = in.nextDouble();

    double total_salary = salary + bonus;

    System.out.println("the name of the employee is : " + name);
    System.out.println("the salary of the employee is : " + salary);
    System.out.println("the bonus of the employee is : " + bonus);
    System.out.println("The total salary of the employee is : " + total_salary);
  }
  
}