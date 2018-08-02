package View;

import Controller.Algorithm;
import java.awt.Color;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Document;
import javax.swing.text.Highlighter;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Oshin
 */
public class View extends javax.swing.JFrame {

    Highlighter.HighlightPainter myHighlightPainter = new MyHighLighterPainter(Color.red);
    Highlighter.HighlightPainter myHighlightPainterYellow = new MyHighLighterPainter(Color.yellow);
    int calculatedPercentageLevel;

    Algorithm summary = new Algorithm();

    public View() {
        initComponents();
        switchScreens();

    }

    public void switchScreens() {
        int selectedIndexHead = jTabbedPaneHead.getSelectedIndex();
        int selectedIndexSub = jTabbedPaneSub.getSelectedIndex();

        if (selectedIndexHead == 1) {
            int answer = JOptionPane.showConfirmDialog(null, "Do you really want to Exit?", "ITS V.1.0", JOptionPane.YES_NO_OPTION);
            if (answer == 0) {            //yes=0   No=1
                this.dispose();
            }
            if (answer == 1) {
                jTabbedPaneHead.setSelectedIndex(0);
            }
        }

        if (selectedIndexSub == 0) {
            jTabbedPaneSub.setEnabledAt(1, false);
        }
        if (selectedIndexSub == 1) {
            jTabbedPaneSub.setEnabledAt(1, true);
        }
    }

    public void calculatePercentageLevel(int currentPercentageLevel) {

        this.calculatedPercentageLevel = currentPercentageLevel / 5;
        System.out.println("calculated Percentage Level : " + this.calculatedPercentageLevel);

    }

    class MyHighLighterPainter extends DefaultHighlighter.DefaultHighlightPainter {

        public MyHighLighterPainter(Color color) {
            super(color);
        }
    }

    public void highlight(JTextComponent txtAreaOutputDocument, String pattern) {

        try {

            Highlighter hilite = txtAreaOutputDocument.getHighlighter();
            Document doc = txtAreaOutputDocument.getDocument();
            String text = doc.getText(0, doc.getLength());
            int pos = 0;//position

            while ((pos = text.toUpperCase().indexOf(pattern.toUpperCase(), pos)) >= 0) {
                hilite.addHighlight(pos, pos + pattern.length(), myHighlightPainter);
                pos += pattern.length();
            }

        } catch (Exception e) {
        }

    }

    public void highlightYellow(JTextComponent txtAreaOutputDocument, String pattern) {

        try {

            Highlighter hilite = txtAreaOutputDocument.getHighlighter();
            Document doc = txtAreaOutputDocument.getDocument();
            String text = doc.getText(0, doc.getLength());
            int pos = 0;//position

            while ((pos = text.toUpperCase().indexOf(pattern.toUpperCase(), pos)) >= 0) {
                hilite.addHighlight(pos, pos + pattern.length(), myHighlightPainterYellow);
                pos += pattern.length();
            }

        } catch (Exception e) {
        }

    }

//    public void writeOriginalDocumentToFile() {
//        try {
//            FileOutputStream out = new FileOutputStream(new File("originalText.txt"));
//            out.write(txtAreaInputDocument.getText());
//        } catch (FileNotFoundException e) {
//            System.out.println(e);
//        }
//    }
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
        search = new javax.swing.JTextField();
        cmbSelectPercentageLevel = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaOutputDocument = new javax.swing.JTextArea();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        lblCompressionRatio = new javax.swing.JLabel();
        lblNoOfParagraphsInContext = new javax.swing.JLabel();
        lblNoOfParagraphsInSummary = new javax.swing.JLabel();
        lblNoOfWordsSummary = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lblNoOfWordsInContext1 = new javax.swing.JLabel();
        lblNoOfSentencesInContext = new javax.swing.JLabel();
        btnHow = new javax.swing.JButton();
        jPanelExit = new javax.swing.JPanel();

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

        jPanelWelcome.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 280));
        jPanelWelcome.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 150, -1));

        cmbSelectPercentageLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "25", "50", "75", "100" }));
        cmbSelectPercentageLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSelectPercentageLevelActionPerformed(evt);
            }
        });
        jPanelWelcome.add(cmbSelectPercentageLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, 190, -1));

        jButton2.setText("Find Key Word");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanelWelcome.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 150, -1));

        jTabbedPaneSub.addTab("                      Place Your Document Here                     ", jPanelWelcome);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAreaOutputDocument.setEditable(false);
        txtAreaOutputDocument.setColumns(20);
        txtAreaOutputDocument.setRows(5);
        jScrollPane2.setViewportView(txtAreaOutputDocument);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 930, 280));

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
        jLabel27.setText("Number of  Sentences in Context :");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 250, -1));

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
        jPanel1.add(lblCompressionRatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 430, 170, -1));

        lblNoOfParagraphsInContext.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfParagraphsInContext.setText("..");
        jPanel1.add(lblNoOfParagraphsInContext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 420, 90, -1));

        lblNoOfParagraphsInSummary.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfParagraphsInSummary.setText("..");
        jPanel1.add(lblNoOfParagraphsInSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 120, -1));

        lblNoOfWordsSummary.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfWordsSummary.setText("..");
        jPanel1.add(lblNoOfWordsSummary, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 120, -1));

        jLabel30.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("Number of  Paragraphs in Context :");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 260, -1));

        lblNoOfWordsInContext1.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfWordsInContext1.setText("..");
        jPanel1.add(lblNoOfWordsInContext1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 110, -1));

        lblNoOfSentencesInContext.setForeground(new java.awt.Color(204, 0, 0));
        lblNoOfSentencesInContext.setText("..");
        jPanel1.add(lblNoOfSentencesInContext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 120, -1));

        btnHow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/question32.png"))); // NOI18N
        btnHow.setBorder(null);
        btnHow.setContentAreaFilled(false);
        btnHow.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/questionPressed.png"))); // NOI18N
        btnHow.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/questionRollover.png"))); // NOI18N
        btnHow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHowActionPerformed(evt);
            }
        });
        jPanel1.add(btnHow, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 420, -1, -1));

        jTabbedPaneSub.addTab("                                        Output                                        ", jPanel1);

        jTabbedPaneHead.addTab("                                            Intelligent Text Summarizer                                      ", jTabbedPaneSub);

        jPanelExit.setBackground(new java.awt.Color(32, 33, 35));
        jPanelExit.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jTabbedPaneHead.addTab("", new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png")), jPanelExit); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPaneHead)
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

        if (!txtAreaInputDocument.getText().isEmpty()) {

            try {
                File file = new File("context.txt");
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(txtAreaInputDocument.getText());
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            summary.init();
            summary.extractSentenceFromContext();
            lblNoOfSentencesInContext.setText(Integer.toString(summary.getNoOfSentences()));
            lblNoOfParagraphsInContext.setText(Integer.toString(summary.getNoOfParagraphs() + 1));
            lblNoOfWordsInContext1.setText(Double.toString(summary.getWordCount(summary.getSentences())));

            /////
            summary.groupSentencesIntoParagraphs();
            summary.createIntersectionMatrix();
            summary.createDictionary();
            System.out.println("SUMMMARY");
            summary.createSummary(this.calculatedPercentageLevel);
            summary.printSummary();
            summary.printStats();
            summary.DictionaryOfParagraphNoAndSentence();
            // summary.printDicationary();

            txtAreaOutputDocument.setText(summary.getFinalSummery());
            // txtAreaOutputDocument.setText(summary.getFinaldictionaryOfParagraphNoAndSentence());
            lblNoOfWordsSummary.setText(Double.toString(summary.getWordCount(summary.getContentSummary())));
            summary.setCommpression();
            lblCompressionRatio.setText(Double.toString(summary.getCommpression()));

            //// Summery base on key words-------------------.
             summary.createnoOfKeyWordsArray(search.getText());
             summary.createIntersectionMatrixBaseOnKeyWords();
             summary.createDictionaryBaseOnKeyWords();
             summary.createSummaryBaseOnKeyWords();
             summary.printSummaryBaseOnKeyWords();
            //txtAreaOutputDocument.setText(summary.getFinalSummeryBaseOnKeyWord());
            // highlightYellow(txtAreaOutputDocument,search.getText());
//---------------------------------------Extra--------------------------------------
            // summary.init();
            // summary.extractSentenceFromContext();
            //summary.groupSentencesIntoParagraphs();
            // summary.createIntersectionMatrix();
            // summary.createDictionary();
            // System.out.println("SUMMMARY");
            // summary.createSummary();
            // summary.printSummary();
            //  summary.printStats();
            //summary.printSentences();
            //System.out.println("INTERSECTION MATRIX");
            // summary.printIntersectionMatrix();
            //Go To Output Tab
            jTabbedPaneSub.setSelectedIndex(1);
            switchScreens();

        } else {
            JOptionPane.showMessageDialog(null, "Please place your summery here !", " ITS ", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSummerizeActionPerformed

    private void btnHowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHowActionPerformed
//        how h = new how();
//        h.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btnHowActionPerformed

    private void cmbSelectPercentageLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSelectPercentageLevelActionPerformed
        int currentPercentageLevel = Integer.parseInt(cmbSelectPercentageLevel.getSelectedItem().toString());
        calculatePercentageLevel(currentPercentageLevel);
        System.out.println("currentPercentageLevel" + currentPercentageLevel);

    }//GEN-LAST:event_cmbSelectPercentageLevelActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        highlight(txtAreaInputDocument, search.getText());

    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

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

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHow;
    private javax.swing.JButton btnSummerize;
    private javax.swing.JComboBox<String> cmbSelectPercentageLevel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelExit;
    private javax.swing.JPanel jPanelWelcome;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPaneHead;
    private javax.swing.JTabbedPane jTabbedPaneSub;
    private javax.swing.JLabel lblCompressionRatio;
    private javax.swing.JLabel lblNoOfParagraphsInContext;
    private javax.swing.JLabel lblNoOfParagraphsInSummary;
    private javax.swing.JLabel lblNoOfSentencesInContext;
    private javax.swing.JLabel lblNoOfWordsInContext1;
    private javax.swing.JLabel lblNoOfWordsSummary;
    private javax.swing.ButtonGroup radGrpGender;
    private javax.swing.JTextField search;
    private javax.swing.JTextArea txtAreaInputDocument;
    private javax.swing.JTextArea txtAreaOutputDocument;
    // End of variables declaration//GEN-END:variables

}
