package src.view.ui;

import src.controller.Controller;
import src.model.Constants;

public class addTechnician extends javax.swing.JFrame {
    private Controller c;

    public addTechnician(Controller c) {
        this.c = c;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        technicianName = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        codeLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        salaryLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        functionLabel = new javax.swing.JLabel();
        salaryArea = new javax.swing.JTextField();
        levelBox = new javax.swing.JComboBox<>();
        functionBox = new javax.swing.JComboBox<>();
        departmentBox = new javax.swing.JComboBox<>();
        technicianCode = new javax.swing.JTextField();
        codeLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 270));
        setResizable(false);

        nameLabel.setText("Nome:");

        technicianName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicianNameActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Adicionar Técnico");
        Title.setPreferredSize(new java.awt.Dimension(360, 36));

        codeLabel.setText("Departamento:");

        cancelButton.setText("Cancelar");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        addButton.setText("Adicionar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        salaryLabel.setText("Salário:");

        levelLabel.setText("Nível:");

        functionLabel.setText("Função:");

        salaryArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryAreaActionPerformed(evt);
            }
        });

        levelBox.setModel(new javax.swing.DefaultComboBoxModel<>(Constants.getTechLevels()));
        levelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelBoxActionPerformed(evt);
            }
        });

        functionBox.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Assessor", "Secretário", "Laboratório" }));
        functionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                functionBoxActionPerformed(evt);
            }
        });

        departmentBox.setModel(new javax.swing.DefaultComboBoxModel<>(c.getAllDepartmentsName()));

        technicianCode.setText(Integer.toString(c.getTotalEmployees()));
        technicianCode.setEnabled(false);
        technicianCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicianCodeActionPerformed(evt);
            }
        });

        codeLabel1.setText("Código do Funcionário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup().addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addGroup(layout
                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        layout.createSequentialGroup().addComponent(nameLabel).addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(technicianName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        380, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        layout.createSequentialGroup().addComponent(codeLabel).addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(
                                                        departmentBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                        layout.createSequentialGroup().addComponent(codeLabel1).addPreferredGap(
                                                javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(technicianCode, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup().addComponent(levelLabel)
                                                        .addGap(11, 11, 11))
                                                .addComponent(salaryLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(levelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(layout.createSequentialGroup().addGap(149, 149, 149).addComponent(cancelButton)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addButton)
                                        .addGroup(layout.createSequentialGroup().addComponent(functionLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(functionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(36, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
                .createSequentialGroup().addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(nameLabel)
                        .addComponent(technicianName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(codeLabel1).addComponent(technicianCode, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(codeLabel)
                        .addComponent(departmentBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(salaryLabel).addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(levelBox, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(levelLabel).addComponent(functionLabel).addComponent(functionBox,
                                javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelButton).addComponent(addButton))
                .addGap(14, 14, 14)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void technicianNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_technicianNameActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_technicianNameActionPerformed

    private void salaryAreaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_salaryAreaActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_salaryAreaActionPerformed

    private void levelBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_levelBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_levelBoxActionPerformed

    private void functionBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_functionBoxActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_functionBoxActionPerformed

    private void technicianCodeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_technicianCodeActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_technicianCodeActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (technicianName.getText().length() > 3) {
            c.addTechnician(departmentBox.getSelectedItem().toString(), Integer.toString(c.getTotalEmployees()),
                    technicianName.getText(), Double.parseDouble(salaryArea.getText()),
                    levelBox.getSelectedItem().toString(), functionBox.getSelectedItem().toString());
            this.dispose();
        }
    }

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
    }

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(addTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addTechnician.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel codeLabel1;
    private javax.swing.JComboBox<String> departmentBox;
    private javax.swing.JComboBox<String> functionBox;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JComboBox<String> levelBox;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField salaryArea;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JTextField technicianCode;
    private javax.swing.JTextField technicianName;
    // End of variables declaration//GEN-END:variables
}
