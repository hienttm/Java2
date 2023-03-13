/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Thamchieu_Thamtri;

/**
 *
 * @author Admin
 */
//pass by value
public class Demo_Thamtri {
    public static void Update_Thamtri(int x)
    {
        x=x+1;
        System.out.println("x " + x);
    }
    public static void main(String[] args) {
        int a=10;
        System.out.println("truoc update,a = " + a);
        Update_Thamtri(a);
        System.out.println("sau update,a = " + a);
    }
}
