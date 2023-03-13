/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithithu_java2;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Student implements Serializable {
    public String EnrolID;
    public String FirstName;
    public String LastName;
    public int Age;

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
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhập ID: ");
        EnrolID=sc.nextLine();
        System.out.print("Nhập FirstName: ");
        FirstName=sc.nextLine();
        System.out.print("Nhập LastName: ");
        LastName=sc.next();
        System.out.print("Nhập Tuổi: ");
        Age=sc.nextInt();
    }
    public void display(){
        System.out.format("%-10s         %-25s  %-7s\n",
        this.EnrolID, this.LastName+ " "+this.FirstName,this.Age );
    }
    
}
