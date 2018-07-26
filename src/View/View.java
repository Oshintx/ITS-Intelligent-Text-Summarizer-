package View;

import Controller.SummaryTool;
import javax.swing.JOptionPane;

/**
 *
 * @author Oshin
 */
public class View extends javax.swing.JFrame {

    SummaryTool summary = new SummaryTool();

    public View() {
        initComponents();
        switchScreens();

    }

    public void switchScreens() {
        int selectedIndex = jTabbedPaneHead.getSelectedIndex();
//        if (selectedIndex == 0) {
//            jTabbedPaneHead.setEnabledAt(1, false);
//            jTabbedPaneHead.setEnabledAt(2, false);
//            jTabbedPaneHead.setEnabledAt(3, false);
//            jTabbedPaneHead.setEnabledAt(4, false);
//        }

        if (selectedIndex == 1) {
            int answer = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "ITS V.1.0", JOptionPane.YES_NO_OPTION);
            if (answer == 0) {            //yes=0   No=1
                this.dispose(); //exit application
            }
            if (answer == 1) {
                jTabbedPaneHead.setSelectedIndex(0);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        radGrpGender = new javax.swing.ButtonGroup();
        jTabbedPaneHead = new javax.swing.JTabbedPane();
        jTabbedPaneSub = new javax.swing.JTabbedPane();
        jPanelWelcome = new javax.swing.JPanel();
        btnSummerize = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInputDocument = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOutputDocument = new javax.swing.JTextArea();
        jLabel23 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblCompressionRatio = new javax.swing.JLabel();
        lblNoOfWordsInContext = new javax.swing.JLabel();
        lblNoOfParagraphsInSummary = new javax.swing.JLabel();
        lblNoOfWordsSummary = new javax.swing.JLabel();
        jPanelExit = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(32, 33, 35));
        setUndecorated(true);
        setResizable(false);

        jTabbedPaneHead.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jTabbedPaneHead.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPaneHeadMouseClicked(evt);
            }
        });

        jTabbedPaneSub.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jPanelWelcome.setBackground(new java.awt.Color(32, 33, 35));
        jPanelWelcome.setVerifyInputWhenFocusTarget(false);
        jPanelWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSummerize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/school-material (1).png"))); // NOI18N
        btnSummerize.setBorder(null);
        btnSummerize.setContentAreaFilled(false);
        btnSummerize.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/approval.png"))); // NOI18N
        btnSummerize.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/write.png"))); // NOI18N
        btnSummerize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSummerizeActionPerformed(evt);
            }
        });
        jPanelWelcome.add(btnSummerize, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 340, 100, 70));

        txtAreaInputDocument.setColumns(20);
        txtAreaInputDocument.setRows(5);
        jScrollPane1.setViewportView(txtAreaInputDocument);

        jPanelWelcome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 930, 280));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BOT Predicted Intent: ");
        jPanelWelcome.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTabbedPaneSub.addTab("                                          Input                                          ", jPanelWelcome);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaOutputDocument.setEditable(false);
        txtAreaOutputDocument.setColumns(20);
        txtAreaOutputDocument.setRows(5);
        jScrollPane2.setViewportView(txtAreaOutputDocument);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 930, 280));

        jLabel23.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Traffic Monitor");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 200, -1));

        jLabel25.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Commpression Ratio :");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 430, 160, -1));

        jLabel26.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Number of words in Context(Input Document) :");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 340, -1));

        jLabel27.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Number of  Paragraphs in Context :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 260, -1));

        jLabel28.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Number of words in Summary(Output) :");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 290, -1));

        jLabel29.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Number of  Paragraphs in Summary :");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 390, 260, -1));

        lblCompressionRatio.setForeground(new java.awt.Color(204, 0, 0));
        lblCompressionRatio.setText("..");
        jPanel1.add(lblCompressionRatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 20, -1));

        lblNoOfWordsInContext.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfWordsInContext.setText("..");
        jPanel1.add(lblNoOfWordsInContext, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 20, -1));

        lblNoOfParagraphsInSummary.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfParagraphsInSummary.setText("..");
        jPanel1.add(lblNoOfParagraphsInSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 20, -1));

        lblNoOfWordsSummary.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfWordsSummary.setText("..");
        jPanel1.add(lblNoOfWordsSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 20, -1));

        jTabbedPaneSub.addTab("                                        Output                                        ", jPanel1);

        jTabbedPaneHead.addTab("                                            Intelligent Text Summarizer                                      ", jTabbedPaneSub);

        jPanelExit.setBackground(new java.awt.Color(32, 33, 35));
        jPanelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Traffic Monitor");
        jPanelExit.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, -1));

        jTabbedPaneHead.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png")), jPanelExit); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneHead, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneHead)
        );

        jTabbedPaneHead.getAccessibleContext().setAccessibleName("     Me     ");

        setSize(new java.awt.Dimension(976, 543));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPaneHeadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPaneHeadMouseClicked
        switchScreens();
    }//GEN-LAST:event_jTabbedPaneHeadMouseClicked

    private void btnSummerizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSummerizeActionPerformed
        summary.init();
        summary.extractSentenceFromContext();
        summary.groupSentencesIntoParagraphs();
        summary.createIntersectionMatrix();
        summary.createDictionary();
        System.out.println("SUMMMARY");
        summary.createSummary();
        summary.printSummary();
        summary.printStats();
        

        //summary.printSentences();
        //System.out.println("INTERSECTION MATRIX");
        //summary.printIntersectionMatrix();
        //summary.printDicationary();
    }//GEN-LAST:event_btnSummerizeActionPerformed

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
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSummerize;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneHead;
    private javax.swing.JTabbedPane jTabbedPaneSub;
    private javax.swing.JLabel lblCompressionRatio;
    private javax.swing.JLabel lblNoOfParagraphsInSummary;
    private javax.swing.JLabel lblNoOfWordsInContext;
    private javax.swing.JLabel lblNoOfWordsSummary;
    private javax.swing.ButtonGroup radGrpGender;
    private javax.swing.JTextArea txtAreaInputDocument;
    private javax.swing.JTextArea txtAreaOutputDocument;
    // End of variables declaration//GEN-END:variables

}
