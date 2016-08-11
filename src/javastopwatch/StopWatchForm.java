/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javastopwatch;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author holan
 */
public class StopWatchForm extends javax.swing.JFrame {
    public final static int TEN_MS = 10;    // 10 milliseconds
    private Timer timer;

    private int ms = 0;
    private int seconds = 0;
    private int minutes = 0;
    private int hours = 0;
    
    private int preMS = 0;
    private int preSeconds = 0;
    private int preMinutes = 0;
    private int preHours = 0;

    private int lapIdx = 1;
    
    /**
     * Creates new form StopWatchForm
     */
    public StopWatchForm() {
        initComponents();
        
        timer = new Timer(TEN_MS, new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                ms += 10;
                
                if( ms >= 1000 ) {
                    ms = 0;
                    seconds++;
                }
                
                if( seconds >= 60 ) {
                    seconds = 0;
                    minutes++;
                }
                
                if( minutes >= 60 ) {
                    minutes = 0;
                    hours++;
                }
                
                timeTxt.setText(hours + ":" + minutes + ":" + seconds + "." + ms);
            }    
        });
        
        clearLapLabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        startBtn = new javax.swing.JButton();
        resetBtn = new javax.swing.JButton();
        lapBtn = new javax.swing.JButton();
        timeTxt = new javax.swing.JLabel();
        lap1 = new javax.swing.JLabel();
        lap2 = new javax.swing.JLabel();
        lap3 = new javax.swing.JLabel();
        lap4 = new javax.swing.JLabel();
        lap5 = new javax.swing.JLabel();
        lap6 = new javax.swing.JLabel();
        lap7 = new javax.swing.JLabel();
        lap8 = new javax.swing.JLabel();
        lap9 = new javax.swing.JLabel();
        lap10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("碼錶");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        startBtn.setText("開始");
        startBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startBtnActionPerformed(evt);
            }
        });
        getContentPane().add(startBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        resetBtn.setText("重設");
        resetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetBtnActionPerformed(evt);
            }
        });
        getContentPane().add(resetBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        lapBtn.setText("圈");
        lapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lapBtnActionPerformed(evt);
            }
        });
        getContentPane().add(lapBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        timeTxt.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        timeTxt.setForeground(new java.awt.Color(51, 51, 255));
        timeTxt.setText("00:00:00.00");
        getContentPane().add(timeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 90, -1));

        lap1.setText("lap1");
        getContentPane().add(lap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 200, -1));

        lap2.setText("lap2");
        getContentPane().add(lap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, -1));

        lap3.setText("lap3");
        getContentPane().add(lap3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 200, -1));

        lap4.setText("lap4");
        getContentPane().add(lap4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 200, -1));

        lap5.setText("lap5");
        getContentPane().add(lap5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 200, -1));

        lap6.setText("lap6");
        getContentPane().add(lap6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 200, -1));

        lap7.setText("lap7");
        getContentPane().add(lap7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 200, -1));

        lap8.setText("lap8");
        getContentPane().add(lap8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 200, -1));

        lap9.setText("lap9");
        getContentPane().add(lap9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 200, -1));

        lap10.setText("lap10");
        getContentPane().add(lap10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, -1));

        jLabel1.setText("Time");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startBtnActionPerformed
        if( timer.isRunning() == true ) {
            timer.stop();
            startBtn.setText("開始");
        } else {
            timer.start();
            startBtn.setText("停止");
        }
    }//GEN-LAST:event_startBtnActionPerformed

    private void resetBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetBtnActionPerformed
        ms = 0;
        seconds = 0;
        minutes = 0;
        hours = 0;
        lapIdx = 1;
        timer.stop();
        timeTxt.setText("00:00:00.00");
        startBtn.setText("開始");
        clearLapLabel();
    }//GEN-LAST:event_resetBtnActionPerformed

    private void lapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lapBtnActionPerformed
        if( timer.isRunning() == false ) return;

        int rLapIdx = (lapIdx - 1) % 10;
        switch( rLapIdx ) {
            case 0:
                updateLapTextMessage(lap1);
                break;
            case 1:
                updateLapTextMessage(lap2);
                break;
            case 2:
                updateLapTextMessage(lap3);
                break;
            case 3:
                updateLapTextMessage(lap4);
                break;
            case 4:
                updateLapTextMessage(lap5);
                break;
            case 5:
                updateLapTextMessage(lap6);
                break;
            case 6:
                updateLapTextMessage(lap7);
                break;
            case 7:
                updateLapTextMessage(lap8);
                break;
            case 8:
                updateLapTextMessage(lap9);
                break;
            case 9:
                updateLapTextMessage(lap10);
                break;
            default:
                // do nothing
                break;
        }
        lapIdx++;
    }//GEN-LAST:event_lapBtnActionPerformed

    private void updateLapTextMessage(javax.swing.JLabel label) {
        int diffMs = ms - preMS;
        int diffSeconds = seconds - preSeconds;
        int diffMinutes = minutes - preMinutes;
        int diffHours = hours - preHours;
        StringBuilder outMsg = new StringBuilder();

        if( diffMinutes < 0 ) {
            diffMinutes += 60;
            diffHours -= 1;
        }
        
        if( diffSeconds < 0 ) {
            diffSeconds += 60;
            diffMinutes -= 1;
        }

        if( diffMs < 0 ) {
            diffMs += 1000;
            diffSeconds -= 1;
        }

        if(lapIdx != 1) {
            outMsg.append( "<html><table width='200'><tr><td align='right'>" + lapIdx + "</td><td align='right'>"
                + hours + ":" + minutes + ":" + seconds + "." + ms + "</td><td align='right'>"
                + diffHours + ":" + diffMinutes + ":" + diffSeconds + "." + diffMs + "</td></tr></table></html>");
        } else {
            outMsg.append( "<html><table width='200'><<tr><td align='right'>" + lapIdx + "</td><td align='right'>"
                + hours + ":" + minutes + ":" + seconds + "." + ms + "</td><td align='right'>"
                + hours + ":" + minutes + ":" + seconds + "." + ms + "</td></tr></table></html>");
        }
        
        label.setText(outMsg.toString());
        preMS = ms;
        preSeconds = seconds;
        preMinutes = minutes;
        preHours = hours;
    }

    private void clearLapLabel() {
        jLabel1.setText("<html><table width='200'><tr><td align='right'>圈數</td><td align='right'>總時間</td><td align='right'>單圈時間</td></tr></table></html>");
        lap1.setText("");
        lap2.setText("");
        lap3.setText("");
        lap4.setText("");
        lap5.setText("");
        lap6.setText("");
        lap7.setText("");
        lap8.setText("");
        lap9.setText("");
        lap10.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(StopWatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StopWatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StopWatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StopWatchForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StopWatchForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lap1;
    private javax.swing.JLabel lap10;
    private javax.swing.JLabel lap2;
    private javax.swing.JLabel lap3;
    private javax.swing.JLabel lap4;
    private javax.swing.JLabel lap5;
    private javax.swing.JLabel lap6;
    private javax.swing.JLabel lap7;
    private javax.swing.JLabel lap8;
    private javax.swing.JLabel lap9;
    private javax.swing.JButton lapBtn;
    private javax.swing.JButton resetBtn;
    private javax.swing.JButton startBtn;
    private javax.swing.JLabel timeTxt;
    // End of variables declaration//GEN-END:variables
}
