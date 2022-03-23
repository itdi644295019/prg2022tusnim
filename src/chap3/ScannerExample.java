package chap3;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name : ");
        String name = sc.next();
        System.out.println("Name is " + name);

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        System.out.println("Age is " + age + " Years.");

        System.out.print("Please Enter Your Salary : ");
        double salary = sc.nextDouble();
        System.out.println("Salary is " + salary);

        String cage = (age >= 20) ? ">20" : "<20";
        System.out.println("" + cage);
    }
}//end class
