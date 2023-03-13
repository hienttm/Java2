/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Thamchieu_Thamtri;

/**
 *
 * @author Admin
 */
public class Demo_Thamchieu {
    public static void Update_Thamchieu(test x)
    {
        x.value ++;
    }
    public static void main(String[] args) {
        test a = new test(10);
        System.out.println("Trước, a.value = " + a.value);
        Update_Thamchieu(a);
        System.out.println("Sau, a.value = " + a.value);
    }
}

class test
{
    public int value;
    public test()
    {
        value=0;
    }
    
    public test(int v)
    {
        value = v;
    }
}