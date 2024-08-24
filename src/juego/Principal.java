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
    setBounds(100, 100, 1344, 786);
    getContentPane().setLayout(null);
    
    JButton inicio = new JButton("");
    inicio.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        juego();
      }
    });
    
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
    

   
    JLabel fondo = new JLabel();
    fondo.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/a61900185607a45a0747d12abd0ebae0368a6cc8c6542f8e71ea6f399d41abbf.png")));
    fondo.setBounds(0, -21, 1386, 810);
    getContentPane().add(fondo);

  }
  private void juego() {
    Juego juego = new Juego();
    //juego.show();
    juego.setVisible(rootPaneCheckingEnabled);
  }
}
