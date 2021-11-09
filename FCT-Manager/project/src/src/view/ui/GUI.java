package src.view.ui;

import java.util.Random;

import src.controller.Controller;

public class GUI extends javax.swing.JFrame {
    private static Controller c = new Controller();

    public GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel5 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        addMenu = new javax.swing.JMenu();
        addDepartment = new javax.swing.JMenuItem();
        addEmployee = new javax.swing.JMenu();
        addTechnician = new javax.swing.JMenuItem();
        addProfessor = new javax.swing.JMenu();
        addEffective = new javax.swing.JMenuItem();
        addSubstitute = new javax.swing.JMenuItem();
        removeMenu = new javax.swing.JMenu();
        removeDepartment = new javax.swing.JMenuItem();
        removeEmployee = new javax.swing.JMenuItem();
        searchMenu = new javax.swing.JMenu();
        searchDepartment = new javax.swing.JMenu();
        searchDepartmentByCode = new javax.swing.JMenuItem();
        searchDepartmentByName = new javax.swing.JMenuItem();
        searchEmployee = new javax.swing.JMenu();
        searchEmployeeById = new javax.swing.JMenuItem();
        searchEmployeeByName = new javax.swing.JMenuItem();
        searchEmployeeBySalary = new javax.swing.JMenuItem();
        reportMenu = new javax.swing.JMenu();
        generalReport = new javax.swing.JMenuItem();
        departmentReport = new javax.swing.JMenu();
        departmentGeneralReport = new javax.swing.JMenuItem();
        departmentGeneralInfo = new javax.swing.JMenuItem();
        departmentSalaryReport = new javax.swing.JMenuItem();
        employeeReport = new javax.swing.JMenu();
        employeeGeneralReport = new javax.swing.JMenuItem();
        employeeBySalarylReport = new javax.swing.JMenuItem();
        technicianReport = new javax.swing.JMenuItem();
        professorReport = new javax.swing.JMenuItem();
        effectiveReport = new javax.swing.JMenuItem();
        substituteReport = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Universidade Estadual Paulista");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(33, 150, 243));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        setForeground(java.awt.Color.darkGray);
        setMinimumSize(new java.awt.Dimension(480, 270));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(0, 147, 221));
        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Copyright © 2021 - Cadastro UNESP");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        jLabel2.setText("Cadastro UNESP");

        jSeparator1.setForeground(new java.awt.Color(33, 150, 243));

        jLabel3.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel3.setText(
                "Seja bem-vindo(a) ao cadastro de departamentos e funcionários da Universidade Estadual Paulista.");
        jLabel3.setPreferredSize(new java.awt.Dimension(620, 10));

        jLabel4.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        jLabel4.setText("O que você gostaria de fazer?");
        jLabel4.setPreferredSize(new java.awt.Dimension(171, 15));

        addButton.setBackground(new java.awt.Color(33, 150, 243));
        addButton.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(240, 240, 240));
        addButton.setText("Cadastrar");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(33, 150, 243));
        jToggleButton1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(240, 240, 240));
        jToggleButton1.setText("Buscar");
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setOpaque(true);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/src/view/ui/Logo_Unesp.png"))); // NOI18N

        Menu.setForeground(new java.awt.Color(240, 240, 240));
        Menu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        // Menu.setMAX_EMPLOYEESimumSize(new java.awt.Dimension(400, 32769));

        addMenu.setText("Cadastrar");
        addMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        addDepartment.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addDepartment.setText("Departamento");
        addDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDepartmentActionPerformed(evt);
            }
        });
        addMenu.add(addDepartment);

        addEmployee.setText("Funcionário");
        addEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        addTechnician.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addTechnician.setText("Técnico");
        addTechnician.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTechnicianActionPerformed(evt);
            }
        });
        addEmployee.add(addTechnician);

        addProfessor.setText("Docente");
        addProfessor.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        addEffective.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addEffective.setText("Efetivo");
        addEffective.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEffectiveActionPerformed(evt);
            }
        });
        addProfessor.add(addEffective);

        addSubstitute.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        addSubstitute.setText("Substituto");
        addSubstitute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSubstituteActionPerformed(evt);
            }
        });
        addProfessor.add(addSubstitute);

        addEmployee.add(addProfessor);

        addMenu.add(addEmployee);

        Menu.add(addMenu);

        removeMenu.setText("Excluir");
        removeMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        removeDepartment.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        removeDepartment.setText("Departamento");
        removeDepartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeDepartmentActionPerformed(evt);
            }
        });
        removeMenu.add(removeDepartment);

        removeEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        removeEmployee.setText("Funcionário");
        removeEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEmployeeActionPerformed(evt);
            }
        });
        removeMenu.add(removeEmployee);

        Menu.add(removeMenu);

        searchMenu.setText("Buscar");
        searchMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        searchDepartment.setText("Departamento");
        searchDepartment.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        searchDepartmentByCode.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchDepartmentByCode.setText("Código");
        searchDepartmentByCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDepartmentByCodeActionPerformed(evt);
            }
        });
        searchDepartment.add(searchDepartmentByCode);

        searchDepartmentByName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchDepartmentByName.setText("Nome");
        searchDepartmentByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchDepartmentByNameActionPerformed(evt);
            }
        });
        searchDepartment.add(searchDepartmentByName);

        searchMenu.add(searchDepartment);

        searchEmployee.setText("Funcionário");
        searchEmployee.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        searchEmployeeById.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchEmployeeById.setText("Código");
        searchEmployeeById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeByIdActionPerformed(evt);
            }
        });
        searchEmployee.add(searchEmployeeById);

        searchEmployeeByName.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchEmployeeByName.setText("Nome");
        searchEmployeeByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeByNameActionPerformed(evt);
            }
        });
        searchEmployee.add(searchEmployeeByName);

        searchEmployeeBySalary.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        searchEmployeeBySalary.setText("Faixa Salarial");
        searchEmployeeBySalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchEmployeeBySalaryActionPerformed(evt);
            }
        });
        searchEmployee.add(searchEmployeeBySalary);

        searchMenu.add(searchEmployee);

        Menu.add(searchMenu);

        reportMenu.setText("Relatório");
        reportMenu.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        generalReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        generalReport.setText("Geral");
        generalReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generalReportActionPerformed(evt);
            }
        });
        reportMenu.add(generalReport);

        departmentReport.setText("Departamentos");
        departmentReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        departmentGeneralReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        departmentGeneralReport.setText("Relatório Geral");
        departmentGeneralReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentGeneralReportActionPerformed(evt);
            }
        });
        departmentReport.add(departmentGeneralReport);

        departmentGeneralInfo.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        departmentGeneralInfo.setText("Resumo do departamento");
        departmentGeneralInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentGeneralInfoActionPerformed(evt);
            }
        });
        departmentReport.add(departmentGeneralInfo);

        departmentSalaryReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        departmentSalaryReport.setText("Resumo por faixa salarial");
        departmentSalaryReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departmentSalaryReportActionPerformed(evt);
            }
        });
        departmentReport.add(departmentSalaryReport);

        reportMenu.add(departmentReport);

        employeeReport.setText("Funcionários");
        employeeReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N

        employeeGeneralReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        employeeGeneralReport.setText("Todos os funcionários");
        employeeGeneralReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeGeneralReportActionPerformed(evt);
            }
        });
        employeeReport.add(employeeGeneralReport);

        employeeBySalarylReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        employeeBySalarylReport.setText("Resumo por faixa salarial");
        employeeBySalarylReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                employeeBySalarylReportActionPerformed(evt);
            }
        });
        employeeReport.add(employeeBySalarylReport);

        technicianReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        technicianReport.setText("Técnicos");
        technicianReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                technicianReportActionPerformed(evt);
            }
        });
        employeeReport.add(technicianReport);

        professorReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        professorReport.setText("Docentes");
        professorReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorReportActionPerformed(evt);
            }
        });
        employeeReport.add(professorReport);

        effectiveReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        effectiveReport.setText("Docentes efetivos");
        effectiveReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                effectiveReportActionPerformed(evt);
            }
        });
        employeeReport.add(effectiveReport);

        substituteReport.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        substituteReport.setText("Docentes substitutos");
        substituteReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                substituteReportActionPerformed(evt);
            }
        });
        employeeReport.add(substituteReport);

        reportMenu.add(employeeReport);

        Menu.add(reportMenu);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                .addGroup(layout.createSequentialGroup().addContainerGap().addGroup(layout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 250,
                                        Short.MAX_VALUE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(250, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGap(9, 9, 9).addComponent(jLabel5))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jSeparator1))
                                .addContainerGap()))));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
                javax.swing.GroupLayout.Alignment.TRAILING,
                layout.createSequentialGroup().addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60,
                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80,
                                javax.swing.GroupLayout.PREFERRED_SIZE)));

        getAccessibleContext().setAccessibleName("Unesp");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addEffectiveActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addEffectiveActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addPermanent(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_addEffectiveActionPerformed

    private void generalReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_generalReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new generalReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_generalReportActionPerformed

    private void searchDepartmentByCodeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchDepartmentByCodeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchDepartmentByCode(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_searchDepartmentByCodeActionPerformed

    private void searchDepartmentByNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchDepartmentByNameActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchDepartmentByName(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_searchDepartmentByNameActionPerformed

    private void removeEmployeeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeEmployeeActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new removeEmployee(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_removeEmployeeActionPerformed

    private void removeDepartmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_removeDepartmentActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new removeDepartment(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_removeDepartmentActionPerformed

    private void departmentGeneralReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_departmentGeneralReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departmentGeneralReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_departmentGeneralReportActionPerformed

    private void substituteReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_substituteReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new substituteReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_substituteReportActionPerformed

    private void effectiveReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_effectiveReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new permanentReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_effectiveReportActionPerformed

    private void professorReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_professorReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new professorReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_professorReportActionPerformed

    private void technicianReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_technicianReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new technicianReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_technicianReportActionPerformed

    private void employeeGeneralReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_employeeGeneralReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allEmployees(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_employeeGeneralReportActionPerformed

    private void employeeBySalarylReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_employeeBySalarylReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeesBySalaryReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_employeeBySalarylReportActionPerformed

    private void departmentSalaryReportActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_departmentSalaryReportActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departmentReportByCost(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_departmentSalaryReportActionPerformed

    private void departmentGeneralInfoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_departmentGeneralInfoActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departmentReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_departmentGeneralInfoActionPerformed

    private void searchEmployeeByIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchEmployeeByIdActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchEmployeeById(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_searchEmployeeByIdActionPerformed

    private void searchEmployeeByNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchEmployeeByNameActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchEmployeeByName(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_searchEmployeeByNameActionPerformed

    private void searchEmployeeBySalaryActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_searchEmployeeBySalaryActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new employeesBySalaryReport(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_searchEmployeeBySalaryActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new add(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_addButtonActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jToggleButton1ActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_jToggleButton1ActionPerformed

    private void addSubstituteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addSubstituteActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addSubstitute(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_addSubstituteActionPerformed

    private void addDepartmentActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addDepartmentActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDepartment(c).setVisible(true);
            }
        });
    }// GEN-LAST:event_addDepartmentActionPerformed

    private void addTechnicianActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_addTechnicianActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addTechnician(c).setVisible(true);
            }
        });
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
    }

    public static void main(String args[]) {
        Random rand = new Random();
        int MAX_EMPLOYEES = 25;
        // CONSTANTS
        String[] professorDegree = new String[] { "Graduação", "Doutorado", "Titular", "Mestrado", "Livre-Docente",
                "Titular" };

        String[] dpName = new String[] { "Computação", "Física", "Estatística", "Psicologia", "Educação Física" };
        String[] permanentLevel = new String[] { "D1", "D2", "D3" };
        String[] permanentArea = new String[] { "Biológicas", "Exatas", "Humanas", "Saúde" };

        String[] substituteLevel = new String[] { "S1", "S2" };

        String[] technicianLevel = new String[] { "T1", "T2" };
        String[] technicianFunction = new String[] { "Assessor", "Laboratório", "Secretário" };

        // CREATE NAMES
        String[] employeeName = new String[] { "Carla", "Suzana", "Paulo", "Renato", "Poliana", "Marcelo", "Ursula",
                "Melissa", "Fernando", "Nathan", "Tatiana", "Vanessa", "Gabriel", "Walter", "Bruna", "Hugo", "Danilo",
                "Karina", "Renata", "Gerson", "Sabrina", "Xavier", "João Carlos", "Jackson", "Márcia", "Luís Henrique",
                "Fabrício", "Leonidas", "Daniel", "Keoma", "Thaís", "Paola", "Marcos", "Stella", "Amanda", "Jéssica",
                "Adriano", "Gustavo", "Guilherme", "Caroline", "Victor", "Anielly", "Heloísa", "Patrícia", "Sinézio",
                "Thomas", "Luísa", "Antônio", "Igor", "Júlio", "Karen", "Lucas Vinícius", "Túlio", "Isabel", "Daiane",
                "Cláudia", "Júlia", "Leonardo", "Thiago", "Caio", "Nathália", "Giovana", "Matheus", "Breno", "Alice",
                "Sofia", "Marcela", "Rodrigo", "Pâmela", "Ramão", "Marina", "Alexia", "Alex", "Tainara", "Felipe",
                "Dafiny", "Laura", "Olívia", "Rayana", "Noah", "Gael", "Enzo", "Valentina", "Letícia", "Daihanny",
                "Rayssa", "Diego", "Jonathan", "Andreia", "Caique", "Ricardo", "Delei", "Dirce", "Silvana", "Rosangela",
                "Loreni" };
        for (int i = 0; i < dpName.length; i++)
            c.addDepartment(dpName[i]);
        // ADD THE EMPLOYEES
        for (int i = 0; i < MAX_EMPLOYEES; i++) {
            String department = dpName[rand.nextInt(dpName.length)];
            String id = Integer.toString(i + 1);
            String name = employeeName[rand.nextInt(employeeName.length)];
            double salary = rand.nextDouble() > 0.7 ? 7000.0 : 6000.0;
            String level;
            String degree;
            int f = rand.nextInt(3);
            switch (f) {
                case 0: // PERMANENT
                    level = permanentLevel[rand.nextInt(permanentLevel.length)];
                    degree = professorDegree[rand.nextInt(professorDegree.length)];
                    String area = permanentArea[rand.nextInt(permanentArea.length)];

                    c.addPermanent(department, id, name, salary, level, degree, area);
                    break;
                case 1: // SUBSTITUTE
                    level = substituteLevel[rand.nextInt(substituteLevel.length)];
                    degree = professorDegree[rand.nextInt(professorDegree.length)];
                    int workload = rand.nextDouble() > 0.5 ? 12 : 24;

                    c.addSubstitute(department, id, name, salary, level, degree, workload);
                    break;
                default: // TECHNICIAN
                    level = technicianLevel[rand.nextInt(technicianLevel.length)];
                    String function = technicianFunction[rand.nextInt(technicianFunction.length)];
                    c.addTechnician(department, id, name, salary, level, function);
                    break;
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar Menu;
    private javax.swing.JButton addButton;
    private javax.swing.JMenuItem addDepartment;
    private javax.swing.JMenuItem addEffective;
    private javax.swing.JMenu addEmployee;
    private javax.swing.JMenu addMenu;
    private javax.swing.JMenu addProfessor;
    private javax.swing.JMenuItem addSubstitute;
    private javax.swing.JMenuItem addTechnician;
    private javax.swing.JMenuItem departmentGeneralInfo;
    private javax.swing.JMenuItem departmentGeneralReport;
    private javax.swing.JMenu departmentReport;
    private javax.swing.JMenuItem departmentSalaryReport;
    private javax.swing.JMenuItem effectiveReport;
    private javax.swing.JMenuItem employeeBySalarylReport;
    private javax.swing.JMenuItem employeeGeneralReport;
    private javax.swing.JMenu employeeReport;
    private javax.swing.JMenuItem generalReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JMenuItem professorReport;
    private javax.swing.JMenuItem removeDepartment;
    private javax.swing.JMenuItem removeEmployee;
    private javax.swing.JMenu removeMenu;
    private javax.swing.JMenu reportMenu;
    private javax.swing.JMenu searchDepartment;
    private javax.swing.JMenuItem searchDepartmentByCode;
    private javax.swing.JMenuItem searchDepartmentByName;
    private javax.swing.JMenu searchEmployee;
    private javax.swing.JMenuItem searchEmployeeById;
    private javax.swing.JMenuItem searchEmployeeByName;
    private javax.swing.JMenuItem searchEmployeeBySalary;
    private javax.swing.JMenu searchMenu;
    private javax.swing.JMenuItem substituteReport;
    private javax.swing.JMenuItem technicianReport;
    // End of variables declaration//GEN-END:variables
}
