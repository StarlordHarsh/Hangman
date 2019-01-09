/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

import java.awt.Color;

public class Guess extends javax.swing.JFrame {

    String chk;
    int d = 1;
    int t = 0;
    String uni = "";
    String cpy = Input.word.toUpperCase(); //Input.word;
    String hng = "H A N G M A N";
    String try1 = " ";
    int tflag = 0;
    int win = 0;
    int win1 = 0;
    int counter = 0;
    int cal = 0;
    int hngf = 0;
    int hngff = 0;
    String winstr = "";

    public Guess() {
        initComponents();
        System.out.println(txt_enter.getText());
        txt_enter.setText("");
        System.out.println(txt_enter.getText());
        do {;
            for (int j = 0; j < cpy.length(); j++) {
                uni = uni + "_";
            }
            String uni1 = "";
            for (int c = 0; c < cpy.length(); c++) {
                uni1 = uni1 + uni.charAt(c) + " ";
            }
            txt_out.setText(uni1);
            t = 1;
        } while (t == 0);
        txt_hang.setText("_ _ _ _ _ _ _ ");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_out = new javax.swing.JLabel();
        txt_hang = new javax.swing.JLabel();
        txt_try = new javax.swing.JLabel();
        txt_enter = new javax.swing.JTextField();
        sub_guess = new javax.swing.JButton();
        txt_err = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("HANGMAN");

        sub_guess.setText("Submit");
        sub_guess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sub_guessActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txt_out, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                .addComponent(txt_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_try, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sub_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_err, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_out, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_hang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_try, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_err, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub_guess, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sub_guessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sub_guessActionPerformed
        boolean check = false;
        txt_err.setText("");
        chk = txt_enter.getText().toUpperCase();
        System.out.println(chk);
        if (((int) chk.charAt(0) >= 65 && (int) chk.charAt(0) <= 90) || ((int) chk.charAt(0) >= 48 && (int) chk.charAt(0) <= 57)) {//txt_out.setText(cpy);
            boolean flag = true;
            boolean flag2 = false;
            boolean winflag = true;
            for (tflag = 0; tflag < try1.length(); tflag++) {
                if (chk.charAt(0) == try1.charAt(tflag)) {
                    txt_err.setForeground(Color.black);
                    txt_err.setText("Entered already !");
                    flag = false;
                    winflag = false;
                }
            }
            for (int i = 0; i < cpy.length(); i++) {
                if (cpy.charAt(i) == chk.charAt(0)) {
                    uni = uni.substring(0, i) + cpy.charAt(i) + uni.substring(i + 1);
                    String uni1 = "";
                    for (int c = 0; c < uni.length(); c++) {
                        uni1 = uni1 + uni.charAt(c) + " ";
                    }
                    System.out.println(hngf + "Counter");
                    txt_out.setText(uni1);
                    if (winflag) {
                        win++;
                        hngf++;
                        winstr = winstr + chk;
                    }
                    flag2 = true;
                    // System.out.println("cin-"+win+" "+cpy.length());
                    if (win == cpy.length()) {

                        for (int l = 0; l < win; l++) {
                            for (int m = 0; m < win; m++) {
                                System.out.println("in-" + winstr.charAt(l) + "  " + cpy.charAt(m) + " " + win1);
                                if (winstr.charAt(l) == cpy.charAt(m)) {
                                    check = true;
                                    win1++;
                                }
                                System.out.println("chk" + check);
                            }
                        }
                    }

                }

            }
            System.out.println("HNGF-" + hngf);
            hngff = hngff + hngf * hngf;
            System.out.println("HNGF " + hngf + " " + hngff);
            hngf = 0;
            if (win1 == hngff && check == true) {
                txt_err.setForeground(Color.green);
                txt_err.setText("You Won !");
            }
            /* for (int y = 0; y < cpy.length() - 1; y++) {
                for (int z = y + 1; z < cpy.length(); z++) {
                    if (cpy.charAt(y) == cpy.charAt(z)) {
                        counter++;
                    }
                }
                cal = cal + counter;
                //counter=0;
            }*/
            System.out.println(counter);
            /* if (check) {
                txt_err.setForeground(Color.green);
                txt_err.setText("You Won !");
            }*/

            if (flag) {
                if (!flag2) {

                    txt_hang.setText(hng.substring(0, d));
                    d = d + 2;
                }
                try1 = try1.trim() + chk + ",";
                if (d == 15) {
                    txt_err.setForeground(Color.red);
                    txt_err.setText("Game Over");
                }
            }
            System.out.println(try1);
        }
        txt_enter.setText("");
        txt_try.setText("Wrong words you have already entered-" + try1);
    }//GEN-LAST:event_sub_guessActionPerformed

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
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guess.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guess().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton sub_guess;
    private javax.swing.JTextField txt_enter;
    private javax.swing.JLabel txt_err;
    private javax.swing.JLabel txt_hang;
    private javax.swing.JLabel txt_out;
    private javax.swing.JLabel txt_try;
    // End of variables declaration//GEN-END:variables
}
