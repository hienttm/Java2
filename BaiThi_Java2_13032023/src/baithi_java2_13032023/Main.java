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
public class Main {
    public static int inputInt(){
        Scanner sc=new Scanner(System.in);
        int n;
        while(true){
            try{
                String str=sc.nextLine();
                n=Integer.parseInt(str);
                return n;
            }
            catch(Exception e){
                System.out.println("Mời nhập số nguyên");
            }
        }
    }
    public static int menu(){
        int chon;
        Scanner sc=new Scanner(System.in);
        System.out.println("\n------MENU------");
        System.out.println("Vui lòng chọn 1 mục:");
        System.out.println("1.Add new Contacts");
        System.out.println("2.Find a contact by name");
        System.out.println("3.Display contacts");
        System.out.println("4.Exit ");
       
        chon=inputInt();
        return chon;
    }
    public static void main(String[] args) {
        int chon;
        ContactList ctlist=new ContactList();
        do{
            chon=menu();
            switch (chon){
                case 1:
                    System.out.println("Add new Contacts");
                    ctlist.inputlist();
                    break;
                case 2:
                    ctlist.findContact();
                    break;
                case 3: 
                    System.out.println("Display all contacts");
                    ctlist.displaylist();
                    break;
                case 4: 
                    System.out.println("Kết thúc chương trình");
                    break;
                default:
                    System.out.println("Vui lòng chọn từ 1-4: ");
            }
        }while (chon!=4);
    }
}
