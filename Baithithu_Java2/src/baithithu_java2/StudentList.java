/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithithu_java2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author tranthimaihien
 */
public class StudentList {
    ArrayList<Student> list=new ArrayList<>();
    public String path="student.dat";

    public StudentList() {
    }
    public void Input(){
        Scanner sc=new Scanner(System.in);
        String res;
        while(true){
            Student newstudent=new Student();
            newstudent.input();
            list.add(newstudent);
            System.out.println("Tiếp tục? (c/k)");
            res=sc.nextLine();
            if(res.equalsIgnoreCase("k"))
                break;
        }
        
    }
    public void Display(){
        if(list.isEmpty()){
            System.out.println("List is empty");
            return;
        }
        System.out.println("   EnrolID             Full Name            Age ");
        System.out.println("----------  ------------------------------  -------");
        for(Student st:list){
            st.display();
        }
    }
    public boolean SaveToFile(){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            fos = new FileOutputStream("student.dat");
            oos = new ObjectOutputStream(fos);
            if(list.isEmpty()){
                System.out.println("không có dữ liệu để ghi");
                return false;
            }
            oos.writeInt(list.size());
            for(int i=0; i<list.size();i++)
            {
                oos.writeObject(list.get(i));
            }
            
            System.out.println("Ghi tệp thành công");
        } catch (FileNotFoundException ex) {
            System.out.println("Có lỗi mở tệp để ghi!");
            //Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        catch(Exception e){
            System.out.println("Có lỗi!");
            return false;
        }
        finally{
            try{
                fos.close();
                oos.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return true;
    }
    public boolean getDataFromFile(){
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream("student.dat");
            ois = new ObjectInputStream(fis);
            list.clear();
            int n = ois.readInt();//đọc số nguyên là số đối tượng đã ghi
            for(int i=0; i<n;i++)
            {
                Student sv = (Student)ois.readObject();//Phải ép kiểu object về kiểu object khi write
                list.add(sv);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("Có lỗi mở tệp để đọc!");
            //Logger.getLogger(StudentList.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        catch(Exception e){
            System.out.println("Có lỗi mở tệp để đọc!");
            //e.printStackTrace();
            return false;
        }
        finally{
            try{
                fis.close();
                ois.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return true;
    }
}
