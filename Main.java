package array;

import java.util.*;

class Subject {

    int marks;

    Subject(int marks) {
        this.marks = marks;
    }
}

class Student {

    String name;
    int rollNo;
    Subject sub[];

    Student(String name, int rollNo, int subjects) {
        this.name = name;
        this.rollNo = rollNo;
        sub = new Subject[subjects];
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Roll No : " + rollNo);

        for (int i = 0; i < sub.length; i++) {
            System.out.println("Marks : " + sub[i].marks);
        }
    }

    void countTotal() {
        int total = 0;

        for (int i = 0; i < sub.length; i++) {
            total += sub[i].marks;
        }

        System.out.println("Total : " + total);
    }

    void percentage() {
        int total = 0;

        for (int i = 0; i < sub.length; i++) {
            total += sub[i].marks;
        }

        double percentage = (double) total / sub.length;

        System.out.println("Percentage : " + percentage);
    }
}

class Batch {

    String batchName;
    Student students[];

    Batch(String batchName, int students) {
        this.batchName = batchName;
        this.students = new Student[students];
    }

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < students.length; i++) {

            System.out.println("Enter Student " + (i + 1));

            System.out.print("Name : ");
            String name = sc.next();

            System.out.print("Roll No : ");
            int rollNo = sc.nextInt();

            System.out.print("Number of Subjects : ");
            int n = sc.nextInt();

            students[i] = new Student(name, rollNo, n);

            for (int j = 0; j < n; j++) {

                System.out.print("Marks : ");
                int marks = sc.nextInt();

                students[i].sub[j] = new Subject(marks);
            }
        }
    }

    void display() {
        System.out.println("Batch : " + batchName);

        for (int i = 0; i < students.length; i++) {
            students[i].display();
            students[i].countTotal();
            students[i].percentage();
            System.out.println();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Batch 1 Name : ");
        String name1 = sc.next();

        System.out.print("Enter Number of Students : ");
        int n1 = sc.nextInt();

        Batch g1 = new Batch(name1, n1);

        g1.input();

        System.out.print("Enter Batch 2 Name : ");
        String name2 = sc.next();

        System.out.print("Enter Number of Students : ");
        int n2 = sc.nextInt();

        Batch g2 = new Batch(name2, n2);

        g2.input();

        System.out.println("Batch 1");
        g1.display();

        System.out.println("Batch 2");
        g2.display();
    }
}