/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo04_Tabs;

/**
 *
 * @author Tran Manh Truong
 */
public class FrmCollectMoney extends javax.swing.JFrame {

    /**
     * Creates new form FrmCollectMoney
     */
    public FrmCollectMoney() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabTienInternet = new javax.swing.JTabbedPane();
        panelTindien = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtChisodau = new javax.swing.JTextField();
        txtChisocuoi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTiendien = new javax.swing.JTextField();
        btnTinhTiendien = new javax.swing.JButton();
        panelTienInternet = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtSothang = new javax.swing.JTextField();
        txtTienInternet = new javax.swing.JTextField();
        btnTinhTienInternet = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Chỉ số đầu:");

        jLabel2.setText("Chỉ số cuối:");

        jLabel3.setText("Thành tiền:");

        btnTinhTiendien.setText("TÍNH TIỀN ĐIỆN");

        javax.swing.GroupLayout panelTindienLayout = new javax.swing.GroupLayout(panelTindien);
        panelTindien.setLayout(panelTindienLayout);
        panelTindienLayout.setHorizontalGroup(
            panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTindienLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnTinhTiendien, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addGroup(panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtChisodau)
                        .addComponent(txtChisocuoi)
                        .addComponent(txtTiendien, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)))
                .addContainerGap(168, Short.MAX_VALUE))
        );
        panelTindienLayout.setVerticalGroup(
            panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTindienLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtChisodau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtChisocuoi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(btnTinhTiendien)
                .addGap(43, 43, 43)
                .addGroup(panelTindienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTiendien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        tabTienInternet.addTab("Tính tiền điện", panelTindien);

        jLabel4.setText("Số Tháng:");

        jLabel5.setText("Thành tiền:");

        btnTinhTienInternet.setText("TÍNH TIỀN INTERNET");

        javax.swing.GroupLayout panelTienInternetLayout = new javax.swing.GroupLayout(panelTienInternet);
        panelTienInternet.setLayout(panelTienInternetLayout);
        panelTienInternetLayout.setHorizontalGroup(
            panelTienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTienInternetLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(panelTienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(66, 66, 66)
                .addGroup(panelTienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSothang)
                    .addComponent(txtTienInternet)
                    .addComponent(btnTinhTienInternet, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE))
                .addContainerGap(145, Short.MAX_VALUE))
        );
        panelTienInternetLayout.setVerticalGroup(
            panelTienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTienInternetLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelTienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSothang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnTinhTienInternet)
                .addGap(43, 43, 43)
                .addGroup(panelTienInternetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTienInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        tabTienInternet.addTab("Tính tiền Internet", panelTienInternet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTienInternet)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTienInternet)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCollectMoney.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCollectMoney().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTinhTienInternet;
    private javax.swing.JButton btnTinhTiendien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel panelTienInternet;
    private javax.swing.JPanel panelTindien;
    private javax.swing.JTabbedPane tabTienInternet;
    private javax.swing.JTextField txtChisocuoi;
    private javax.swing.JTextField txtChisodau;
    private javax.swing.JTextField txtSothang;
    private javax.swing.JTextField txtTienInternet;
    private javax.swing.JTextField txtTiendien;
    // End of variables declaration//GEN-END:variables
}
