/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Quanlydanhba;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class PhoneBooks {
    Vector<Phone> list= new Vector<Phone>();

    public PhoneBooks() {
        
        //thêm các phần tử vào danh sách
        list.add(new Phone("Họ tên 1", "11111111", "email1@a.b"));
        list.add(new Phone("Họ tên 2", "22222222", "email2@a.b"));
        list.add(new Phone("Họ tên 3", "33333333", "email3@a.b"));
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
}
