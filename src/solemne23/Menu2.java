/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solemne23;
import java.applet.AudioClip;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dekum
 */
public class Menu2 extends javax.swing.JFrame {
//Se crean los arraylist y se asocia el table
    ArrayList<Abarrote> listaAbarrotes;
    ArrayList<Liquido> listaLiquidos;
    ArrayList<Aseo> listaAseo;
    ArrayList<Congelado> listaCongelados;
    ArrayList<Oferta> listaOfertas;
   
    String filaAbarrote[] = new String[]{"Categoría","Código","Descripción","Precio","Tipo de Clasificación"};
    String filaLiquido[] = new String[]{"Categoría","Código","Descripción","Precio","Cantidad en ml"};
    String filaAseo[] = new String[]{"Categoría","Código","Descripción","Precio","Aroma"};
    String filaCongelado[] = new String[]{"Categoría","Código","Descripción","Precio","Tipo de Carne"};
    String filaOferta[] = new String[]{"Categoría","Código","Descripción","Precio","Oferta"};
    
    DefaultTableModel fAbarrote;
    DefaultTableModel fLiquido;
    DefaultTableModel fAseo;
    DefaultTableModel fCongelado;
    DefaultTableModel fOferta;
    
    int filaAb,columnaAb,filaLiq,columnaLiq,filaAs,columnaAs,filaCo,columnaCo,filaOf,columnaOf;
    
    public Menu2(){
        initComponents();
    //Array Abarrotes  
    
        listaAbarrotes = new ArrayList<>();
        fAbarrote = new DefaultTableModel(filaAbarrote,0);
        tablaAba.setModel(fAbarrote);
        
        guardarTabAb();
                
    //Array Líquidos
    
        listaLiquidos = new ArrayList<>();
        fLiquido = new DefaultTableModel(filaLiquido,0);
        tablaLiq.setModel(fLiquido);
        
        guardarTabLiq();
        
    //Array Aseo
    
        listaAseo = new ArrayList<>();
        fAseo = new DefaultTableModel(filaAseo,0);
        tablaAseo.setModel(fAseo);
        
        guardarTabAs();
        
    //Array Congelados
    
        listaCongelados = new ArrayList<>();
        fCongelado = new DefaultTableModel(filaCongelado,0);
        tablaCon.setModel(fCongelado);
        
        guardarTabCo();
    
    //Array Ofertas
    
        listaOfertas = new ArrayList<>();
        fOferta = new DefaultTableModel(filaOferta,0);
        tablaOfer.setModel(fOferta);
        
        guardarTabOf();
    }   
   public void guardarTabAb() {
        
        final String ruta = "abarrotes.txt";
        File f = new File(ruta);
        
        try{
           FileReader fr = new FileReader(f.getAbsoluteFile());
               BufferedReader br = new BufferedReader(fr);
           
           Object[] filasAb = br.lines().toArray();
           
           for (int contador = 0; contador < filasAb.length; contador++){
               
               String linea = filasAb[contador].toString().trim();
               String[] ab = linea.split("/");
               fAbarrote.addRow(ab);
           }
           fr.close();
           br.close();
        }catch (Exception ex){
            
        }
    }
    
    public void guardarTabLiq() {
        
        final String ruta = "liquidos.txt";
        File f = new File(ruta);
        
        try{
           FileReader fr = new FileReader(f.getAbsoluteFile());
               BufferedReader br = new BufferedReader(fr);
           
           Object[] filasLiq = br.lines().toArray();
           
           for (int contador = 0; contador < filasLiq.length; contador++){
               
               String linea = filasLiq[contador].toString().trim();
               String[] liq = linea.split("/");
               fLiquido.addRow(liq);
           }
           fr.close();
           br.close();
        }catch (Exception ex){
            
        }
    }
    
    public void guardarTabAs() {
        
        final String ruta = "aseo.txt";
        File f = new File(ruta);
        
        try{
           FileReader fr = new FileReader(f.getAbsoluteFile());
               BufferedReader br = new BufferedReader(fr);
           
           Object[] filasAs = br.lines().toArray();
           
           for (int contador = 0; contador < filasAs.length; contador++){
               
               String linea = filasAs[contador].toString().trim();
               String[] as = linea.split("/");
               fAseo.addRow(as);
           }
           fr.close();
           br.close();
        }catch (Exception ex){
            
        }
    }
    
    public void guardarTabCo() {
        
        final String ruta = "congelados.txt";
        File f = new File(ruta);
        
        try{
           FileReader fr = new FileReader(f.getAbsoluteFile());
               BufferedReader br = new BufferedReader(fr);
           
           Object[] filasCo = br.lines().toArray();
           
           for (int contador = 0; contador < filasCo.length; contador++){
               
               String linea = filasCo[contador].toString().trim();
               String[] co = linea.split("/");
               fCongelado.addRow(co);
           }
           fr.close();
           br.close();
        }catch (Exception ex){
            
        }
    }
    
    public void guardarTabOf() {
        
        final String ruta = "ofertas.txt";
        File f = new File(ruta);
        
        try{
           FileReader fr = new FileReader(f.getAbsoluteFile());
               BufferedReader br = new BufferedReader(fr);
           
           Object[] filasOf = br.lines().toArray();
           
           for (int contador = 0; contador < filasOf.length; contador++){
               
               String linea = filasOf[contador].toString().trim();
               String[] of = linea.split("/");
               fOferta.addRow(of);
           }
           fr.close();
           br.close();
        }catch (Exception ex){
            
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

        panelMantenedor = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        btVolver = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btAgregar = new javax.swing.JButton();
        panelCrearprod = new javax.swing.JPanel();
        tabbedPane = new javax.swing.JTabbedPane();
        abarrotes = new javax.swing.JScrollPane();
        tablaAba = new javax.swing.JTable();
        liquidos = new javax.swing.JScrollPane();
        tablaLiq = new javax.swing.JTable();
        aseo = new javax.swing.JScrollPane();
        tablaAseo = new javax.swing.JTable();
        congelados = new javax.swing.JScrollPane();
        tablaCon = new javax.swing.JTable();
        ofertas = new javax.swing.JScrollPane();
        tablaOfer = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        categoria = new javax.swing.JLabel();
        cmbCategoria = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        atributo = new javax.swing.JLabel();
        txtclasificacion = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMantenedor.setBackground(new java.awt.Color(255, 255, 255));
        panelMantenedor.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtTitulo.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        txtTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btVolver.setBackground(new java.awt.Color(204, 204, 204));
        btVolver.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        btVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btVolver.setContentAreaFilled(false);
        btVolver.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        btVolver.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir2.png"))); // NOI18N
        btVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVolverActionPerformed(evt);
            }
        });

        btEliminar.setBackground(new java.awt.Color(204, 204, 204));
        btEliminar.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        btEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar.png"))); // NOI18N
        btEliminar.setContentAreaFilled(false);
        btEliminar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar.png"))); // NOI18N
        btEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar 2.png"))); // NOI18N
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });

        btAgregar.setBackground(new java.awt.Color(204, 204, 204));
        btAgregar.setFont(new java.awt.Font("Leelawadee UI", 1, 11)); // NOI18N
        btAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btAgregar.setContentAreaFilled(false);
        btAgregar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar.png"))); // NOI18N
        btAgregar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregar 2.png"))); // NOI18N
        btAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAgregarActionPerformed(evt);
            }
        });

        panelCrearprod.setBackground(new java.awt.Color(51, 153, 255));
        panelCrearprod.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaAba.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tablaAba.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAbaMouseClicked(evt);
            }
        });
        abarrotes.setViewportView(tablaAba);

        tabbedPane.addTab("Abarrotes", abarrotes);

        tablaLiq.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaLiq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaLiqMouseClicked(evt);
            }
        });
        liquidos.setViewportView(tablaLiq);

        tabbedPane.addTab("Líquidos", liquidos);

        tablaAseo.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaAseo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAseoMouseClicked(evt);
            }
        });
        aseo.setViewportView(tablaAseo);

        tabbedPane.addTab("Aseo", aseo);

        tablaCon.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaConMouseClicked(evt);
            }
        });
        congelados.setViewportView(tablaCon);

        tabbedPane.addTab("Congelados", congelados);

        tablaOfer.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaOfer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaOferMouseClicked(evt);
            }
        });
        ofertas.setViewportView(tablaOfer);

        tabbedPane.addTab("Ofertas", ofertas);

        javax.swing.GroupLayout panelCrearprodLayout = new javax.swing.GroupLayout(panelCrearprod);
        panelCrearprod.setLayout(panelCrearprodLayout);
        panelCrearprodLayout.setHorizontalGroup(
            panelCrearprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCrearprodLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        panelCrearprodLayout.setVerticalGroup(
            panelCrearprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearprodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(102, 204, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\dekum\\OneDrive\\Escritorio\\Emotes\\icn1.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn2.png"))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn3.png"))); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn4.png"))); // NOI18N

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn5.png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn6.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn7.png"))); // NOI18N

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn8.png"))); // NOI18N

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icn9.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(33, 33, 33))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Freestyle Script", 0, 60)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Pandemic Store");

        jButton1.setForeground(new java.awt.Color(240, 240, 240));
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\dekum\\OneDrive\\Escritorio\\Emotes\\musica on.png")); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel3.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Código:");

        txtCodigo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(51, 153, 255));

        categoria.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        categoria.setForeground(new java.awt.Color(255, 255, 255));
        categoria.setText("Categoría:");

        cmbCategoria.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cmbCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Abarrotes", "Líquidos", "Aseo", "Congelados", "Ofertas" }));
        cmbCategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCategoriaMouseClicked(evt);
            }
        });
        cmbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(categoria)
                .addGap(18, 18, 18)
                .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(categoria)
                    .addComponent(cmbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 153, 255));

        atributo.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        atributo.setForeground(new java.awt.Color(255, 255, 255));
        atributo.setText("Atributo:");

        txtclasificacion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtclasificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclasificacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(atributo)
                .addGap(18, 18, 18)
                .addComponent(txtclasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atributo)
                    .addComponent(txtclasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(51, 153, 255));

        jLabel5.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Precio $:");

        txtPrecio.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(51, 153, 255));

        jLabel4.setFont(new java.awt.Font("Freestyle Script", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Descripción:");

        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelMantenedorLayout = new javax.swing.GroupLayout(panelMantenedor);
        panelMantenedor.setLayout(panelMantenedorLayout);
        panelMantenedorLayout.setHorizontalGroup(
            panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCrearprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantenedorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelMantenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMantenedorLayout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMantenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtTitulo)))
                .addContainerGap())
        );
        panelMantenedorLayout.setVerticalGroup(
            panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMantenedorLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMantenedorLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtTitulo))
                    .addGroup(panelMantenedorLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMantenedorLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelMantenedorLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCrearprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelMantenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMantenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMantenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAgregarActionPerformed
        Validaciones val = new Validaciones();
        //Variables Importantes
        int tamAb = listaAbarrotes.size();
        int tamLiq = listaLiquidos.size();
        int tamAs = listaAseo.size();
        int tamCo = listaCongelados.size();
        int tamOf = listaOfertas.size();

        String cat = cmbCategoria.getSelectedItem().toString();
        String codigo = txtCodigo.getText();
        String descripcion = txtDescripcion.getText();
        String precio = txtPrecio.getText();

        if(precio.equals("")){
            precio = "0";
        }

        int cash = Integer.parseInt(precio);

        boolean c = val.validarCodigo(codigo);
        boolean p = val.validarPrecio(cash);
        boolean d = val.validarDescripcion(descripcion);
        //Agregar Abarrotes
        if(c == true && p == true && d == true){
            if(cat.equals("Abarrotes")){

                String clasificacion = txtclasificacion.getText();
                boolean clas = val.validarAtributoAb(clasificacion);

                if(clas == true){
                    listaAbarrotes.add(new Abarrote(cat,codigo,descripcion,cash,clasificacion)); //Toma el mismo orden que el constructor de trabajadorc
                    fAbarrote.setRowCount(0);
                    BufferedWriter bw = null;

                    try{

                        final String ruta = "abarrotes.txt";
                        File f = new File(ruta);

                        if(!f.exists()){
                            f.createNewFile();
                        }

                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        bw = new BufferedWriter(fw);

                        for(int contador = tamAb; contador < listaAbarrotes.size(); contador++){
                            bw.write((String) listaAbarrotes.get(contador).toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                    guardarTabAb();
                    borrar();
                }else{
                    JOptionPane.showMessageDialog(null," Los Datos que usted ha ingresado son incorrectos, favor intente de nuevo");
                }
            }

            //Agregar Líquidos
            if(cat.equals("Líquidos")){

                String tamml = txtclasificacion.getText();
                if(tamml.equals("")){
                    tamml = "0";
                }
                int tamanoml = Integer.parseInt(tamml);
                boolean tam = val.validarAtributoLiq(tamanoml);

                if(tam == true){
                    listaLiquidos.add(new Liquido(cat,codigo,descripcion,cash,tamanoml)); //Toma el mismo orden que el constructor de trabajadorc
                    fLiquido.setRowCount(0);

                    BufferedWriter bw = null;

                    try{

                        final String ruta = "liquidos.txt";
                        File f = new File(ruta);

                        if(!f.exists()){
                            f.createNewFile();
                        }

                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        bw = new BufferedWriter(fw);

                        for(int contador = tamLiq; contador < listaLiquidos.size(); contador++){
                            bw.write((String) listaLiquidos.get(contador).toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                    guardarTabLiq();
                    borrar();
                }else{
                    JOptionPane.showMessageDialog(null," Los Datos que usted ha ingresado son incorrectos, favor intente de nuevo");
                }
            }

            //Agregar Aseo
            if(cat.equals("Aseo")){

                String aroma = txtclasificacion.getText();
                boolean arom = val.validarAtributoAs(aroma);

                if(arom == true){
                    listaAseo.add(new Aseo(cat,codigo,descripcion,cash,aroma)); //Toma el mismo orden que el constructor de trabajadorc
                    fAseo.setRowCount(0);

                    BufferedWriter bw = null;

                    try{

                        final String ruta = "Aseo.txt";
                        File f = new File(ruta);

                        if(!f.exists()){
                            f.createNewFile();
                        }

                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        bw = new BufferedWriter(fw);

                        for(int contador = tamAs; contador < listaAseo.size(); contador++){
                            bw.write((String) listaAseo.get(contador).toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                    guardarTabAs();
                    borrar();
                }else{
                    JOptionPane.showMessageDialog(null," Los Datos que usted ha ingresado son incorrectos, favor intente de nuevo");
                }
            }

            //Agregar Congelados
            if(cat.equals("Congelados")){

                String carne = txtclasificacion.getText();
                boolean carn = val.validarAtributoCo(carne);

                if(carn == true){
                    listaCongelados.add(new Congelado(cat,codigo,descripcion,cash,carne)); //Toma el mismo orden que el constructor de trabajadorc
                    fCongelado.setRowCount(0);

                    BufferedWriter bw = null;

                    try{

                        final String ruta = "congelados.txt";
                        File f = new File(ruta);

                        if(!f.exists()){
                            f.createNewFile();
                        }

                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        bw = new BufferedWriter(fw);

                        for(int contador = tamCo; contador < listaCongelados.size(); contador++){
                            bw.write((String) listaCongelados.get(contador).toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                    guardarTabCo();
                    borrar();
                }else{
                    JOptionPane.showMessageDialog(null," Los Datos que usted ha ingresado son incorrectos, favor intente de nuevo");
                }
            }

            //Agregar Ofertas
            if(cat.equals("Ofertas")){

                String nwPrecio = txtclasificacion.getText();
                if(nwPrecio.equals("")){
                    nwPrecio = "0";
                }
                int newPrecio = Integer.parseInt(nwPrecio);
                boolean np = val.validarAtributoOf(newPrecio);

                if(np == true){
                    listaOfertas.add(new Oferta(cat,codigo,descripcion,cash,newPrecio)); //Toma el mismo orden que el constructor de trabajadorc
                    fOferta.setRowCount(0);

                    BufferedWriter bw = null;

                    try{

                        final String ruta = "ofertas.txt";
                        File f = new File(ruta);

                        if(!f.exists()){
                            f.createNewFile();
                        }

                        FileWriter fw = new FileWriter(f.getAbsoluteFile(),true);
                        bw = new BufferedWriter(fw);

                        for(int contador = tamOf; contador < listaOfertas.size(); contador++){
                            bw.write((String) listaOfertas.get(contador).toString());
                            bw.newLine();
                        }
                        bw.close();
                        fw.close();
                    } catch (IOException ex) {
                    }
                    guardarTabOf();
                    borrar();
                }else{
                    JOptionPane.showMessageDialog(null," Los Datos que usted ha ingresado son incorrectos, favor intente de nuevo");
                }
            }
        }else{
            JOptionPane.showMessageDialog(null," Los Datos que usted ha ingresado son incorrectos, favor intente de nuevo");
        }

    }//GEN-LAST:event_btAgregarActionPerformed
private void borrar(){
        
        txtCodigo.setText("");
        txtDescripcion.setText("");
        txtPrecio.setText("");  
     
       txtclasificacion.setText("");  }
    private void cmbCategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCategoriaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoriaMouseClicked

    private void cmbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoriaActionPerformed

        if(cmbCategoria.getSelectedItem().toString().equals("Abarrotes")){
            atributo.setText("Tipo de Abarrote: ");
            tabbedPane.setSelectedIndex(0);
        }

        if(cmbCategoria.getSelectedItem().toString().equals("Líquidos")){
            atributo.setText("Cantidad en ml: ");
            tabbedPane.setSelectedIndex(1);
        }

        if(cmbCategoria.getSelectedItem().toString().equals("Aseo")){
            atributo.setText("Liquido/Aerosol: ");
            tabbedPane.setSelectedIndex(2);
        }

        if(cmbCategoria.getSelectedItem().toString().equals("Congelados")){
            atributo.setText("Carner/Verduras: ");
            tabbedPane.setSelectedIndex(3);
        }

        if(cmbCategoria.getSelectedItem().toString().equals("Ofertas")){
            atributo.setText("Precio Oferta: $");
            tabbedPane.setSelectedIndex(4);
        }

    }//GEN-LAST:event_cmbCategoriaActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void txtclasificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclasificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclasificacionActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed

        String busq = txtCodigo.getText();
        String categoria = cmbCategoria.getSelectedItem().toString();
        //Abarrotes
        if(categoria.equals("Abarrotes")){

            fAbarrote.removeRow(filaAb);
            fAbarrote.setRowCount(0);
            int pos = 1;
            String abarroteFile = "temp.txt";
            File oldFile = new File("abarrotes.txt");
            File newFile = new File("temp.txt");

            String linea;
            String data[];

            try{
                FileWriter fw = new FileWriter(abarroteFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader("abarrotes.txt");
                BufferedReader br = new BufferedReader(fr);

                while((linea = br.readLine()) !=null){
                    data = linea.split("/");

                    if(!data[pos].equalsIgnoreCase(busq)){
                        pw.println(linea);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                fw.close();
                bw.close();

                oldFile.delete();
                File dump = new File("abarrotes.txt");
                newFile.renameTo(dump);

                guardarTabAb();

            }catch(Exception ex){

            }
        }

        //Líquidos

        if(categoria.equals("Líquidos")){

            fLiquido.removeRow(filaLiq);
            fLiquido.setRowCount(0);
            int pos = 1;
            String liquidoFile = "temp.txt";
            File oldFile = new File("liquidos.txt");
            File newFile = new File("temp.txt");

            String linea;
            String data[];

            try{
                FileWriter fw = new FileWriter(liquidoFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader("liquidos.txt");
                BufferedReader br = new BufferedReader(fr);

                while((linea = br.readLine()) !=null){
                    data = linea.split("/");

                    if(!data[pos].equalsIgnoreCase(busq)){
                        pw.println(linea);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                fw.close();
                bw.close();

                oldFile.delete();
                File dump = new File("liquidos.txt");
                newFile.renameTo(dump);

                guardarTabLiq();

            }catch(Exception ex){

            }

        }

        //Aseo

        if(categoria.equals("Aseo")){

            fAseo.removeRow(filaAs);
            fAseo.setRowCount(0);
            int pos = 1;
            String aseoFile = "temp.txt";
            File oldFile = new File("Aseo.txt");
            File newFile = new File("temp.txt");

            String linea;
            String data[];

            try{
                FileWriter fw = new FileWriter(aseoFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader("Aseo.txt");
                BufferedReader br = new BufferedReader(fr);

                while((linea = br.readLine()) !=null){
                    data = linea.split("/");

                    if(!data[pos].equalsIgnoreCase(busq)){
                        pw.println(linea);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                fw.close();
                bw.close();

                oldFile.delete();
                File dump = new File("Aseo.txt");
                newFile.renameTo(dump);

                guardarTabAs();

            }catch(Exception ex){

            }

        }

        //Congelados

        if(categoria.equals("Congelados")){

            fCongelado.removeRow(filaCo);
            fCongelado.setRowCount(0);
            int pos = 1;
            String congeladoFile = "temp.txt";
            File oldFile = new File("congelados.txt");
            File newFile = new File("temp.txt");

            String linea;
            String data[];

            try{
                FileWriter fw = new FileWriter(congeladoFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader("congelados.txt");
                BufferedReader br = new BufferedReader(fr);

                while((linea = br.readLine()) !=null){
                    data = linea.split("/");

                    if(!data[pos].equalsIgnoreCase(busq)){
                        pw.println(linea);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                fw.close();
                bw.close();

                oldFile.delete();
                File dump = new File("congelados.txt");
                newFile.renameTo(dump);

                guardarTabCo();

            }catch(Exception ex){

            }

        }

        //Ofertas

        if(categoria.equals("Ofertas")){

            fOferta.removeRow(filaOf);
            fOferta.setRowCount(0);
            int pos = 1;
            String ofertaFile = "temp.txt";
            File oldFile = new File("ofertas.txt");
            File newFile = new File("temp.txt");

            String linea;
            String data[];

            try{
                FileWriter fw = new FileWriter(ofertaFile,true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);

                FileReader fr = new FileReader("ofertas.txt");
                BufferedReader br = new BufferedReader(fr);

                while((linea = br.readLine()) !=null){
                    data = linea.split("/");

                    if(!data[pos].equalsIgnoreCase(busq)){
                        pw.println(linea);
                    }
                }
                pw.flush();
                pw.close();
                fr.close();
                br.close();
                fw.close();
                bw.close();

                oldFile.delete();
                File dump = new File("ofertas.txt");
                newFile.renameTo(dump);

                guardarTabOf();

            }catch(Exception ex){

            }

        }

    }//GEN-LAST:event_btEliminarActionPerformed

    
        
    private void btVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVolverActionPerformed
        setVisible(false);
    }//GEN-LAST:event_btVolverActionPerformed

    private void tablaAbaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAbaMouseClicked
        // TODO add your handling code here:
        //Abarrote
        filaAb = tablaAba.getSelectedRow();
        columnaAb = tablaAba.getColumnCount();

        txtCodigo.setText(fAbarrote.getValueAt(filaAb, 1).toString());
        txtDescripcion.setText(fAbarrote.getValueAt(filaAb, 2).toString());
        txtPrecio.setText(fAbarrote.getValueAt(filaAb, 3).toString());
        txtclasificacion.setText(fAbarrote.getValueAt(filaAb, 4).toString());

        cmbCategoria.setSelectedIndex(0);
    }//GEN-LAST:event_tablaAbaMouseClicked

    private void tablaLiqMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaLiqMouseClicked
        //Líquidos
        filaLiq = tablaLiq.getSelectedRow();
        columnaLiq = tablaLiq.getColumnCount();

        txtCodigo.setText(fLiquido.getValueAt(filaLiq, 1).toString());
        txtDescripcion.setText(fLiquido.getValueAt(filaLiq, 2).toString());
        txtPrecio.setText(fLiquido.getValueAt(filaLiq, 3).toString());
        txtclasificacion.setText(fLiquido.getValueAt(filaLiq, 4).toString());

        cmbCategoria.setSelectedIndex(1);
    }//GEN-LAST:event_tablaLiqMouseClicked

    private void tablaAseoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAseoMouseClicked
        //Aseo
        filaAs = tablaAseo.getSelectedRow();
        columnaAs = tablaAseo.getColumnCount();

        txtCodigo.setText(fAseo.getValueAt(filaAs, 1).toString());
        txtDescripcion.setText(fAseo.getValueAt(filaAs, 2).toString());
        txtPrecio.setText(fAseo.getValueAt(filaAs, 3).toString());
        txtclasificacion.setText(fAseo.getValueAt(filaAs, 4).toString());

        cmbCategoria.setSelectedIndex(2);
    }//GEN-LAST:event_tablaAseoMouseClicked

    private void tablaConMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaConMouseClicked
        //Congelados
        filaCo = tablaCon.getSelectedRow();
        columnaCo = tablaCon.getColumnCount();

        txtCodigo.setText(fCongelado.getValueAt(filaCo, 1).toString());
        txtDescripcion.setText(fCongelado.getValueAt(filaCo, 2).toString());
        txtPrecio.setText(fCongelado.getValueAt(filaCo, 3).toString());
        txtclasificacion.setText(fCongelado.getValueAt(filaCo, 4).toString());

        cmbCategoria.setSelectedIndex(3);
    }//GEN-LAST:event_tablaConMouseClicked

    private void tablaOferMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaOferMouseClicked
        //Ofertas
        filaOf = tablaOfer.getSelectedRow();
        columnaOf = tablaOfer.getColumnCount();

        txtCodigo.setText(fOferta.getValueAt(filaOf, 1).toString());
        txtDescripcion.setText(fOferta.getValueAt(filaOf, 2).toString());
        txtPrecio.setText(fOferta.getValueAt(filaOf, 3).toString());
        txtclasificacion.setText(fOferta.getValueAt(filaOf, 4).toString());

        cmbCategoria.setSelectedIndex(4);
    }//GEN-LAST:event_tablaOferMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/solemne23/super.wav"));
        Sound.play();

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane abarrotes;
    private javax.swing.JScrollPane aseo;
    private javax.swing.JLabel atributo;
    private javax.swing.JButton btAgregar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btVolver;
    private javax.swing.JLabel categoria;
    private javax.swing.JComboBox<String> cmbCategoria;
    private javax.swing.JScrollPane congelados;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane liquidos;
    private javax.swing.JScrollPane ofertas;
    private javax.swing.JPanel panelCrearprod;
    private javax.swing.JPanel panelMantenedor;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tablaAba;
    private javax.swing.JTable tablaAseo;
    private javax.swing.JTable tablaCon;
    private javax.swing.JTable tablaLiq;
    private javax.swing.JTable tablaOfer;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JLabel txtTitulo;
    private javax.swing.JTextField txtclasificacion;
    // End of variables declaration//GEN-END:variables

    /*private void initComponents();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.*/
    
}
