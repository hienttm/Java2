/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlydanhba;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class PhoneBooks {
    Vector<Phone> list;

    public PhoneBooks() {
        this.list = new Vector<Phone>();
        //thêm các phần tử vào danh sách
        //getDataFromFile();
       // list.add(new Phone("Họ tên 1", "11111111", "email1@a.b"));
       // list.add(new Phone("Họ tên 2", "22222222", "email2@a.b"));
        //list.add(new Phone("Họ tên 3", "33333333", "email3@a.b"));
    }

    public Vector<Phone> getList() {
        return list;
    }

    public void setList(Vector<Phone> list) {
        this.list = list;
    }
    public boolean addItem(Phone phone)
    {
        list.add(phone);
        return true;
    }
    public boolean updateItem(int i, Phone newPhone)
    {
        if(i<0)
            return false;
        else
        {
            list.set(i, newPhone);
        return true;
        }
    }
    public boolean updateItem(Phone oldPhone, Phone newPhone)
    {
        int i = list.indexOf(oldPhone);
        if(i>0)
        {
            updateItem(i,newPhone);
            return true;
        }
        else
            return false;
    }
    public boolean deleteItem(int i)
    {
        if(i<0)
            return false;
        else
        {
            list.remove(i);
            return true;
        }
    }
    public boolean deleteItem(Phone phone)
    {
        if(phone == null)
            return false;
        else
        {
            list.remove(phone);
            return true;
        }
    }
    //Hàm ghi Vector<Phone> list ra tệp PhoneBooks.dat
    public boolean SaveToFile(String filePath)
    {
        if(list.isEmpty())
            return false;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            
            fos = new FileOutputStream(filePath);
            oos = new ObjectOutputStream(fos);
            //thao tác ghi dữ liệu ra tệp kiểu nhị phân 
            oos.writeInt(list.size());//ghi số phần tử ra tệp
            for(int i=0; i<list.size();i++)
            {
                Phone phone = list.get(i);
                oos.writeObject(phone);
            }
                
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            try {
                if(oos!=null)
                    oos.close();
                if(fos!=null)
                    fos.close();
            } catch (IOException ex) {
                Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return true;
    }
    //Hàm đọc dữ liệu từ PhoneBooks.dat đưa vào Vector<Phone> list
    public boolean getDataFromFile(String filePath)
    {
        list.clear();//xóa tất các phần tử đã có trong list
        ObjectInputStream ois = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(filePath);
            ois = new ObjectInputStream(fis);
            int n = ois.readInt();//đọc số nguyên là số đối tượng đã ghi
            for(int i=0; i<n;i++)//lặp n lần để đọc n đối tượng Phone
            {
                Phone phone = (Phone)ois.readObject();//Phải ép kiểu object về kiểu object khi write
                list.add(phone);
            }
            
        } catch (FileNotFoundException ex) {
                System.out.println("Có lỗi mở tệp để đọc!");
                Logger.getLogger(PhoneBooks.class.getName()).log(Level.SEVERE, null, ex);
                return false;
        }
        catch(Exception e){
            e.printStackTrace();
            return false;
        }
        finally{
            try{
                if(ois!=null)
                    ois.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        return true;
    }
}
