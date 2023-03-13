
import java.io.Serializable;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Student implements Serializable{
    String EnrolID;
    String FirstName;
    String LastName;
    int Age;

    public Student() {
    }

    public Student(String EnrolID, String FirstName, String LastName, int Age) {
        this.EnrolID = EnrolID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Age = Age;
    }

    public String getEnrolID() {
        return EnrolID;
    }

    public void setEnrolID(String EnrolID) {
        this.EnrolID = EnrolID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public void display() {
        System.out.printf("%10s %20s %10d\n", this.EnrolID, this.FirstName + " " + this.LastName, this.Age);
    }
    
    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input EnrolID : ");
        this.EnrolID = sc.nextLine();
        System.out.print("Input First Name : ");
        this.FirstName = sc.nextLine();
        System.out.print("Input Last Name : ");
        this.LastName = sc.nextLine();
        System.out.print("Input Age : ");
        this.Age = sc.nextInt();
    }
}
