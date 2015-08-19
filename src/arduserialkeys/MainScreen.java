/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arduserialkeys;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.text.DefaultCaret;
import static javax.swing.text.DefaultCaret.ALWAYS_UPDATE;
import jssc.SerialPortException;


/**
 *
 * @author Dakky
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        init();
        setResizable(false);
        serialPort = new SerialCommSys();
        jComboBox2.setModel(new DefaultComboBoxModel(serialPort.getPorts()));
    }

     // <editor-fold defaultstate="collapsed" desc="Custom Code">                          
    private void init() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        DefaultCaret caret = (DefaultCaret)jTextArea1.getCaret();
        caret.setUpdatePolicy(ALWAYS_UPDATE);
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jSlider13 = new javax.swing.JSlider(0, 255);
        jCheckBox53 = new javax.swing.JCheckBox();
        jButton38 = new javax.swing.JButton();
        jCheckBox54 = new javax.swing.JCheckBox();
        jButton39 = new javax.swing.JButton();
        jCheckBox55 = new javax.swing.JCheckBox();
        jButton40 = new javax.swing.JButton();
        jCheckBox56 = new javax.swing.JCheckBox();
        jButton41 = new javax.swing.JButton();
        jCheckBox57 = new javax.swing.JCheckBox();
        jButton42 = new javax.swing.JButton();
        jCheckBox58 = new javax.swing.JCheckBox();
        jButton43 = new javax.swing.JButton();
        jCheckBox59 = new javax.swing.JCheckBox();
        jSlider14 = new javax.swing.JSlider(0, 255);
        jCheckBox60 = new javax.swing.JCheckBox();
        jButton44 = new javax.swing.JButton();
        jCheckBox61 = new javax.swing.JCheckBox();
        jButton45 = new javax.swing.JButton();
        jCheckBox62 = new javax.swing.JCheckBox();
        jButton46 = new javax.swing.JButton();
        jCheckBox63 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jSlider15 = new javax.swing.JSlider(0, 255);
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox64 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox65 = new javax.swing.JCheckBox();
        jSlider16 = new javax.swing.JSlider(0, 255);
        jLabel17 = new javax.swing.JLabel();
        jCheckBox66 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jCheckBox67 = new javax.swing.JCheckBox();
        jSlider17 = new javax.swing.JSlider(0, 255);
        jLabel18 = new javax.swing.JLabel();
        jCheckBox68 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        jCheckBox69 = new javax.swing.JCheckBox();
        jSlider18 = new javax.swing.JSlider(0, 255);
        jLabel19 = new javax.swing.JLabel();
        jCheckBox70 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton12 = new javax.swing.JButton();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton13 = new javax.swing.JButton();
        jCheckBox71 = new javax.swing.JCheckBox();
        jSlider19 = new javax.swing.JSlider(0, 255);
        jLabel20 = new javax.swing.JLabel();
        jCheckBox72 = new javax.swing.JCheckBox();
        jButton14 = new javax.swing.JButton();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton15 = new javax.swing.JButton();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton16 = new javax.swing.JButton();
        jCheckBox73 = new javax.swing.JCheckBox();
        jSlider20 = new javax.swing.JSlider(0, 255);
        jLabel21 = new javax.swing.JLabel();
        jCheckBox74 = new javax.swing.JCheckBox();
        jButton17 = new javax.swing.JButton();
        jCheckBox11 = new javax.swing.JCheckBox();
        jButton18 = new javax.swing.JButton();
        jCheckBox12 = new javax.swing.JCheckBox();
        jButton19 = new javax.swing.JButton();
        jCheckBox75 = new javax.swing.JCheckBox();
        jSlider21 = new javax.swing.JSlider(0, 255);
        jLabel22 = new javax.swing.JLabel();
        jCheckBox76 = new javax.swing.JCheckBox();
        jButton20 = new javax.swing.JButton();
        jCheckBox13 = new javax.swing.JCheckBox();
        jButton21 = new javax.swing.JButton();
        jCheckBox14 = new javax.swing.JCheckBox();
        jButton22 = new javax.swing.JButton();
        jCheckBox77 = new javax.swing.JCheckBox();
        jSlider22 = new javax.swing.JSlider(0, 255);
        jLabel23 = new javax.swing.JLabel();
        jCheckBox78 = new javax.swing.JCheckBox();
        jButton23 = new javax.swing.JButton();
        jCheckBox15 = new javax.swing.JCheckBox();
        jButton24 = new javax.swing.JButton();
        jCheckBox16 = new javax.swing.JCheckBox();
        jButton25 = new javax.swing.JButton();
        jCheckBox79 = new javax.swing.JCheckBox();
        jSlider23 = new javax.swing.JSlider(0, 255);
        jLabel24 = new javax.swing.JLabel();
        jCheckBox80 = new javax.swing.JCheckBox();
        jButton26 = new javax.swing.JButton();
        jCheckBox17 = new javax.swing.JCheckBox();
        jButton27 = new javax.swing.JButton();
        jCheckBox18 = new javax.swing.JCheckBox();
        jButton28 = new javax.swing.JButton();
        jCheckBox81 = new javax.swing.JCheckBox();
        jSlider24 = new javax.swing.JSlider(0, 255);
        jLabel25 = new javax.swing.JLabel();
        jCheckBox82 = new javax.swing.JCheckBox();
        jButton29 = new javax.swing.JButton();
        jCheckBox19 = new javax.swing.JCheckBox();
        jButton30 = new javax.swing.JButton();
        jCheckBox20 = new javax.swing.JCheckBox();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jCheckBox83 = new javax.swing.JCheckBox();
        jButton33 = new javax.swing.JButton();
        jCheckBox21 = new javax.swing.JCheckBox();
        jButton34 = new javax.swing.JButton();
        jCheckBox22 = new javax.swing.JCheckBox();
        jButton35 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        
        jSlider13.setValue(0);
        jSlider14.setValue(0);
        jSlider15.setValue(0);
        jSlider16.setValue(0);
        jSlider17.setValue(0);
        jSlider18.setValue(0);
        jSlider19.setValue(0);
        jSlider20.setValue(0);
        jSlider21.setValue(0);
        jSlider22.setValue(0);
        jSlider23.setValue(0);
        jSlider24.setValue(0);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arduino Mega Control");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setToolTipText("Input Serial Commands");
        jTextField1.setActionCommand("serialTextSend");

        jButton2.setText("Send");
        jButton2.setActionCommand("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setText("Baud Rate");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "300", "1200", "2400", "4800", "9600", "14400", "19200", "28800", "38400", "57600", "115200" }));
        jComboBox1.setSelectedIndex(4);
        jComboBox1.setActionCommand("baudChanged");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCheckBox52.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox52StateChanged(evt);
            }
        });
        jCheckBox52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox52MouseReleased(evt);
            }
        });

        jSlider13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider13StateChanged(evt);
            }
        });
        jSlider13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider13MousePressed(evt);
            }
        });
        jSlider13.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jSlider13CaretPositionChanged(evt);
            }
        });
        jSlider13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSlider13PropertyChange(evt);
            }
        });

        jCheckBox53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox53MouseReleased(evt);
            }
        });
        jCheckBox53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox53ActionPerformed(evt);
            }
        });

        jButton38.setText("Pin 14");
        jButton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton38MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton38MouseReleased(evt);
            }
        });
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jButton38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton38KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton38KeyReleased(evt);
            }
        });

        jCheckBox54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox54MouseReleased(evt);
            }
        });

        jButton39.setText("Pin 28");
        jButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton39MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton39MouseReleased(evt);
            }
        });
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jCheckBox55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox55MouseReleased(evt);
            }
        });

        jButton40.setLabel("Pin 42");
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton40MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton40MouseReleased(evt);
            }
        });
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jCheckBox56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox56MouseReleased(evt);
            }
        });

        jButton41.setText("Pin 15");
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton41MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton41MouseReleased(evt);
            }
        });
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jCheckBox57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox57MouseReleased(evt);
            }
        });

        jButton42.setText("Pin 29");
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton42MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton42MouseReleased(evt);
            }
        });
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jCheckBox58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox58MouseReleased(evt);
            }
        });

        jButton43.setLabel("Pin 43");
        jButton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton43MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton43MouseReleased(evt);
            }
        });
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jCheckBox59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox59MouseReleased(evt);
            }
        });

        jSlider14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider14StateChanged(evt);
            }
        });
        jSlider14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider14MousePressed(evt);
            }
        });

        jCheckBox60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox60MouseReleased(evt);
            }
        });

        jButton44.setText("Pin 16");
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton44MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton44MouseReleased(evt);
            }
        });
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jCheckBox61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox61MouseReleased(evt);
            }
        });

        jButton45.setText("Pin 30");
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton45MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton45MouseReleased(evt);
            }
        });
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jCheckBox62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox62MouseReleased(evt);
            }
        });

        jButton46.setLabel("Pin 44");
        jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton46MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton46MouseReleased(evt);
            }
        });
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jCheckBox63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox63MouseReleased(evt);
            }
        });

        jLabel14.setText("Pin 2");

        jSlider15.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider15StateChanged(evt);
            }
        });
        jSlider15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider15MousePressed(evt);
            }
        });

        jLabel15.setText("Pin 3");

        jLabel16.setText("Pin 4");

        jCheckBox64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox64MouseReleased(evt);
            }
        });

        jButton1.setText("Pin 17");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseReleased(evt);
            }
        });

        jButton3.setText("Pin 31");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseReleased(evt);
            }
        });

        jButton4.setLabel("Pin 45");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox65MouseReleased(evt);
            }
        });

        jSlider16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider16StateChanged(evt);
            }
        });
        jSlider16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider16MousePressed(evt);
            }
        });

        jLabel17.setText("Pin 5");

        jCheckBox66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox66MouseReleased(evt);
            }
        });

        jButton5.setText("Pin 18");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseReleased(evt);
            }
        });

        jButton6.setText("Pin 32");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseReleased(evt);
            }
        });

        jButton7.setLabel("Pin 46");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jCheckBox67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox67MouseReleased(evt);
            }
        });

        jSlider17.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider17StateChanged(evt);
            }
        });
        jSlider17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider17MousePressed(evt);
            }
        });

        jLabel18.setText("Pin 6");

        jCheckBox68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox68MouseReleased(evt);
            }
        });

        jButton8.setText("Pin 19");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseReleased(evt);
            }
        });

        jButton9.setText("Pin 33");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseReleased(evt);
            }
        });

        jButton10.setLabel("Pin 47");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton10MouseReleased(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jCheckBox69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox69MouseReleased(evt);
            }
        });

        jSlider18.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider18StateChanged(evt);
            }
        });
        jSlider18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider18MousePressed(evt);
            }
        });

        jLabel19.setText("Pin 7");

        jCheckBox70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox70MouseReleased(evt);
            }
        });

        jButton11.setLabel("Pin 20");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton11MouseReleased(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseReleased(evt);
            }
        });

        jButton12.setText("Pin 34");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton12MouseReleased(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox8MouseReleased(evt);
            }
        });

        jButton13.setLabel("Pin 48");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton13MouseReleased(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jCheckBox71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox71MouseReleased(evt);
            }
        });

        jSlider19.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider19StateChanged(evt);
            }
        });
        jSlider19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider19MousePressed(evt);
            }
        });

        jLabel20.setText("Pin 8");

        jCheckBox72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox72MouseReleased(evt);
            }
        });

        jButton14.setLabel("Pin 21");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton14MouseReleased(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox9MouseReleased(evt);
            }
        });

        jButton15.setText("Pin 35");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton15MouseReleased(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox10MouseReleased(evt);
            }
        });

        jButton16.setLabel("Pin 49");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton16MouseReleased(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jCheckBox73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox73MouseReleased(evt);
            }
        });

        jSlider20.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider20StateChanged(evt);
            }
        });
        jSlider20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider20MousePressed(evt);
            }
        });

        jLabel21.setText("Pin 9");

        jCheckBox74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox74MouseReleased(evt);
            }
        });

        jButton17.setLabel("Pin 22");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton17MouseReleased(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseReleased(evt);
            }
        });

        jButton18.setText("Pin 36");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton18MouseReleased(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jCheckBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox12MouseReleased(evt);
            }
        });

        jButton19.setLabel("Pin 50");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton19MouseReleased(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jCheckBox75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox75MouseReleased(evt);
            }
        });

        jSlider21.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider21StateChanged(evt);
            }
        });
        jSlider21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider21MousePressed(evt);
            }
        });

        jLabel22.setText("Pin 10");

        jCheckBox76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox76MouseReleased(evt);
            }
        });

        jButton20.setLabel("Pin 23");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton20MouseReleased(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jCheckBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox13MouseReleased(evt);
            }
        });

        jButton21.setText("Pin 37");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton21MouseReleased(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jCheckBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox14MouseReleased(evt);
            }
        });

        jButton22.setLabel("Pin 51");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton22MouseReleased(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jCheckBox77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox77MouseReleased(evt);
            }
        });

        jSlider22.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider22StateChanged(evt);
            }
        });
        jSlider22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider22MousePressed(evt);
            }
        });

        jLabel23.setText("Pin 11");

        jCheckBox78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox78MouseReleased(evt);
            }
        });

        jButton23.setLabel("Pin 24");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton23MouseReleased(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jCheckBox15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox15MouseReleased(evt);
            }
        });

        jButton24.setText("Pin 38");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton24MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton24MouseReleased(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jCheckBox16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox16MouseReleased(evt);
            }
        });

        jButton25.setLabel("Pin 52");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton25MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton25MouseReleased(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jCheckBox79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox79MouseReleased(evt);
            }
        });

        jSlider23.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider23StateChanged(evt);
            }
        });
        jSlider23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider23MousePressed(evt);
            }
        });

        jLabel24.setText("Pin 12");

        jCheckBox80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox80MouseReleased(evt);
            }
        });

        jButton26.setLabel("Pin 25");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton26MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton26MouseReleased(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jCheckBox17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox17MouseReleased(evt);
            }
        });

        jButton27.setText("Pin 39");
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton27MouseReleased(evt);
            }
        });
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jCheckBox18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox18MouseReleased(evt);
            }
        });

        jButton28.setLabel("Pin 53");
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton28MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton28MouseReleased(evt);
            }
        });
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jCheckBox81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox81MouseReleased(evt);
            }
        });

        jSlider24.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider24StateChanged(evt);
            }
        });
        jSlider24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider24MousePressed(evt);
            }
        });

        jLabel25.setText("Pin 13");

        jCheckBox82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox82MouseReleased(evt);
            }
        });

        jButton29.setLabel("Pin 26");
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton29MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton29MouseReleased(evt);
            }
        });
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jCheckBox19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox19MouseReleased(evt);
            }
        });

        jButton30.setText("Pin 40");
        jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton30MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton30MouseReleased(evt);
            }
        });
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jCheckBox20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox20MouseReleased(evt);
            }
        });

        jButton31.setLabel("Pin 0");
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton31MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton31MouseReleased(evt);
            }
        });
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("Clear");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jCheckBox83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox83MouseReleased(evt);
            }
        });

        jButton33.setText("Pin 27");
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton33MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton33MouseReleased(evt);
            }
        });
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jCheckBox21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox21MouseReleased(evt);
            }
        });

        jButton34.setLabel("Pin 41");
        jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton34MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton34MouseReleased(evt);
            }
        });
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jCheckBox22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox22MouseReleased(evt);
            }
        });

        jButton35.setLabel("Pin 1");
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton35MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton35MouseReleased(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel3.setText("Serial Port");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Port" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("©Dakky 2015  「ダッキ」");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox79)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox77)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox75)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox73)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox69)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox65)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox52)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSlider13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox59)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSlider14, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox63)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSlider15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton38)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton39)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton41)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton42)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton45)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox56, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton41)
                                .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton44)
                                .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton45)
                                .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox66, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox70, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton11)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton12)
                                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox72, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton14)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton15)
                                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox74, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton17)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton18)
                                .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox76, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton20)
                                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton21)
                                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton23)
                                    .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton24)
                                .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton26)
                                    .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton27)
                                .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton29)
                                    .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton30)
                                .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton33)
                                    .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton34)
                                .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton35)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider13, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jCheckBox52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox69, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox75, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSlider24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jCheckBox52 = new javax.swing.JCheckBox();
        jSlider13 = new javax.swing.JSlider();
        jCheckBox53 = new javax.swing.JCheckBox();
        jButton38 = new javax.swing.JButton();
        jCheckBox54 = new javax.swing.JCheckBox();
        jButton39 = new javax.swing.JButton();
        jCheckBox55 = new javax.swing.JCheckBox();
        jButton40 = new javax.swing.JButton();
        jCheckBox56 = new javax.swing.JCheckBox();
        jButton41 = new javax.swing.JButton();
        jCheckBox57 = new javax.swing.JCheckBox();
        jButton42 = new javax.swing.JButton();
        jCheckBox58 = new javax.swing.JCheckBox();
        jButton43 = new javax.swing.JButton();
        jCheckBox59 = new javax.swing.JCheckBox();
        jSlider14 = new javax.swing.JSlider();
        jCheckBox60 = new javax.swing.JCheckBox();
        jButton44 = new javax.swing.JButton();
        jCheckBox61 = new javax.swing.JCheckBox();
        jButton45 = new javax.swing.JButton();
        jCheckBox62 = new javax.swing.JCheckBox();
        jButton46 = new javax.swing.JButton();
        jCheckBox63 = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jSlider15 = new javax.swing.JSlider();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jCheckBox64 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox65 = new javax.swing.JCheckBox();
        jSlider16 = new javax.swing.JSlider();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox66 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jCheckBox67 = new javax.swing.JCheckBox();
        jSlider17 = new javax.swing.JSlider();
        jLabel18 = new javax.swing.JLabel();
        jCheckBox68 = new javax.swing.JCheckBox();
        jButton8 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton9 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jButton10 = new javax.swing.JButton();
        jCheckBox69 = new javax.swing.JCheckBox();
        jSlider18 = new javax.swing.JSlider();
        jLabel19 = new javax.swing.JLabel();
        jCheckBox70 = new javax.swing.JCheckBox();
        jButton11 = new javax.swing.JButton();
        jCheckBox7 = new javax.swing.JCheckBox();
        jButton12 = new javax.swing.JButton();
        jCheckBox8 = new javax.swing.JCheckBox();
        jButton13 = new javax.swing.JButton();
        jCheckBox71 = new javax.swing.JCheckBox();
        jSlider19 = new javax.swing.JSlider();
        jLabel20 = new javax.swing.JLabel();
        jCheckBox72 = new javax.swing.JCheckBox();
        jButton14 = new javax.swing.JButton();
        jCheckBox9 = new javax.swing.JCheckBox();
        jButton15 = new javax.swing.JButton();
        jCheckBox10 = new javax.swing.JCheckBox();
        jButton16 = new javax.swing.JButton();
        jCheckBox73 = new javax.swing.JCheckBox();
        jSlider20 = new javax.swing.JSlider();
        jLabel21 = new javax.swing.JLabel();
        jCheckBox74 = new javax.swing.JCheckBox();
        jButton17 = new javax.swing.JButton();
        jCheckBox11 = new javax.swing.JCheckBox();
        jButton18 = new javax.swing.JButton();
        jCheckBox12 = new javax.swing.JCheckBox();
        jButton19 = new javax.swing.JButton();
        jCheckBox75 = new javax.swing.JCheckBox();
        jSlider21 = new javax.swing.JSlider();
        jLabel22 = new javax.swing.JLabel();
        jCheckBox76 = new javax.swing.JCheckBox();
        jButton20 = new javax.swing.JButton();
        jCheckBox13 = new javax.swing.JCheckBox();
        jButton21 = new javax.swing.JButton();
        jCheckBox14 = new javax.swing.JCheckBox();
        jButton22 = new javax.swing.JButton();
        jCheckBox77 = new javax.swing.JCheckBox();
        jSlider22 = new javax.swing.JSlider();
        jLabel23 = new javax.swing.JLabel();
        jCheckBox78 = new javax.swing.JCheckBox();
        jButton23 = new javax.swing.JButton();
        jCheckBox15 = new javax.swing.JCheckBox();
        jButton24 = new javax.swing.JButton();
        jCheckBox16 = new javax.swing.JCheckBox();
        jButton25 = new javax.swing.JButton();
        jCheckBox79 = new javax.swing.JCheckBox();
        jSlider23 = new javax.swing.JSlider();
        jLabel24 = new javax.swing.JLabel();
        jCheckBox80 = new javax.swing.JCheckBox();
        jButton26 = new javax.swing.JButton();
        jCheckBox17 = new javax.swing.JCheckBox();
        jButton27 = new javax.swing.JButton();
        jCheckBox18 = new javax.swing.JCheckBox();
        jButton28 = new javax.swing.JButton();
        jCheckBox81 = new javax.swing.JCheckBox();
        jSlider24 = new javax.swing.JSlider();
        jLabel25 = new javax.swing.JLabel();
        jCheckBox82 = new javax.swing.JCheckBox();
        jButton29 = new javax.swing.JButton();
        jCheckBox19 = new javax.swing.JCheckBox();
        jButton30 = new javax.swing.JButton();
        jCheckBox20 = new javax.swing.JCheckBox();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jCheckBox83 = new javax.swing.JCheckBox();
        jButton33 = new javax.swing.JButton();
        jCheckBox21 = new javax.swing.JCheckBox();
        jButton34 = new javax.swing.JButton();
        jCheckBox22 = new javax.swing.JCheckBox();
        jButton35 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Arduino Mega Control");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setToolTipText("Serial Data");
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setToolTipText("Input Serial Commands");
        jTextField1.setActionCommand("serialTextSend");

        jButton2.setText("Send");
        jButton2.setActionCommand("");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel2.setText("Baud Rate");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "300", "1200", "2400", "4800", "9600", "14400", "19200", "28800", "38400", "57600", "115200" }));
        jComboBox1.setSelectedIndex(4);
        jComboBox1.setActionCommand("baudChanged");
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jCheckBox52.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBox52StateChanged(evt);
            }
        });
        jCheckBox52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox52MouseReleased(evt);
            }
        });

        jSlider13.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider13StateChanged(evt);
            }
        });
        jSlider13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider13MousePressed(evt);
            }
        });
        jSlider13.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                jSlider13CaretPositionChanged(evt);
            }
        });
        jSlider13.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jSlider13PropertyChange(evt);
            }
        });

        jCheckBox53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox53MouseReleased(evt);
            }
        });
        jCheckBox53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox53ActionPerformed(evt);
            }
        });

        jButton38.setText("Pin 14");
        jButton38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton38MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton38MouseReleased(evt);
            }
        });
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jButton38.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton38KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton38KeyReleased(evt);
            }
        });

        jCheckBox54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox54MouseReleased(evt);
            }
        });

        jButton39.setText("Pin 28");
        jButton39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton39MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton39MouseReleased(evt);
            }
        });
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });

        jCheckBox55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox55MouseReleased(evt);
            }
        });

        jButton40.setLabel("Pin 42");
        jButton40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton40MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton40MouseReleased(evt);
            }
        });
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });

        jCheckBox56.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox56MouseReleased(evt);
            }
        });

        jButton41.setText("Pin 15");
        jButton41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton41MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton41MouseReleased(evt);
            }
        });
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });

        jCheckBox57.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox57MouseReleased(evt);
            }
        });

        jButton42.setText("Pin 29");
        jButton42.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton42MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton42MouseReleased(evt);
            }
        });
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });

        jCheckBox58.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox58MouseReleased(evt);
            }
        });

        jButton43.setLabel("Pin 43");
        jButton43.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton43MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton43MouseReleased(evt);
            }
        });
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });

        jCheckBox59.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox59MouseReleased(evt);
            }
        });

        jSlider14.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider14StateChanged(evt);
            }
        });
        jSlider14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider14MousePressed(evt);
            }
        });

        jCheckBox60.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox60MouseReleased(evt);
            }
        });

        jButton44.setText("Pin 16");
        jButton44.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton44MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton44MouseReleased(evt);
            }
        });
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });

        jCheckBox61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox61MouseReleased(evt);
            }
        });

        jButton45.setText("Pin 30");
        jButton45.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton45MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton45MouseReleased(evt);
            }
        });
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });

        jCheckBox62.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox62MouseReleased(evt);
            }
        });

        jButton46.setLabel("Pin 44");
        jButton46.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton46MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton46MouseReleased(evt);
            }
        });
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });

        jCheckBox63.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox63MouseReleased(evt);
            }
        });

        jLabel14.setText("Pin 2");

        jSlider15.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider15StateChanged(evt);
            }
        });
        jSlider15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider15MousePressed(evt);
            }
        });

        jLabel15.setText("Pin 3");

        jLabel16.setText("Pin 4");

        jCheckBox64.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox64MouseReleased(evt);
            }
        });

        jButton1.setText("Pin 17");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton1MouseReleased(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox1MouseReleased(evt);
            }
        });

        jButton3.setText("Pin 31");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton3MouseReleased(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jCheckBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox2MouseReleased(evt);
            }
        });

        jButton4.setLabel("Pin 45");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton4MouseReleased(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox65.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox65MouseReleased(evt);
            }
        });

        jSlider16.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider16StateChanged(evt);
            }
        });
        jSlider16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider16MousePressed(evt);
            }
        });

        jLabel17.setText("Pin 5");

        jCheckBox66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox66MouseReleased(evt);
            }
        });

        jButton5.setText("Pin 18");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton5MouseReleased(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jCheckBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox3MouseReleased(evt);
            }
        });

        jButton6.setText("Pin 32");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton6MouseReleased(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jCheckBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox4MouseReleased(evt);
            }
        });

        jButton7.setLabel("Pin 46");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton7MouseReleased(evt);
            }
        });
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jCheckBox67.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox67MouseReleased(evt);
            }
        });

        jSlider17.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider17StateChanged(evt);
            }
        });
        jSlider17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider17MousePressed(evt);
            }
        });

        jLabel18.setText("Pin 6");

        jCheckBox68.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox68MouseReleased(evt);
            }
        });

        jButton8.setText("Pin 19");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton8MouseReleased(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jCheckBox5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox5MouseReleased(evt);
            }
        });

        jButton9.setText("Pin 33");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton9MouseReleased(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jCheckBox6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox6MouseReleased(evt);
            }
        });

        jButton10.setLabel("Pin 47");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton10MouseReleased(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jCheckBox69.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox69MouseReleased(evt);
            }
        });

        jSlider18.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider18StateChanged(evt);
            }
        });
        jSlider18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider18MousePressed(evt);
            }
        });

        jLabel19.setText("Pin 7");

        jCheckBox70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox70MouseReleased(evt);
            }
        });

        jButton11.setLabel("Pin 20");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton11MouseReleased(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jCheckBox7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox7MouseReleased(evt);
            }
        });

        jButton12.setText("Pin 34");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton12MouseReleased(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        jCheckBox8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox8MouseReleased(evt);
            }
        });

        jButton13.setLabel("Pin 48");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton13MouseReleased(evt);
            }
        });
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jCheckBox71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox71MouseReleased(evt);
            }
        });

        jSlider19.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider19StateChanged(evt);
            }
        });
        jSlider19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider19MousePressed(evt);
            }
        });

        jLabel20.setText("Pin 8");

        jCheckBox72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox72MouseReleased(evt);
            }
        });

        jButton14.setLabel("Pin 21");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton14MouseReleased(evt);
            }
        });
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        jCheckBox9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox9MouseReleased(evt);
            }
        });

        jButton15.setText("Pin 35");
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton15MouseReleased(evt);
            }
        });
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jCheckBox10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox10MouseReleased(evt);
            }
        });

        jButton16.setLabel("Pin 49");
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton16MouseReleased(evt);
            }
        });
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jCheckBox73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox73MouseReleased(evt);
            }
        });

        jSlider20.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider20StateChanged(evt);
            }
        });
        jSlider20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider20MousePressed(evt);
            }
        });

        jLabel21.setText("Pin 9");

        jCheckBox74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox74MouseReleased(evt);
            }
        });

        jButton17.setLabel("Pin 22");
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton17MouseReleased(evt);
            }
        });
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jCheckBox11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox11MouseReleased(evt);
            }
        });

        jButton18.setText("Pin 36");
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton18MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton18MouseReleased(evt);
            }
        });
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jCheckBox12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox12MouseReleased(evt);
            }
        });

        jButton19.setLabel("Pin 50");
        jButton19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton19MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton19MouseReleased(evt);
            }
        });
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jCheckBox75.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox75MouseReleased(evt);
            }
        });

        jSlider21.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider21StateChanged(evt);
            }
        });
        jSlider21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider21MousePressed(evt);
            }
        });

        jLabel22.setText("Pin 10");

        jCheckBox76.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox76MouseReleased(evt);
            }
        });

        jButton20.setLabel("Pin 23");
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton20MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton20MouseReleased(evt);
            }
        });
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jCheckBox13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox13MouseReleased(evt);
            }
        });

        jButton21.setText("Pin 37");
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton21MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton21MouseReleased(evt);
            }
        });
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jCheckBox14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox14MouseReleased(evt);
            }
        });

        jButton22.setLabel("Pin 51");
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton22MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton22MouseReleased(evt);
            }
        });
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        jCheckBox77.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox77MouseReleased(evt);
            }
        });

        jSlider22.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider22StateChanged(evt);
            }
        });
        jSlider22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider22MousePressed(evt);
            }
        });

        jLabel23.setText("Pin 11");

        jCheckBox78.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox78MouseReleased(evt);
            }
        });

        jButton23.setLabel("Pin 24");
        jButton23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton23MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton23MouseReleased(evt);
            }
        });
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        jCheckBox15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox15MouseReleased(evt);
            }
        });

        jButton24.setText("Pin 38");
        jButton24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton24MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton24MouseReleased(evt);
            }
        });
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jCheckBox16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox16MouseReleased(evt);
            }
        });

        jButton25.setLabel("Pin 52");
        jButton25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton25MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton25MouseReleased(evt);
            }
        });
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jCheckBox79.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox79MouseReleased(evt);
            }
        });

        jSlider23.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider23StateChanged(evt);
            }
        });
        jSlider23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider23MousePressed(evt);
            }
        });

        jLabel24.setText("Pin 12");

        jCheckBox80.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox80MouseReleased(evt);
            }
        });

        jButton26.setLabel("Pin 25");
        jButton26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton26MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton26MouseReleased(evt);
            }
        });
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jCheckBox17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox17MouseReleased(evt);
            }
        });

        jButton27.setText("Pin 39");
        jButton27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton27MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton27MouseReleased(evt);
            }
        });
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        jCheckBox18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox18MouseReleased(evt);
            }
        });

        jButton28.setLabel("Pin 53");
        jButton28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton28MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton28MouseReleased(evt);
            }
        });
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        jCheckBox81.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox81MouseReleased(evt);
            }
        });

        jSlider24.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSlider24StateChanged(evt);
            }
        });
        jSlider24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider24MousePressed(evt);
            }
        });

        jLabel25.setText("Pin 13");

        jCheckBox82.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox82MouseReleased(evt);
            }
        });

        jButton29.setLabel("Pin 26");
        jButton29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton29MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton29MouseReleased(evt);
            }
        });
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });

        jCheckBox19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox19MouseReleased(evt);
            }
        });

        jButton30.setText("Pin 40");
        jButton30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton30MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton30MouseReleased(evt);
            }
        });
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });

        jCheckBox20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox20MouseReleased(evt);
            }
        });

        jButton31.setLabel("Pin 0");
        jButton31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton31MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton31MouseReleased(evt);
            }
        });
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });

        jButton32.setText("Clear");
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });

        jCheckBox83.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox83MouseReleased(evt);
            }
        });

        jButton33.setText("Pin 27");
        jButton33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton33MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton33MouseReleased(evt);
            }
        });
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });

        jCheckBox21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox21MouseReleased(evt);
            }
        });

        jButton34.setLabel("Pin 41");
        jButton34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton34MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton34MouseReleased(evt);
            }
        });
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });

        jCheckBox22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCheckBox22MouseReleased(evt);
            }
        });

        jButton35.setLabel("Pin 1");
        jButton35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton35MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jButton35MouseReleased(evt);
            }
        });
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });

        jLabel3.setText("Serial Port");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Port" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("©Dakky 2015  「ダッキ」");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton32))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox79)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox77)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox75)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox73)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox71)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox69)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox67)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jCheckBox65)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox52)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSlider13, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox59)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSlider14, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCheckBox63)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jSlider15, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCheckBox81)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jSlider24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox83)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton33)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton34)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox82)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton29)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton30)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox66)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox68)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton9)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton11)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox72)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton14)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton15)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton16))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox74)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton17)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton19))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox76)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton21)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton22))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox78)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton23)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton24)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton25))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox80)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton26)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton27)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton38)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton39)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton40))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton41)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton42)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton43))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton44)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton45)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton46))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jCheckBox2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton43))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox53, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox54, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox55, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox56, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton41)
                                .addComponent(jCheckBox57, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox58, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jCheckBox60, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton44)
                                .addComponent(jCheckBox61, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton45)
                                .addComponent(jCheckBox62, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox64, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton1)
                                    .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jCheckBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton4))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox66, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton5)
                                    .addComponent(jCheckBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox68, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton8)
                                    .addComponent(jCheckBox5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton9)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox70, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton11)
                                    .addComponent(jCheckBox7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton12)
                                .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox72, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton14)
                                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton15)
                                .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox74, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton17)
                                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton18)
                                .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton19))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox76, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton20)
                                    .addComponent(jCheckBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton21)
                                .addComponent(jCheckBox14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton22))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox78, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton23)
                                    .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton24)
                                .addComponent(jCheckBox16, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton25))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox80, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton26)
                                    .addComponent(jCheckBox17, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton27)
                                .addComponent(jCheckBox18, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox82, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton29)
                                    .addComponent(jCheckBox19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton30)
                                .addComponent(jCheckBox20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBox83, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton33)
                                    .addComponent(jCheckBox21, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton34)
                                .addComponent(jCheckBox22, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton35)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSlider13, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(jCheckBox52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox59, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSlider15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCheckBox63, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox65, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox67, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox69, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox71, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox73, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox75, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox77, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSlider23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jCheckBox79, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jSlider24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox81, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton32))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        jCheckBox3.setSelected(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jCheckBox53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox53ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox53ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        jCheckBox53.setSelected(false);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        jCheckBox56.setSelected(false);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        jCheckBox60.setSelected(false);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jCheckBox64.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jCheckBox66.setSelected(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        jCheckBox68.setSelected(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        jCheckBox70.setSelected(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        jCheckBox72.setSelected(false);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        jCheckBox74.setSelected(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        jCheckBox76.setSelected(false);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        jCheckBox78.setSelected(false);
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        jCheckBox80.setSelected(false);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        jCheckBox82.setSelected(false);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        jTextArea1.setText("");
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton38KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton38KeyPressed

    }//GEN-LAST:event_jButton38KeyPressed

    private void jButton38KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton38KeyReleased

    }//GEN-LAST:event_jButton38KeyReleased

    private void jButton38MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton38MousePressed
        serialSend("14001");
    }//GEN-LAST:event_jButton38MousePressed

    private void jButton38MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton38MouseReleased
        serialSend("14000");
    }//GEN-LAST:event_jButton38MouseReleased

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String serText = removeLeadSpace(jTextField1.getText());
        if(!"".equals(serText)) {
                serialSend(serText);
        } else {
        }
        jTextField1.setText("");
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        jCheckBox54.setSelected(false);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        jCheckBox57.setSelected(false);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        jCheckBox61.setSelected(false);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        jCheckBox5.setSelected(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        jCheckBox7.setSelected(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        jCheckBox9.setSelected(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        jCheckBox11.setSelected(false);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        jCheckBox13.setSelected(false);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        jCheckBox15.setSelected(false);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        jCheckBox17.setSelected(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        jCheckBox19.setSelected(false);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        jCheckBox55.setSelected(false);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        jCheckBox58.setSelected(false);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        jCheckBox62.setSelected(false);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        jCheckBox2.setSelected(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jCheckBox4.setSelected(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        jCheckBox6.setSelected(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        jCheckBox8.setSelected(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        jCheckBox10.setSelected(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        jCheckBox12.setSelected(false);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        jCheckBox14.setSelected(false);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        jCheckBox16.setSelected(false);
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        jCheckBox18.setSelected(false);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        jCheckBox20.setSelected(false);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton41MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MousePressed
        serialSend("15001");
    }//GEN-LAST:event_jButton41MousePressed

    private void jButton41MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton41MouseReleased
        serialSend("15000");
    }//GEN-LAST:event_jButton41MouseReleased

    private void jButton44MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MousePressed
        serialSend("16001");
    }//GEN-LAST:event_jButton44MousePressed

    private void jButton44MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton44MouseReleased
        serialSend("16000");
    }//GEN-LAST:event_jButton44MouseReleased

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        serialSend("17001");
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseReleased
        serialSend("17000");
    }//GEN-LAST:event_jButton1MouseReleased

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        serialSend("18001");
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseReleased
        serialSend("18000");
    }//GEN-LAST:event_jButton5MouseReleased

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        serialSend("19001");
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseReleased
        serialSend("19000");
    }//GEN-LAST:event_jButton8MouseReleased

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
        serialSend("20001");
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseReleased
        serialSend("20000");
    }//GEN-LAST:event_jButton11MouseReleased

    private void jButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MousePressed
        serialSend("21001");
    }//GEN-LAST:event_jButton14MousePressed

    private void jButton14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseReleased
        serialSend("21000");
    }//GEN-LAST:event_jButton14MouseReleased

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MousePressed
        serialSend("22001");
    }//GEN-LAST:event_jButton17MousePressed

    private void jButton17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MouseReleased
        serialSend("22000");
    }//GEN-LAST:event_jButton17MouseReleased

    private void jButton20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MousePressed
        serialSend("23001");
    }//GEN-LAST:event_jButton20MousePressed

    private void jButton20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseReleased
        serialSend("23000");
    }//GEN-LAST:event_jButton20MouseReleased

    private void jButton23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MousePressed
        serialSend("24001");
    }//GEN-LAST:event_jButton23MousePressed

    private void jButton23MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton23MouseReleased
        serialSend("24000");
    }//GEN-LAST:event_jButton23MouseReleased

    private void jButton26MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MousePressed
        serialSend("25001");
    }//GEN-LAST:event_jButton26MousePressed

    private void jButton26MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton26MouseReleased
        serialSend("25000");
    }//GEN-LAST:event_jButton26MouseReleased

    private void jButton29MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MousePressed
        serialSend("26001");
    }//GEN-LAST:event_jButton29MousePressed

    private void jButton29MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton29MouseReleased
        serialSend("26000");
    }//GEN-LAST:event_jButton29MouseReleased

    private void jButton39MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton39MousePressed
        serialSend("28001");
    }//GEN-LAST:event_jButton39MousePressed

    private void jButton39MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton39MouseReleased
        serialSend("28000");
    }//GEN-LAST:event_jButton39MouseReleased

    private void jButton42MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MousePressed
        serialSend("29001");
    }//GEN-LAST:event_jButton42MousePressed

    private void jButton42MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton42MouseReleased
        serialSend("29000");
    }//GEN-LAST:event_jButton42MouseReleased

    private void jButton45MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MousePressed
        serialSend("30001");
    }//GEN-LAST:event_jButton45MousePressed

    private void jButton45MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton45MouseReleased
        serialSend("30000");
    }//GEN-LAST:event_jButton45MouseReleased

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        serialSend("31001");
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseReleased
        serialSend("31000");
    }//GEN-LAST:event_jButton3MouseReleased

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        serialSend("32001");
    }//GEN-LAST:event_jButton6MousePressed

    private void jButton6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseReleased
        serialSend("32000");
    }//GEN-LAST:event_jButton6MouseReleased

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        serialSend("33001");
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseReleased
        serialSend("33000");
    }//GEN-LAST:event_jButton9MouseReleased

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        serialSend("34001");
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseReleased
        serialSend("34000");
    }//GEN-LAST:event_jButton12MouseReleased

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MousePressed
        serialSend("35001");
    }//GEN-LAST:event_jButton15MousePressed

    private void jButton15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MouseReleased
        serialSend("35000");
    }//GEN-LAST:event_jButton15MouseReleased

    private void jButton18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MousePressed
        serialSend("36001");
    }//GEN-LAST:event_jButton18MousePressed

    private void jButton18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MouseReleased
        serialSend("36000");
    }//GEN-LAST:event_jButton18MouseReleased

    private void jButton21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MousePressed
        serialSend("37001");
    }//GEN-LAST:event_jButton21MousePressed

    private void jButton21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseReleased
        serialSend("37000");
    }//GEN-LAST:event_jButton21MouseReleased

    private void jButton24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MousePressed
        serialSend("38001");
    }//GEN-LAST:event_jButton24MousePressed

    private void jButton24MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton24MouseReleased
        serialSend("38000");
    }//GEN-LAST:event_jButton24MouseReleased

    private void jButton27MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MousePressed
        serialSend("39001");
    }//GEN-LAST:event_jButton27MousePressed

    private void jButton27MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton27MouseReleased
        serialSend("39000");
    }//GEN-LAST:event_jButton27MouseReleased

    private void jButton30MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton30MousePressed
        serialSend("40001");
    }//GEN-LAST:event_jButton30MousePressed

    private void jButton30MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton30MouseReleased
        serialSend("40000");
    }//GEN-LAST:event_jButton30MouseReleased

    private void jButton40MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MousePressed
        serialSend("42001");
    }//GEN-LAST:event_jButton40MousePressed

    private void jButton40MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton40MouseReleased
        serialSend("42000");
    }//GEN-LAST:event_jButton40MouseReleased

    private void jButton43MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton43MousePressed
        serialSend("43001");
    }//GEN-LAST:event_jButton43MousePressed

    private void jButton43MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton43MouseReleased
        serialSend("43000");
    }//GEN-LAST:event_jButton43MouseReleased

    private void jButton46MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton46MousePressed
        serialSend("44001");
    }//GEN-LAST:event_jButton46MousePressed

    private void jButton46MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton46MouseReleased
        serialSend("44000");
    }//GEN-LAST:event_jButton46MouseReleased

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        serialSend("45001");
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseReleased
        serialSend("45000");
    }//GEN-LAST:event_jButton4MouseReleased

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        serialSend("46001");
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseReleased
        serialSend("46000");
    }//GEN-LAST:event_jButton7MouseReleased

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        serialSend("47001");
    }//GEN-LAST:event_jButton10MousePressed

    private void jButton10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseReleased
        serialSend("47000");
    }//GEN-LAST:event_jButton10MouseReleased

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        serialSend("48001");
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseReleased
        serialSend("48000");
    }//GEN-LAST:event_jButton13MouseReleased

    private void jButton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MousePressed
        serialSend("49001");
    }//GEN-LAST:event_jButton16MousePressed

    private void jButton16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MouseReleased
        serialSend("49000");
    }//GEN-LAST:event_jButton16MouseReleased

    private void jButton19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MousePressed
        serialSend("50001");
    }//GEN-LAST:event_jButton19MousePressed

    private void jButton19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton19MouseReleased
        serialSend("50000");
    }//GEN-LAST:event_jButton19MouseReleased

    private void jButton22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MousePressed
        serialSend("51001");
    }//GEN-LAST:event_jButton22MousePressed

    private void jButton22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseReleased
        serialSend("51000");
    }//GEN-LAST:event_jButton22MouseReleased

    private void jButton25MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MousePressed
        serialSend("52001");
    }//GEN-LAST:event_jButton25MousePressed

    private void jButton25MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton25MouseReleased
        serialSend("52000");
    }//GEN-LAST:event_jButton25MouseReleased

    private void jButton28MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MousePressed
        serialSend("53001");
    }//GEN-LAST:event_jButton28MousePressed

    private void jButton28MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton28MouseReleased
        serialSend("53000");
    }//GEN-LAST:event_jButton28MouseReleased

    private void jButton31MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MousePressed
        serialSend("00001");
    }//GEN-LAST:event_jButton31MousePressed

    private void jButton31MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton31MouseReleased
        serialSend("00000");
    }//GEN-LAST:event_jButton31MouseReleased

    private void jButton33MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MousePressed
        serialSend("27001");
    }//GEN-LAST:event_jButton33MousePressed

    private void jButton33MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton33MouseReleased
        serialSend("27000");
    }//GEN-LAST:event_jButton33MouseReleased

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        jCheckBox83.setSelected(false);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton34MousePressed
        serialSend("41001");
    }//GEN-LAST:event_jButton34MousePressed

    private void jButton34MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton34MouseReleased
        serialSend("41000");
    }//GEN-LAST:event_jButton34MouseReleased

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        jCheckBox21.setSelected(false);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MousePressed
        serialSend("01001");
    }//GEN-LAST:event_jButton35MousePressed

    private void jButton35MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton35MouseReleased
        serialSend("01000");
    }//GEN-LAST:event_jButton35MouseReleased

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        jCheckBox22.setSelected(false);
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jComboBox2PopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeVisible
        jComboBox2.setModel(new DefaultComboBoxModel(serialPort.getPorts()));
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeVisible

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
        serialPort.connectPort(String.valueOf(jComboBox2.getSelectedItem()));
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jSlider13CaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jSlider13CaretPositionChanged
        
    }//GEN-LAST:event_jSlider13CaretPositionChanged

    private void jSlider13PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jSlider13PropertyChange
     
    }//GEN-LAST:event_jSlider13PropertyChange

    private void jSlider13StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider13StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider13.getValue() == 0){
            
            serialSend("02" + String.format("%03d", jSlider13.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
        
    }//GEN-LAST:event_jSlider13StateChanged

    private void jSlider13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider13MousePressed
        serialSend("02" + String.format("%03d", jSlider13.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox52.setSelected(false);
    }//GEN-LAST:event_jSlider13MousePressed

    private void jSlider14StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider14StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider14.getValue() == 0){
            
            serialSend("03" + String.format("%03d", jSlider14.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider14StateChanged

    private void jSlider14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider14MousePressed
        serialSend("03" + String.format("%03d", jSlider14.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox59.setSelected(false);
    }//GEN-LAST:event_jSlider14MousePressed

    private void jSlider15StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider15StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider15.getValue() == 0){
            
            serialSend("04" + String.format("%03d", jSlider15.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider15StateChanged

    private void jSlider15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider15MousePressed
        serialSend("04" + String.format("%03d", jSlider15.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox63.setSelected(false);
    }//GEN-LAST:event_jSlider15MousePressed

    private void jSlider16StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider16StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider16.getValue() == 0){
            
            serialSend("05" + String.format("%03d", jSlider16.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider16StateChanged

    private void jSlider16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider16MousePressed
        serialSend("05" + String.format("%03d", jSlider16.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox65.setSelected(false);
    }//GEN-LAST:event_jSlider16MousePressed

    private void jSlider17StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider17StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider17.getValue() == 0){
            
            serialSend("06" + String.format("%03d", jSlider17.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider17StateChanged

    private void jSlider17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider17MousePressed
        serialSend("06" + String.format("%03d", jSlider17.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox67.setSelected(false);
    }//GEN-LAST:event_jSlider17MousePressed

    private void jSlider18StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider18StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider18.getValue() == 0){
            
            serialSend("07" + String.format("%03d", jSlider18.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider18StateChanged

    private void jSlider18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider18MousePressed
        serialSend("07" + String.format("%03d", jSlider18.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox69.setSelected(false);
    }//GEN-LAST:event_jSlider18MousePressed

    private void jSlider19StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider19StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider19.getValue() == 0){
            
            serialSend("08" + String.format("%03d", jSlider19.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider19StateChanged

    private void jSlider19MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider19MousePressed
        serialSend("08" + String.format("%03d", jSlider19.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox71.setSelected(false);
    }//GEN-LAST:event_jSlider19MousePressed

    private void jSlider20StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider20StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider20.getValue() == 0){
            
            serialSend("09" + String.format("%03d", jSlider20.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider20StateChanged

    private void jSlider20MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider20MousePressed
        serialSend("09" + String.format("%03d", jSlider20.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox73.setSelected(false);
    }//GEN-LAST:event_jSlider20MousePressed

    private void jSlider21StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider21StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider21.getValue() == 0){
            
            serialSend("10" + String.format("%03d", jSlider21.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider21StateChanged

    private void jSlider21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider21MousePressed
        serialSend("10" + String.format("%03d", jSlider21.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox75.setSelected(false);
    }//GEN-LAST:event_jSlider21MousePressed

    private void jSlider22StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider22StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider22.getValue() == 0){
            
            serialSend("11" + String.format("%03d", jSlider22.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider22StateChanged

    private void jSlider22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider22MousePressed
        serialSend("11" + String.format("%03d", jSlider22.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox77.setSelected(false);
    }//GEN-LAST:event_jSlider22MousePressed

    private void jSlider23StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider23StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider23.getValue() == 0){
            
            serialSend("12" + String.format("%03d", jSlider23.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider23StateChanged

    private void jSlider23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider23MousePressed
        serialSend("12" + String.format("%03d", jSlider23.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox79.setSelected(false);
    }//GEN-LAST:event_jSlider23MousePressed

    private void jSlider24StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSlider24StateChanged
        if(System.currentTimeMillis() - lastTime >= 100 || jSlider24.getValue() == 0){
            
            serialSend("13" + String.format("%03d", jSlider24.getValue()));
            
            lastTime = System.currentTimeMillis();
            
        }
    }//GEN-LAST:event_jSlider24StateChanged

    private void jSlider24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider24MousePressed
        serialSend("13" + String.format("%03d", jSlider24.getValue()));
        lastTime = System.currentTimeMillis();
        jCheckBox81.setSelected(false);
    }//GEN-LAST:event_jSlider24MousePressed

    private void jCheckBox52StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBox52StateChanged
        
    }//GEN-LAST:event_jCheckBox52StateChanged

    private void jCheckBox52MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox52MouseReleased
        if(jCheckBox52.isSelected()){
            serialSend("02255");
        }
        else
            serialSend("02000");
    }//GEN-LAST:event_jCheckBox52MouseReleased

    private void jCheckBox59MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox59MouseReleased
        if(jCheckBox59.isSelected()){
            serialSend("03255");
        }
        else
            serialSend("03000");
    }//GEN-LAST:event_jCheckBox59MouseReleased

    private void jCheckBox63MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox63MouseReleased
        if(jCheckBox63.isSelected()){
            serialSend("04255");
        }
        else
            serialSend("04000");
    }//GEN-LAST:event_jCheckBox63MouseReleased

    private void jCheckBox65MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox65MouseReleased
        if(jCheckBox65.isSelected()){
            serialSend("05255");
        }
        else
            serialSend("05000");
    }//GEN-LAST:event_jCheckBox65MouseReleased

    private void jCheckBox67MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox67MouseReleased
        if(jCheckBox67.isSelected()){
            serialSend("06255");
        }
        else
            serialSend("06000");
    }//GEN-LAST:event_jCheckBox67MouseReleased

    private void jCheckBox69MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox69MouseReleased
        if(jCheckBox69.isSelected()){
            serialSend("07255");
        }
        else
            serialSend("07000");
    }//GEN-LAST:event_jCheckBox69MouseReleased

    private void jCheckBox71MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox71MouseReleased
        if(jCheckBox71.isSelected()){
            serialSend("08255");
        }
        else
            serialSend("08000");
    }//GEN-LAST:event_jCheckBox71MouseReleased

    private void jCheckBox73MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox73MouseReleased
        if(jCheckBox73.isSelected()){
            serialSend("09255");
        }
        else
            serialSend("09000");
    }//GEN-LAST:event_jCheckBox73MouseReleased

    private void jCheckBox75MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox75MouseReleased
        if(jCheckBox75.isSelected()){
            serialSend("10255");
        }
        else
            serialSend("10000");
    }//GEN-LAST:event_jCheckBox75MouseReleased

    private void jCheckBox77MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox77MouseReleased
        if(jCheckBox77.isSelected()){
            serialSend("11255");
        }
        else
            serialSend("11000");
    }//GEN-LAST:event_jCheckBox77MouseReleased

    private void jCheckBox79MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox79MouseReleased
        if(jCheckBox79.isSelected()){
            serialSend("12255");
        }
        else
            serialSend("12000");
    }//GEN-LAST:event_jCheckBox79MouseReleased

    private void jCheckBox81MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox81MouseReleased
        if(jCheckBox81.isSelected()){
            serialSend("13255");
        }
        else
            serialSend("13000");
    }//GEN-LAST:event_jCheckBox81MouseReleased

    private void jCheckBox53MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox53MouseReleased
        if(jCheckBox53.isSelected()){
            serialSend("14255");
        }
        else
            serialSend("14000");
    }//GEN-LAST:event_jCheckBox53MouseReleased

    private void jCheckBox56MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox56MouseReleased
        if(jCheckBox56.isSelected()){
            serialSend("15255");
        }
        else
            serialSend("15000");
    }//GEN-LAST:event_jCheckBox56MouseReleased

    private void jCheckBox60MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox60MouseReleased
        if(jCheckBox60.isSelected()){
            serialSend("16255");
        }
        else
            serialSend("16000");
    }//GEN-LAST:event_jCheckBox60MouseReleased

    private void jCheckBox64MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox64MouseReleased
        if(jCheckBox64.isSelected()){
            serialSend("17255");
        }
        else
            serialSend("17000");
    }//GEN-LAST:event_jCheckBox64MouseReleased

    private void jCheckBox66MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox66MouseReleased
        if(jCheckBox66.isSelected()){
            serialSend("18255");
        }
        else
            serialSend("18000");
    }//GEN-LAST:event_jCheckBox66MouseReleased

    private void jCheckBox68MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox68MouseReleased
        if(jCheckBox68.isSelected()){
            serialSend("19255");
        }
        else
            serialSend("19000");
    }//GEN-LAST:event_jCheckBox68MouseReleased

    private void jCheckBox70MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox70MouseReleased
        if(jCheckBox70.isSelected()){
            serialSend("20255");
        }
        else
            serialSend("20000");
    }//GEN-LAST:event_jCheckBox70MouseReleased

    private void jCheckBox72MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox72MouseReleased
        if(jCheckBox72.isSelected()){
            serialSend("21255");
        }
        else
            serialSend("21000");
    }//GEN-LAST:event_jCheckBox72MouseReleased

    private void jCheckBox74MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox74MouseReleased
        if(jCheckBox74.isSelected()){
            serialSend("22255");
        }
        else
            serialSend("22000");
    }//GEN-LAST:event_jCheckBox74MouseReleased

    private void jCheckBox76MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox76MouseReleased
        if(jCheckBox76.isSelected()){
            serialSend("23255");
        }
        else
            serialSend("23000");
    }//GEN-LAST:event_jCheckBox76MouseReleased

    private void jCheckBox78MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox78MouseReleased
        if(jCheckBox78.isSelected()){
            serialSend("24255");
        }
        else
            serialSend("24000");
    }//GEN-LAST:event_jCheckBox78MouseReleased

    private void jCheckBox80MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox80MouseReleased
        if(jCheckBox80.isSelected()){
            serialSend("25255");
        }
        else
            serialSend("25000");
    }//GEN-LAST:event_jCheckBox80MouseReleased

    private void jCheckBox82MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox82MouseReleased
        if(jCheckBox82.isSelected()){
            serialSend("26255");
        }
        else
            serialSend("26000");
    }//GEN-LAST:event_jCheckBox82MouseReleased

    private void jCheckBox83MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox83MouseReleased
        if(jCheckBox83.isSelected()){
            serialSend("27255");
        }
        else
            serialSend("27000");
    }//GEN-LAST:event_jCheckBox83MouseReleased

    private void jCheckBox54MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox54MouseReleased
        if(jCheckBox54.isSelected()){
            serialSend("28255");
        }
        else
            serialSend("28000");
    }//GEN-LAST:event_jCheckBox54MouseReleased

    private void jCheckBox57MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox57MouseReleased
        if(jCheckBox57.isSelected()){
            serialSend("29255");
        }
        else
            serialSend("29000");
    }//GEN-LAST:event_jCheckBox57MouseReleased

    private void jCheckBox61MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox61MouseReleased
        if(jCheckBox61.isSelected()){
            serialSend("30255");
        }
        else
            serialSend("30000");
    }//GEN-LAST:event_jCheckBox61MouseReleased

    private void jCheckBox1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MouseReleased
        if(jCheckBox1.isSelected()){
            serialSend("31255");
        }
        else
            serialSend("31000");
    }//GEN-LAST:event_jCheckBox1MouseReleased

    private void jCheckBox3MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox3MouseReleased
        if(jCheckBox3.isSelected()){
            serialSend("32255");
        }
        else
            serialSend("32000");
    }//GEN-LAST:event_jCheckBox3MouseReleased

    private void jCheckBox5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox5MouseReleased
        if(jCheckBox5.isSelected()){
            serialSend("33255");
        }
        else
            serialSend("33000");
    }//GEN-LAST:event_jCheckBox5MouseReleased

    private void jCheckBox7MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox7MouseReleased
        if(jCheckBox7.isSelected()){
            serialSend("34255");
        }
        else
            serialSend("34000");
    }//GEN-LAST:event_jCheckBox7MouseReleased

    private void jCheckBox9MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox9MouseReleased
        if(jCheckBox9.isSelected()){
            serialSend("35255");
        }
        else
            serialSend("35000");
    }//GEN-LAST:event_jCheckBox9MouseReleased

    private void jCheckBox11MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox11MouseReleased
        if(jCheckBox11.isSelected()){
            serialSend("36255");
        }
        else
            serialSend("36000");
    }//GEN-LAST:event_jCheckBox11MouseReleased

    private void jCheckBox13MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox13MouseReleased
        if(jCheckBox13.isSelected()){
            serialSend("37255");
        }
        else
            serialSend("37000");
    }//GEN-LAST:event_jCheckBox13MouseReleased

    private void jCheckBox15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox15MouseReleased
        if(jCheckBox15.isSelected()){
            serialSend("38255");
        }
        else
            serialSend("38000");
    }//GEN-LAST:event_jCheckBox15MouseReleased

    private void jCheckBox17MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox17MouseReleased
        if(jCheckBox17.isSelected()){
            serialSend("39255");
        }
        else
            serialSend("39000");
    }//GEN-LAST:event_jCheckBox17MouseReleased

    private void jCheckBox19MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox19MouseReleased
        if(jCheckBox19.isSelected()){
            serialSend("40255");
        }
        else
            serialSend("40000");
    }//GEN-LAST:event_jCheckBox19MouseReleased

    private void jCheckBox21MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox21MouseReleased
        if(jCheckBox21.isSelected()){
            serialSend("41255");
        }
        else
            serialSend("41000");
    }//GEN-LAST:event_jCheckBox21MouseReleased

    private void jCheckBox55MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox55MouseReleased
        if(jCheckBox55.isSelected()){
            serialSend("42255");
        }
        else
            serialSend("42000");
    }//GEN-LAST:event_jCheckBox55MouseReleased

    private void jCheckBox58MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox58MouseReleased
        if(jCheckBox58.isSelected()){
            serialSend("43255");
        }
        else
            serialSend("43000");
    }//GEN-LAST:event_jCheckBox58MouseReleased

    private void jCheckBox62MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox62MouseReleased
        if(jCheckBox62.isSelected()){
            serialSend("44255");
        }
        else
            serialSend("44000");
    }//GEN-LAST:event_jCheckBox62MouseReleased

    private void jCheckBox2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox2MouseReleased
        if(jCheckBox2.isSelected()){
            serialSend("45255");
        }
        else
            serialSend("45000");
    }//GEN-LAST:event_jCheckBox2MouseReleased

    private void jCheckBox4MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox4MouseReleased
        if(jCheckBox4.isSelected()){
            serialSend("46255");
        }
        else
            serialSend("46000");
    }//GEN-LAST:event_jCheckBox4MouseReleased

    private void jCheckBox6MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox6MouseReleased
        if(jCheckBox6.isSelected()){
            serialSend("47255");
        }
        else
            serialSend("47000");
    }//GEN-LAST:event_jCheckBox6MouseReleased

    private void jCheckBox8MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox8MouseReleased
        if(jCheckBox8.isSelected()){
            serialSend("48255");
        }
        else
            serialSend("48000");
    }//GEN-LAST:event_jCheckBox8MouseReleased

    private void jCheckBox10MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox10MouseReleased
        if(jCheckBox10.isSelected()){
            serialSend("49255");
        }
        else
            serialSend("49000");
    }//GEN-LAST:event_jCheckBox10MouseReleased

    private void jCheckBox12MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox12MouseReleased
        if(jCheckBox12.isSelected()){
            serialSend("50255");
        }
        else
            serialSend("50000");
    }//GEN-LAST:event_jCheckBox12MouseReleased

    private void jCheckBox14MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox14MouseReleased
        if(jCheckBox14.isSelected()){
            serialSend("51255");
        }
        else
            serialSend("51000");
    }//GEN-LAST:event_jCheckBox14MouseReleased

    private void jCheckBox16MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox16MouseReleased
        if(jCheckBox16.isSelected()){
            serialSend("52255");
        }
        else
            serialSend("52000");
    }//GEN-LAST:event_jCheckBox16MouseReleased

    private void jCheckBox18MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox18MouseReleased
        if(jCheckBox18.isSelected()){
            serialSend("53255");
        }
        else
            serialSend("53000");
    }//GEN-LAST:event_jCheckBox18MouseReleased

    private void jCheckBox20MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox20MouseReleased
        if(jCheckBox20.isSelected()){
            serialSend("00255");
        }
        else
            serialSend("00000");
    }//GEN-LAST:event_jCheckBox20MouseReleased

    private void jCheckBox22MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox22MouseReleased
        if(jCheckBox22.isSelected()){
            serialSend("01255");
        }
        else
            serialSend("01000");
    }//GEN-LAST:event_jCheckBox22MouseReleased

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MainScreen().setVisible(true);
        });
    }

    private void serialSend(String serialCommand){
        jTextArea1.setText(jTextArea1.getText() + serialCommand + "\n");
        serialPort.writeData(serialCommand + "\n");
    }

    private String removeLeadSpace(String inText){
        int charInd = 0;
        while(inText != null && charInd < inText.length() && inText.charAt(charInd) == ' '){
            charInd++;
        }
        if(inText != null){
            inText = inText.substring(charInd);
            return inText;
        }
        else
            return "";
    }
    
    public void updateSerial() throws SerialPortException{
        if(serialPort != null
                && !"none".equals(serialPort.getSerialText())
                && !"".equals(serialPort.getSerialText())){
            jTextArea1.setText(jTextArea1.getText() + serialPort.getSerialText());
        }
        serialPort.clearBuffer();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox18;
    private javax.swing.JCheckBox jCheckBox19;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox20;
    private javax.swing.JCheckBox jCheckBox21;
    private javax.swing.JCheckBox jCheckBox22;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox52;
    private javax.swing.JCheckBox jCheckBox53;
    private javax.swing.JCheckBox jCheckBox54;
    private javax.swing.JCheckBox jCheckBox55;
    private javax.swing.JCheckBox jCheckBox56;
    private javax.swing.JCheckBox jCheckBox57;
    private javax.swing.JCheckBox jCheckBox58;
    private javax.swing.JCheckBox jCheckBox59;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox60;
    private javax.swing.JCheckBox jCheckBox61;
    private javax.swing.JCheckBox jCheckBox62;
    private javax.swing.JCheckBox jCheckBox63;
    private javax.swing.JCheckBox jCheckBox64;
    private javax.swing.JCheckBox jCheckBox65;
    private javax.swing.JCheckBox jCheckBox66;
    private javax.swing.JCheckBox jCheckBox67;
    private javax.swing.JCheckBox jCheckBox68;
    private javax.swing.JCheckBox jCheckBox69;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox70;
    private javax.swing.JCheckBox jCheckBox71;
    private javax.swing.JCheckBox jCheckBox72;
    private javax.swing.JCheckBox jCheckBox73;
    private javax.swing.JCheckBox jCheckBox74;
    private javax.swing.JCheckBox jCheckBox75;
    private javax.swing.JCheckBox jCheckBox76;
    private javax.swing.JCheckBox jCheckBox77;
    private javax.swing.JCheckBox jCheckBox78;
    private javax.swing.JCheckBox jCheckBox79;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox80;
    private javax.swing.JCheckBox jCheckBox81;
    private javax.swing.JCheckBox jCheckBox82;
    private javax.swing.JCheckBox jCheckBox83;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider13;
    private javax.swing.JSlider jSlider14;
    private javax.swing.JSlider jSlider15;
    private javax.swing.JSlider jSlider16;
    private javax.swing.JSlider jSlider17;
    private javax.swing.JSlider jSlider18;
    private javax.swing.JSlider jSlider19;
    private javax.swing.JSlider jSlider20;
    private javax.swing.JSlider jSlider21;
    private javax.swing.JSlider jSlider22;
    private javax.swing.JSlider jSlider23;
    private javax.swing.JSlider jSlider24;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    private SerialCommSys serialPort;
    private long lastTime = 0;
}
