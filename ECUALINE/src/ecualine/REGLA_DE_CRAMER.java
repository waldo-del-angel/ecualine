package ecualine;

import javax.swing.ImageIcon;

/*@author File-Hunter*/
public class REGLA_DE_CRAMER extends javax.swing.JFrame {

    public REGLA_DE_CRAMER() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/icon/logo.jpg")).getImage());
        setLocationRelativeTo(null);//Centrar    
        setTitle("Sistema de CRAMER");//Titulo
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelDeProcedimiento = new javax.swing.JPanel();
        jToggleButton2 = new javax.swing.JToggleButton();
        f1 = new javax.swing.JLabel();
        Pros1 = new javax.swing.JLabel();
        muestra1 = new javax.swing.JLabel();
        f2 = new javax.swing.JLabel();
        muestra2 = new javax.swing.JLabel();
        Pros2 = new javax.swing.JLabel();
        Pros4 = new javax.swing.JLabel();
        muestra4 = new javax.swing.JLabel();
        f4 = new javax.swing.JLabel();
        Pros3 = new javax.swing.JLabel();
        muestra3 = new javax.swing.JLabel();
        f3 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Titulo1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Subtitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        R3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        R2 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        R1 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        c3 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        c2 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        PanelDeRespuestas = new javax.swing.JPanel();
        Imprimir1 = new javax.swing.JLabel();
        Imprimir2 = new javax.swing.JLabel();
        Imprimir3 = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelDeProcedimiento.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButton2.setText("PROCEDIMIENTO");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        Pros1.setText(" ");

        muestra1.setForeground(new java.awt.Color(204, 0, 0));
        muestra1.setText(" ");

        muestra2.setForeground(new java.awt.Color(204, 0, 0));
        muestra2.setText(" ");

        Pros2.setText(" ");

        Pros4.setText(" ");

        muestra4.setForeground(new java.awt.Color(204, 0, 0));
        muestra4.setText(" ");

        Pros3.setText(" ");

        muestra3.setForeground(new java.awt.Color(204, 0, 0));
        muestra3.setText(" ");

        javax.swing.GroupLayout PanelDeProcedimientoLayout = new javax.swing.GroupLayout(PanelDeProcedimiento);
        PanelDeProcedimiento.setLayout(PanelDeProcedimientoLayout);
        PanelDeProcedimientoLayout.setHorizontalGroup(
            PanelDeProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeProcedimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelDeProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pros4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muestra4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pros3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muestra3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pros2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muestra2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(f2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Pros1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(muestra1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelDeProcedimientoLayout.createSequentialGroup()
                        .addGroup(PanelDeProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jToggleButton2)
                            .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelDeProcedimientoLayout.setVerticalGroup(
            PanelDeProcedimientoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeProcedimientoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToggleButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(f1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muestra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pros1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muestra2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pros2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muestra3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pros3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(f4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(muestra4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Pros4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setText("+");

        jLabel14.setText("+");

        b1.setBackground(new java.awt.Color(204, 204, 204));
        b1.setPreferredSize(new java.awt.Dimension(40, 40));

        b2.setBackground(new java.awt.Color(204, 204, 204));
        b2.setPreferredSize(new java.awt.Dimension(40, 40));

        b3.setBackground(new java.awt.Color(204, 204, 204));
        b3.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel10.setText("Y3");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel9.setText("Y2");

        Titulo1.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        Titulo1.setText("SISTEMA DE ECUACIÓN");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel8.setText("Y1");

        Subtitulo.setText("Solución por el método de CRAMER");

        jLabel5.setText("+");

        R3.setBackground(new java.awt.Color(204, 204, 204));
        R3.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel6.setText("+");

        R2.setBackground(new java.awt.Color(204, 204, 204));
        R2.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel7.setText("+");

        R1.setBackground(new java.awt.Color(204, 204, 204));
        R1.setPreferredSize(new java.awt.Dimension(40, 40));

        a3.setBackground(new java.awt.Color(204, 204, 204));
        a3.setPreferredSize(new java.awt.Dimension(40, 40));

        c1.setBackground(new java.awt.Color(204, 204, 204));
        c1.setPreferredSize(new java.awt.Dimension(40, 40));

        a2.setBackground(new java.awt.Color(204, 204, 204));
        a2.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel17.setText("=");

        a1.setBackground(new java.awt.Color(204, 204, 204));
        a1.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel18.setText("=");

        jLabel19.setText("=");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("X1");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("X2");

        c3.setBackground(new java.awt.Color(204, 204, 204));
        c3.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setText("X3");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel11.setText("Z3");

        jLabel21.setText("NOTA: Ingrese los valores correspondientes en las casillas");

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel12.setText("Z2");

        jLabel22.setText("siendo números enteros o decimales.");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel13.setText("Z1");

        c2.setBackground(new java.awt.Color(204, 204, 204));
        c2.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel16.setText("+");

        jToggleButton1.setText("RESULTADO");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        Imprimir1.setText("         ");

        Imprimir2.setText("         ");

        Imprimir3.setText("         ");

        javax.swing.GroupLayout PanelDeRespuestasLayout = new javax.swing.GroupLayout(PanelDeRespuestas);
        PanelDeRespuestas.setLayout(PanelDeRespuestasLayout);
        PanelDeRespuestasLayout.setHorizontalGroup(
            PanelDeRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Imprimir1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelDeRespuestasLayout.createSequentialGroup()
                .addGroup(PanelDeRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Imprimir2, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                    .addComponent(Imprimir3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelDeRespuestasLayout.setVerticalGroup(
            PanelDeRespuestasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelDeRespuestasLayout.createSequentialGroup()
                .addComponent(Imprimir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imprimir2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Imprimir3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Salir.setText("REGRESAR");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel23.setText("R1");

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel24.setText("R2");

        jLabel25.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel25.setText("R3");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/itsta2.jpg"))); // NOI18N

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Salir))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Titulo1)
                                    .addComponent(Subtitulo)))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PanelDeRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelPrincipalLayout.createSequentialGroup()
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel20))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel7)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel10))
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel5))
                                                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel6)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jLabel8)
                                                            .addComponent(jLabel9))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                                .addComponent(jLabel15)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel12))
                                                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                                .addComponent(jLabel14)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel13)))
                                                        .addGap(8, 8, 8))
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(jLabel16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel19))
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel17))
                                                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel18)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel23)
                                            .addComponent(jLabel24)
                                            .addComponent(jLabel25))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(0, 7, Short.MAX_VALUE))))
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addComponent(Titulo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Subtitulo))
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addComponent(jLabel3)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel20)))
                            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(27, 27, 27)
                                .addComponent(jLabel10))))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16)))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17))
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19))))
                    .addGroup(PanelPrincipalLayout.createSequentialGroup()
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeRespuestas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelDeProcedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelDeProcedimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        
        double X1 = Double.parseDouble(this.a1.getText()), Y1 = Double.parseDouble(this.b1.getText());
        double Z1 = Double.parseDouble(this.c1.getText()), X2 = Double.parseDouble(this.a2.getText());
        double Y2 = Double.parseDouble(this.b2.getText()), Z2 = Double.parseDouble(this.c2.getText());
        double X3 = Double.parseDouble(this.a3.getText()), Y3 = Double.parseDouble(this.b3.getText());
        double Z3 = Double.parseDouble(this.c3.getText()), R1 = Double.parseDouble(this.R1.getText());
        double R2 = Double.parseDouble(this.R2.getText()), R3 = Double.parseDouble(this.R3.getText());
        
        double A = ((X1 * Y2 * Z3) + (Y1 * Z2 * X3) + (Z1 * X2 * Y3) - (X3 * Y2 * Z1) - (Y3 * Z2 * X1) - (Z3 * X2 * Y1));
        double B1 = ((R1 * Y2 * Z3) + (Y1 * Z2 * R3) + (Z1 * R2 * Y3) - (R3 * Y2 * Z1) - (Y3 * Z2 * R1) - (Z3 * R2 * Y1));
        double B2 = ((X1 * R2 * Z3) + (R1 * Z2 * X3) + (Z1 * X2 * R3) - (X3 * R2 * Z1) - (R3 * Z2 * X1) - (Z3 * X2 * R1));
        double B3 = ((X1 * Y2 * R3) + (Y1 * R2 * X3) + (R1 * X2 * Y3) - (X3 * Y2 * R1) - (Y3 * R2 * X1) - (R3 * X2 * Y1));

        f1.setText("      El Primer paso es sacar A realizando la siguiente operación:");
        muestra1.setText("A = (X1*Y2*Z3) + (Y1*Z2*X3) + (Z1*X2*Y3) - (X3*Y2*Z1) - (Y3*Z2*X1) - (Z3*X2*Y1)");
        Pros1.setText("= ((" + X1 + "*" + Y2 + "*" + Z3 + ") + (" + Y1 + "*" + Z2 + "*" + X3 + ") + (" + Z1 + "*" + X2 + "*" + Y3 + ") "
                + "- (" + X3 + "*" + Y2 + "*" + Z1 + ") - (" + Y3 + "*" + Z2 + "*" + X1 + ") - (" + Z3 + "*" + X2 + "*" + Y1 + ")) = " + A);
        f2.setText("      El Segundo paso es sacar B1 con el procedimiento: ");
        muestra2.setText("B1 = (R1*Y2*Z3) + (Y1*Z2*R3) + (Z1*R2*Y3) - (R3*Y2*Z1) - (Y3*Z2*R1) - (Z3*R2*Y1)");
        Pros2.setText("= ((" + R1 + "*" + Y2 + "*" + Z3 + ") + (" + Y1 + "*" + Z2 + " *" + R3 + ") + (+" + Z1 + "*" + R2 + "*" + Y3 + ") "
                + "- (" + R3 + "*" + Y2 + "*" + Z1 + ") - (" + Y3 + "*" + Z2 + "*" + R1 + ") - (+" + Z3 + "*" + R2 + "*" + Y1 + ")) = " + B1);
        f3.setText("      El Tercer paso es sacar B2 con el procedimiento: ");
        muestra3.setText("B2 = (X1*R2*Z3) + (R1*Z2*X3) + (Z1*X2*R3) - (X3*R2*Z1) -( R3*Z2*X1) - (Z3*X2*R1)");
        Pros3.setText("= ((+" + X1 + "*" + R2 + "*" + Z3 + ") + (" + R1 + "*" + Z2 + "*" + X3 + ") + (" + Z1 + "*" + X2 + "*" + R3 + ") "
                + "- (" + X3 + "*" + R2 + "*" + Z1 + ") - (" + R3 + "*" + Z2 + "*" + X1 + ") - (" + Z3 + "*" + X2 + "*" + R1 + ")) = " + B2);
        f4.setText("      El Cuarto paso es sacar B3 con el procedimiento: ");
        muestra4.setText("B3 = (X1*Y2*R3) + (Y1*R2*X3) + (R1*X2*Y3) - (X3*Y2*R1) - (Y3*R2*X1) - (R3*X2*Y1)");
        Pros4.setText("= ((" + X1 + "*" + Y2 + "*" + R3 + ") + (" + Y1 + "*" + R2 + "*" + X3 + ") + (" + R1 + "*" + X2 + "*" + Y3 + ") - "
                + "(+" + X3 + "*" + Y2 + "*" + R1 + ") - (" + Y3 + "*" + R2 + "*" + X1 + ") - (" + R3 + "*" + X2 + "*" + Y1 + ")) = " + B3);
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed

        double X1 = Double.parseDouble(this.a1.getText()), Y1 = Double.parseDouble(this.b1.getText());
        double Z1 = Double.parseDouble(this.c1.getText()), X2 = Double.parseDouble(this.a2.getText());
        double Y2 = Double.parseDouble(this.b2.getText()), Z2 = Double.parseDouble(this.c2.getText());
        double X3 = Double.parseDouble(this.a3.getText()), Y3 = Double.parseDouble(this.b3.getText());
        double Z3 = Double.parseDouble(this.c3.getText()), R1 = Double.parseDouble(this.R1.getText());
        double R2 = Double.parseDouble(this.R2.getText()), R3 = Double.parseDouble(this.R3.getText());
        
        double A = ((X1 * Y2 * Z3) + (Y1 * Z2 * X3) + (Z1 * X2 * Y3) - (X3 * Y2 * Z1) - (Y3 * Z2 * X1) - (Z3 * X2 * Y1));
        double B1 = ((R1 * Y2 * Z3) + (Y1 * Z2 * R3) + (Z1 * R2 * Y3) - (R3 * Y2 * Z1) - (Y3 * Z2 * R1) - (Z3 * R2 * Y1));
        double B2 = ((X1 * R2 * Z3) + (R1 * Z2 * X3) + (Z1 * X2 * R3) - (X3 * R2 * Z1) - (R3 * Z2 * X1) - (Z3 * X2 * R1));
        double B3 = ((X1 * Y2 * R3) + (Y1 * R2 * X3) + (R1 * X2 * Y3) - (X3 * Y2 * R1) - (Y3 * R2 * X1) - (R3 * X2 * Y1));
        Imprimir1.setText("X = |B1|/| A | = " + B1 / A);
        Imprimir2.setText("Y = |B2|/| A | = " + B2 / A);
        Imprimir3.setText("Z = |B3|/| A | = " + B3 / A);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        MENU pp = new MENU();
        pp.setVisible(true);
        dispose();

    }//GEN-LAST:event_SalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Imprimir1;
    private javax.swing.JLabel Imprimir2;
    private javax.swing.JLabel Imprimir3;
    private javax.swing.JPanel PanelDeProcedimiento;
    private javax.swing.JPanel PanelDeRespuestas;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JLabel Pros1;
    private javax.swing.JLabel Pros2;
    private javax.swing.JLabel Pros3;
    private javax.swing.JLabel Pros4;
    private javax.swing.JTextField R1;
    private javax.swing.JTextField R2;
    private javax.swing.JTextField R3;
    private javax.swing.JButton Salir;
    private javax.swing.JLabel Subtitulo;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JLabel f1;
    private javax.swing.JLabel f2;
    private javax.swing.JLabel f3;
    private javax.swing.JLabel f4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JLabel muestra1;
    private javax.swing.JLabel muestra2;
    private javax.swing.JLabel muestra3;
    private javax.swing.JLabel muestra4;
    // End of variables declaration//GEN-END:variables
}
