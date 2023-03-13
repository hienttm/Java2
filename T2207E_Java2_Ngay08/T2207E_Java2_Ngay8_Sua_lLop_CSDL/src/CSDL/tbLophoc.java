/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSDL;

import Models.clsLophoc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Tran Manh Truong
 */
public class tbLophoc {
    public Vector<clsLophoc> list;
    public tbLophoc()
    {
        list = new Vector<clsLophoc>();
    }
    //hàm trả về mảng dsLop chứa các lớp học học (qua tham chiếu)
    //hàm trả về -1 (lỗi kết nối CSDL), -2 (Lỗi SQL), còn lại là số bản ghi
    public int LayDSLop()
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
         String sql = "SELECT * FROM tbLophoc";
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while(rs.next())//duyệt từng bản ghi kết quả select
            {
                clsLophoc lophoc = new clsLophoc();
                lophoc.setMalop(rs.getInt("Malop"));
                lophoc.setTenlop(rs.getString("Tenlop"));
                this.list.add(lophoc);
            }
            return this.list.size();
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public int ThemLophoc(String tenlop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "INSERT INTO tbLophoc VALUES(NULL,?)";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, tenlop);
            int n = stm.executeUpdate();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public int XoaLophoc(int malop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "DELETE FROM tbLophoc WHERE Malop=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setInt(1, malop);
            int n = stm.executeUpdate();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    public int SuaLophoc(int malop,String tenlop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "UPDATE tbLophoc SET Tenlop=? WHERE Malop=?";
        try {
            PreparedStatement stm = cnn.prepareStatement(sql);
            stm.setString(1, tenlop);
            stm.setInt(2, malop);
            int n = stm.executeUpdate();
            return n;
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }
    }
    //hàm trả về Tenlop qua tham chiếu
    public int LayTenLop(int Malop, String Tenlop)
    {
        Connection cnn = Database.KetnoiCSDL();
        if(cnn==null)
            return -1;
        String sql = "SELECT * FROM tbLophoc WHERE Malop = " + Malop;
        try {
            Statement stm = cnn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            if(rs.next())
            {
                Tenlop = rs.getString("Tenlop");
            }
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(tbLophoc.class.getName()).log(Level.SEVERE, null, ex);
            return -2;
        }        
    }
}
