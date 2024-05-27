package com.example.week_one;

import java.util.List;
import java.util.Scanner;

public class Mains {

    public static void main(String[] args) {
        WorkCompany workCompany = new WorkCompany();
        Scanner scn = new Scanner(System.in);


        while(true){
            System.out.println("Enter your function: ");
            System.out.println("1 add");
            System.out.println("2 delete");
            System.out.println("3 calculate");
            System.out.println("4 stop");

            int answer = scn.nextInt();

            switch(answer){
                case 1:
                    System.out.print("Enter employee name: ");
                    String name = scn.nextLine();
                    System.out.println();
                    System.out.print("Enter employee age: ");
                    int age = scn.nextInt();
                    System.out.println();

                    System.out.print("Enter employee job: ");
                    String job = scn.nextLine();
                    System.out.println();

                    System.out.print("Enter employee salary: ");
                    int salary = scn.nextInt();
                    System.out.println();

                    workCompany.addWorkEmployee(new Employee(name,age,job,salary));
                case 2:
                    System.out.print("Enter employee name: ");
                    String dname = scn.nextLine();
                    System.out.println();
                    System.out.print("Enter employee age: ");
                    int dage = scn.nextInt();
                    System.out.println();

                    System.out.print("Enter employee job: ");
                    String djob = scn.nextLine();
                    System.out.println();

                    System.out.print("Enter employee salary: ");
                    int dsalary = scn.nextInt();
                    System.out.println();

                    workCompany.removeWorkEmployee(new Employee(dname,dage,djob,dsalary));

                case 3:
                    workCompany.calculatePay();

                case  4:
                    break;

            }
        }
    }
}
