package revision;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Revision extends JFrame {

   // Variables declaration - do not modify
   private JButton btnExit;
   private JButton btnReset;
   private JButton btnTotal;
   private JCheckBox chkMouse;
   private JCheckBox chkUSB;
   private JCheckBox chkCharger;
   private JLabel jLabel1;
   private JScrollPane jScrollPane1;
   private JTextArea txtAreaDisplay;
   private JTextField txtCharger;
   private JTextField txtDiscount;
   private JTextField txtMouse;
   private JTextField txtUSB;

   // End of variables declaration
   public Revision() {
       txtMouse = new JTextField();
       chkMouse = new JCheckBox();
       chkUSB = new JCheckBox();
       txtUSB = new JTextField();
       chkCharger = new JCheckBox();
       txtCharger = new JTextField();
       txtDiscount = new JTextField();
       jLabel1 = new JLabel();
       btnTotal = new JButton();
       btnReset = new JButton();
       btnExit = new JButton();
       jScrollPane1 = new JScrollPane();
       txtAreaDisplay = new JTextArea();

       GridBagConstraints gridBagConstraints; //gridbag layout



       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setPreferredSize(new java.awt.Dimension(350, 400)); //set the frame dimension
       getContentPane().setLayout(new GridBagLayout()); //gridbag layout

       txtMouse.setEnabled(false);
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 0;
       gridBagConstraints.gridwidth = 2;
       gridBagConstraints.gridheight = 2;
       gridBagConstraints.ipadx = 90;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(27, 34, 0, 0);
       getContentPane().add(txtMouse, gridBagConstraints);

       chkMouse.setText("Mouse @10 each");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 2;
       gridBagConstraints.gridy = 0;
       gridBagConstraints.gridwidth = 11;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(28, 6, 0, 0);
       getContentPane().add(chkMouse, gridBagConstraints);

       chkUSB.setText("USB @10 each");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 2;
       gridBagConstraints.gridy = 2;
       gridBagConstraints.gridwidth = 6;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(7, 6, 0, 0);
       getContentPane().add(chkUSB, gridBagConstraints);

       txtUSB.setEnabled(false);
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 2;
       gridBagConstraints.gridwidth = 2;
       gridBagConstraints.gridheight = 2;
       gridBagConstraints.ipadx = 90;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(6, 34, 0, 0);
       getContentPane().add(txtUSB, gridBagConstraints);

       chkCharger.setText("Charger @15 each");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 2;
       gridBagConstraints.gridy = 4;
       gridBagConstraints.gridwidth = 16;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(7, 6, 0, 0);
       getContentPane().add(chkCharger, gridBagConstraints);

       txtCharger.setEnabled(false);
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 4;
       gridBagConstraints.gridwidth = 2;
       gridBagConstraints.gridheight = 2;
       gridBagConstraints.ipadx = 90;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(6, 34, 0, 0);
       getContentPane().add(txtCharger, gridBagConstraints);
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 4;
       gridBagConstraints.gridy = 6;
       gridBagConstraints.gridwidth = 7;
       gridBagConstraints.gridheight = 2;
       gridBagConstraints.ipadx = 110;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(12, 6, 0, 0);
       getContentPane().add(txtDiscount, gridBagConstraints);

       jLabel1.setText("Subtract Discount");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 6;
       gridBagConstraints.gridwidth = 3;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(17, 34, 0, 0);
       getContentPane().add(jLabel1, gridBagConstraints);

       btnTotal.setText("TOTAL");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 8;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(6, 34, 0, 0);
       getContentPane().add(btnTotal, gridBagConstraints);

       btnReset.setText("RESET");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 1;
       gridBagConstraints.gridy = 8;
       gridBagConstraints.gridwidth = 4;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(6, 6, 0, 0);
       getContentPane().add(btnReset, gridBagConstraints);

       btnExit.setText("EXIT");
       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 7;
       gridBagConstraints.gridy = 8;
       gridBagConstraints.gridwidth = 17;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.insets = new Insets(6, 6, 0, 0);
       getContentPane().add(btnExit, gridBagConstraints);

       txtAreaDisplay.setColumns(20);
       txtAreaDisplay.setRows(5);
       jScrollPane1.setViewportView(txtAreaDisplay);

       gridBagConstraints = new GridBagConstraints();
       gridBagConstraints.gridx = 0;
       gridBagConstraints.gridy = 9;
       gridBagConstraints.gridwidth = 25;
       gridBagConstraints.fill = GridBagConstraints.BOTH;
       gridBagConstraints.ipadx = 243;
       gridBagConstraints.ipady = 109;
       gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
       gridBagConstraints.weightx = 1.0;
       gridBagConstraints.weighty = 1.0;
       gridBagConstraints.insets = new Insets(6, 34, 43, 35);
       getContentPane().add(jScrollPane1, gridBagConstraints);
       // Mouse checkbox action event;
       chkMouse.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               if (chkMouse.isSelected()) // check for Mouse to enable the Mouse textbox
                   txtMouse.enable(); // enable
               else
                   txtMouse.disable(); // disable
           }
       });
       // USB checkbox action event;
       chkUSB.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               if (chkUSB.isSelected()) // check for USB to enable the Mouse textbox
                   txtUSB.enable(); // enable
               else
                   txtUSB.disable(); // disable
           }
       });
       // Charger checkbox action event;
       chkCharger.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               if (chkCharger.isSelected()) // check for Charger to enable the Mouse textbox
                   txtCharger.enable(); // enable
               else
                   txtCharger.disable(); // disable
           }
       });

       // TOTAL button action event;
       btnTotal.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               double mousePrice = 0, USBPrice = 0, ChargerPrice = 0, discount = 0, total = 0;
               String str = "";
               try {
                   if (chkMouse.isSelected()) { //check for the mouse is checked
                       mousePrice = Double.valueOf(txtMouse.getText()) * 10;
                       str += "Mouse = $" + mousePrice + "\n";
                   }
                   if (chkUSB.isSelected()) {//check for the USB is checked
                       USBPrice = Double.valueOf(txtUSB.getText()) * 20;
                       str += "USB = $" + USBPrice + "\n";
                   }
                   if (chkCharger.isSelected()) { //check for the Charger is checked
                       ChargerPrice = Double.valueOf(txtCharger.getText()) * 15;
                       str += "Charger = $" + ChargerPrice + "\n";
                   }
                   if (txtDiscount.getText() != "") { //check for the discount is not blank
                       discount = Double.valueOf(txtDiscount.getText());
                       str += "Discount = $" + discount + "\n";
                       str += "-----------\n";
                       total = (mousePrice + USBPrice + ChargerPrice) - discount;
                       str += "Total = $" + total + "\n";
                       txtAreaDisplay.append(str);
                   }
               } catch (Exception e) {
                   JOptionPane.showConfirmDialog(null, "Enter correct value", "Error", JOptionPane.CLOSED_OPTION); // dialog option
               }
           }
       });

       // RESET button action event;
       btnReset.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               // clear the all textfield
               txtAreaDisplay.setText("");
               txtCharger.setText("");
               txtUSB.setText("");
               txtMouse.setText("");
               txtDiscount.setText("");
               // disable the textbox
               txtMouse.disable();
               txtUSB.disable();
               txtCharger.disable();
               // check box unchecked
               chkMouse.setSelected(false);
               chkUSB.setSelected(false);
               chkCharger.setSelected(false);
           }
       });
       // EXIT button action event;
       btnExit.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent event) {
               int dialogButton = JOptionPane.showConfirmDialog(null, "Are you sure?", "WARNING",
                       JOptionPane.YES_NO_OPTION); // dialog option
               // chekc for the yes no button is clicked
               if (dialogButton == JOptionPane.YES_OPTION) {
                   System.exit(0); // exit
               } else {
                   remove(dialogButton); // remove the dialog window
               }
           }
       });
       pack();
   }

   // main method
   public static void main(String args[]) {
       Revision sp = new Revision(); // call the constructor
       sp.setSize(350, 400); // set the size
       sp.setVisible(true); // set the visible to true
   }
}