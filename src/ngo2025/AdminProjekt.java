/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ngo2025;
import oru.inf.InfDB;
import oru.inf.InfException;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.HashMap;


public class AdminProjekt extends javax.swing.JFrame {

    private InfDB idb;
     private String inloggadAnvändare;
     private javax.swing.JTextField idField;
   
    public AdminProjekt(InfDB idb,String inloggadAnvändare) {
        this.idb=idb;
        this.inloggadAnvändare=inloggadAnvändare;
        
        initComponents();
        jLabelAnvändare.setText(inloggadAnvändare);
        fyllComboBoxVäljProjekt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAnvändare = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        bLaggTillProjekt = new javax.swing.JButton();
        bAndraUppgifter = new javax.swing.JButton();
        bTaBortProjekt = new javax.swing.JButton();
        pidField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        projektnamnField = new javax.swing.JTextField();
        beskrivningField = new javax.swing.JTextField();
        startdatumField = new javax.swing.JTextField();
        slutdatumField = new javax.swing.JTextField();
        kostnadField = new javax.swing.JTextField();
        statusField = new javax.swing.JTextField();
        prioritetField = new javax.swing.JTextField();
        projektchefField = new javax.swing.JTextField();
        landField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jComboBoxVäljProjekt = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAnvändare.setText("jLabel1");

        jLabel1.setText("Projektmeny");

        bLaggTillProjekt.setText("Lägg till projekt");
        bLaggTillProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLaggTillProjektActionPerformed(evt);
            }
        });

        bAndraUppgifter.setText("Ändra uppgifter");
        bAndraUppgifter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAndraUppgifterActionPerformed(evt);
            }
        });

        bTaBortProjekt.setText("Ta bort projekt");
        bTaBortProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTaBortProjektActionPerformed(evt);
            }
        });

        jLabel2.setText("PID");

        jLabel7.setText("Kostnad");

        jLabel3.setText("Projektnamn");

        jLabel4.setText("Beskrivning");

        jLabel5.setText("Startdatum");

        jLabel6.setText("Slutdatum");

        jLabel8.setText("Status");

        jLabel9.setText("Prioritet");

        jLabel10.setText("Projektchef");

        jLabel11.setText("Land");

        jLabel12.setText("Välj Projekt");

        jComboBoxVäljProjekt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxVäljProjekt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxVäljProjektActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAnvändare)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bTaBortProjekt)
                            .addComponent(bAndraUppgifter)
                            .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projektnamnField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(beskrivningField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(startdatumField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(slutdatumField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kostnadField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prioritetField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(projektchefField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(landField, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(152, 152, 152))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(jComboBoxVäljProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(68, 68, 68)
                        .addComponent(bLaggTillProjekt)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel12)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(bLaggTillProjekt)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAnvändare)
                    .addComponent(bAndraUppgifter)
                    .addComponent(jComboBoxVäljProjekt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bTaBortProjekt)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(pidField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kostnadField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projektnamnField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(beskrivningField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prioritetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startdatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projektchefField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(slutdatumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(landField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel11))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void fyllComboBoxVäljProjekt() {
    try {
        jComboBoxVäljProjekt.removeAllItems();
        String sql = "SELECT pid FROM projekt";
        ArrayList<HashMap<String, String>> projektLista = idb.fetchRows(sql);

        if (projektLista != null) {
            for (HashMap<String, String> projekt : projektLista) {
                jComboBoxVäljProjekt.addItem(projekt.get("pid"));
            }
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid hämtning av projekt: " + e.getMessage());
    }
}
    private void bLaggTillProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLaggTillProjektActionPerformed
        // TODO add your handling code here:
try {
        String pid = pidField.getText();
        String projektnamn = projektnamnField.getText();
        String beskrivning = beskrivningField.getText();
        String startdatum = startdatumField.getText();
        String slutdatum = slutdatumField.getText();
        String kostnad = kostnadField.getText();
        String status = statusField.getText();
        String prioritet = prioritetField.getText();
        String projektchef = projektchefField.getText();
        String land = landField.getText();

        if (!Validering.isNotEmpty(pid) || !Validering.isNotEmpty(projektnamn) || !Validering.isNotEmpty(beskrivning)
        || !Validering.isNotEmpty(startdatum) || !Validering.isNotEmpty(slutdatum)
        || !Validering.isNotEmpty(kostnad) || !Validering.isNotEmpty(status)
        || !Validering.isNotEmpty(prioritet) || !Validering.isNotEmpty(projektchef)
        || !Validering.isNotEmpty(land)) {
    JOptionPane.showMessageDialog(this, "Alla fält måste fyllas i.");
    return;
}

if (!Validering.isValidDate(startdatum) || !Validering.isValidDate(slutdatum)) {
    JOptionPane.showMessageDialog(this, "Datum måste vara i formatet yyyy-MM-dd.");
    return;
}
        
        String sql = "INSERT INTO projekt (pid, projektnamn, beskrivning, startdatum, slutdatum, kostnad, status, prioritet, projektchef, land) "
                   + "VALUES ('" + pid + "', '" + projektnamn + "', '" + beskrivning + "', '" + startdatum + "', '" + slutdatum + "', '" + kostnad + "', '" + status + "', '" + prioritet + "', '" + projektchef + "', '" + land + "')";
        
        idb.insert(sql);
        JOptionPane.showMessageDialog(null, "Projekt tillagt!");
        
        // Rensa fälten
        pidField.setText("");
        projektnamnField.setText("");
        beskrivningField.setText("");
        startdatumField.setText("");
        slutdatumField.setText("");
        kostnadField.setText("");
        statusField.setText("");
        prioritetField.setText("");
        projektchefField.setText("");
        landField.setText("");

    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Fel vid tillägg av projekt: " + e.getMessage());
    }
        
    }//GEN-LAST:event_bLaggTillProjektActionPerformed

    private void bAndraUppgifterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAndraUppgifterActionPerformed
        // TODO add your handling code here:
try {
        String pid = pidField.getText();
        String projektnamn = projektnamnField.getText();
        String beskrivning = beskrivningField.getText();
        String startdatum = startdatumField.getText();
        String slutdatum = slutdatumField.getText();
        String kostnad = kostnadField.getText();
        String status = statusField.getText();
        String prioritet = prioritetField.getText();
        String projektchef = projektchefField.getText();
        String land = landField.getText();

        if (!Validering.isNotEmpty(pid) || !Validering.isNotEmpty(projektnamn) || !Validering.isNotEmpty(beskrivning)
        || !Validering.isNotEmpty(startdatum) || !Validering.isNotEmpty(slutdatum)
        || !Validering.isNotEmpty(kostnad) || !Validering.isNotEmpty(status)
        || !Validering.isNotEmpty(prioritet) || !Validering.isNotEmpty(projektchef)
        || !Validering.isNotEmpty(land)) {
    JOptionPane.showMessageDialog(this, "Alla fält måste fyllas i.");
    return;
}

if (!Validering.isValidDate(startdatum) || !Validering.isValidDate(slutdatum)) {
    JOptionPane.showMessageDialog(this, "Datum måste vara i formatet yyyy-MM-dd.");
    return;
}
        
        String sql = "UPDATE projekt SET "
                   + "pid = '" + pid + "', "
                   + "projektnamn = '" + projektnamn + "', "
                   + "beskrivning = '" + beskrivning + "', "
                   + "startdatum = '" + startdatum + "', "
                   + "slutdatum = '" + slutdatum + "', "
                   + "kostnad = '" + kostnad + "', "
                   + "status = '" + status + "', "
                   + "prioritet = '" + prioritet + "', "
                   + "projektchef = '" + projektchef + "', "
                   + "land = '" + land + "' "
                   + "WHERE pid = " + pid;

        idb.update(sql);
        JOptionPane.showMessageDialog(null, "Uppgifter uppdaterade!");

    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Fel vid uppdatering: " + e.getMessage());
    }

    }//GEN-LAST:event_bAndraUppgifterActionPerformed

    private void bTaBortProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTaBortProjektActionPerformed
        // TODO add your handling code here:
try {
        String pid = pidField.getText();

        // Kontrollera att fältet inte är tomt
        if (pid.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Vänligen ange ett PID för att ta bort projektet.");
            return;
        }

        // Bekräftelse innan borttagning
        int bekräfta = JOptionPane.showConfirmDialog(null, "Är du säker på att du vill ta bort projektet med PID: " + pid + "?", "Bekräfta borttagning", JOptionPane.YES_NO_OPTION);
        if (bekräfta == JOptionPane.YES_OPTION) {
            String sql = "DELETE FROM projekt WHERE pid = '" + pid + "'";
            idb.delete(sql);
            JOptionPane.showMessageDialog(null, "Projektet har tagits bort!");

            // Rensa fälten
            pidField.setText("");
            projektnamnField.setText("");
            beskrivningField.setText("");
            startdatumField.setText("");
            slutdatumField.setText("");
            kostnadField.setText("");
            statusField.setText("");
            prioritetField.setText("");
            projektchefField.setText("");
            landField.setText("");
        }

    } catch (InfException e) {
        JOptionPane.showMessageDialog(null, "Fel vid borttagning av projekt: " + e.getMessage());
    }

    }//GEN-LAST:event_bTaBortProjektActionPerformed

    private void jComboBoxVäljProjektActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxVäljProjektActionPerformed
       String pid = (String) jComboBoxVäljProjekt.getSelectedItem();
    if (pid == null) return;

    try {
        String sql = "SELECT * FROM projekt WHERE pid = '" + pid + "'";
        HashMap<String, String> projekt = idb.fetchRow(sql);

        if (projekt != null) {
            pidField.setText(projekt.get("pid"));
            projektnamnField.setText(projekt.get("projektnamn"));
            beskrivningField.setText(projekt.get("beskrivning"));
            startdatumField.setText(projekt.get("startdatum"));
            slutdatumField.setText(projekt.get("slutdatum"));
            kostnadField.setText(projekt.get("kostnad"));
            statusField.setText(projekt.get("status"));
            prioritetField.setText(projekt.get("prioritet"));
            projektchefField.setText(projekt.get("projektchef"));
            landField.setText(projekt.get("land"));
        }
    } catch (InfException e) {
        JOptionPane.showMessageDialog(this, "Fel vid hämtning av projekt: " + e.getMessage());
    } 
    }//GEN-LAST:event_jComboBoxVäljProjektActionPerformed

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
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminProjekt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AdminProjekt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAndraUppgifter;
    private javax.swing.JButton bLaggTillProjekt;
    private javax.swing.JButton bTaBortProjekt;
    private javax.swing.JTextField beskrivningField;
    private javax.swing.JComboBox<String> jComboBoxVäljProjekt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAnvändare;
    private javax.swing.JTextField kostnadField;
    private javax.swing.JTextField landField;
    private javax.swing.JTextField pidField;
    private javax.swing.JTextField prioritetField;
    private javax.swing.JTextField projektchefField;
    private javax.swing.JTextField projektnamnField;
    private javax.swing.JTextField slutdatumField;
    private javax.swing.JTextField startdatumField;
    private javax.swing.JTextField statusField;
    // End of variables declaration//GEN-END:variables
}
