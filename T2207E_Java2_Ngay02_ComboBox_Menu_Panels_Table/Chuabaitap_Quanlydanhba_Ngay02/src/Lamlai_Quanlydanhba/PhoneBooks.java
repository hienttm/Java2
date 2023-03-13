/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lamlai_Quanlydanhba;

import java.util.ArrayList;

/**
 *
 * @author tranthimaihien
 */
public class PhoneBooks {
    ArrayList<Phone> list=new ArrayList<Phone>();

    public PhoneBooks() {
    }

    public ArrayList<Phone> getList() {
        return list;
    }

    public void setList(ArrayList<Phone> list) {
        this.list = list;
    }
    public boolean addItem(Phone phone){
        //ktra sdt trung
        for(int i=0;i<list.size();i++){
            if(list.get(i).number.equalsIgnoreCase(phone.number)){
                return false;
            }
        }
        list.add(phone);
        return true;
    }
    public boolean updateItem(int i, Phone newPhone){
        if(i<0){
            return false;
        }else
        {
            list.set(i , newPhone);
            return true;
        }
    }
    public boolean updateItem(Phone oldPhone, Phone newPhone){
        int i=list.indexOf(oldPhone);
        if(i<0)
            return false;
        else{
            list.set(i, newPhone);
            return true;
        }
    }
    public boolean deleteItem(int i){
        if( i<0){
            return false;
        }else{
            list.remove(i);
            return true;
        }
    }
    public boolean deleteItem(Phone phone){
        int i=list.indexOf(phone);
        if( i<0){
            return false;
        }else{
            list.remove(i);
            return true;
        }
    }
}
