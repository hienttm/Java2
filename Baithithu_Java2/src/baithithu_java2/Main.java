/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithithu_java2;

import java.util.InputMismatchException;
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
        System.out.println("1.Add new student");
        System.out.println("2.Save");
        System.out.println("3.Display all students");
        System.out.println("4.Exit ");
       
        chon=inputInt();
        return chon;
    }
    public static void main(String[] args) {
        int chon;
        StudentList stlist=new StudentList();
        do{
            chon=menu();
            switch (chon){
                case 1:
                    System.out.println("Add new Students");
                    stlist.Input();
                    System.out.println("Input Completed");
                    break;
                case 2:
                    stlist.SaveToFile();
                    boolean b=stlist.SaveToFile();
                    if(b==true)
                        System.out.println("Save Successfull!");
                    else
                        System.out.println("Save Fall!");
                    break;
                case 3: 
                    System.out.println("Display all students");
                    boolean b2=stlist.getDataFromFile();
                    if(b2==true)
                        System.out.println("Display all students Successfull");
                    else
                        System.out.println("Display all students Fall");
                    stlist.getDataFromFile();
                    stlist.Display();
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
