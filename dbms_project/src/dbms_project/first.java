/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms_project;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MapReduceCommand;
import com.mongodb.MapReduceOutput;
import com.mongodb.MongoClient;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import javax.swing.Timer;
import java.awt.event.*;
import java.util.Date;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;


public class first extends javax.swing.JFrame {
    
    
    
    public static String temp_grp = "";
    public static String email_login = "";
    public static String user_login = "";

      Timer t = new Timer(2000, new ActionListener(){
        public void actionPerformed (ActionEvent evt){
            Random ran = new Random();
            int n = ran.nextInt(6);
            //System.out.println(""+n);
            if(n==0)
            {
                bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\1.jpg"));
                cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\1.jpg"));
            }
            if(n==1)
            {   
                bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\2.jpg"));
                cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\2.jpg"));
            }if(n==2)
            {   
                bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\3.jpg"));
                cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\3.jpg"));
            }if(n==3)
            {   
                bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\4.jpg"));
                cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\4.jpg"));
            }if(n==4)
            {   
                bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\5.png"));
                cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\5.png"));
            }if(n==5)
            {   
                bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\7.jpg"));
                cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\7.jpg"));
            }}
    });
    
    
    
    
    public first() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customer_registration = new javax.swing.JFrame();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        cr_bgl = new javax.swing.JLabel();
        new_registration = new javax.swing.JFrame();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel3 = new javax.swing.JLabel();
        grp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        addr = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        nr_bg = new javax.swing.JLabel();
        add_grp_member = new javax.swing.JFrame();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        c_name = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        health = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        activity = new javax.swing.JComboBox<>();
        bg1 = new javax.swing.JComboBox<>();
        agm_bg = new javax.swing.JLabel();
        existing_customer = new javax.swing.JFrame();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        jLabel14 = new javax.swing.JLabel();
        cust_el = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        ec_bg = new javax.swing.JLabel();
        ec_login = new javax.swing.JFrame();
        jLayeredPane6 = new javax.swing.JLayeredPane();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        ecl_bg = new javax.swing.JLabel();
        customer_details = new javax.swing.JFrame();
        jLayeredPane7 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jButton56 = new javax.swing.JButton();
        jLabel26 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        gn = new javax.swing.JLabel();
        ca = new javax.swing.JLabel();
        em = new javax.swing.JLabel();
        cn = new javax.swing.JLabel();
        panel2 = new javax.swing.JPanel();
        cd_bg = new javax.swing.JLabel();
        payment = new javax.swing.JFrame();
        jLayeredPane8 = new javax.swing.JLayeredPane();
        jLabel19 = new javax.swing.JLabel();
        cardno = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        chname = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        cvv = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        m = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        jButton57 = new javax.swing.JButton();
        panel3 = new javax.swing.JPanel();
        p_bg = new javax.swing.JLabel();
        feedback = new javax.swing.JFrame();
        jLayeredPane9 = new javax.swing.JLayeredPane();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        exp = new javax.swing.JTextArea();
        jButton14 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sugg = new javax.swing.JTextArea();
        rt = new javax.swing.JComboBox<>();
        quality = new javax.swing.JComboBox<>();
        f_bg = new javax.swing.JLabel();
        management_staff = new javax.swing.JFrame();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        des = new javax.swing.JComboBox<>();
        jButton15 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        pass = new javax.swing.JPasswordField();
        ms_bg = new javax.swing.JLabel();
        manager = new javax.swing.JFrame();
        jLayeredPane15 = new javax.swing.JLayeredPane();
        jButton30 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        m_bg = new javax.swing.JLabel();
        new_emp_reg = new javax.swing.JFrame();
        jLayeredPane21 = new javax.swing.JLayeredPane();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        e_name = new javax.swing.JTextField();
        username = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        password = new javax.swing.JTextField();
        jLabel54 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        e_email = new javax.swing.JTextField();
        jButton49 = new javax.swing.JButton();
        bg = new javax.swing.JLabel();
        e_cont = new javax.swing.JTextField();
        designation = new javax.swing.JComboBox<>();
        jLabel61 = new javax.swing.JLabel();
        domain = new javax.swing.JTextField();
        jButton51 = new javax.swing.JButton();
        e_bg = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        ner_bg = new javax.swing.JLabel();
        activity_info = new javax.swing.JFrame();
        jLayeredPane22 = new javax.swing.JLayeredPane();
        jButton50 = new javax.swing.JButton();
        panel1 = new javax.swing.JPanel();
        jButton19 = new javax.swing.JButton();
        c1 = new javax.swing.JComboBox<>();
        c2 = new javax.swing.JComboBox<>();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        l3 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        ai_bg = new javax.swing.JLabel();
        equipment_info = new javax.swing.JFrame();
        jLayeredPane24 = new javax.swing.JLayeredPane();
        jButton40 = new javax.swing.JButton();
        panel8 = new javax.swing.JPanel();
        ei_bg = new javax.swing.JLabel();
        report = new javax.swing.JFrame();
        jLayeredPane23 = new javax.swing.JLayeredPane();
        jButton58 = new javax.swing.JButton();
        jLabel43 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        datr = new javax.swing.JLabel();
        daer = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        dtm = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        panel6 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        empsal = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        totalrfee = new javax.swing.JLabel();
        jButton21 = new javax.swing.JButton();
        profit = new javax.swing.JLabel();
        r_bg = new javax.swing.JLabel();
        employee_info = new javax.swing.JFrame();
        jLayeredPane13 = new javax.swing.JLayeredPane();
        jButton18 = new javax.swing.JButton();
        panel11 = new javax.swing.JPanel();
        jButton20 = new javax.swing.JButton();
        dl = new javax.swing.JLabel();
        dt = new javax.swing.JTextField();
        del = new javax.swing.JButton();
        empi_bg = new javax.swing.JLabel();
        customer_info = new javax.swing.JFrame();
        jLayeredPane16 = new javax.swing.JLayeredPane();
        jButton39 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        panel9 = new javax.swing.JPanel();
        panel10 = new javax.swing.JPanel();
        ci_bg = new javax.swing.JLabel();
        em_login = new javax.swing.JFrame();
        jLayeredPane11 = new javax.swing.JLayeredPane();
        jButton17 = new javax.swing.JButton();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        en = new javax.swing.JLabel();
        ea = new javax.swing.JLabel();
        ee = new javax.swing.JLabel();
        ec = new javax.swing.JLabel();
        eb = new javax.swing.JLabel();
        eu = new javax.swing.JLabel();
        ep = new javax.swing.JLabel();
        es = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        panel5 = new javax.swing.JPanel();
        emb_bg = new javax.swing.JLabel();
        t_login = new javax.swing.JFrame();
        jLayeredPane12 = new javax.swing.JLayeredPane();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        tn = new javax.swing.JLabel();
        te = new javax.swing.JLabel();
        ta = new javax.swing.JLabel();
        tb = new javax.swing.JLabel();
        tc = new javax.swing.JLabel();
        tp = new javax.swing.JLabel();
        tu = new javax.swing.JLabel();
        dom = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cc = new javax.swing.JLabel();
        sal = new javax.swing.JLabel();
        t_bg = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bg_l = new javax.swing.JLabel();

        customer_registration.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane2.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("NEW CUSTOMER");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton3);
        jButton3.setBounds(250, 180, 290, 50);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("EXISTING CUSTOMER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton4);
        jButton4.setBounds(250, 320, 290, 50);

        jButton52.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton52.setText("back");
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jLayeredPane2.add(jButton52);
        jButton52.setBounds(60, 40, 81, 37);

        cr_bgl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cr_bgl.setMinimumSize(new java.awt.Dimension(1920, 1080));
        cr_bgl.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane2.add(cr_bgl);
        cr_bgl.setBounds(1, -4, 1920, 1080);

        javax.swing.GroupLayout customer_registrationLayout = new javax.swing.GroupLayout(customer_registration.getContentPane());
        customer_registration.getContentPane().setLayout(customer_registrationLayout);
        customer_registrationLayout.setHorizontalGroup(
            customer_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_registrationLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 2002, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        customer_registrationLayout.setVerticalGroup(
            customer_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customer_registrationLayout.createSequentialGroup()
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        new_registration.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane3.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Group Name");
        jLayeredPane3.add(jLabel3);
        jLabel3.setBounds(170, 90, 140, 30);

        grp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane3.add(grp);
        grp.setBounds(440, 70, 260, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Address");
        jLayeredPane3.add(jLabel4);
        jLabel4.setBounds(170, 170, 100, 29);

        addr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane3.add(addr);
        addr.setBounds(440, 160, 260, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Email ID");
        jLayeredPane3.add(jLabel5);
        jLabel5.setBounds(170, 260, 110, 29);

        email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane3.add(email);
        email.setBounds(440, 250, 260, 50);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Mobile Number");
        jLayeredPane3.add(jLabel6);
        jLabel6.setBounds(170, 350, 170, 29);

        mob.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane3.add(mob);
        mob.setBounds(440, 340, 260, 50);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("ADD GROUP MEMBERS");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jButton5);
        jButton5.setBounds(340, 460, 280, 50);

        jButton53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton53.setText("back");
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jLayeredPane3.add(jButton53);
        jButton53.setBounds(70, 20, 90, 40);

        nr_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        nr_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        nr_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane3.add(nr_bg);
        nr_bg.setBounds(0, -4, 2000, 1210);

        javax.swing.GroupLayout new_registrationLayout = new javax.swing.GroupLayout(new_registration.getContentPane());
        new_registration.getContentPane().setLayout(new_registrationLayout);
        new_registrationLayout.setHorizontalGroup(
            new_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 2000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        new_registrationLayout.setVerticalGroup(
            new_registrationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        add_grp_member.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLayeredPane4.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Name");
        jLayeredPane4.add(jLabel8);
        jLabel8.setBounds(140, 59, 80, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setText("Blood Group");
        jLayeredPane4.add(jLabel9);
        jLabel9.setBounds(140, 140, 160, 40);

        c_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_nameActionPerformed(evt);
            }
        });
        jLayeredPane4.add(c_name);
        c_name.setBounds(420, 50, 260, 50);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel10.setText("Age");
        jLayeredPane4.add(jLabel10);
        jLabel10.setBounds(140, 220, 50, 29);

        age.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane4.add(age);
        age.setBounds(420, 210, 260, 50);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Activity");
        jLayeredPane4.add(jLabel11);
        jLabel11.setBounds(140, 300, 75, 29);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel12.setText("Health Issues");
        jLayeredPane4.add(jLabel12);
        jLabel12.setBounds(140, 370, 150, 40);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton6.setText("SUBMIT");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jLayeredPane4.add(jButton6);
        jButton6.setBounds(170, 490, 150, 40);

        health.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane4.add(health);
        health.setBounds(420, 370, 260, 50);

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton7.setText("ADD MEMBER");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jLayeredPane4.add(jButton7);
        jButton7.setBounds(430, 490, 200, 40);

        activity.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        activity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Paragliding joyride", "Paragliding training", "Scubadiving joyride", "Scubadiving training", "Bungee jumping" }));
        jLayeredPane4.add(activity);
        activity.setBounds(420, 290, 260, 50);

        bg1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bg1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A +ve", "A -ve", "B +ve", "B -ve", "AB +ve", "AB -ve", "O +ve", "O -ve" }));
        jLayeredPane4.add(bg1);
        bg1.setBounds(420, 140, 140, 40);

        agm_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        agm_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        agm_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane4.add(agm_bg);
        agm_bg.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout add_grp_memberLayout = new javax.swing.GroupLayout(add_grp_member.getContentPane());
        add_grp_member.getContentPane().setLayout(add_grp_memberLayout);
        add_grp_memberLayout.setHorizontalGroup(
            add_grp_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_grp_memberLayout.createSequentialGroup()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1920, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        add_grp_memberLayout.setVerticalGroup(
            add_grp_memberLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(add_grp_memberLayout.createSequentialGroup()
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1086, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        existing_customer.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane5.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setText("Email");
        jLayeredPane5.add(jLabel14);
        jLabel14.setBounds(780, 190, 100, 40);

        cust_el.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane5.add(cust_el);
        cust_el.setBounds(960, 190, 360, 50);

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton8.setText("LOGIN");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jLayeredPane5.add(jButton8);
        jButton8.setBounds(900, 310, 140, 50);

        jButton54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton54.setText("back");
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jLayeredPane5.add(jButton54);
        jButton54.setBounds(50, 30, 81, 37);

        ec_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ec_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ec_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane5.add(ec_bg);
        ec_bg.setBounds(0, 0, 2000, 1080);

        javax.swing.GroupLayout existing_customerLayout = new javax.swing.GroupLayout(existing_customer.getContentPane());
        existing_customer.getContentPane().setLayout(existing_customerLayout);
        existing_customerLayout.setHorizontalGroup(
            existing_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 2001, Short.MAX_VALUE)
        );
        existing_customerLayout.setVerticalGroup(
            existing_customerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        ec_login.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane6.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton9.setText("LOGOUT");
        jButton9.setMinimumSize(null);
        jButton9.setPreferredSize(null);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jLayeredPane6.add(jButton9);
        jButton9.setBounds(220, 140, 300, 50);

        jButton10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton10.setText("CUSTOMER DETAILS");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jLayeredPane6.add(jButton10);
        jButton10.setBounds(220, 250, 300, 50);

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton11.setText("PAYMENT");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jLayeredPane6.add(jButton11);
        jButton11.setBounds(220, 350, 300, 50);

        jButton12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton12.setText("FEEDBACK");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jLayeredPane6.add(jButton12);
        jButton12.setBounds(220, 450, 300, 50);

        ecl_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ecl_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ecl_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane6.add(ecl_bg);
        ecl_bg.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout ec_loginLayout = new javax.swing.GroupLayout(ec_login.getContentPane());
        ec_login.getContentPane().setLayout(ec_loginLayout);
        ec_loginLayout.setHorizontalGroup(
            ec_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        ec_loginLayout.setVerticalGroup(
            ec_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        customer_details.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane7.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel2.setText("Group detail");
        jLayeredPane7.add(jLabel2);
        jLabel2.setBounds(60, 140, 250, 40);

        jButton56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton56.setText("back");
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jLayeredPane7.add(jButton56);
        jButton56.setBounds(60, 50, 100, 40);

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel26.setText("Group Name");
        jLayeredPane7.add(jLabel26);
        jLabel26.setBounds(110, 210, 140, 40);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel50.setText("Address");
        jLayeredPane7.add(jLabel50);
        jLabel50.setBounds(110, 280, 140, 40);

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel60.setText("Email ID");
        jLayeredPane7.add(jLabel60);
        jLabel60.setBounds(110, 350, 110, 40);

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel62.setText("Contact no.");
        jLayeredPane7.add(jLabel62);
        jLabel62.setBounds(110, 420, 140, 40);

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel63.setText("Group Members");
        jLayeredPane7.add(jLabel63);
        jLabel63.setBounds(70, 520, 250, 50);

        gn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        gn.setText("gn");
        jLayeredPane7.add(gn);
        gn.setBounds(380, 210, 360, 40);

        ca.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ca.setText("ca");
        jLayeredPane7.add(ca);
        ca.setBounds(380, 280, 300, 30);

        em.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        em.setText("em");
        jLayeredPane7.add(em);
        em.setBounds(380, 346, 230, 40);

        cn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cn.setText("cn");
        jLayeredPane7.add(cn);
        cn.setBounds(380, 420, 220, 40);

        panel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLayeredPane7.add(panel2);
        panel2.setBounds(90, 620, 1000, 100);

        cd_bg.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLayeredPane7.add(cd_bg);
        cd_bg.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout customer_detailsLayout = new javax.swing.GroupLayout(customer_details.getContentPane());
        customer_details.getContentPane().setLayout(customer_detailsLayout);
        customer_detailsLayout.setHorizontalGroup(
            customer_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        customer_detailsLayout.setVerticalGroup(
            customer_detailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        payment.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane8.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setText("Card Number");
        jLayeredPane8.add(jLabel19);
        jLabel19.setBounds(50, 110, 160, 29);

        cardno.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane8.add(cardno);
        cardno.setBounds(50, 150, 230, 50);

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel20.setText("Card Holder Name");
        jLayeredPane8.add(jLabel20);
        jLabel20.setBounds(50, 230, 200, 20);

        chname.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane8.add(chname);
        chname.setBounds(50, 270, 230, 50);

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel21.setText("CVV");
        jLayeredPane8.add(jLabel21);
        jLabel21.setBounds(50, 370, 42, 29);

        cvv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane8.add(cvv);
        cvv.setBounds(130, 360, 150, 50);

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel22.setText("Expiry Date");
        jLayeredPane8.add(jLabel22);
        jLabel22.setBounds(50, 440, 130, 29);

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton13.setText("PAY NOW");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jLayeredPane8.add(jButton13);
        jButton13.setBounds(100, 620, 160, 50);

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel23.setText("Payment details");
        jLayeredPane8.add(jLabel23);
        jLabel23.setBounds(420, 110, 210, 29);

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel25.setText("Total");
        jLayeredPane8.add(jLabel25);
        jLabel25.setBounds(490, 540, 53, 29);

        amount.setEditable(false);
        amount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane8.add(amount);
        amount.setBounds(810, 530, 110, 50);

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel64.setText("Month");
        jLayeredPane8.add(jLabel64);
        jLabel64.setBounds(50, 490, 80, 29);

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel24.setText("Year");
        jLayeredPane8.add(jLabel24);
        jLabel24.setBounds(170, 490, 80, 29);

        m.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane8.add(m);
        m.setBounds(50, 532, 70, 40);

        y.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        y.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yActionPerformed(evt);
            }
        });
        jLayeredPane8.add(y);
        y.setBounds(160, 530, 110, 40);

        jButton57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton57.setText("back");
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jLayeredPane8.add(jButton57);
        jButton57.setBounds(50, 30, 120, 40);

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jLayeredPane8.add(panel3);
        panel3.setBounds(430, 160, 500, 300);

        p_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        p_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        p_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane8.add(p_bg);
        p_bg.setBounds(-20, 0, 1950, 1080);

        javax.swing.GroupLayout paymentLayout = new javax.swing.GroupLayout(payment.getContentPane());
        payment.getContentPane().setLayout(paymentLayout);
        paymentLayout.setHorizontalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLayeredPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
                .addContainerGap())
        );
        paymentLayout.setVerticalGroup(
            paymentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        feedback.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane9.setBackground(new java.awt.Color(255, 204, 102));
        jLayeredPane9.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane9.setVerifyInputWhenFocusTarget(false);

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel27.setText("Rate Trainer");
        jLayeredPane9.add(jLabel27);
        jLabel27.setBounds(160, 80, 150, 30);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel28.setText("Rate Equipment Quality");
        jLayeredPane9.add(jLabel28);
        jLabel28.setBounds(160, 160, 280, 30);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel29.setText("Share your experience");
        jLayeredPane9.add(jLabel29);
        jLabel29.setBounds(160, 250, 270, 30);

        exp.setColumns(20);
        exp.setRows(5);
        jScrollPane1.setViewportView(exp);

        jLayeredPane9.add(jScrollPane1);
        jScrollPane1.setBounds(500, 250, 350, 90);

        jButton14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton14.setText("SUBMIT");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jLayeredPane9.add(jButton14);
        jButton14.setBounds(430, 510, 140, 50);

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel59.setText("Suggestions (if any)");
        jLayeredPane9.add(jLabel59);
        jLabel59.setBounds(160, 370, 240, 50);

        sugg.setColumns(20);
        sugg.setRows(5);
        jScrollPane2.setViewportView(sugg);

        jLayeredPane9.add(jScrollPane2);
        jScrollPane2.setBounds(500, 380, 350, 90);

        rt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jLayeredPane9.add(rt);
        rt.setBounds(520, 80, 50, 30);

        quality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5" }));
        jLayeredPane9.add(quality);
        quality.setBounds(520, 160, 50, 30);

        f_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        f_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane9.add(f_bg);
        f_bg.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout feedbackLayout = new javax.swing.GroupLayout(feedback.getContentPane());
        feedback.getContentPane().setLayout(feedbackLayout);
        feedbackLayout.setHorizontalGroup(
            feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        feedbackLayout.setVerticalGroup(
            feedbackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        management_staff.setBackground(new java.awt.Color(255, 204, 102));
        management_staff.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane10.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane10.setRequestFocusEnabled(false);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel31.setText("Username");
        jLayeredPane10.add(jLabel31);
        jLabel31.setBounds(820, 140, 130, 29);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel32.setText("Password");
        jLayeredPane10.add(jLabel32);
        jLabel32.setBounds(820, 220, 110, 29);

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel33.setText("Designation");
        jLayeredPane10.add(jLabel33);
        jLabel33.setBounds(820, 310, 140, 29);

        user.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane10.add(user);
        user.setBounds(1030, 130, 330, 50);

        des.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        des.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Trainer", "Equipment Manager", "Manager" }));
        jLayeredPane10.add(des);
        des.setBounds(1030, 300, 330, 50);

        jButton15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton15.setText("Login");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jLayeredPane10.add(jButton15);
        jButton15.setBounds(970, 400, 130, 50);

        jButton55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton55.setText("back");
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jLayeredPane10.add(jButton55);
        jButton55.setBounds(40, 20, 81, 37);

        pass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane10.add(pass);
        pass.setBounds(1030, 210, 330, 50);

        ms_bg.setBackground(new java.awt.Color(255, 204, 102));
        ms_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ms_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ms_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane10.add(ms_bg);
        ms_bg.setBounds(-10, -10, 1930, 1090);

        javax.swing.GroupLayout management_staffLayout = new javax.swing.GroupLayout(management_staff.getContentPane());
        management_staff.getContentPane().setLayout(management_staffLayout);
        management_staffLayout.setHorizontalGroup(
            management_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        management_staffLayout.setVerticalGroup(
            management_staffLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        manager.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane15.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton30.setText("LOG OUT");
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton30);
        jButton30.setBounds(1000, 60, 380, 50);

        jButton33.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton33.setText("CUSTOMER'S INFORMATION");
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton33);
        jButton33.setBounds(170, 200, 350, 50);

        jButton34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton34.setText("EMPLOYEE INFORMATION");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton34);
        jButton34.setBounds(170, 320, 350, 50);

        jButton35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton35.setText("EQUIPMENT INFORMATION");
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton35);
        jButton35.setBounds(170, 440, 350, 50);

        jButton36.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton36.setText("ACTIVITY INFORMATION");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton36);
        jButton36.setBounds(660, 200, 380, 50);

        jButton37.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton37.setText("NEW EMPLOYEE REGISTRATION");
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton37);
        jButton37.setBounds(660, 320, 380, 50);

        jButton38.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton38.setText("REPORT ANALYSIS");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jLayeredPane15.add(jButton38);
        jButton38.setBounds(660, 440, 380, 50);

        m_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        m_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        m_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane15.add(m_bg);
        m_bg.setBounds(0, -10, 1920, 1090);

        javax.swing.GroupLayout managerLayout = new javax.swing.GroupLayout(manager.getContentPane());
        manager.getContentPane().setLayout(managerLayout);
        managerLayout.setHorizontalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        managerLayout.setVerticalGroup(
            managerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane15, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        new_emp_reg.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane21.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane21.setOpaque(true);

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel51.setText("Name");
        jLayeredPane21.add(jLabel51);
        jLabel51.setBounds(100, 120, 90, 30);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel52.setText("Username");
        jLayeredPane21.add(jLabel52);
        jLabel52.setBounds(100, 180, 140, 40);

        e_name.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane21.add(e_name);
        e_name.setBounds(320, 110, 310, 50);

        username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane21.add(username);
        username.setBounds(320, 180, 310, 50);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel53.setText("Password");
        jLayeredPane21.add(jLabel53);
        jLabel53.setBounds(100, 260, 130, 40);

        password.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        jLayeredPane21.add(password);
        password.setBounds(320, 250, 310, 50);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel54.setText("Address");
        jLayeredPane21.add(jLabel54);
        jLabel54.setBounds(100, 320, 110, 40);

        address.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane21.add(address);
        address.setBounds(320, 320, 310, 50);

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel55.setText("Email id");
        jLayeredPane21.add(jLabel55);
        jLabel55.setBounds(100, 390, 110, 40);

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel56.setText("Mobile Number");
        jLayeredPane21.add(jLabel56);
        jLabel56.setBounds(100, 550, 180, 29);

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel57.setText("Designation");
        jLayeredPane21.add(jLabel57);
        jLabel57.setBounds(100, 620, 130, 40);

        e_email.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane21.add(e_email);
        e_email.setBounds(320, 390, 310, 50);

        jButton49.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton49.setText("SUBMIT");
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jLayeredPane21.add(jButton49);
        jButton49.setBounds(260, 760, 150, 50);

        bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bg.setText("Blood group");
        jLayeredPane21.add(bg);
        bg.setBounds(100, 470, 150, 40);

        e_cont.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane21.add(e_cont);
        e_cont.setBounds(320, 540, 310, 50);

        designation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        designation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manager", "Equipment Manager", "Trainer" }));
        jLayeredPane21.add(designation);
        designation.setBounds(320, 610, 310, 50);

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel61.setText("Domain");
        jLayeredPane21.add(jLabel61);
        jLabel61.setBounds(100, 680, 110, 40);

        domain.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane21.add(domain);
        domain.setBounds(320, 680, 310, 50);

        jButton51.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton51.setText("back");
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jLayeredPane21.add(jButton51);
        jButton51.setBounds(30, 20, 81, 37);

        e_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        e_bg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "A +ve", "A -ve", "B +ve", "B -ve", "O +ve", "O -ve", "AB +ve", "AB -ve" }));
        jLayeredPane21.add(e_bg);
        e_bg.setBounds(320, 470, 120, 50);

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setText("*optional");
        jLayeredPane21.add(jLabel18);
        jLabel18.setBounds(650, 680, 150, 40);

        ner_bg.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ner_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ner_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane21.add(ner_bg);
        ner_bg.setBounds(1, -4, 2000, 1210);

        javax.swing.GroupLayout new_emp_regLayout = new javax.swing.GroupLayout(new_emp_reg.getContentPane());
        new_emp_reg.getContentPane().setLayout(new_emp_regLayout);
        new_emp_regLayout.setHorizontalGroup(
            new_emp_regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 2003, Short.MAX_VALUE)
        );
        new_emp_regLayout.setVerticalGroup(
            new_emp_regLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane21, javax.swing.GroupLayout.DEFAULT_SIZE, 1201, Short.MAX_VALUE)
        );

        activity_info.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane22.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton50.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton50.setText("BACK");
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jLayeredPane22.add(jButton50);
        jButton50.setBounds(60, 30, 100, 37);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        jLayeredPane22.add(panel1);
        panel1.setBounds(70, 120, 1400, 250);

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton19.setText("edit");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jLayeredPane22.add(jButton19);
        jButton19.setBounds(60, 440, 130, 40);

        c1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paragliding joyride", "Paragliding training", "Scubadiving joyride", "Scubadiving training", "Bungee jumping" }));
        jLayeredPane22.add(c1);
        c1.setBounds(390, 550, 290, 40);

        c2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "registration_fee", "trainer_fee" }));
        jLayeredPane22.add(c2);
        c2.setBounds(390, 620, 290, 40);

        l1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        l1.setText("Select activity name");
        jLayeredPane22.add(l1);
        l1.setBounds(70, 540, 280, 50);

        l2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        l2.setText("Select field");
        jLayeredPane22.add(l2);
        l2.setBounds(70, 620, 220, 40);

        b1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        b1.setText("Change");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        jLayeredPane22.add(b1);
        b1.setBounds(260, 790, 120, 50);

        l3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        l3.setText("New Value");
        jLayeredPane22.add(l3);
        l3.setBounds(70, 700, 130, 40);

        t1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane22.add(t1);
        t1.setBounds(390, 690, 230, 50);

        ai_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ai_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ai_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane22.add(ai_bg);
        ai_bg.setBounds(0, 0, 1940, 1100);

        javax.swing.GroupLayout activity_infoLayout = new javax.swing.GroupLayout(activity_info.getContentPane());
        activity_info.getContentPane().setLayout(activity_infoLayout);
        activity_infoLayout.setHorizontalGroup(
            activity_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        activity_infoLayout.setVerticalGroup(
            activity_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane22, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        equipment_info.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane24.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton40.setText("BACK");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jLayeredPane24.add(jButton40);
        jButton40.setBounds(100, 30, 89, 37);

        javax.swing.GroupLayout panel8Layout = new javax.swing.GroupLayout(panel8);
        panel8.setLayout(panel8Layout);
        panel8Layout.setHorizontalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        panel8Layout.setVerticalGroup(
            panel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jLayeredPane24.add(panel8);
        panel8.setBounds(100, 150, 1600, 700);

        ei_bg.setMaximumSize(new java.awt.Dimension(1920, 1080));
        ei_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ei_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane24.add(ei_bg);
        ei_bg.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout equipment_infoLayout = new javax.swing.GroupLayout(equipment_info.getContentPane());
        equipment_info.getContentPane().setLayout(equipment_infoLayout);
        equipment_infoLayout.setHorizontalGroup(
            equipment_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        equipment_infoLayout.setVerticalGroup(
            equipment_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        report.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane23.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jButton58.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton58.setText("BACK");
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jLayeredPane23.add(jButton58);
        jButton58.setBounds(80, 40, 150, 37);

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel43.setText("Feedback analysis report");
        jLayeredPane23.add(jLabel43);
        jLabel43.setBounds(90, 130, 320, 40);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel48.setText("Average Trainer Rating");
        jLayeredPane23.add(jLabel48);
        jLabel48.setBounds(90, 210, 280, 40);

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel66.setText("Average Equipment Rating");
        jLayeredPane23.add(jLabel66);
        jLabel66.setBounds(90, 280, 310, 30);

        datr.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(datr);
        datr.setBounds(470, 220, 190, 50);

        daer.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(daer);
        daer.setBounds(500, 270, 160, 50);

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel67.setText("Equipment Analysis Report");
        jLayeredPane23.add(jLabel67);
        jLabel67.setBounds(90, 370, 420, 30);

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel68.setText("Total Maintainance Cost");
        jLayeredPane23.add(jLabel68);
        jLabel68.setBounds(90, 460, 280, 30);

        dtm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(dtm);
        dtm.setBounds(460, 460, 140, 50);

        jLabel69.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel69.setText("Customer Analysis Report");
        jLayeredPane23.add(jLabel69);
        jLabel69.setBounds(100, 570, 430, 29);

        javax.swing.GroupLayout panel6Layout = new javax.swing.GroupLayout(panel6);
        panel6.setLayout(panel6Layout);
        panel6Layout.setHorizontalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        panel6Layout.setVerticalGroup(
            panel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );

        jLayeredPane23.add(panel6);
        panel6.setBounds(100, 650, 790, 230);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Money spent on employee salary");
        jLayeredPane23.add(jLabel15);
        jLabel15.setBounds(880, 140, 400, 30);

        empsal.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(empsal);
        empsal.setBounds(890, 200, 190, 40);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setText("Total registration fee");
        jLayeredPane23.add(jLabel16);
        jLabel16.setBounds(880, 300, 370, 40);

        totalrfee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(totalrfee);
        totalrfee.setBounds(890, 370, 180, 40);

        jButton21.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton21.setText("Calculate profit");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jLayeredPane23.add(jButton21);
        jButton21.setBounds(890, 520, 210, 40);

        profit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(profit);
        profit.setBounds(1170, 520, 160, 40);

        r_bg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane23.add(r_bg);
        r_bg.setBounds(10, 10, 1920, 1080);

        javax.swing.GroupLayout reportLayout = new javax.swing.GroupLayout(report.getContentPane());
        report.getContentPane().setLayout(reportLayout);
        reportLayout.setHorizontalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        reportLayout.setVerticalGroup(
            reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane23, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        employee_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        employee_info.setMaximumSize(new java.awt.Dimension(1920, 1080));
        employee_info.setMinimumSize(new java.awt.Dimension(1920, 1080));
        employee_info.setPreferredSize(new java.awt.Dimension(1920, 1080));
        employee_info.setResizable(false);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton18.setText("back");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jLayeredPane13.add(jButton18);
        jButton18.setBounds(80, 50, 140, 60);

        javax.swing.GroupLayout panel11Layout = new javax.swing.GroupLayout(panel11);
        panel11.setLayout(panel11Layout);
        panel11Layout.setHorizontalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        panel11Layout.setVerticalGroup(
            panel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        jLayeredPane13.add(panel11);
        panel11.setBounds(80, 170, 1600, 430);

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton20.setText("Delete Record");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jLayeredPane13.add(jButton20);
        jButton20.setBounds(130, 650, 320, 60);

        dl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        dl.setText("Enter Email Id :");
        jLayeredPane13.add(dl);
        dl.setBounds(110, 780, 200, 40);

        dt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLayeredPane13.add(dt);
        dt.setBounds(330, 780, 340, 40);

        del.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        del.setText("DELETE");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jLayeredPane13.add(del);
        del.setBounds(240, 860, 160, 50);
        jLayeredPane13.add(empi_bg);
        empi_bg.setBounds(0, 0, 1920, 1090);

        javax.swing.GroupLayout employee_infoLayout = new javax.swing.GroupLayout(employee_info.getContentPane());
        employee_info.getContentPane().setLayout(employee_infoLayout);
        employee_infoLayout.setHorizontalGroup(
            employee_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane13)
        );
        employee_infoLayout.setVerticalGroup(
            employee_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane13)
        );

        customer_info.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLayeredPane16.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane16.setRequestFocusEnabled(false);

        jButton39.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton39.setText("BACK");
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jLayeredPane16.add(jButton39);
        jButton39.setBounds(30, 20, 89, 30);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setText("Group Details");
        jLayeredPane16.add(jLabel34);
        jLabel34.setBounds(40, 100, 190, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel35.setText("Customer Details");
        jLayeredPane16.add(jLabel35);
        jLabel35.setBounds(50, 370, 210, 40);

        javax.swing.GroupLayout panel9Layout = new javax.swing.GroupLayout(panel9);
        panel9.setLayout(panel9Layout);
        panel9Layout.setHorizontalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        panel9Layout.setVerticalGroup(
            panel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        jLayeredPane16.add(panel9);
        panel9.setBounds(60, 150, 1500, 200);

        javax.swing.GroupLayout panel10Layout = new javax.swing.GroupLayout(panel10);
        panel10.setLayout(panel10Layout);
        panel10Layout.setHorizontalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1500, Short.MAX_VALUE)
        );
        panel10Layout.setVerticalGroup(
            panel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        jLayeredPane16.add(panel10);
        panel10.setBounds(50, 440, 1500, 400);

        ci_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        ci_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane16.add(ci_bg);
        ci_bg.setBounds(1, 0, 1920, 1090);

        javax.swing.GroupLayout customer_infoLayout = new javax.swing.GroupLayout(customer_info.getContentPane());
        customer_info.getContentPane().setLayout(customer_infoLayout);
        customer_infoLayout.setHorizontalGroup(
            customer_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        customer_infoLayout.setVerticalGroup(
            customer_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane16, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        em_login.setMinimumSize(new java.awt.Dimension(1920, 1370));

        jLayeredPane11.setMinimumSize(new java.awt.Dimension(1920, 1370));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton17.setText("LOGOUT");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jLayeredPane11.add(jButton17);
        jButton17.setBounds(991, 40, 150, 50);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel39.setText("Profile");
        jLayeredPane11.add(jLabel39);
        jLabel39.setBounds(80, 110, 130, 50);

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel40.setText("Name");
        jLayeredPane11.add(jLabel40);
        jLabel40.setBounds(80, 200, 62, 29);

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel75.setText("Address");
        jLayeredPane11.add(jLabel75);
        jLabel75.setBounds(80, 270, 110, 30);

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel76.setText("Email ID");
        jLayeredPane11.add(jLabel76);
        jLabel76.setBounds(80, 340, 89, 29);

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel77.setText("Contact no.");
        jLayeredPane11.add(jLabel77);
        jLabel77.setBounds(80, 400, 140, 29);

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel78.setText("Blood group");
        jLayeredPane11.add(jLabel78);
        jLabel78.setBounds(80, 470, 150, 29);

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel79.setText("Username");
        jLayeredPane11.add(jLabel79);
        jLabel79.setBounds(680, 320, 140, 29);

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel80.setText("Password");
        jLayeredPane11.add(jLabel80);
        jLabel80.setBounds(680, 390, 140, 29);

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel81.setText("Salary");
        jLayeredPane11.add(jLabel81);
        jLabel81.setBounds(680, 460, 110, 29);

        en.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        en.setText("n");
        jLayeredPane11.add(en);
        en.setBounds(310, 200, 320, 29);

        ea.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ea.setText("a");
        jLayeredPane11.add(ea);
        ea.setBounds(309, 260, 320, 29);

        ee.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ee.setText("e");
        jLayeredPane11.add(ee);
        ee.setBounds(310, 330, 320, 29);

        ec.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ec.setText("c");
        jLayeredPane11.add(ec);
        ec.setBounds(310, 400, 330, 29);

        eb.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eb.setText("b");
        jLayeredPane11.add(eb);
        eb.setBounds(310, 470, 320, 29);

        eu.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        eu.setText("u");
        jLayeredPane11.add(eu);
        eu.setBounds(910, 320, 270, 29);

        ep.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        ep.setText("p");
        jLayeredPane11.add(ep);
        ep.setBounds(910, 390, 320, 29);

        es.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        es.setText("s");
        jLayeredPane11.add(es);
        es.setBounds(909, 460, 310, 29);

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel90.setText("Equipment Detail");
        jLayeredPane11.add(jLabel90);
        jLabel90.setBounds(80, 570, 250, 37);

        javax.swing.GroupLayout panel5Layout = new javax.swing.GroupLayout(panel5);
        panel5.setLayout(panel5Layout);
        panel5Layout.setHorizontalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1600, Short.MAX_VALUE)
        );
        panel5Layout.setVerticalGroup(
            panel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        jLayeredPane11.add(panel5);
        panel5.setBounds(90, 630, 1600, 320);

        emb_bg.setMinimumSize(new java.awt.Dimension(1920, 1080));
        emb_bg.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane11.add(emb_bg);
        emb_bg.setBounds(0, 0, 1900, 1150);

        javax.swing.GroupLayout em_loginLayout = new javax.swing.GroupLayout(em_login.getContentPane());
        em_login.getContentPane().setLayout(em_loginLayout);
        em_loginLayout.setHorizontalGroup(
            em_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(em_loginLayout.createSequentialGroup()
                .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1902, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        em_loginLayout.setVerticalGroup(
            em_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(em_loginLayout.createSequentialGroup()
                .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 1540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        t_login.setMinimumSize(new java.awt.Dimension(1920, 1365));

        jLayeredPane12.setMinimumSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane12.setVerifyInputWhenFocusTarget(false);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel44.setText("PROFILE");
        jLayeredPane12.add(jLabel44);
        jLabel44.setBounds(100, 80, 92, 50);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel45.setText("Name");
        jLabel45.setToolTipText("");
        jLayeredPane12.add(jLabel45);
        jLabel45.setBounds(100, 140, 80, 50);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel46.setText("Address");
        jLayeredPane12.add(jLabel46);
        jLabel46.setBounds(100, 210, 70, 50);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel47.setText("Email Id");
        jLayeredPane12.add(jLabel47);
        jLabel47.setBounds(100, 270, 86, 50);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel49.setText("Contact No");
        jLayeredPane12.add(jLabel49);
        jLabel49.setBounds(100, 330, 98, 50);

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel70.setText("Blood Group");
        jLayeredPane12.add(jLabel70);
        jLabel70.setBounds(100, 390, 109, 50);

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel71.setText("Username");
        jLayeredPane12.add(jLabel71);
        jLabel71.setBounds(100, 450, 90, 50);

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel72.setText("Password");
        jLayeredPane12.add(jLabel72);
        jLabel72.setBounds(100, 510, 84, 50);

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel73.setText("Domain");
        jLayeredPane12.add(jLabel73);
        jLabel73.setBounds(100, 570, 69, 50);

        tn.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tn.setText("tn");
        jLayeredPane12.add(tn);
        tn.setBounds(320, 140, 500, 50);

        te.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        te.setText("te");
        jLayeredPane12.add(te);
        te.setBounds(320, 270, 520, 50);

        ta.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        ta.setText("ta");
        jLayeredPane12.add(ta);
        ta.setBounds(320, 210, 520, 50);

        tb.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tb.setText("tb");
        tb.setAutoscrolls(true);
        jLayeredPane12.add(tb);
        tb.setBounds(320, 390, 460, 50);

        tc.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tc.setText("tc");
        jLayeredPane12.add(tc);
        tc.setBounds(320, 330, 530, 50);

        tp.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tp.setText("tp");
        jLayeredPane12.add(tp);
        tp.setBounds(320, 510, 530, 50);

        tu.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        tu.setText("tu");
        jLayeredPane12.add(tu);
        tu.setBounds(320, 450, 590, 50);

        dom.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        dom.setText("dom");
        jLayeredPane12.add(dom);
        dom.setBounds(320, 570, 590, 50);

        jButton16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton16.setText("Log out");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jLayeredPane12.add(jButton16);
        jButton16.setBounds(910, 30, 113, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("No. of Customers Serviced -");
        jLayeredPane12.add(jLabel7);
        jLabel7.setBounds(100, 650, 310, 80);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel13.setText("Salary");
        jLayeredPane12.add(jLabel13);
        jLabel13.setBounds(100, 750, 140, 50);

        cc.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        cc.setText("cc");
        jLayeredPane12.add(cc);
        cc.setBounds(490, 670, 130, 40);

        sal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        sal.setText("sal");
        jLayeredPane12.add(sal);
        sal.setBounds(250, 760, 140, 40);
        jLayeredPane12.add(t_bg);
        t_bg.setBounds(0, 0, 2170, 1200);

        javax.swing.GroupLayout t_loginLayout = new javax.swing.GroupLayout(t_login.getContentPane());
        t_login.getContentPane().setLayout(t_loginLayout);
        t_loginLayout.setHorizontalGroup(
            t_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(t_loginLayout.createSequentialGroup()
                .addComponent(jLayeredPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
                .addGap(0, 254, Short.MAX_VALUE))
        );
        t_loginLayout.setVerticalGroup(
            t_loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 1197, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLayeredPane1.setBackground(new java.awt.Color(255, 153, 0));
        jLayeredPane1.setMinimumSize(new java.awt.Dimension(1920, 1080));

        jLabel1.setFont(new java.awt.Font("Poor Richard", 1, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADVENTURE   NATION");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(10, 10, 1070, 230);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("MANAGEMENT STAFF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton1);
        jButton1.setBounds(140, 390, 350, 50);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("CUSTOMER REGISTRATION");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jLayeredPane1.add(jButton2);
        jButton2.setBounds(140, 270, 350, 50);

        bg_l.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        bg_l.setMinimumSize(new java.awt.Dimension(1920, 1080));
        bg_l.setPreferredSize(new java.awt.Dimension(1920, 1080));
        jLayeredPane1.add(bg_l);
        bg_l.setBounds(0, 0, 1920, 1080);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1080, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
management_staff.setVisible(true);
this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        customer_registration.setVisible(true);
        this.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
         new_registration.setVisible(true);
        customer_registration.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        existing_customer.setVisible(true);
        customer_registration.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        
    if( (grp.getText().isEmpty()) || (addr.getText().isEmpty()) || (email.getText().isEmpty()) || (mob.getText().isEmpty()) ){
        JOptionPane.showMessageDialog( grp, "Please fill all the details.");
        return;
    }
    
    String grp_name = (String)grp.getText();
    String address = (String)addr.getText();
    String email1 = (String)email.getText();
    String mobile = (String)mob.getText();
    Boolean chk=true;

    if(!email1.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
        JOptionPane.showMessageDialog(rootPane,"Invalid email id.");
        chk=false;
    }
    if(!mobile.matches("^[7-9][0-9]{9}$")){
        JOptionPane.showMessageDialog(rootPane,"Please enter correct mobile number.");
        chk=false;
    }
    if(chk==true){
    try{
        int flag=0;
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection groups = db.getCollection("Groups");
        DBCursor cursor = groups.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String grp1 = (String) obj1.get("Grp_name");
                if(grp1.contentEquals(grp.getText())){
                    JOptionPane.showMessageDialog( grp, "Group name already exist.");
                    flag=1;
                    break;
                }
        }
        if(flag==0){
        BasicDBObject obj = new BasicDBObject();
        //obj.put("_id",g);g++;
        obj.put("Grp_name",grp.getText());
        obj.put("Address",addr.getText());
        obj.put("Email",email.getText());
        obj.put("Contact-no",mob.getText());
        obj.put("payment_status",0);
        obj.put("feedback_status",0);
        obj.put("Date", new Date());
        groups.insert(obj);
        
        temp_grp = grp.getText();
        grp.setText("");
        addr.setText("");
        email.setText("");
        mob.setText("");
        add_grp_member.setVisible(true);
        new_registration.setVisible(false);
        }
        mongo.close();
    }    
    catch(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }
    } 
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        email_login = cust_el.getText();
        int flag=0;
        if(email_login.isEmpty()){
            JOptionPane.showMessageDialog( cust_el, "Please enter Email ID.");
            return;
        }
        try{
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection group = db.getCollection("Groups");
        DBCursor cursor = group.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String email = (String) obj1.get("Email");
                if(email_login.contentEquals(email)){
                    cust_el.setText("");
                    ec_login.setVisible(true);
                    existing_customer.setVisible(false);
                    flag=1;
                    break;
                }
                mongo.close();
        }
        if(flag==0){
            JOptionPane.showMessageDialog( cust_el, "Invalid customer");
        }
        }catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        
        existing_customer.setVisible(true);
        ec_login.setVisible(false);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        JTable ctable;
        String[] columnNames = {"Name","Blood group","Age","Activity","Health issue","Trainer"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        ctable = new JTable();
        ctable.setModel(model);
        ctable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ctable.setBackground(Color.lightGray);
        ctable.setEnabled(true);
        ctable.setFillsViewportHeight(true);
        ctable.setFont(new Font("", 0, 20));
        ctable.setRowHeight(25);
        ctable.getTableHeader().setFont(new Font("", 1, 22));
        
        JScrollPane scroll = new JScrollPane(ctable);
        scroll.setBounds(0, 0, 1000, 100);
        /*scroll.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
                     
        panel2.add(scroll);
        
        try{
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection group = db.getCollection("Groups");
        DBCursor cursor = group.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String email = (String) obj1.get("Email");
                if(email_login.contentEquals(email)){
                    String grp = (String) obj1.get("Grp_name");
                    String addr = (String) obj1.get("Address");
                    String ct = (String) obj1.get("Contact-no");
                    gn.setText(grp);
                    ca.setText(addr);
                    em.setText(email);
                    cn.setText(ct);
                    
                    DBCollection customer = db.getCollection("Customer_detail");
                    DBCursor cursor1 = customer.find();
                    while(cursor1.hasNext()){
                    BasicDBObject obj2 = (BasicDBObject)cursor1.next();
                    String cgrp = (String) obj2.get("cust_group");
                    if(cgrp.contentEquals(grp)){
                    
                    String name = (String) obj2.get("cust_name");
                    String cb = (String) obj2.get("cust_bloodgrp");
                    String ag = (String) obj2.get("cust_age");
                    String ac = (String) obj2.get("cust_activity");
                    String hi = (String) obj2.get("cust_healthissue");
                    String tr = (String) obj2.get("trainer");
                    model.addRow(new Object[]{name,cb,ag,ac,hi,tr});
                    }
                    
                    }
                    customer_details.setVisible(true);
                    ec_login.setVisible(false);
                    return;
                }
        }mongo.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        
        int amt=0;
        JTable ctable;
        String[] columnNames = {"Name","Activity","Cost"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        ctable = new JTable();
        ctable.setModel(model);
        ctable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        ctable.setBackground(Color.lightGray);
        ctable.setEnabled(true);
        ctable.setFillsViewportHeight(true);
        ctable.setFont(new Font("", 0, 20));
        ctable.setRowHeight(25);
        ctable.getTableHeader().setFont(new Font("", 1, 22));
        
        JScrollPane scroll = new JScrollPane(ctable);
        scroll.setBounds(0, 0, 500, 300);
        
        panel3.add(scroll);
        
       try{
            
        int flag=0;
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection group = db.getCollection("Groups");
        DBCursor cursor = group.find();
            while(cursor.hasNext()){
                BasicDBObject obj = (BasicDBObject)cursor.next();
                String email = (String) obj.get("Email");
                if(email.contentEquals(email_login)){
                    int s = (int) obj.get("payment_status");
                    if(s==0){
                    
                        String grp = (String) obj.get("Grp_name");
                        DBCollection customer = db.getCollection("Customer_detail");
                        DBCursor cursor1 = customer.find();
                    
                        while(cursor1.hasNext()){
                        
                            BasicDBObject obj1 = (BasicDBObject)cursor1.next();
                            String cgrp = (String) obj1.get("cust_group");
                        
                            if(cgrp.contentEquals(grp)){;
                                
                                String name = (String) obj1.get("cust_name");
                                String ac = (String) obj1.get("cust_activity");
                                
                                DBCollection activity1 = db.getCollection("Activity");
                                DBCursor cursor2 = activity1.find();
                                while(cursor2.hasNext()){
                        
                                    BasicDBObject obj2 = (BasicDBObject)cursor2.next();
                                    String act = (String) obj2.get("act_name");
                        
                                    if(ac.contentEquals(act)){
                                        String rf = (String) obj2.get("registration_fee");
                                        int rfi = Integer.parseInt(rf);
                                        amt=amt+rfi;
                                        model.addRow(new Object[]{name,ac,rf});
                                        break;
                                    }
                                }
                            }
                        }
                        String amts = Integer.toString(amt);
                        amount.setText(amts);
                        payment.setVisible(true);
                        ec_login.setVisible(false);
                        //JOptionPane.showMessageDialog( rootPane , amt );
                        flag=1;
                        return;
                    }
                }
            }
            if(flag==0){
                JOptionPane.showMessageDialog( rootPane , "Payment is done.");
                return;
            }mongo.close();
        }catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        
        try{
            
        int flag=0;
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection group = db.getCollection("Groups");
        DBCursor cursor = group.find();
        while(cursor.hasNext()){
                BasicDBObject obj = (BasicDBObject)cursor.next();
                String email = (String) obj.get("Email");
                if(email.contentEquals(email_login)){
                    int s = (int) obj.get("feedback_status");
                    if(s==0){
                        feedback.setVisible(true);
                        ec_login.setVisible(false);
                        flag=1;
                        return;
                    }
                }
        }mongo.close();
        if(flag==0){
            JOptionPane.showMessageDialog( rootPane , "Feedback is given.");
            return;
        }
        }catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        
        if( (chname.getText().isEmpty()) || (cardno.getText().isEmpty()) || (cvv.getText().isEmpty()) || (m.getText().isEmpty()) || (y.getText().isEmpty()) ){
        JOptionPane.showMessageDialog( grp, "Please fill all the details.");
        return;
        }
        
        String name1 = (String)chname.getText();
        String cd = (String)cardno.getText();
        String mo = (String)m.getText();
        String yr = (String)y.getText();
        
        Boolean chk=true;
        
        if(!name1.matches("^[a-zA-z\\s]+$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Please enter valid name.");
            chk=false;
        }
        else if(!cd.matches("^(?:(?<visa>4[0-9]{12}(?:[0-9]{3})?)|" +
        "(?<mastercard>5[1-5][0-9]{14})|" +
        "(?<discover>6(?:011|5[0-9]{2})[0-9]{12})|" +
        "(?<amex>3[47][0-9]{13})|" +
        "(?<diners>3(?:0[0-5]|[68][0-9])?[0-9]{11})|" +
        "(?<jcb>(?:2131|1800|35[0-9]{3})[0-9]{11}))$"))
        {   
            JOptionPane.showMessageDialog(rootPane,"Please enter valid Card number");
            chk=false;
        }
        else if(!mo.matches("(0?[1-9]|1[012])"))
        {
            JOptionPane.showMessageDialog(rootPane,"Please enter valid month.");
            chk=false;
        }
        else if(!yr.matches("((19|20)\\d\\d)"))
        {
            JOptionPane.showMessageDialog(rootPane,"Please enter valid year.");
            chk=false;
        }
    if(chk==true){
    try{
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        
        
        DBCollection groups = db.getCollection("Groups");
        DBCursor cursor = groups.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String email = (String) obj1.get("Email");
                if(email.contentEquals(email_login)){
                    String grp = (String) obj1.get("Grp_name");
                    BasicDBObject newdocument = new BasicDBObject().append("$set", new BasicDBObject().append("payment_status", 1));
                    groups.update(new BasicDBObject().append("Email", email_login ), newdocument);
                    DBCollection payment1 = db.getCollection("Payment");
                    BasicDBObject obj = new BasicDBObject();
                    obj.put("Grp_name",grp);
                    obj.put("card_holder",chname.getText());
                    obj.put("amount",amount.getText());
                    obj.put("payment_date",new Date());
                    payment1.insert(obj);
                    payment.setVisible(false);
                    ec_login.setVisible(true);
                    return;
                }
        }mongo.close();
    }    
    catch(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }
    }
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
    
        if( (exp.getText().isEmpty()) || ( sugg.getText().isEmpty() ) ){
        JOptionPane.showMessageDialog( grp, "Please fill all the details.");
        return;
    }
    try{
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        
        
        DBCollection groups = db.getCollection("Groups");
        DBCursor cursor = groups.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String email = (String) obj1.get("Email");
                if(email.contentEquals(email_login)){
                    String grp = (String) obj1.get("Grp_name");
                    BasicDBObject newdocument = new BasicDBObject().append("$set", new BasicDBObject().append("feedback_status", 1));
                    groups.update(new BasicDBObject().append("Email", email_login ), newdocument);
                    DBCollection feedback1 = db.getCollection("Feedback");
                    BasicDBObject obj = new BasicDBObject();
                    //obj.put("_id",f);f++;
                    obj.put("Grp_name",grp);
                    obj.put("rate_trainer",rt.getSelectedItem());
                    obj.put("rate_quality",quality.getSelectedItem());
                    obj.put("experience",exp.getText());
                    obj.put("suggestions",sugg.getText());
                    feedback1.insert(obj);
                    feedback.setVisible(false);
                    ec_login.setVisible(true);
                    return;
                }
        }mongo.close();
    }    
    catch(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
    }
    }//GEN-LAST:event_jButton14ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        t.start();
        bg_l.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\6.png"));
        cr_bgl.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\6.png"));
        nr_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\4.jpg"));
        agm_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\4.jpg"));
        ec_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\3.jpg"));
        p_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\4.jpg"));
        ecl_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\7.jpg"));
        f_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\4.jpg"));
        ms_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\3.jpg"));
        m_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\7.jpg"));
        cd_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ner_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        emb_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ci_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        empi_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        r_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ei_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ai_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        t_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        /*
        
        
        
        
       
        ner_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ai_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ei_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        r_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        empi_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ci_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        emb_bg.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));
        ld.setIcon(new ImageIcon("C:\\Users\\Shivani-PC\\Desktop\\dbms images\\bg1.jpg"));*/
       
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        
        try{
        //String dgp="";    
        JTable table;
        String[] columnNames = {"Sr no.","Group Name","Address","Email","Contact no."};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 1500, 200);
        /*scroll1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
                
                MongoClient mongo=new MongoClient("localhost",27017);
                DB db=mongo.getDB("Adventure_Nation");
        
                DBCollection groups = db.getCollection("Groups");
                DBCursor cursor = groups.find();
                int i=0;
                while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                i=i+1;
                String gn = (String) obj1.get("Grp_name");
                String ga = (String) obj1.get("Address");
                String ge = (String) obj1.get("Email");
                String gc = (String) obj1.get("Contact-no");
                //String gp = (String) obj1.get("payment_status");
                //if(gp.contentEquals("0")){dgp="Not done";}else{ dgp = "Done";}
                model.addRow(new Object[]{i,gn,ga,ge,gc});
            }
        panel9.add(scroll1);
        
        JTable table1;
        String[] columnNames1 = {"Sr no.","Name","Group-name","Blood group","Age","Activity","Health issue","Trainer"};
 
        DefaultTableModel model1 = new DefaultTableModel();
        model1.setColumnIdentifiers(columnNames1);

        table1 = new JTable();
        table1.setModel(model1);
        table1.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table1.setBackground(Color.lightGray);
        table1.setEnabled(true);
        table1.setFillsViewportHeight(true);
        table1.setFont(new Font("", 0, 20));
        table1.setRowHeight(25);
        table1.getTableHeader().setFont(new Font("", 0, 22));
 
        JScrollPane scroll = new JScrollPane(table1);
        scroll.setBounds(0, 0, 1500, 400);
        /*scroll1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
                
                DBCollection customer = db.getCollection("Customer_detail");
                DBCursor cursor1 = customer.find();
                int j=0;
                while(cursor1.hasNext()){
                BasicDBObject obj2 = (BasicDBObject)cursor1.next();
                j=j+1;
                    String cgrp = (String) obj2.get("cust_group");
                    String name = (String) obj2.get("cust_name");
                    String cb = (String) obj2.get("cust_bloodgrp");
                    String ag = (String) obj2.get("cust_age");
                    String ac = (String) obj2.get("cust_activity");
                    String hi = (String) obj2.get("cust_healthissue");
                    String tr = (String) obj2.get("trainer");
                    model1.addRow(new Object[]{j,name,cgrp,cb,ag,ac,hi,tr});
            }
        panel10.add(scroll);
        
        customer_info.setVisible(true);
        manager.setVisible(false);
        //activity_info.setSize(400, 300);
        mongo.close();
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
       customer_registration.setVisible(false);
        new first().setVisible(true);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        new_registration.setVisible(false);
        customer_registration.setVisible(true);
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
         String name1 = (String)c_name.getText();
        String blood_grp = (String)bg1.getSelectedItem();
        String age1 = (String)age.getText();
        String health1 = (String)health.getText();
        String act = (String) activity.getSelectedItem(); 
        Boolean chk=true;
        
        if( (c_name.getText().isEmpty()) || (age.getText().isEmpty()) || (health.getText().isEmpty()) || act.contentEquals("Select") || blood_grp.contentEquals("Select")){
            JOptionPane.showMessageDialog( c_name, "Please fill all the details.");
            return;
        }
        
        if(!name1.matches("^[a-zA-z\\s]+$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Name field can only have letters and spaces");
            chk=false;
        }
        
        if(chk==true){
        
        try{
            
       
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection trainer1 = db.getCollection("Trainer");
        DBCursor cursor = trainer1.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String dom = (String) obj1.get("domain");
                if(dom.contentEquals(act)){
                    String em = (String) obj1.get("t_email");
                    DBCollection employee = db.getCollection("Employee");
                    DBCursor cursor1 = employee.find();
                    while(cursor1.hasNext()){
                        BasicDBObject obj2 = (BasicDBObject)cursor1.next();
                        String em1 = (String) obj2.get("emp_email");
                        if(em.contentEquals(em1)){
                            BasicDBObject newDocument = new BasicDBObject().append("$inc", 
                            new BasicDBObject().append("cust_serviced",1));
                            trainer1.update(new BasicDBObject().append("t_email", em), newDocument);
                            BasicDBObject newDocument1 = new BasicDBObject().append("$inc", 
                            new BasicDBObject().append("count",1));
                            trainer1.update(new BasicDBObject().append("t_email", em), newDocument1);
                            String tr = (String) obj2.get("emp_name");
                                
                            DBCollection customer = db.getCollection("Customer_detail");
                            BasicDBObject obj = new BasicDBObject();
   
                            obj.put("cust_name",c_name.getText());
                            obj.put("cust_bloodgrp",bg1.getSelectedItem());
                            obj.put("cust_age",age.getText());
                            obj.put("cust_activity",activity.getSelectedItem());
                            obj.put("cust_group",temp_grp);
                            obj.put("cust_healthissue",health.getText());
                            obj.put("trainer",tr);
                            customer.insert(obj);
                            c_name.setText("");
                            bg1.setName("");
                            age.setText("");
                            activity.setSelectedItem("Paragliding joyride");
                            health.setText("");
                            return; 
                        }
                    }
                }
            }
        mongo.close();
        }
        catch(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
        }
        
        
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
         String name1 = (String)c_name.getText();
        String blood_grp = (String)bg1.getSelectedItem();
        String age1 = (String)age.getText();
        String health1 = (String)health.getText();
        String act = (String) activity.getSelectedItem(); 
        Boolean chk=true;
        
        if( (c_name.getText().isEmpty()) || (age.getText().isEmpty()) || (health.getText().isEmpty()) || act.contentEquals("Select") || blood_grp.contentEquals("Select")){
            JOptionPane.showMessageDialog( c_name, "Please fill all the details.");
            return;
        }
       
        
       if(!name1.matches("^[a-zA-z\\s]+$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Name field can only have letters and spaces");
            chk=false;
        }
      
        
        if(chk==true){
        try{
       
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection trainer1 = db.getCollection("Trainer");
        DBCursor cursor = trainer1.find();
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String dom = (String) obj1.get("domain");
                if(dom.contentEquals(act)){
                    String em = (String) obj1.get("t_email");
                    DBCollection employee = db.getCollection("Employee");
                    DBCursor cursor1 = employee.find();
                    while(cursor1.hasNext()){
                        BasicDBObject obj2 = (BasicDBObject)cursor1.next();
                        String em1 = (String) obj2.get("emp_email");
                        if(em.contentEquals(em1)){
                            BasicDBObject newDocument = new BasicDBObject().append("$inc", 
                            new BasicDBObject().append("cust_serviced",1));
                            BasicDBObject newDocument1 = new BasicDBObject().append("$inc", 
                            new BasicDBObject().append("count",1));
                            trainer1.update(new BasicDBObject().append("t_email", em), newDocument);
                            trainer1.update(new BasicDBObject().append("t_email", em), newDocument1);
                            String tr = (String) obj2.get("emp_name");
                                
                            DBCollection customer = db.getCollection("Customer_detail");
                            BasicDBObject obj = new BasicDBObject();
   
                            obj.put("cust_name",c_name.getText());
                            obj.put("cust_bloodgrp",bg1.getSelectedItem());
                            obj.put("cust_age",age.getText());
                            obj.put("cust_activity",activity.getSelectedItem());
                            obj.put("cust_group",temp_grp);
                            obj.put("cust_healthissue",health.getText());
                            obj.put("trainer",tr);
                            customer.insert(obj);
                            c_name.setText("");
                            bg1.setName("Select");
                            age.setText("");
                            activity.setSelectedItem("Paragliding joyride");
                            health.setText("");
                            customer_registration.setVisible(true);
                            add_grp_member.setVisible(false);
                            return; 
                        }
                    }
                }
            }mongo.close();
        }
        catch(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
        }
        
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        existing_customer.setVisible(false);
        customer_registration.setVisible(true);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        
        try{
            String td="";
            int flag=0;
            String d = (String) des.getSelectedItem();
            String u = (String) user.getText();
            String p = (String) pass.getText();
            
            MongoClient mongo = new MongoClient("localhost",27017);
            DB db = mongo.getDB("Adventure_Nation");
            
            DBCollection employee = db.getCollection("Employee");
            DBCursor cursor = employee.find();
            while(cursor.hasNext()){
            BasicDBObject obj = (BasicDBObject)cursor.next();
            String us = obj.getString("username");
            if(u.contentEquals(us)){
                flag=1;
                user_login = us;
                String pa = obj.getString("password");
                if(p.contentEquals(pa)){
                    String de = obj.getString("designation");
                    
                    if(d.contentEquals(de)){
                       if(d=="Manager"){
                            user.setText("");
                            pass.setText("");
                            des.setSelectedItem("Select");
                            management_staff.setVisible(false);
                            manager.setVisible(true);
                            return;
                       }else if(d=="Equipment Manager"){
                            user.setText("");
                            pass.setText("");
                            des.setSelectedItem("Select");
                            
                            
                            String name = obj.getString("emp_name");
                            String a = obj.getString("emp_address");
                            String e = obj.getString("emp_email");
                            String c = obj.getString("emp_contact");
                            String b = obj.getString("emp_bloodgrp");
                            //JOptionPane.showMessageDialog( management_staff , e);
                            
                            DBCollection manager = db.getCollection("Manager");
                            DBCursor cursor3 = manager.find();
                            while(cursor3.hasNext()){
                                BasicDBObject obj3 = (BasicDBObject)cursor3.next();
                                String design = obj3.getString("designation");
                                if(design.contentEquals("Equipment Manager")){
                                    String sl = obj3.getString("salary");
                                    en.setText(name);
                                    ea.setText(a);
                                    ee.setText(e);
                                    ec.setText(c);
                                    eb.setText(b);
                                    eu.setText(u);
                                    ep.setText(p);
                                    es.setText(sl);
                                    break;
                                }
                            }
                            //JOptionPane.showMessageDialog( management_staff , "table starts");
                            JTable table;
                            String[] columnNames = {"Sr no.","Equipment Name","Buying cost","Maintainance cost","Quantity","Activity"};
 
                            DefaultTableModel model = new DefaultTableModel();
                            model.setColumnIdentifiers(columnNames);

                            table = new JTable();
                            table.setModel(model);
                            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                            table.setBackground(Color.lightGray);
                            table.setEnabled(true);
                            table.setFillsViewportHeight(true);
                            table.setFont(new Font("", 0, 20));
                            table.setRowHeight(25);
                            table.getTableHeader().setFont(new Font("", 1, 22));
 
                            JScrollPane scroll1 = new JScrollPane(table);
                            scroll1.setBounds(0, 0, 1600, 320);
                            DBCollection equipment = db.getCollection("Equipment");
                            DBCursor cursor5 = equipment.find();
                            int i=0;
                            while(cursor5.hasNext()){
                            BasicDBObject obj5 = (BasicDBObject)cursor5.next();
                            i=i+1;
                            String ename = (String) obj5.get("name");
                            String bc = (String) obj5.get("buying cost");
                            String mc = (String) obj5.get("maintainance cost");
                            String qt = (String) obj5.get("quantity");
                            String ea = (String) obj5.get("activity");
                
                            model.addRow(new Object[]{i,ename,bc,mc,qt,ea});
                            }
        
                        panel5.add(scroll1);
                        management_staff.setVisible(false);
                        em_login.setVisible(true);
                        return;
                       }else if(d=="Trainer"){
                            user.setText("");
                            pass.setText("");
                            des.setSelectedItem("Select");
                                
                            String name = obj.getString("emp_name");
                            String a = obj.getString("emp_address");
                            String e = obj.getString("emp_email");
                            String c = obj.getString("emp_contact");
                            String b = obj.getString("emp_bloodgrp");
                            //JOptionPane.showMessageDialog( management_staff , e);
                            
                            DBCollection trainer = db.getCollection("Trainer");
                            DBCursor cursor1 = trainer.find();
                            while(cursor1.hasNext()){
                                BasicDBObject obj1 = (BasicDBObject)cursor1.next();
                                String et = obj1.getString("t_email");
                                // JOptionPane.showMessageDialog( management_staff , et);
                                if(et.contentEquals(e)){
                                    //JOptionPane.showMessageDialog( management_staff , "email matched");
                                    td = obj1.getString("domain");
                                    //JOptionPane.showMessageDialog( management_staff , td);
                                    Integer cs = obj1.getInt("cust_serviced");
                                    DBCollection activity = db.getCollection("Activity");
                                    DBCursor cursor2 = activity.find();
                                    while(cursor2.hasNext()){
                                        BasicDBObject obj2 = (BasicDBObject)cursor2.next();
                                        String act = obj2.getString("act_name");
                                        //JOptionPane.showMessageDialog( management_staff , act);
                                        if(act.contentEquals(td)){
                                            //JOptionPane.showMessageDialog( management_staff , "activity matched");
                                            String tf = obj2.getString("trainer_fee");
                                            int tfi = Integer.parseInt(tf);
                                            int total = cs * tfi;
                                            String css = Integer.toString(cs);
                                            String totals = Integer.toString(total);
                                            
                                            tn.setText(name);
                                            ta.setText(a);
                                            te.setText(e);
                                            tc.setText(c);
                                            tb.setText(b);
                                            tu.setText(u);
                                            tp.setText(p);
                                            dom.setText(td);
                                            cc.setText(css);
                                            sal.setText(totals);
                                            break;
                                        }
                                    }
                                }
                            }
                            //JOptionPane.showMessageDialog( management_staff , "table starts");
                            JTable table;
                            String[] columnNames = {"Customer Name","Customer group"};
 
                            DefaultTableModel model = new DefaultTableModel();
                            model.setColumnIdentifiers(columnNames);

                            table = new JTable();
                            table.setModel(model);
                            table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
                            table.setBackground(Color.lightGray);
                            table.setEnabled(false);
                            table.setFillsViewportHeight(true);
 
                            JScrollPane scroll1 = new JScrollPane(table);
                            scroll1.setBounds(0, 0, 300, 200);
       
                            DBCollection customer = db.getCollection("Customer_detail");
                            DBCursor cursor3 = customer.find();
                            while(cursor3.hasNext()){
                                BasicDBObject obj3 = (BasicDBObject)cursor3.next();
                                String ac = (String) obj3.get("cust_activity");
                                //JOptionPane.showMessageDialog( management_staff , ac);
                                if(ac.contentEquals(td)){
                                    //JOptionPane.showMessageDialog( management_staff , "activity matched");
                                    String cust = obj3.getString("cust_name");
                                    String gp =obj3.getString("cust_group");
                                    model.addRow(new Object[]{cust,gp});
                                }
                
                               
                            }
        
                       // panel4.add(scroll1);
                        management_staff.setVisible(false);
                        t_login.setVisible(true);
                        return;
                       }
                    }else{
                        JOptionPane.showMessageDialog( management_staff , "Please select correct designation. ");
                        return;
                        }
                }else{
                    JOptionPane.showMessageDialog( management_staff , "Invalid password. ");
                    return;
                }
            }
            }mongo.close();
            if(flag==0){
                JOptionPane.showMessageDialog( management_staff , "Invalid username. ");
                return;
            }
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        user.setText("");
        pass.setText("");
        des.setSelectedItem("Select");
        management_staff.setVisible(false);
        new first().setVisible(true);
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        
        manager.setVisible(false);
        management_staff.setVisible(true);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        
       try{
            
        JTable table;
        String[] columnNames = {"Sr no.","Activity name","Days","Trainer fee","Registration fee","Equipment set"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 1400, 250);
        /*scroll1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
                
                MongoClient mongo=new MongoClient("localhost",27017);
                DB db=mongo.getDB("Adventure_Nation");
        
                DBCollection activity = db.getCollection("Activity");
                DBCursor cursor = activity.find();
                int i=0;
                while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                i=i+1;
                String act = (String) obj1.get("act_name");
                String d = (String) obj1.get("days");
                String tfee = (String) obj1.get("trainer_fee");
                String rfee = (String) obj1.get("registration_fee");
                String es = (String) obj1.get("equipment_set");
                
                model.addRow(new Object[]{i,act,d,tfee,rfee,es});
            }
        
        panel1.add(scroll1);
        l1.setVisible(false);
        l2.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        b1.setVisible(false);
        l3.setVisible(false);
        t1.setVisible(false);
        activity_info.setVisible(true);
        mongo.close();
        //activity_info.setSize(400, 300);
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        activity_info.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        new_emp_reg.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        
        String name2 = (String)e_name.getText();
        String user2 = (String)username.getText();
        String pswd2 = (String)password.getText();
        String add2 = (String)address.getText();
        String email2 = (String)e_email.getText();
        String Blood_grp = (String)e_bg.getSelectedItem();
        String mobile2 = (String)e_cont.getText();
        String designation2 = (String)designation.getSelectedItem();
        Boolean chk=true;
        if( e_name.getText().isEmpty() || username.getText().isEmpty() || password.getText().isEmpty() || address.getText().isEmpty() || e_email.getText().isEmpty() || Blood_grp.contentEquals("Select")|| e_cont.getText().isEmpty() ){
            JOptionPane.showMessageDialog( e_name, "Please fill all the detail.");
            return;
        }
        
       if(!name2.matches("^[a-zA-z\\s]+$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Name field can only have letters and spaces");
            chk=false;
        }
       else if(!pswd2.matches("^[a-zA-Z0-9]{7,}$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Password should contain only alphanumeric values.(Minimum 7 letters required)");
            chk=false;
        }
        else if(!email2.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Email is wrong");
            chk=false;
        }  
        else if(!mobile2.matches("^[7-9][0-9]{9}$"))
        {
            JOptionPane.showMessageDialog(rootPane,"Mobile number is wrong");
            chk=false;
        }
        if(chk==true)
        {
        try{
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        
        DBCollection employee1 = db.getCollection("Employee");
        DBCursor cursor = employee1.find();
        while(cursor.hasNext()){
                BasicDBObject obj4 = (BasicDBObject)cursor.next();
                String u = (String) obj4.get("username");
                if(u.contentEquals(user2)){
                    JOptionPane.showMessageDialog( grp, "Username name already exist.");
                    return;
                }
        }
        
        BasicDBObject obj3 = new BasicDBObject();
        obj3.put("emp_name",e_name.getText());
        obj3.put("username",username.getText());
        obj3.put("password",password.getText());
        obj3.put("emp_address",address.getText());
        obj3.put("emp_email",e_email.getText());
        obj3.put("emp_contact",e_cont.getText());
        obj3.put("emp_bloodgrp",e_bg.getSelectedItem());
        obj3.put("designation",designation.getSelectedItem());
        employee1.insert(obj3);
        
        String d = (String) designation.getSelectedItem();
        if( d == "Manager" || d == "Equipment Manager" ){
           
            DBCollection manager = db.getCollection("Manager");
            BasicDBObject obj1 = new BasicDBObject();
            //obj1.put("_id",m);m++;
            obj1.put("emp_email",e_email.getText());
            obj1.put("designation",d);
            if(d=="Manager"){
                obj1.put("salary",40000);
            }
            else{
                obj1.put("salary",25000);
            }
            obj1.put("designation",designation.getSelectedItem());
            manager.insert(obj1);
        }
        else{
            
            DBCollection trainer = db.getCollection("Trainer");
            BasicDBObject obj2 = new BasicDBObject();
            //obj2.put("_id",tr);tr++;
            obj2.put("t_email",e_email.getText());
            obj2.put("domain",domain.getText());
            obj2.put("cust_serviced",0);
            obj2.put("count",0);
            trainer.insert(obj2);
        }
        mongo.close();
        
        e_name.setText("");
        username.setText("");
        password.setText("");
        address.setText("");
        e_email.setText("");
        e_cont.setText("");
        domain.setText("");
        e_bg.setSelectedItem("select");
        designation.setSelectedItem("Manager");
        }
        catch(Exception e){
        System.err.println(e.getMessage());
        e.printStackTrace();
        }
        
        
        new_emp_reg.setVisible(false);
        manager.setVisible(true);
        }
    }//GEN-LAST:event_jButton49ActionPerformed

    private void c_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_nameActionPerformed

    private void yActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        customer_details.setVisible(false);
        ec_login.setVisible(true);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
        payment.setVisible(false);
        ec_login.setVisible(true);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
         try{
        panel11.removeAll();
        JTable table;
        String[] columnNames = {"Sr no.","Employee Name","Address","Email","Contact","Blood grp","Designation"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 1600, 500);
        scroll1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                
                MongoClient mongo=new MongoClient("localhost",27017);
                DB db=mongo.getDB("Adventure_Nation");
        
                DBCollection employee = db.getCollection("Employee");
                DBCursor cursor = employee.find();
                int i=0;
                while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                i=i+1;
                String ename = (String) obj1.get("emp_name");
                String bc = (String) obj1.get("emp_address");
                String mc = (String) obj1.get("emp_email");
                String qt = (String) obj1.get("emp_contact");
                String a = (String) obj1.get("emp_bloodgrp");
                String d = (String) obj1.get("designation");
                
                model.addRow(new Object[]{i,ename,bc,mc,qt,a,d});
            }
        
        panel11.add(scroll1);
        del.setVisible(false);
        dl.setVisible(false);
        dt.setVisible(false);
        employee_info.setVisible(true);
        manager.setVisible(false);
        //activity_info.setSize(400, 300);
        mongo.close();
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        try{
            
        JTable table;
        String[] columnNames = {"Sr no.","Equipment Name","Buying cost","Maintainance cost","Quantity","Activity"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 1600, 700);
        /*scroll1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);*/
                
                MongoClient mongo=new MongoClient("localhost",27017);
                DB db=mongo.getDB("Adventure_Nation");
        
                DBCollection equipment = db.getCollection("Equipment");
                DBCursor cursor = equipment.find();
                int i=0;
                while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                i=i+1;
                String ename = (String) obj1.get("name");
                String bc = (String) obj1.get("buying cost");
                String mc = (String) obj1.get("maintainance cost");
                String qt = (String) obj1.get("quantity");
                String a = (String) obj1.get("activity");
                
                model.addRow(new Object[]{i,ename,bc,mc,qt,a});
            }
        
        panel8.add(scroll1);
        equipment_info.setVisible(true);
        manager.setVisible(false);
        mongo.close();
        //activity_info.setSize(400, 300);
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        
        this.setVisible(false);
        new_emp_reg.setVisible(true);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        try{
        JTable table;
        String[] columnNames = {"Activity name","No.of customers registered"};

        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);
  
        
        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
        //table.setBackground(Color.blue);
        
        //.setFont(new Font("Arial", Font.BOLD, 12));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 800, 800);
        
        int atr=0;
        int aq=0;
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
        
        DBCollection feedback = db.getCollection("Feedback");
        DBCursor cursor1 = feedback.find();
                int i=0;
                while(cursor1.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor1.next();
                i=i+1;
                String trate = (String) obj1.get("rate_trainer");
                String qrate = (String) obj1.get("rate_quality");
                int trati = Integer.parseInt(trate);
                atr=atr+trati;
                int qrati = Integer.parseInt(qrate);
                aq=aq+qrati;
                }
        atr=atr/i;        
        aq=aq/i;
        String atrs = Integer.toString(atr);
        datr.setText(atrs);
        String aqs = Integer.toString(aq);
        daer.setText(aqs);
        
        DBCollection equipment = db.getCollection("Equipment");
        DBCursor cursor2 = equipment.find();
            int tmc=0;
            while(cursor2.hasNext()){
                
                BasicDBObject obj2 = (BasicDBObject)cursor2.next();
                String mc = (String) obj2.get("maintainance cost");
                int mci = Integer.parseInt(mc);
                tmc=tmc+mci;
            }
            String tmcs = Integer.toString(tmc);
            dtm.setText(tmcs);
        
        
        DBCollection customer = db.getCollection("Customer_detail");
        String map = "function() { emit(this.cust_activity,1); }";
        String reduce = "function(key, values) {return Array.sum(values)}";
        MapReduceCommand cmd = new MapReduceCommand(customer, map, reduce,
                     null, MapReduceCommand.OutputType.INLINE, null);
        MapReduceOutput out = customer.mapReduce(cmd);
        for (DBObject o : out.results()) {
            
            String x = (String)o.get("_id");
            double v = (double)o.get("value");
            model.addRow(new Object[]{x,v});
        }
        panel6.add(scroll1);
        
        int total=0;
                            DBCollection trainer = db.getCollection("Trainer");
                            DBCursor cursort = trainer.find();
                            while(cursort.hasNext()){
                                BasicDBObject objt1 = (BasicDBObject)cursort.next();
                                
                                    //JOptionPane.showMessageDialog( management_staff , "email matched");
                                    String td = objt1.getString("domain");
                                    //JOptionPane.showMessageDialog( management_staff , td);
                                    Integer cs = objt1.getInt("cust_serviced");
                                    DBCollection activity = db.getCollection("Activity");
                                    DBCursor cursora = activity.find();
                                    while(cursora.hasNext()){
                                        BasicDBObject objt2 = (BasicDBObject)cursora.next();
                                        String act = objt2.getString("act_name");
                                        //JOptionPane.showMessageDialog( management_staff , act);
                                        if(act.contentEquals(td)){
                                            //JOptionPane.showMessageDialog( management_staff , "activity matched");
                                            String tf = objt2.getString("trainer_fee");
                                            int tfi = Integer.parseInt(tf);
                                            total = total + (cs * tfi);
                                            //String css = Integer.toString(cs);
                                            
                                            
                                        }
                                    
                                }
                            }
        total=total+40000+25000;
        String totals = Integer.toString(total);
        
        int totalr=0;
        
                            DBCollection customer1 = db.getCollection("Customer_detail");
                            DBCursor cursorc = customer1.find();
                            while(cursorc.hasNext()){
                                BasicDBObject objt1 = (BasicDBObject)cursorc.next();
                                
                                    //JOptionPane.showMessageDialog( management_staff , "email matched");
                                    String ca = objt1.getString("cust_activity");
                                    //JOptionPane.showMessageDialog( management_staff , td);
                                    
                                    DBCollection activity1 = db.getCollection("Activity");
                                    DBCursor cursorac = activity1.find();
                                    while(cursorac.hasNext()){
                                        BasicDBObject objt2 = (BasicDBObject)cursorac.next();
                                        String act = objt2.getString("act_name");
                                        //JOptionPane.showMessageDialog( management_staff , act);
                                        if(act.contentEquals(ca)){
                                            //JOptionPane.showMessageDialog( management_staff , "activity matched");
                                            String rf = objt2.getString("registration_fee");
                                            int rfi = Integer.parseInt(rf);
                                            totalr = totalr + (rfi);
                                            //String css = Integer.toString(cs);
                                            
                                            
                                        }
                                    
                                }
                            }
                            
        String totalrs = Integer.toString(totalr);
        totalrfee.setText(totalrs);
        empsal.setText(totals);
        report.setVisible(true);
        manager.setVisible(false);
        mongo.close();
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        report.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        equipment_info.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        customer_info.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        t_login.setVisible(false);
        management_staff.setVisible(true);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        em_login.setVisible(false);
        management_staff.setVisible(true);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        employee_info.setVisible(false);
        manager.setVisible(true);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        l1.setVisible(true);
        l2.setVisible(true);
        c1.setVisible(true);
        c2.setVisible(true);
        b1.setVisible(true);
        l3.setVisible(true);
        t1.setVisible(true);
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
            
        JTable table;
        String[] columnNames = {"Sr no.","Activity name","Days","Trainer fee","Registration fee","Equipment set"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 1400, 250);
        
        String a = (String) c1.getSelectedItem();
        String field = (String) c2.getSelectedItem();
        String change = (String) t1.getText();
        
        MongoClient mongo=new MongoClient("localhost",27017);
        DB db=mongo.getDB("Adventure_Nation");
       
        DBCollection activity = db.getCollection("Activity");
        DBCursor cursor = activity.find();
        
        while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String act = (String) obj1.get("act_name");
                if(a.contentEquals(act)){
                    //JOptionPane.showMessageDialog( rootPane, "activity matched.");
                    if(field.contentEquals("registration_fee")){
                        //JOptionPane.showMessageDialog( rootPane, "regidtartion_fee match");
                        BasicDBObject newdocument = new BasicDBObject().append("$set", new BasicDBObject().append("registration_fee", change));
                        activity.update(new BasicDBObject().append("act_name", act ), newdocument);
                        //JOptionPane.showMessageDialog( rootPane, "updated");
                        break;
                    }
                    if(field.contentEquals("trainer_fee")){
                        //JOptionPane.showMessageDialog( rootPane, "trainer_fee match");
                        BasicDBObject newdocument = new BasicDBObject().append("$set", new BasicDBObject().append("trainer_fee", change));
                        activity.update(new BasicDBObject().append("act_name", act ), newdocument);
                        //JOptionPane.showMessageDialog( rootPane, "updated");
                        break;
                    }
                }
        }
        
        l1.setVisible(false);
        l2.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        b1.setVisible(false);
        l3.setVisible(false);
        t1.setVisible(false);
        //activity_info.setVisible(false);
       // manager.setVisible(true);
        panel1.removeAll();
        
                DBCollection activity1 = db.getCollection("Activity");
                DBCursor cursor1 = activity1.find();
                int i=0;
                while(cursor1.hasNext()){
                BasicDBObject obj2 = (BasicDBObject)cursor1.next();
                i=i+1;
                String act = (String) obj2.get("act_name");
                String d = (String) obj2.get("days");
                String tfee = (String) obj2.get("trainer_fee");
                String rfee = (String) obj2.get("registration_fee");
                String es = (String) obj2.get("equipment_set");
                
                model.addRow(new Object[]{i,act,d,tfee,rfee,es});
            }
        
        panel1.add(scroll1);
        t1.setText("");
        mongo.close();
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }//GEN-LAST:event_b1ActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        try{
            
        JTable table;
        String[] columnNames = {"Sr no.","Employee Name","Address","Email","Contact","Blood grp","Designation"};
 
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(columnNames);

        table = new JTable();
        table.setModel(model);
        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        table.setBackground(Color.lightGray);
        table.setEnabled(true);
        table.setFillsViewportHeight(true);
        table.setFont(new Font("", 0, 20));
        table.setRowHeight(25);
        table.getTableHeader().setFont(new Font("", 1, 22));
 
        JScrollPane scroll1 = new JScrollPane(table);
        scroll1.setBounds(0, 0, 1600, 500);
        scroll1.setHorizontalScrollBarPolicy(
                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scroll1.setVerticalScrollBarPolicy(
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                
        String dem = (String) dt.getText();
        
        
                MongoClient mongo=new MongoClient("localhost",27017);
                DB db=mongo.getDB("Adventure_Nation");
        
                DBCollection employee = db.getCollection("Employee");
                DBCursor cursor = employee.find();
                
                while(cursor.hasNext()){
                BasicDBObject obj1 = (BasicDBObject)cursor.next();
                String email = (String) obj1.get("emp_email");
                if(dem.contentEquals(email)){
                    //JOptionPane.showMessageDialog( rootPane, "activity matched.");
                    employee.remove(obj1);
                    
                    DBCollection trainer = db.getCollection("Trainer");
                    DBCursor tcursor = trainer.find();
                
                    while(tcursor.hasNext()){
                    BasicDBObject objt = (BasicDBObject)tcursor.next();
                    String temail = (String) objt.get("t_email");
                    if(dem.contentEquals(temail)){
                        //JOptionPane.showMessageDialog( rootPane, "activity matched.");
                        trainer.remove(objt);
                    }
                    }
                }
            }
            
            panel11.removeAll();
            
            DBCollection employee1 = db.getCollection("Employee");
            DBCursor cursor1 = employee1.find();  
            int i=0;
            while(cursor1.hasNext()){
                BasicDBObject obj2 = (BasicDBObject)cursor1.next();
                i=i+1;
                String ename = (String) obj2.get("emp_name");
                String bc = (String) obj2.get("emp_address");
                String mc = (String) obj2.get("emp_email");
                String qt = (String) obj2.get("emp_contact");
                String a = (String) obj2.get("emp_bloodgrp");
                String d = (String) obj2.get("designation");
                
                model.addRow(new Object[]{i,ename,bc,mc,qt,a,d});
            }
        
        panel11.add(scroll1);
        del.setVisible(false);
        dl.setVisible(false);
        dt.setVisible(false);
        employee_info.setVisible(true);
        manager.setVisible(false);
        //activity_info.setSize(400, 300);
        mongo.close();
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
        }
    }//GEN-LAST:event_delActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        del.setVisible(true);
        dl.setVisible(true);
        dt.setVisible(true);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        String mt = (String)dtm.getText();
        String emp = (String)empsal.getText();
        String totalr = (String)totalrfee.getText();
        int mti = Integer.parseInt(mt);
        int empi = Integer.parseInt(emp);
        int totalri = Integer.parseInt(totalr);
        
        int pro = (totalri - (mti+empi));
        String pros = Integer.toString(pro);
        profit.setText(pros);
    }//GEN-LAST:event_jButton21ActionPerformed

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
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(first.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new first().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activity;
    private javax.swing.JFrame activity_info;
    private javax.swing.JFrame add_grp_member;
    private javax.swing.JTextField addr;
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JLabel agm_bg;
    private javax.swing.JLabel ai_bg;
    private javax.swing.JTextField amount;
    private javax.swing.JButton b1;
    private javax.swing.JLabel bg;
    private javax.swing.JComboBox<String> bg1;
    private javax.swing.JLabel bg_l;
    private javax.swing.JComboBox<String> c1;
    private javax.swing.JComboBox<String> c2;
    private javax.swing.JTextField c_name;
    private javax.swing.JLabel ca;
    private javax.swing.JTextField cardno;
    private javax.swing.JLabel cc;
    private javax.swing.JLabel cd_bg;
    private javax.swing.JTextField chname;
    private javax.swing.JLabel ci_bg;
    private javax.swing.JLabel cn;
    private javax.swing.JLabel cr_bgl;
    private javax.swing.JTextField cust_el;
    private javax.swing.JFrame customer_details;
    private javax.swing.JFrame customer_info;
    private javax.swing.JFrame customer_registration;
    private javax.swing.JTextField cvv;
    private javax.swing.JLabel daer;
    private javax.swing.JLabel datr;
    private javax.swing.JButton del;
    private javax.swing.JComboBox<String> des;
    private javax.swing.JComboBox<String> designation;
    private javax.swing.JLabel dl;
    private javax.swing.JLabel dom;
    private javax.swing.JTextField domain;
    private javax.swing.JTextField dt;
    private javax.swing.JLabel dtm;
    private javax.swing.JComboBox<String> e_bg;
    private javax.swing.JTextField e_cont;
    private javax.swing.JTextField e_email;
    private javax.swing.JTextField e_name;
    private javax.swing.JLabel ea;
    private javax.swing.JLabel eb;
    private javax.swing.JLabel ec;
    private javax.swing.JLabel ec_bg;
    private javax.swing.JFrame ec_login;
    private javax.swing.JLabel ecl_bg;
    private javax.swing.JLabel ee;
    private javax.swing.JLabel ei_bg;
    private javax.swing.JLabel em;
    private javax.swing.JFrame em_login;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emb_bg;
    private javax.swing.JLabel empi_bg;
    private javax.swing.JFrame employee_info;
    private javax.swing.JLabel empsal;
    private javax.swing.JLabel en;
    private javax.swing.JLabel ep;
    private javax.swing.JFrame equipment_info;
    private javax.swing.JLabel es;
    private javax.swing.JLabel eu;
    private javax.swing.JFrame existing_customer;
    private javax.swing.JTextArea exp;
    private javax.swing.JLabel f_bg;
    private javax.swing.JFrame feedback;
    private javax.swing.JLabel gn;
    private javax.swing.JTextField grp;
    private javax.swing.JTextField health;
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
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JLayeredPane jLayeredPane12;
    private javax.swing.JLayeredPane jLayeredPane13;
    private javax.swing.JLayeredPane jLayeredPane15;
    private javax.swing.JLayeredPane jLayeredPane16;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane21;
    private javax.swing.JLayeredPane jLayeredPane22;
    private javax.swing.JLayeredPane jLayeredPane23;
    private javax.swing.JLayeredPane jLayeredPane24;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JLayeredPane jLayeredPane6;
    private javax.swing.JLayeredPane jLayeredPane7;
    private javax.swing.JLayeredPane jLayeredPane8;
    private javax.swing.JLayeredPane jLayeredPane9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JTextField m;
    private javax.swing.JLabel m_bg;
    private javax.swing.JFrame management_staff;
    private javax.swing.JFrame manager;
    private javax.swing.JTextField mob;
    private javax.swing.JLabel ms_bg;
    private javax.swing.JLabel ner_bg;
    private javax.swing.JFrame new_emp_reg;
    private javax.swing.JFrame new_registration;
    private javax.swing.JLabel nr_bg;
    private javax.swing.JLabel p_bg;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel10;
    private javax.swing.JPanel panel11;
    private javax.swing.JPanel panel2;
    private javax.swing.JPanel panel3;
    private javax.swing.JPanel panel5;
    private javax.swing.JPanel panel6;
    private javax.swing.JPanel panel8;
    private javax.swing.JPanel panel9;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField password;
    private javax.swing.JFrame payment;
    private javax.swing.JLabel profit;
    private javax.swing.JComboBox<String> quality;
    private javax.swing.JLabel r_bg;
    private javax.swing.JFrame report;
    private javax.swing.JComboBox<String> rt;
    private javax.swing.JLabel sal;
    private javax.swing.JTextArea sugg;
    private javax.swing.JTextField t1;
    private javax.swing.JLabel t_bg;
    private javax.swing.JFrame t_login;
    private javax.swing.JLabel ta;
    private javax.swing.JLabel tb;
    private javax.swing.JLabel tc;
    private javax.swing.JLabel te;
    private javax.swing.JLabel tn;
    private javax.swing.JLabel totalrfee;
    private javax.swing.JLabel tp;
    private javax.swing.JLabel tu;
    private javax.swing.JTextField user;
    private javax.swing.JTextField username;
    private javax.swing.JTextField y;
    // End of variables declaration//GEN-END:variables
}
