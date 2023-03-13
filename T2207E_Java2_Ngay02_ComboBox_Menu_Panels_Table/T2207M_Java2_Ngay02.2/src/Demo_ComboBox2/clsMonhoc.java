/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo_ComboBox2;

/**
 *
 * @author Tran Manh Truong
 */
public class clsMonhoc {
    String Mamon;
    String Tenmon;
    int Sogio;

    public clsMonhoc() {
    }

    public clsMonhoc(String Mamon, String Tenmon) {
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
    }

    public clsMonhoc(String Mamon, String Tenmon, int Sogio) {
        this.Mamon = Mamon;
        this.Tenmon = Tenmon;
        this.Sogio = Sogio;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }

    public String getTenmon() {
        return Tenmon;
    }

    public void setTenmon(String Tenmon) {
        this.Tenmon = Tenmon;
    }

    public int getSogio() {
        return Sogio;
    }

    public void setSogio(int Sogio) {
        this.Sogio = Sogio;
    }

    @Override
    public String toString() {
        return  Mamon + ", " + Tenmon;
    }

  
    
}
