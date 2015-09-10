/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

//import java.awt.event.WindowEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
//import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;


/**
 *
 * @author Samitha
 */
public class LOGIN extends javax.swing.JFrame {

    /**
     * Creates new form LOGIN
     */
    // constructor of LOGIN class
    Connection conn = null;

    public LOGIN() {
        initComponents();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //here I used a one DB connection throught the class (singleton design pattern)
        conn = DBConnect.getConnection();
        setSize(1366, 768);//set the window size
        setLayout(new BorderLayout()); // set a new boder layout
        //adding a background image
        JLabel background = new JLabel(new ImageIcon("C:\\Users\\Samitha\\Documents\\NetBeansProjects\\HMS\\src\\images\\pool_and_hotel_204118.jpg"));
        add(background);
        background.setLayout(new FlowLayout());
        loginpanel.setLocation(480, 200);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

//        ImageIcon icon=new ImageIcon("C:\\Users\\Samitha\\Desktop\\pool_and_hotel_204118.jpg");
//        background.setIcon(icon);
        // background.add(usertype);
        // Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        //this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
//        imageUpdate(null, WIDTH, WIDTH, WIDTH, WIDTH, WIDTH)
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JLabel();
        loginpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        btn_cancel = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        txt_pw = new javax.swing.JPasswordField();
        usertype = new javax.swing.JLabel();
        select_type = new javax.swing.JComboBox();
        label1 = new java.awt.Label();
        register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Beach Hotel Matara - LOGIN");

        loginpanel.setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel1.setText("username");

        jLabel2.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        jLabel2.setText("password");

        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });

        btn_cancel.setText("EXIT");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        usertype.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        usertype.setText("user type");

        select_type.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrator", "Manager", "Reseptionist", "Staff", "User" }));
        select_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                select_typeActionPerformed(evt);
            }
        });

        label1.setBackground(new java.awt.Color(0, 255, 102));
        label1.setForeground(new java.awt.Color(255, 0, 0));
        label1.setText("Change Password");
        label1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                label1MouseClicked(evt);
            }
        });

        register.setText("REGISTER");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel3.setText("only for guests");

        javax.swing.GroupLayout loginpanelLayout = new javax.swing.GroupLayout(loginpanel);
        loginpanel.setLayout(loginpanelLayout);
        loginpanelLayout.setHorizontalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)))
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_type, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))
                    .addGroup(loginpanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(register)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        loginpanelLayout.setVerticalGroup(
            loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usertype, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(select_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(loginpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_cancel)
                        .addComponent(btn_login)
                        .addComponent(register))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txt_usernameActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed

        if (txt_username.getText().length() == 0) // Checking for empty field
        {
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        } else if (txt_pw.getPassword().length == 0) // Checking for empty field
        {
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        } else {
            String user = txt_username.getText();   // Collecting the input
            char[] pass = txt_pw.getPassword(); // Collecting the input

            String pw = String.copyValueOf(pass); // converting from array to string
            encrypt en = new encrypt();
            String encryptedPassword = en.MD5(pw);
            String type = select_type.getSelectedItem().toString();
            if (validate_login(user, encryptedPassword, type)) {
                
                //giving different access levels

                if (type == "Administrator" || type == "Manager" || type == "Staff"  ) {
                    try {
                        MainWindow w = new MainWindow();
                        w.setname(user);
                        w.setVisible(true);
                        w.Checkintable_load();
                        w.Reservationtable_load();
                        dispose();
                        txt_username.setText("");
                        txt_pw.setText("");
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else if (type == "User") {
                    try {
                        MainWindowUser w1 = new MainWindowUser();
                        w1.setname(user);
                        w1.setVisible(true);
                       
                        w1.Checkintable_load();
                        w1.Reservationtable_load();
                        dispose();
                        txt_username.setText("");
                        txt_pw.setText("");
                    } catch (Exception e) {
                    }
                }else if(type == "Reseptionist"){
                
                 try {
                        MainWindowReception w2 = new MainWindowReception();
                        w2.setname(user);
                        w2.setVisible(true);
                       
                        w2.Checkintable_load();
                        w2.Reservationtable_load();
                        dispose();
                        txt_username.setText("");
                        txt_pw.setText("");
                    } catch (Exception e) {
                    }
                }
                
                else {
                    
                    
                    JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");

                    Highlighter highlighter = txt_username.getHighlighter();
                    HighlightPainter painter = new DefaultHighlighter.DefaultHighlightPainter(Color.pink);

                }
            }

    }//GEN-LAST:event_btn_loginActionPerformed
    }
  

    public boolean validate_login(String username, String password, String type) {
        try {
            PreparedStatement pst = conn.prepareStatement("Select * from reg where UserName=? and Password=? and UserType=?");
            pst.setString(1, username);
            pst.setString(2, password);
            pst.setString(3, type);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            //It's important to close the statement when you are done with it
        }
    }
    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed

        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void select_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_select_typeActionPerformed
        // TODO add your handling code here:
        // String[] type = new String[] {"Effective Java", "Head First Java","Thinking in Java"};

    }//GEN-LAST:event_select_typeActionPerformed

    private void label1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_label1MouseClicked
        // TODO add your handling code here:
        ChangePassword cp = new ChangePassword();
        cp.setVisible(true);

    }//GEN-LAST:event_label1MouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        new UserRegister().setVisible(true);

    }//GEN-LAST:event_registerActionPerformed

    /**
     *
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
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        new LOGIN().setVisible(true);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.Label label1;
    private javax.swing.JPanel loginpanel;
    private javax.swing.JButton register;
    private javax.swing.JComboBox select_type;
    private javax.swing.JPasswordField txt_pw;
    private javax.swing.JTextField txt_username;
    private javax.swing.JLabel usertype;
    // End of variables declaration//GEN-END:variables

}
