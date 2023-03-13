/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Views;
import CSDL.tbSinhvien;
import Models.clsSinhvien;
import java.sql.*;
import java.util.Vector;
/**
 *
 * @author Admin
 */
public class ViewData {
    public static void main(String[] args) {
        Vector<clsSinhvien> danhsach = new Vector<clsSinhvien>();
        int ketqua = tbSinhvien.TimSinhvien("", danhsach);
        if(ketqua==-1)
            System.out.println("Lỗi kết nối CSDL");
        else if(ketqua==-2)
            System.out.println("Lỗi SQL truy vấn dữ liệu");
        else if(ketqua==0)
            System.out.println("Không có dữ liệu thỏa mãn");
        else if(ketqua>0)
        {
            System.out.println("Danh sách sinh viên");
            System.out.println("Mã      |      Họ tên     |   Điện thoại");
            for(int i=0;i<danhsach.size();i++)
            {
                System.out.print(danhsach.get(i).getMasv() + "    |    ");
                System.out.print(danhsach.get(i).getHoten() + "    |   ");
                System.out.println(danhsach.get(i).getDienthoai() + "    |");
            }
        }
           
    }
}
