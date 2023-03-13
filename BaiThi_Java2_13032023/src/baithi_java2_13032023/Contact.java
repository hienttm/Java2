/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithi_java2_13032023;

import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class Contact {
    public String ContactName;
    public String Phone;

    public Contact() {
    }

    public Contact(String ContactName, String Phone) {
        this.ContactName = ContactName;
        this.Phone = Phone;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String ContactName) {
        this.ContactName = ContactName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Input Contact Name:");
        ContactName=sc.nextLine();
        System.out.println("Input Phone number:");
        Phone=sc.nextLine();
        
    }
    public void display(){
        System.out.format("%-24s %-10s\n",ContactName,Phone);
    }
}
