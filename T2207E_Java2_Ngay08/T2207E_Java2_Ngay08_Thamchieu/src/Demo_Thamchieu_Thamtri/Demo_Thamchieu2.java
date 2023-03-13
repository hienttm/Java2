/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo_Thamchieu_Thamtri;

import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Demo_Thamchieu2 {
    public static void getData(Vector<Integer> L)
    {
        L.add(10);
        L.add(20);
        L.add(30);
    }
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<Integer>();
        getData(list);
        for(Integer v : list)
        {
            System.out.println(v);
        }
    }
}
