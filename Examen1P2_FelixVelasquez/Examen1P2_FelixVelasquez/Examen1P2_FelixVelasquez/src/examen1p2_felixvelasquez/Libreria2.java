/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1p2_felixvelasquez;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author famii
 */
public class Libreria2 extends javax.swing.JFrame {

    
    String Genero = "";
    ArrayList<Libreria> libros = new ArrayList<>();
    ArrayList<Login> usuarios = new ArrayList<>();
    int IdLibroActual = -1;
    int IdUsuarioActual = -1;

    public Libreria2() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultComboBoxModel modelo
                = (DefaultComboBoxModel) cb_amigos.getModel();
        modelo.addElement(new Amigos(100, "JUAN"));
        modelo.addElement(new Amigos(200, "FELIX"));
        modelo.addElement(new Amigos(300, "DAVID"));
        modelo.addElement(new Amigos(300, "SADAI"));

        ((Amigos) modelo.getElementAt(0)).setNombre("CARLOS");
        modelo.removeElementAt(3);

        cb_amigos.setModel(modelo);

        this.libros = Administrador.libros;
        this.usuarios = Administrador.usuarios;
        JtableLibros.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Autores", "Valor", "Edicion", "Genero", "Año Publicacion"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        JtableLibros.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {

                IdLibroActual = JtableLibros.getSelectedRow();
                if (IdLibroActual != -1) {
                    Libreria libro = libros.get(IdLibroActual);
                    txtAutor.setText(libro.getAutores());
                    txtAñoEscribio.setText(libro.getAno() + "");
                    txtTitulo.setText(libro.getTitulo());

                    txtIBSN.setText(libro.getIsb());
                    txtEditoriales.setText(libro.getEdi());
                    txtGeneroLibro.setText(libro.getGenero());
                    libro.setEstado(Genero);
                }
            }

        });

        // tabla usuarios
        jtableUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // jTable1.getSelectedRow()
                IdUsuarioActual = jtableUsuarios.getSelectedRow();
            }

        });
        jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "Nombre", "Apellido", "Celular", "Fecha de nacimiento", "Correo electronico", "Genero de lectura"
                }
        ) {
            Class[] types = new Class[]{
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean[]{
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });

        jtableUsuarios.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                // jTable1.getSelectedRow()
                IdUsuarioActual = jtableUsuarios.getSelectedRow();
                if (IdLibroActual != -1) {

                }
            }

        });

        tblero(JtableLibros);
        usu(jtableUsuarios);
    }

    public void vaciarTablaUsuarios(JTable tabla) {
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] = new String[]{
            "Nombre", "Apellido", "Celular", "Usuario",};
        Modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(Modelo);

    }

    public void tipo(JTable tabla) {
        DefaultTableModel Modelo = (DefaultTableModel) tabla.getModel();
        String titulos[] = new String[]{
            "Autores", "Valor", "Edicion", "Genero", "Año Publicacion"
        };
        Modelo = new DefaultTableModel(null, titulos);
        tabla.setModel(Modelo);

    }

    private void tblero(JTable tabla) {
        tipo(tabla);
        for (Libreria libros : libros) {
            Object row[] = {libros.getAutores(), libros.getGenero(), libros.getIsb(), libros.getEstado(), libros.getAno()};
            DefaultTableModel m
                    = (DefaultTableModel) tabla.getModel();
            m.addRow(row);
            tabla.setModel(m);
        }//fin for

    }

    private void usu(JTable tabla) {
        vaciarTablaUsuarios(tabla);
        for (Login Usuarios : usuarios) {
            Object row[] = {Usuarios.getNombre(), Usuarios.getApellido(), Usuarios.getEdad(), Usuarios.getCodigo()};
            DefaultTableModel m
                    = (DefaultTableModel) tabla.getModel();
            m.addRow(row);
            tabla.setModel(m);
        }//fin for

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAutor = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtGeneroLibro = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtEditoriales = new javax.swing.JTextField();
        jbFueraInventario = new javax.swing.JRadioButton();
        jbPrestado = new javax.swing.JRadioButton();
        jbDisponible = new javax.swing.JRadioButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtIBSN = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAñoEscribio = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jbDisponible1 = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JtableLibros = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtableUsuarios = new javax.swing.JTable();
        btnEliminar1 = new javax.swing.JButton();
        btnAgregar1 = new javax.swing.JButton();
        btnModificar1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        txtApellido2 = new javax.swing.JTextField();
        txtApellido3 = new javax.swing.JTextField();
        txtApellido4 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_amigos = new javax.swing.JComboBox();
        cb_libros = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        cb_amigos_modificar = new javax.swing.JComboBox();
        jLabel20 = new javax.swing.JLabel();
        tf_codigo_m = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        tf_nombre_m = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        bt_color_m = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        ta_direccion_m = new javax.swing.JTextArea();
        jLabel28 = new javax.swing.JLabel();
        cb_idioma_m = new javax.swing.JComboBox();
        jLabel29 = new javax.swing.JLabel();
        cb_football_m = new javax.swing.JCheckBox();
        cb_tv_m = new javax.swing.JCheckBox();
        cb_musica_m = new javax.swing.JCheckBox();
        cb_correr_m = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel12.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel12.setText("Descripcion");

        jLabel13.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel13.setText("Autor");

        txtTitulo.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        txtAutor.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel14.setText("Valor");

        txtGeneroLibro.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel15.setText("Edicion");

        txtEditoriales.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        buttonGroup1.add(jbFueraInventario);
        jbFueraInventario.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbFueraInventario.setText("Fantasia");

        buttonGroup1.add(jbPrestado);
        jbPrestado.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbPrestado.setText("Romance");
        jbPrestado.setActionCommand("");
        jbPrestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPrestadoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jbDisponible);
        jbDisponible.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbDisponible.setText("Historia");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Genero");

        jLabel21.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel21.setText("Puntaje");

        txtIBSN.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel22.setText("Año de publicacion");

        txtAñoEscribio.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        btnAgregar.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        buttonGroup1.add(jbDisponible1);
        jbDisponible1.setFont(new java.awt.Font("SimSun", 3, 18)); // NOI18N
        jbDisponible1.setText("Accion");

        JtableLibros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JtableLibros);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Titulo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(180, 180, 180)
                                .addComponent(jLabel19))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jbPrestado)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jbFueraInventario)
                                .addGap(53, 53, 53)
                                .addComponent(jbDisponible1)
                                .addGap(78, 78, 78)
                                .addComponent(jbDisponible))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnModificar)
                                .addGap(33, 33, 33)
                                .addComponent(btnEliminar))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel12)
                        .addGap(27, 27, 27)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtAñoEscribio, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(246, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(txtGeneroLibro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel22)
                    .addComponent(txtAñoEscribio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEditoriales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbPrestado)
                    .addComponent(jbFueraInventario)
                    .addComponent(jbDisponible1)
                    .addComponent(jbDisponible))
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Libros", jPanel2);

        jLabel1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel1.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel2.setText("Apellido:");

        txtApellido.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel3.setText("Edad:");

        txtEdad.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel4.setText("Fecha de nacimiento");

        txtCodigo.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jtableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Título 4"
            }
        ));
        jScrollPane2.setViewportView(jtableUsuarios);

        btnEliminar1.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnEliminar1.setText("Eliminar");
        btnEliminar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminar1ActionPerformed(evt);
            }
        });

        btnAgregar1.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnAgregar1.setText("Agregar");
        btnAgregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar1ActionPerformed(evt);
            }
        });

        btnModificar1.setFont(new java.awt.Font("SimSun", 3, 24)); // NOI18N
        btnModificar1.setText("Modificar");
        btnModificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificar1ActionPerformed(evt);
            }
        });

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel8.setText("Correo Electronico");

        jLabel9.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel9.setText("Usuario");

        jLabel10.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel10.setText("Genero de lectura");

        jLabel11.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel11.setText("Celular");

        txtApellido1.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        txtApellido2.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        txtApellido3.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        txtApellido4.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel16.setText("Lista  De libros");

        jLabel17.setFont(new java.awt.Font("Segoe UI Symbol", 3, 18)); // NOI18N
        jLabel17.setText("Lista de amigos");

        cb_amigos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_amigosActionPerformed(evt);
            }
        });

        cb_libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_librosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addGap(39, 39, 39)
                        .addComponent(txtApellido4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAgregar1)
                        .addGap(49, 49, 49)
                        .addComponent(btnModificar1)
                        .addGap(76, 76, 76)
                        .addComponent(btnEliminar1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(159, 159, 159)
                        .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(cb_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(jLabel3)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtApellido3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(41, 41, 41)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cb_libros, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel10)
                                .addGap(50, 50, 50)
                                .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(76, 76, 76)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel11)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtApellido3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtApellido4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(txtApellido2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(cb_amigos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar1)
                    .addComponent(btnModificar1)
                    .addComponent(btnEliminar1))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtApellido1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        jTabbedPane1.addTab("Crear Usuarios", jPanel1);

        jLabel18.setText("Amigos");

        cb_amigos_modificar.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cb_amigos_modificarItemStateChanged(evt);
            }
        });

        jLabel20.setText("Usuario");

        tf_codigo_m.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tf_codigo_mKeyPressed(evt);
            }
        });

        jLabel23.setText("Nombre");

        jLabel25.setText("Fecha Nacimiento");

        jLabel26.setText("Color");

        bt_color_m.setBackground(new java.awt.Color(255, 0, 51));
        bt_color_m.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_color_mMouseClicked(evt);
            }
        });

        jLabel27.setText("Direccion");

        ta_direccion_m.setColumns(20);
        ta_direccion_m.setRows(5);
        jScrollPane3.setViewportView(ta_direccion_m);

        jLabel28.setText("Idioma");

        cb_idioma_m.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Espanol", "Ingles" }));

        jLabel29.setText("Genero");

        cb_football_m.setText("Historia");

        cb_tv_m.setText("Fantancia");

        cb_musica_m.setText("Accion");

        cb_correr_m.setText("Romance");

        jButton4.setText("Modificar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_amigos_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(tf_codigo_m, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(tf_nombre_m, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(68, 68, 68)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(297, 297, 297)
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cb_idioma_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(jLabel26)
                                .addGap(43, 43, 43)
                                .addComponent(bt_color_m, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jLabel25))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(cb_football_m)
                        .addGap(18, 18, 18)
                        .addComponent(cb_tv_m)
                        .addGap(18, 18, 18)
                        .addComponent(cb_musica_m)
                        .addGap(18, 18, 18)
                        .addComponent(cb_correr_m))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(236, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_amigos_modificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cb_idioma_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_codigo_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(tf_nombre_m, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cb_football_m)
                            .addComponent(cb_tv_m)
                            .addComponent(cb_musica_m)
                            .addComponent(cb_correr_m)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(bt_color_m, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(277, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modificar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 731, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 202, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbPrestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPrestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbPrestadoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String Genero = "";
        if (this.jbDisponible.isSelected()) {
            Genero = "Historia";
        } else if (this.jbPrestado.isSelected()) {
            Genero = "Romance";
        } else if (this.jbFueraInventario.isSelected()) {
            Genero = "Fantacia";
        } else if (this.jbDisponible1.isSelected()) {
            Genero = "Accion";
        }
        String errores = "";
        boolean valido = true;
        if (this.txtAutor.getText() == null || "".equals(this.txtAutor.getText())) {
            errores += "Ingrese el nombre de los Autores separado por (,)\n";
            valido = false;
        }
        if (this.txtTitulo.getText() == null || "".equals(this.txtTitulo.getText())) {
            errores += "Ingrese el titulo del libro\n";
            valido = false;
        }
        if (this.txtGeneroLibro.getText() == null || "".equals(this.txtGeneroLibro.getText())) {
            errores += "Ingrese el genero del libro\n";
            valido = false;
        }
        if (this.txtEditoriales.getText() == null || "".equals(this.txtEditoriales.getText())) {
            errores += "Ingrese el editorial\n";
            valido = false;
        }

        if (this.txtAñoEscribio.getText() == null || "".equals(this.txtAñoEscribio.getText())) {
            errores += "Ingrese el año en que se escribio\n";
            valido = false;
        }
        if (this.txtIBSN.getText() == null || "".equals(this.txtIBSN.getText())) {
            errores += "Ingrese el IBSN del libro\n";
            valido = false;
        }

        if (Genero == null || "".equals(Genero)) {
            errores += "Ingrese el estado del libro\n";
            valido = false;
        }
        if (valido) {

            libros.add(new Libreria(txtAutor.getText(), txtTitulo.getText(), txtGeneroLibro.getText(), txtEditoriales.getText(), Integer.parseInt(txtAñoEscribio.getText()), txtIBSN.getText(), Genero, "", 0));
            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el libro");
            tipo(JtableLibros);
            tblero(JtableLibros);
            Administrador.libros = this.libros;

        } else {
            JOptionPane.showMessageDialog(this, errores);
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        if (JtableLibros.getSelectedRow() >= 0) {
            String Genero = "";
            if (this.jbDisponible.isSelected()) {
                Genero = "Fantasia";
            } else if (this.jbPrestado.isSelected()) {
                Genero = "Romance";
            } else if (this.jbFueraInventario.isSelected()) {
                Genero = "Historia";
            } else if (this.jbDisponible1.isSelected()) {
                Genero = "Accion";
            }
            String errores = "";
            boolean valido = true;
            if (this.txtAutor.getText() == null || "".equals(this.txtAutor.getText())) {
                errores += "Ingrese el nombre de los Autores separado por";
                valido = false;
            }
            if (this.txtTitulo.getText() == null || "".equals(this.txtTitulo.getText())) {
                errores += "Ingrese el titulo del libro\n";
                valido = false;
            }
            if (this.txtGeneroLibro.getText() == null || "".equals(this.txtGeneroLibro.getText())) {
                errores += "Ingrese el genero del libro\n";
                valido = false;
            }
            if (this.txtEditoriales.getText() == null || "".equals(this.txtEditoriales.getText())) {
                errores += "Ingrese el edicion\n";
                valido = false;
            }

            if (this.txtAñoEscribio.getText() == null || "".equals(this.txtAñoEscribio.getText())) {
                errores += "Ingrese el año en que se escribio\n";
                valido = false;
            }

            if (Genero == null || "".equals(Genero)) {
                errores += "Ingrese el Genero del libro\n";
                valido = false;
            }
            if (valido && IdLibroActual != -1) {
                // editar
                Libreria libro = libros.get(IdLibroActual);
                libro.setAutores(txtAutor.getText());
                libro.setTitulo(txtTitulo.getText());
                libro.setGenero(txtGeneroLibro.getText());
                libro.setEdi(txtEditoriales.getText());

                libro.setAno(Integer.parseInt(txtAñoEscribio.getText()));
                libro.setIsb(txtIBSN.getText());

                libro.setEstado(Genero);
                JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el libro");

                tblero(JtableLibros);
                Administrador.libros = this.libros;
            } else {
                JOptionPane.showMessageDialog(this, errores);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para Modificar el registro");
        }

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        if (JtableLibros.getSelectedRow() >= 0) {
            // eliminar           
            int eliminar = JOptionPane.showConfirmDialog(this, "Eliminar libro");
            if (eliminar == 0) {
                libros.remove(IdLibroActual);
                this.IdLibroActual = -1;
                tblero(JtableLibros);
                Administrador.libros = this.libros;
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar el registro");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEliminar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminar1ActionPerformed
        if (jtableUsuarios.getSelectedRow() >= 0) {
            // eliminar           
            int eliminar = JOptionPane.showConfirmDialog(this, "Eliminar Usuario");
            if (eliminar == 0) {
                usuarios.remove(IdUsuarioActual);
                this.IdUsuarioActual = -1;
                tblero(jtableUsuarios);
                Administrador.usuarios = this.usuarios;
                JOptionPane.showMessageDialog(this, "Se elimino correctamente");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para eliminar el Usuario");
        }
    }//GEN-LAST:event_btnEliminar1ActionPerformed

    private void btnAgregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar1ActionPerformed
        String errores = "";
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            errores += "Ingrese el nombre del usuario\n";
            valido = false;
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            errores += "Ingrese el apellido del usuario\n";
            valido = false;
        }
        if (this.txtEdad.getText() == null || "".equals(this.txtEdad.getText())) {
            errores += "Ingrese la edad del usuario\n";
            valido = false;
        }

        if (valido) {
            // guardar
            usuarios.add(new Login(txtNombre.getText(), txtApellido.getText(), txtEdad.getText(), Integer.parseInt(txtCodigo.getText()), "", 0));
            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el usuario");
            vaciarTablaUsuarios(jtableUsuarios);
            usu(jtableUsuarios);
            Administrador.usuarios = this.usuarios;

        } else {
            JOptionPane.showMessageDialog(this, errores);
        }
    }//GEN-LAST:event_btnAgregar1ActionPerformed

    private void btnModificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificar1ActionPerformed
        String errores = "";
        boolean valido = true;
        if (this.txtNombre.getText() == null || "".equals(this.txtNombre.getText())) {
            errores += "Ingrese el nombre del usuario\n";
            valido = false;
        }
        if (this.txtApellido.getText() == null || "".equals(this.txtApellido.getText())) {
            errores += "Ingrese el apellido del usuario\n";
            valido = false;
        }
        if (this.txtEdad.getText() == null || "".equals(this.txtEdad.getText())) {
            errores += "Ingrese la edad del usuario\n";
            valido = false;
        }

        if (valido && IdUsuarioActual != -1) {
            // editar
            Login usuario = usuarios.get(IdUsuarioActual);
            usuario.setNombre(txtNombre.getText());
            usuario.setApellido(txtApellido.getText());
            usuario.setEdad(txtEdad.getText());

            JOptionPane.showMessageDialog(this, "Se ha guardado exitosamente el usuario");
            vaciarTablaUsuarios(jtableUsuarios);
            usu(jtableUsuarios);
            Administrador.usuarios = this.usuarios;

        } else {
            JOptionPane.showMessageDialog(this, errores);
        }
    }//GEN-LAST:event_btnModificar1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        Administrador menu = new Administrador();
        menu.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cb_amigosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_amigosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_amigosActionPerformed

    private void cb_librosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_librosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_librosActionPerformed

    private void cb_amigos_modificarItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cb_amigos_modificarItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cb_amigos_modificarItemStateChanged

    private void tf_codigo_mKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_codigo_mKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigo_mKeyPressed

    private void bt_color_mMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_color_mMouseClicked

    }//GEN-LAST:event_bt_color_mMouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jButton4MouseClicked

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
            java.util.logging.Logger.getLogger(Libreria2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Libreria2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Libreria2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Libreria2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Libreria2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JtableLibros;
    private javax.swing.JButton bt_color_m;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAgregar1;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cb_amigos;
    private javax.swing.JComboBox cb_amigos_modificar;
    private javax.swing.JCheckBox cb_correr_m;
    private javax.swing.JCheckBox cb_football_m;
    private javax.swing.JComboBox cb_idioma_m;
    private javax.swing.JComboBox cb_libros;
    private javax.swing.JCheckBox cb_musica_m;
    private javax.swing.JCheckBox cb_tv_m;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton jbDisponible;
    private javax.swing.JRadioButton jbDisponible1;
    private javax.swing.JRadioButton jbFueraInventario;
    private javax.swing.JRadioButton jbPrestado;
    private javax.swing.JTable jtableUsuarios;
    private javax.swing.JTextArea ta_direccion_m;
    private javax.swing.JTextField tf_codigo_m;
    private javax.swing.JTextField tf_nombre_m;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtApellido3;
    private javax.swing.JTextField txtApellido4;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAñoEscribio;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEditoriales;
    private javax.swing.JTextField txtGeneroLibro;
    private javax.swing.JTextField txtIBSN;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
