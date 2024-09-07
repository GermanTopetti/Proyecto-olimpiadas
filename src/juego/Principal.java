package juego;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JProgressBar;
import java.awt.Font;

public class Principal extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  boolean botonPantalla=true;
 
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          Principal frame = new Principal();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public Principal() {
    
    setTitle("El agua con Pablo");
    setForeground(new Color(0, 0, 0));
    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    setBackground(new Color(0, 0, 0));
    contentPane = new JPanel();
    setBounds(100, 100, 1366, 768);
    getContentPane().setLayout(null);
    
    JButton inicio = new JButton("");
    inicio.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        juego();
        dispose();
        
      }
    });
    
    /* JButton pantalla = new JButton("");
    pantalla.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        fullscreen();
        if(botonPantalla==true){
          pantalla.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/modo-ventana.png")));
          botonPantalla=false;
          
        }
        else {
          pantalla.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/pantalla-completa.png")));
          botonPantalla=true;
          
        }
      
      }
    });
    */
   /* pantalla.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/pantalla-completa.png")));
    pantalla.setBorderPainted(false);
    pantalla.setContentAreaFilled(false);
    pantalla.setBounds(570, 375, 150, 40);
    getContentPane().add(pantalla);
    */
    JLabel nutria = new JLabel("");
    nutria.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/nutria-boca-cerrada.png")));
    nutria.setBounds(120, 320, 399, 506);
    getContentPane().add(nutria);
    
    JLabel creadores = new JLabel("Creadores: German Topetti, Emiliano Brito");
    creadores.setForeground(Color.BLACK);
    creadores.setFont(new Font("Courier 10 Pitch", Font.BOLD, 16));
    creadores.setBounds(12, 717, 427, 15);
    getContentPane().add(creadores);
    inicio.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/inicio.png")));
    inicio.setForeground(new Color(0, 0, 0));
    inicio.setBackground(new Color(0, 0, 0));
    
    inicio.setBounds(580, 323, 130, 40);
    getContentPane().add(inicio);
    
    JButton modoHistoria = new JButton("");
    modoHistoria.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null,"Coming Soon");
      }
    });
    modoHistoria.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/modoHistoria.png")));
    modoHistoria.setBounds(580, 274, 130, 40);
    modoHistoria.setBorderPainted(false);
    modoHistoria.setContentAreaFilled(false);
    getContentPane().add(modoHistoria);
    
    JButton botonSalir = new JButton("");
    botonSalir.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/boton-salir.png")));
    botonSalir.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
    botonSalir.setBounds(576, 420, 140, 40);
    
    getContentPane().add(botonSalir);
    botonSalir.setBorderPainted(false);
    botonSalir.setContentAreaFilled(false);
   
    JLabel fondo = new JLabel();
    fondo.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/fondo-del-todo.png")));
    fondo.setBounds(0, -21, 1400, 810);
    getContentPane().add(fondo);

  }
  private void juego() {
    Juego juego = new Juego();
    //juego.show();
    juego.setVisible(rootPaneCheckingEnabled);
  }
/*  public void fullscreen() {
    super.dispose();
    super.setExtendedState(JFrame.MAXIMIZED_BOTH);
    super.setUndecorated(!super.isUndecorated());
    super.setVisible(rootPaneCheckingEnabled);
  }
  public boolean getFullscreen() {
    return botonPantalla;
  }
 */
}
