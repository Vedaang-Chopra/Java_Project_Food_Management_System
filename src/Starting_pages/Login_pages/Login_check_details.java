/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Starting_pages.Login_pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Atharva Sahani
 */
public class Login_check_details extends javax.swing.JFrame {

    /**
     * Creates new form login_open
     */
    public Login_check_details() {
        initComponents();
        setSize(1000,1000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        t1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        t2 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(null);
        getContentPane().add(t1);
        t1.setBounds(190, 10, 300, 30);

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Username:-");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 10, 90, 30);

        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("Password:-");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 60, 140, 30);

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 120, 220, 37);
        getContentPane().add(t2);
        t2.setBounds(190, 60, 300, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\resources\\delicious-food-wallpaper-images-1.jpg")); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(-10, 0, 870, 560);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try
       {   String username=t1.getText();
           String password=t2.getText();
           Connection con=null;
           Class.forName("oracle.jdbc.driver.OracleDriver");
           con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","vedaang" );
           PreparedStatement pst=con.prepareStatement("Select * from login" );
           ResultSet x=pst.executeQuery();
           while(x.next())
           {  
               if(username.equals(x.getString(10))&& password.equals(x.getString(11)))
               { 
           JOptionPane.showMessageDialog(this,"Successful Login");
           PreparedStatement pst2=con.prepareStatement("Insert into temp_details (*) values(?,?,?,?,?,?,?,?,?,?,?)");
           File fout = new File("C:\\Users\\Atharva Sahani\\Documents\\NetBeansProjects\\Final_project\\src\\Login_pages\\temp_details.txt");
           FileOutputStream fos = new FileOutputStream(fout);
 
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        String s="User details";
        bw.write(s);
        bw.newLine();
           String name = null,emailid = null,contactno = null,address = null,state = null,country = null,pincode = null,gender = null,alternateemailid = null;
           name=x.getString(1);
           emailid=x.getString(2);
           contactno=x.getString(3);
           address=x.getString(4);
           state=x.getString(5);
           country=x.getString(6);
           pincode=x.getString(7);
           gender=x.getString(8);
           alternateemailid=x.getString(9);
           pst2.setString(1,name);
           pst2.setString(2,emailid);
           pst2.setString(3,contactno);
           pst2.setString(4,address);
           pst2.setString(5,state);
           pst2.setString(6,country);
           pst2.setString(7,pincode);
           pst2.setString(8,gender);
           pst2.setString(9,alternateemailid);
           pst2.setString(10,username);
           pst2.setString(11,password);
           pst2.executeUpdate();
           bw.write("Name:");
           bw.write(name);
           bw.newLine();
        bw.write("Email id:");
        bw.write(emailid);
	bw.newLine();
        bw.write("Contact number:");
        bw.write(contactno);
	bw.newLine();
        bw.write("Address:");
        bw.write(address);
	bw.newLine();
        bw.write("State:");
        bw.write(state);
	bw.newLine();
        bw.write("Country:");
        bw.write(country);
	bw.newLine();
        bw.write("Pincode:");
        bw.write(pincode);
	bw.newLine();
        bw.write("Alternate Email Id:");
        bw.write(alternateemailid);
	bw.newLine();
        bw.write("Gender:");
        bw.write(gender);
	bw.newLine();
        bw.close();
          
           con.close();
           new User_end.User_intro.User_intro_home().setVisible(true);
           this.dispose();
           
               }
               else if(username=="admin" && password=="system")
               {
            JOptionPane.showMessageDialog(this,"Successful Login Admin");
           PreparedStatement pst2=con.prepareStatement("Insert into temp_details (*) values(?,?,?,?,?,?,?,?,?,?,?)");
            File fout = new File("C:\\Users\\Atharva Sahani\\Documents\\NetBeansProjects\\Final_project\\src\\Login_pages\\temp_details.txt");
            FileOutputStream fos = new FileOutputStream(fout);
 
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            String s="User details";
            bw.write(s);
            bw.newLine();
           String name = null,emailid = null,contactno = null,address = null,state = null,country = null,pincode = null,gender = null,alternateemailid = null;
           PreparedStatement pst3=con.prepareStatement("Select * from login");
           String username1="admin",password1="system";
           ResultSet y=pst3.executeQuery();
           while (y.next())
                   {
           if(y.getString(10).equals(username1) && y.getString(11).equals(password1))
           {
           name=y.getString(1);
           emailid=y.getString(2);
           contactno=y.getString(3);
           address=y.getString(4);
           state=y.getString(5);
           country=y.getString(6);
           pincode=y.getString(7);
           gender=y.getString(8);
           alternateemailid=y.getString(9);
           
           pst2.setString(1,name);
           pst2.setString(2,emailid);
           pst2.setString(3,contactno);
           pst2.setString(4,address);
           pst2.setString(5,state);
           pst2.setString(6,country);
           pst2.setString(7,pincode);
           pst2.setString(8,gender);
           pst2.setString(9,alternateemailid);
           pst.setString(10,username);
           pst2.setString(11,password);
           pst2.executeUpdate();
           bw.write("Name:");
           bw.write(name);
           bw.newLine();
        bw.write("Email id:");
        bw.write(emailid);
	bw.newLine();
        bw.write("Contact number:");
        bw.write(contactno);
	bw.newLine();
        bw.write("Address:");
        bw.write(address);
	bw.newLine();
        bw.write("State:");
        bw.write(state);
	bw.newLine();
        bw.write("Country:");
        bw.write(country);
	bw.newLine();
        bw.write("Pincode:");
        bw.write(pincode);
	bw.newLine();
        bw.write("Alternate Email Id:");
        bw.write(alternateemailid);
	bw.newLine();
        bw.write("Gender:");
        bw.write(gender);
	bw.newLine();
        bw.close();
           
           con.close();
                   }                  }
           
           new Admin_end.Admin_intro.Admin_page_home().setVisible(true);
           this.dispose();
               }
               else
               {
                   JOptionPane.showMessageDialog(this,"Unccessful login ");
                   }
           }
           
           
          }catch(Exception e)
       {
           System.out.println(e);
       }
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Login_check_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_check_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_check_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_check_details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_check_details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t1;
    private javax.swing.JPasswordField t2;
    // End of variables declaration//GEN-END:variables
}