package src.view.ui;

import src.controller.Controller;
import src.model.Constants;

public class addPermanent extends javax.swing.JFrame {
        private Controller c;

        public addPermanent(Controller c) {
                this.c = c;
                initComponents();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameLabel = new javax.swing.JLabel();
        permanentName = new javax.swing.JTextField();
        Title = new javax.swing.JLabel();
        codeLabel = new javax.swing.JLabel();
        cancelButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        salaryLabel = new javax.swing.JLabel();
        levelLabel = new javax.swing.JLabel();
        titulationBox = new javax.swing.JLabel();
        salaryArea = new javax.swing.JTextField();
        levelBox = new javax.swing.JComboBox<>();
        degreeBox = new javax.swing.JComboBox<>();
        departmentBox = new javax.swing.JComboBox<>();
        employeeCode = new javax.swing.JTextField();
        codeLabel1 = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        areaBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(480, 270));
        setResizable(false);

        nameLabel.setText("Nome:");

        permanentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                permanentNameActionPerformed(evt);
            }
        });

        Title.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("Adicionar docente efetivo");
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

        titulationBox.setText("Titulação:");

        salaryArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaryAreaActionPerformed(evt);
            }
        });

        levelBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "D1", "D2", "D3" }));
        levelBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                levelBoxActionPerformed(evt);
            }
        });

        degreeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Graduação", "Mestrado", "Dourado", "Livre-docente", "Titular" }));
        degreeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreeBoxActionPerformed(evt);
            }
        });

        departmentBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        departmentBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentBoxActionPerformed(evt);
            }
        });

        employeeCode.setText(Integer.toString(c.getNewDepartmentCode()));
        employeeCode.setEnabled(false);
        employeeCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeCodeActionPerformed(evt);
            }
        });

        codeLabel1.setText("Código do Funcionário:");

        areaLabel.setText("Área:");

        areaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Exatas", "Biológicas", "Humanas", "Saúde" }));
        areaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(nameLabel)
                                .addGap(15, 15, 15)
                                .addComponent(permanentName, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(codeLabel)
                                .addGap(15, 15, 15)
                                .addComponent(departmentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(codeLabel1)
                                .addGap(15, 15, 15)
                                .addComponent(employeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(levelLabel)
                                        .addGap(11, 11, 11))
                                    .addComponent(salaryLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(levelBox, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(cancelButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addButton)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(areaLabel)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(areaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(titulationBox)
                                    .addGap(15, 15, 15)
                                    .addComponent(degreeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nameLabel)
                    .addComponent(permanentName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel1)
                    .addComponent(employeeCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(codeLabel)
                    .addComponent(departmentBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salaryLabel)
                    .addComponent(salaryArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(areaLabel)
                    .addComponent(areaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(levelBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(levelLabel)
                    .addComponent(titulationBox)
                    .addComponent(degreeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(addButton))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void departmentBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departmentBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departmentBoxActionPerformed

    private void areaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaBoxActionPerformed

    private void degreeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreeBoxActionPerformed
        degreeBoxActionPerformed(evt);
    }//GEN-LAST:event_degreeBoxActionPerformed

    private void employeeCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_employeeCodeActionPerformed
        employeeCodeActionPerformed(evt);
    }//GEN-LAST:event_employeeCodeActionPerformed

    private void permanentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_permanentNameActionPerformed
        permanentNameActionPerformed(evt);
    }//GEN-LAST:event_permanentNameActionPerformed

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
                if (permanentName.getText().length() > 3) {
                        c.addPermanent(departmentBox.getSelectedItem().toString(),
                                        Integer.toString(c.getTotalEmployees()), permanentName.getText(),
                                        Double.parseDouble(salaryArea.getText()), levelBox.getSelectedItem().toString(),
                                        degreeBox.getSelectedItem().toString(), areaBox.getSelectedItem().toString());
                        this.dispose();
                }
        }

        private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {
        }

        public static void main(String args[]) {

                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(addPermanent.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(addPermanent.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(addPermanent.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(addPermanent.class.getName())
                                        .log(java.util.logging.Level.SEVERE, null, ex);
                }
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> areaBox;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel codeLabel;
    private javax.swing.JLabel codeLabel1;
    private javax.swing.JComboBox<String> degreeBox;
    private javax.swing.JComboBox<String> departmentBox;
    private javax.swing.JTextField employeeCode;
    private javax.swing.JComboBox<String> levelBox;
    private javax.swing.JLabel levelLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField permanentName;
    private javax.swing.JTextField salaryArea;
    private javax.swing.JLabel salaryLabel;
    private javax.swing.JLabel titulationBox;
    // End of variables declaration//GEN-END:variables
}
