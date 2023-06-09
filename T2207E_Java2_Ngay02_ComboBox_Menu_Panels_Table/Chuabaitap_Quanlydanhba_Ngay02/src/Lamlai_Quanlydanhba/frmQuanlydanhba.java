/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lamlai_Quanlydanhba;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tranthimaihien
 */
public class frmQuanlydanhba extends javax.swing.JFrame {
    PhoneBooks phoneBooks=new PhoneBooks();
    String trangthai="";

    /**
     * Creates new form frmQuanlydanhba
     */
    public frmQuanlydanhba() {
        initComponents();
    }
    public void showPhoneBooksToTable(){
        DefaultTableModel dtm=(DefaultTableModel)this.tblDanhba.getModel();
        dtm.setRowCount(0);//xoá data cũ
        ArrayList<Phone> list=phoneBooks.getList();
        for(int i=0;i<list.size();i++){
            dtm.addRow(new Object[]{(i+1),list.get(i).getName(),list.get(i).getNumber(),list.get(i).getEmail()});
        }
    }
    public void EnableEditForm(){
        this.txtName.setEditable(true);
        this.txtPhone.setEditable(true);
        this.txtEmail.setEditable(true);
        this.btnThem.setEnabled(false);
        this.btnSua.setEnabled(false);
        this.btnXoa.setEnabled(false);
        this.btnDongy.setEnabled(true);
        this.btnBoqua.setEnabled(true);
    }
    public void DisableEditForm(){
        this.txtName.setEditable(false);
        this.txtPhone.setEditable(false);
        this.txtEmail.setEditable(false);
        this.btnThem.setEnabled(true);
        this.btnSua.setEnabled(true);
        this.btnXoa.setEnabled(true);
        this.btnDongy.setEnabled(false);
        this.btnBoqua.setEnabled(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnDongy = new javax.swing.JButton();
        btnBoqua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhba = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Quản lý danh bạ");

        jLabel2.setText("Số ĐT:");

        jLabel3.setText("Họ tên:");

        jLabel4.setText("Email:");

        txtName.setEditable(false);

        txtPhone.setEditable(false);

        txtEmail.setEditable(false);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnDongy.setText("Đồng ý");
        btnDongy.setEnabled(false);
        btnDongy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDongyActionPerformed(evt);
            }
        });

        btnBoqua.setText("Bỏ qua");
        btnBoqua.setEnabled(false);
        btnBoqua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBoquaActionPerformed(evt);
            }
        });

        tblDanhba.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Họ tên ", "Số ĐT", "Email"
            }
        ));
        tblDanhba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhbaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhba);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDongy)
                .addGap(47, 47, 47)
                .addComponent(btnBoqua)
                .addGap(126, 126, 126))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnThem)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnSua)
                            .addGap(30, 30, 30)
                            .addComponent(btnXoa))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addGap(46, 46, 46)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBoqua)
                    .addComponent(btnDongy))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        this.txtName.setText("");
        this.txtPhone.setText("");
        this.txtEmail.setText("");
        EnableEditForm();
        trangthai="addNew";
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        EnableEditForm();
        trangthai="update";
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnDongyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDongyActionPerformed
        // TODO add your handling code here:
        String hoten=this.txtName.getText();
        String sodt=this.txtPhone.getText();
        String email=this.txtEmail.getText();
        Phone newphone=new Phone(hoten,sodt,email);
        if(trangthai.equalsIgnoreCase("addNew")){
            
            if(this.phoneBooks.addItem(newphone)==true){
                showPhoneBooksToTable();
            }
        }
        if(trangthai.equalsIgnoreCase("update")){
            int row=tblDanhba.getSelectedRow();
            /*ArrayList<Phone> list=phoneBooks.getList();
            Phone odlphone=list.get(row);
            if(this.phoneBooks.updateItem(odlphone, newphone)==true){
                showPhoneBooksToTable();
            }*/ 
            if(this.phoneBooks.updateItem(row, newphone)==true){
                showPhoneBooksToTable();
            }

        }
        if(trangthai.equalsIgnoreCase("delete")){
            int row=tblDanhba.getSelectedRow();
            if(this.phoneBooks.deleteItem(row)==true){
                showPhoneBooksToTable();
            }
        }
        
        DisableEditForm();
    }//GEN-LAST:event_btnDongyActionPerformed

    private void btnBoquaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBoquaActionPerformed
        // TODO add your handling code here:
        DisableEditForm();
    }//GEN-LAST:event_btnBoquaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        showPhoneBooksToTable();
    }//GEN-LAST:event_formWindowOpened

    private void tblDanhbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhbaMouseClicked
        // TODO add your handling code here:
        int row=tblDanhba.getSelectedRow();
        this.txtName.setText((String)tblDanhba.getValueAt(row, 1));
        this.txtPhone.setText((String)tblDanhba.getValueAt(row, 2));
        this.txtEmail.setText((String)tblDanhba.getValueAt(row, 3));
    }//GEN-LAST:event_tblDanhbaMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        EnableEditForm();
        trangthai="delete";
        
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(frmQuanlydanhba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanlydanhba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanlydanhba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanlydanhba.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanlydanhba().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBoqua;
    private javax.swing.JButton btnDongy;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDanhba;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
