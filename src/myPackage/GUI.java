package myPackage;
import java.awt.*;
import static java.awt.SystemColor.text;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.font.TextAttribute;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {
    LinkShortener ls;
    public GUI() {
        initComponents();
        this.setTitle("Link Shortener");
        ls = new LinkShortener("short.ly");
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        originalUrlField = new javax.swing.JTextField();
        shortUrlButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        shortUrlLabel = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Please Enter the URL Here:");

        originalUrlField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        originalUrlField.setToolTipText("https://google.com");
        originalUrlField.setBorder(null);

        shortUrlButton.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        shortUrlButton.setText("Short URL");
        shortUrlButton.setOpaque(true);
        shortUrlButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shortUrlButtonMouseClicked(evt);
            }
        });
        shortUrlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shortUrlButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Your Short URL is here: ");
        jLabel2.setPreferredSize(new java.awt.Dimension(201, 30));

        shortUrlLabel.setBackground(new java.awt.Color(255, 255, 255));
        shortUrlLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        shortUrlLabel.setForeground(new java.awt.Color(255, 255, 0));
        shortUrlLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                shortUrlLabelMouseDragged(evt);
            }
        });
        shortUrlLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shortUrlLabelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                shortUrlLabelMouseEntered(evt);
            }
        });

        name.setFont(new java.awt.Font("Glacial Indifference", 1, 36)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Link Shortener");

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton1.setText("Copy URL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(shortUrlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(265, 265, 265))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(shortUrlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(originalUrlField, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(name))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(jLabel1)))
                .addGap(93, 93, 93))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(name)
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(originalUrlField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(shortUrlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(shortUrlLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void shortUrlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shortUrlButtonActionPerformed
        String originalUrl = originalUrlField.getText();
            if(originalUrl.isEmpty() || !originalUrl.matches("https://www\\.[A-Za-z0-9]+\\.com.*")){
                JOptionPane.showMessageDialog(null,"Invalid URL, Please enter a valid URL");
                originalUrlField.setText("");
                shortUrlLabel.setText("");
            }
//            else if(LinkShortener.urlMap.containsValue(originalUrl)){
//                JOptionPane.showMessageDialog(null,"Given URL is already present, try a different URL");
//                originalUrlField.setText("");
//                shortUrlLabel.setText("");
//            }
            else{
            String shortUrl = ls.shortenUrl(originalUrl);
            shortUrlLabel.setText(shortUrl);
            }
    }//GEN-LAST:event_shortUrlButtonActionPerformed

    private void shortUrlButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortUrlButtonMouseClicked

    }//GEN-LAST:event_shortUrlButtonMouseClicked

    private void shortUrlLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortUrlLabelMouseClicked
                String shortUrl = shortUrlLabel.getText();
                String originalUrl = ls.expandUrl(shortUrl);
                if (originalUrl != null) {
                    ls.openLink(originalUrl);
                }
                else{
                    JOptionPane.showMessageDialog(null,"URL not found");
                }
    }//GEN-LAST:event_shortUrlLabelMouseClicked

    private void shortUrlLabelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortUrlLabelMouseDragged
        
    }//GEN-LAST:event_shortUrlLabelMouseDragged

    private void shortUrlLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shortUrlLabelMouseEntered
        Font font = shortUrlLabel.getFont();
        Map<TextAttribute, Object> attributes = new HashMap<>(font.getAttributes());
        attributes.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        shortUrlLabel.setFont(font.deriveFont(attributes));
    }//GEN-LAST:event_shortUrlLabelMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String shortUrl = shortUrlLabel.getText();
        StringSelection selection = new StringSelection(shortUrl);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(selection, null);
        JOptionPane.showMessageDialog(null,"URL successfully copied to clipboard");
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JTextField originalUrlField;
    private javax.swing.JButton shortUrlButton;
    private javax.swing.JLabel shortUrlLabel;
    // End of variables declaration//GEN-END:variables
}
