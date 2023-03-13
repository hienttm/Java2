/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithi_java2_13032023;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author tranthimaihien
 */
public class ContactList {
    HashMap<String,String> list=new HashMap();

    public ContactList() {
        
    }
    
    public void inputlist(){
        Scanner sc=new Scanner(System.in);
        String res;
        while(true){
            Contact newscontact=new Contact();
            newscontact.input();
            list.put(newscontact.ContactName,newscontact.Phone);
            System.out.println("Tiếp tục? (c/k)");
            res=sc.nextLine();
            if(res.equalsIgnoreCase("k"))
                break;
        }
    }
    public void displaylist(){
        if(list.isEmpty()){
            System.out.println("ContactList is empty");
            return;
        }
        System.out.println("            Address Book");    
        System.out.println("Contact Name             Phone Number ");
        for (String ct:list.keySet()){
            String phone=list.get(ct);
            Contact Contact=new Contact(ct,phone);
            Contact.display();
        }
    }
    public void findContact(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Vui lòng nhập tên của liên hệ cần tìm");
        String name=sc.nextLine();
        if(list.containsKey(name)==false){
            System.out.println("Not found"); 
            
        }else
            System.out.println("SDT của liên hệ cần tìm là:"+list.get(name));
    }
}
