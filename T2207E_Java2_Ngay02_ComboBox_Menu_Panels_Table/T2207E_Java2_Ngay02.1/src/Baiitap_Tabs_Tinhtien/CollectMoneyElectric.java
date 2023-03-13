/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Baiitap_Tabs_Tinhtien;

/**
 *
 * @author Admin
 */
public class CollectMoneyElectric extends CollectMoney{
    public double chisodau;
    public double chisocuoi;
    public final double dongia = 2500;

    public CollectMoneyElectric() {
    }

    public CollectMoneyElectric(double chisodau, double chisocuoi) {
        this.chisodau = chisodau;
        this.chisocuoi = chisocuoi;
    }

    public double getChisodau() {
        return chisodau;
    }

    public void setChisodau(double chisodau) {
        this.chisodau = chisodau;
    }

    public double getChisocuoi() {
        return chisocuoi;
    }

    public void setChisocuoi(double chisocuoi) {
        this.chisocuoi = chisocuoi;
    }

    @Override
    public double calculateMoney() {
         double sotieuthu=chisocuoi-chisodau;
         double tiendien=0;
         if(sotieuthu<100)
             tiendien = sotieuthu*2500;//tien dien muc 1
         else{ //(sotieuthu>=100)
             tiendien = 99*2500;//tien mức 1 full
             sotieuthu = sotieuthu - 99;//tru di muc 1 de tinh mức 2
             if(sotieuthu<199)//so thieu thu con lai (muc2)
                 tiendien += sotieuthu*2500*1.05;//tien dien muc2 còn lại
             else{//so muc2 con lại >=199
                 tiendien += 199*2500*1.05;//tien dien muc2 full
                 sotieuthu -=199;//giam tiep 199 de tinh muc3
                 if(sotieuthu>0)
                      tiendien += sotieuthu*2500*1.1;
             }
         }     
         return tiendien;
    }
    
}
