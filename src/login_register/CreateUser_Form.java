/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login_register;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author dell
 */
public class CreateUser_Form extends javax.swing.JFrame {

    /**
     * Creates new form CreateUser_Form
     */
    public CreateUser_Form() {
        initComponents();
        
         //Sets location of form to the center of the screen
        this.setLocationRelativeTo(null);
        
        //Create black border for close and minimize jlabels
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jLabel_minimize.setBorder(label_border);
        jLabel_close.setBorder(label_border);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTextField_username = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel_username = new javax.swing.JLabel();
        jLabel_password = new javax.swing.JLabel();
        jButton_create = new javax.swing.JButton();
        jLabel_confirmpassword = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel_minimize = new javax.swing.JLabel();
        jLabel_close = new javax.swing.JLabel();
        jLabel_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(153, 0, 51));

        jPanel3.setBackground(new java.awt.Color(255, 51, 102));

        jTextField_username.setBackground(new java.awt.Color(255, 204, 204));
        jTextField_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_usernameFocusLost(evt);
            }
        });
        jTextField_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_usernameActionPerformed(evt);
            }
        });

        jPasswordField1.setBackground(new java.awt.Color(255, 204, 204));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1ActionPerformed(evt);
            }
        });

        jLabel_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_username.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_username.setText("Username");

        jLabel_password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_password.setText("Password");

        jButton_create.setBackground(new java.awt.Color(0, 0, 0));
        jButton_create.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_create.setForeground(new java.awt.Color(255, 255, 255));
        jButton_create.setText("Create");
        jButton_create.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton_createMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton_createMouseExited(evt);
            }
        });
        jButton_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_createActionPerformed(evt);
            }
        });

        jLabel_confirmpassword.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_confirmpassword.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_confirmpassword.setText("Confirm Password");

        jPasswordField2.setBackground(new java.awt.Color(255, 204, 204));
        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPasswordField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField2FocusLost(evt);
            }
        });
        jPasswordField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel_confirmpassword)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_username)
                            .addComponent(jLabel_password))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton_create, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_username)
                    .addComponent(jTextField_username, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_password))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_confirmpassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jButton_create, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jLabel_minimize.setBackground(new java.awt.Color(0, 0, 0));
        jLabel_minimize.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_minimize.setText("-");
        jLabel_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_minimizeMouseExited(evt);
            }
        });

        jLabel_close.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_close.setText("X");
        jLabel_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel_closeMouseExited(evt);
            }
        });

        jLabel_title.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_title.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel_title.setText("NEW USER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_title)
                .addGap(93, 93, 93)
                .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_close, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel_title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusGained
        //Clear the "Username" to write the username on focus
        if(jTextField_username.getText().trim().equals("Username"))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(Color.BLACK);
        }

        //Sets black border of username panel on focus
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jTextField_username.setBorder(label_border);
    }//GEN-LAST:event_jTextField_usernameFocusGained

    private void jTextField_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_usernameFocusLost

        //If focus is lost then the panel will be set to "Username" again
        if(jTextField_username.getText().trim().equals("Username")||jTextField_username.getText().trim().equals(""))
        {
            jTextField_username.setText("");
            jTextField_username.setForeground(new Color(153,153,153));
        }

        //If focus is lost then border will be removed
        jTextField_username.setBorder(null);
    }//GEN-LAST:event_jTextField_usernameFocusLost

    private void jTextField_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_usernameActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained

        //Get the password text
        String pass = String.valueOf(jPasswordField1.getPassword());
        //Clear the password field to write the password on focus
        if(pass.trim().equals("Password"))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.BLACK);
        }

        //Sets black border of password field on focus
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jPasswordField1.setBorder(label_border);
    }//GEN-LAST:event_jPasswordField1FocusGained

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusLost
        //If focus is lost then the panel will be set to "Password" again
        String pass = String.valueOf(jPasswordField1.getPassword());
        if(pass.trim().equals("Password")||pass.trim().equals(""))
        {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(new Color(153,153,153));
        }

        //If focus is lost then border will be removed
        jPasswordField1.setBorder(null);
    }//GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed

    private void jButton_createMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_createMouseEntered
        //Setting color for mouse entered
        jButton_create.setBackground(Color.DARK_GRAY);
    }//GEN-LAST:event_jButton_createMouseEntered

    private void jButton_createMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton_createMouseExited
        //Setting color for mouse exit
        jButton_create.setBackground(Color.BLACK);
    }//GEN-LAST:event_jButton_createMouseExited

    private void jButton_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_createActionPerformed
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection cn = null;
            PreparedStatement st = null;
            ResultSet rs = null;
            
            
            //Get the username and password
            String username = jTextField_username.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            
            //Create a INSERT query to insert data on the database
            String query = "INSERT INTO users VALUES(?,?)";
            cn = MyCon.ConnectDB();
            st = cn.prepareStatement(query);
            st.setString(1,username);
            st.setString(2,password);
          
            boolean b1 = verifyFields();
            boolean b2 = checkUsername(username);
            
            if((b1==true)&&(b1==true))
            {    
            st.executeUpdate();
            JOptionPane.showMessageDialog(null, "Your account has been created");
            
                //Progress to Login form
                Login_Form lf = new Login_Form();
                lf.setVisible(true);
                lf.pack();
                lf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                //Close the CreateUser form
                this.dispose();
            }
            else{
                    JOptionPane.showMessageDialog(null, "Retry!!!");   
            }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CreateUser_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }//GEN-LAST:event_jButton_createActionPerformed

    private void jLabel_minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel_minimizeMouseClicked

    private void jLabel_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.WHITE);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.WHITE);//Set color of the icon
    }//GEN-LAST:event_jLabel_minimizeMouseEntered

    private void jLabel_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_minimizeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jLabel_minimize.setBorder(label_border);
        jLabel_minimize.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_minimizeMouseExited

    private void jLabel_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel_closeMouseClicked

    private void jLabel_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseEntered
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.WHITE);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.WHITE);
    }//GEN-LAST:event_jLabel_closeMouseEntered

    private void jLabel_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_closeMouseExited
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jLabel_close.setBorder(label_border);
        jLabel_close.setForeground(Color.BLACK);
    }//GEN-LAST:event_jLabel_closeMouseExited

    private void jPasswordField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusGained
         //Get the password text
        String pass = String.valueOf(jPasswordField2.getPassword());
        //Clear the password field to write the password on focus
        if(pass.trim().equals("Password"))
        {
            jPasswordField2.setText("");
            jPasswordField2.setForeground(Color.BLACK);
        }

        //Sets black border of password field on focus
        Border label_border = BorderFactory.createMatteBorder(1,1,1,1,Color.BLACK);
        jPasswordField2.setBorder(label_border);
    }//GEN-LAST:event_jPasswordField2FocusGained

    private void jPasswordField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField2FocusLost
          //If focus is lost then the panel will be set to "Password" again
        String pass = String.valueOf(jPasswordField2.getPassword());
        if(pass.trim().equals("Password")||pass.trim().equals(""))
        {
            jPasswordField2.setText("");
            jPasswordField2.setForeground(new Color(153,153,153));
        }

        //If focus is lost then border will be removed
        jPasswordField2.setBorder(null);
    }//GEN-LAST:event_jPasswordField2FocusLost

    private void jPasswordField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2ActionPerformed

     //Create a function to check for mandatory fields
    private boolean verifyFields()
    {
        String uname = jTextField_username.getText();
        String pass1 = String.valueOf(jPasswordField1.getPassword());
        String pass2 = String.valueOf(jPasswordField2.getPassword());
        
        
        //Check empty fields
        if(uname.trim().equals("")||pass1.trim().equals("")||pass2.trim().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Mandatory fields are empty","Empty Fields",2);
            return false;
        }
        
        //Check if two passwords are equal
        else if(pass1.equals(pass2))
                {
                 return true;
                }
        else{
            JOptionPane.showMessageDialog(null, "Passwords don't match");
            return false;
        }
        
    }
    
    //Create a function to check if the entered username already exists in the database
    public boolean checkUsername(String username)
    {
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "Select * From users WHERE username = ?";
        
        try {
            st = MyCon.ConnectDB().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            
            if(rs.next())
            {
                username_exist = true;
                JOptionPane.showMessageDialog(null,"This username is already taken so choose another one","Username failed",2); 
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Login_Form.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return username_exist;
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateUser_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CreateUser_Form().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_create;
    private javax.swing.JLabel jLabel_close;
    private javax.swing.JLabel jLabel_confirmpassword;
    private javax.swing.JLabel jLabel_minimize;
    private javax.swing.JLabel jLabel_password;
    private javax.swing.JLabel jLabel_title;
    private javax.swing.JLabel jLabel_username;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField_username;
    // End of variables declaration//GEN-END:variables
}
