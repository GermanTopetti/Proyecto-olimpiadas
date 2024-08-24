package juego;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextPane;

public class Juego extends JFrame {
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  public int contador=0;
  public int puntos=0;

  /**
   * Launch the application.
   */

  /**
   * Create the frame.
   */
  public Juego() {
  
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1344, 786);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 0, 0));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    
    setContentPane(contentPane);
    contentPane.setLayout(null);
 
    JLabel nutria=new JLabel("");
    nutria.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/cartel-vacio.png")));
   
    nutria.setForeground(new Color(246, 245, 244));
    JButton verdadero=new JButton("");
  
    verdadero.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton.png")));
    JButton falso=new JButton("");
   falso.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton.png")));
    
    JLabel creadores = new JLabel("Creadores: German Topetti, Emiliano Brito");
    creadores.setForeground(new Color(0, 0, 0));
    creadores.setFont(new Font("Courier 10 Pitch", Font.BOLD, 16));
    creadores.setBounds(12, 715, 427, 15);
    contentPane.add(creadores);
    
    JLabel nutriaCerrada = new JLabel("");
    nutriaCerrada.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/nutria-boca-cerrada.png")));
    nutriaCerrada.setBounds(66, 358, 365, 488);
    contentPane.add(nutriaCerrada);
    
    JLabel nutriaAbierta = new JLabel("");
    nutriaAbierta.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/nutria-boca-abierta.png")));
    nutriaAbierta.setBounds(66, 358, 365, 488);
    contentPane.add(nutriaAbierta);
    
    JLabel siguientePregunta = new JLabel("Siguiente Pregunta");
    siguientePregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 10));
    siguientePregunta.setBounds(596, 412, 158, 27);
    contentPane.add(siguientePregunta);
    siguientePregunta.setVisible(false);
    
    JLabel lblNo = new JLabel("no");
    lblNo.setFont(new Font("Dialog", Font.BOLD, 17));
    lblNo.setBounds(596, 417, 35, 15);
    contentPane.add(lblNo);
    
    JLabel lblSi = new JLabel("si");
    lblSi.setFont(new Font("Dialog", Font.BOLD, 18));
    lblSi.setBounds(675, 418, 22, 13);
    contentPane.add(lblSi);
    
  
    JButton boton1=new JButton("");
    boton1.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton-si-no.png")));
    boton1.setBorderPainted(false);
    boton1.setContentAreaFilled(false);
    contentPane.add(boton1);
    
    boton1.setBounds(662,400 ,50,50);
    JButton boton2=new JButton("");
    boton2.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton-si-no.png")));
    boton2.setBorderPainted(false);
    boton2.setContentAreaFilled(false);
    contentPane.add(boton2);
    boton2.setBounds(585,400,50, 50);
    boton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      ventanaPrincipal();
        dispose();
      }
    });
    
    JLabel preguntasNutria = new JLabel("¿Estas listo para empezar?");
    preguntasNutria.setHorizontalAlignment(SwingConstants.CENTER);
    preguntasNutria.setFont(new Font("URW Bookman", preguntasNutria.getFont().getStyle() | Font.BOLD, preguntasNutria.getFont().getSize() + 6));
    preguntasNutria.setBounds(468, 242, 389, 208);
    contentPane.add(preguntasNutria);
    
    JLabel respuestaTrue = new JLabel("Verdadero");
    respuestaTrue.setFont(new Font("Courier 10 Pitch", Font.BOLD, 16));
    respuestaTrue.setBounds(675, 419, 90, 15);
    contentPane.add(respuestaTrue);
    respuestaTrue.setVisible(false);
    
    
    JLabel respuestaFalse = new JLabel("Falso");
    respuestaFalse.setFont(new Font("Courier 10 Pitch", Font.BOLD, 18));
    respuestaFalse.setBounds(553, 418, 70, 15);
    contentPane.add(respuestaFalse);
    respuestaFalse.setVisible(false);
    
    contentPane.add(verdadero);
    contentPane.add(falso);
    contentPane.add(nutria);
    verdadero.setBounds(652, 400, 133, 50);
    falso.setBounds(517, 400, 133, 50);
    nutria.setBounds(457,266,400,200);
    verdadero.setBorderPainted(false);
    verdadero.setContentAreaFilled(false);
    falso.setBorderPainted(false);
    falso.setContentAreaFilled(false);
    
   verdadero.setVisible(false);
   falso.setVisible(false);
    

    JLabel fondo = new JLabel("New label");
   fondo.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/a61900185607a45a0747d12abd0ebae0368a6cc8c6542f8e71ea6f399d41abbf.png")));
    fondo.setBounds(0, -15, 1344, 801);
    contentPane.add(fondo);
    
    boton1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        boton1.setVisible(false);
        boton2.setVisible(false);
        verdadero.setVisible(true);
        falso.setVisible(true);
        respuestaFalse.setVisible(true);
        respuestaTrue.setVisible(true);
        lblSi.setVisible(false);
        lblNo.setVisible(false);
        siguientePregunta.setVisible(false);
        if(contador==0) {
        preguntasNutria.setText("<html>La canilla debe mantenerse cerrada si no se usa</html>");
        }
        else if(contador==1) {
          preguntasNutria.setText("<html>El agua es infinita</html>");
        }
        else if(contador==2) {
          preguntasNutria.setText("<html>Bañarse una hora es lo correcto</html>");
        }
        else if(contador==3) {
          preguntasNutria.setText("<html>El agua es importante para la vida de los animales</html>");
        }
        else if(contador==4) {
          preguntasNutria.setText("<html>La contaminacion del mar es por culpa de los humanos</html>");
        }
        else if(contador==5) {
          preguntasNutria.setText("<html>La sequia del año 2023 se pudo prevenir </html>");
        }
        else {
          preguntasNutria.setText("conseguiste "+puntos+" puntos");
          verdadero.setVisible(false);
          falso.setVisible(false);
          respuestaTrue.setVisible(false);
          respuestaFalse.setVisible(false);
        }
      }
    }); 
    verdadero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
       if(contador==0) {
         preguntasNutria.setText("Correcto, sumas un punto");
         puntos=puntos+1;
         nutriaCerrada.setVisible(false);
         nutriaAbierta.setVisible(true);
       }
       else if(contador==1) {
         preguntasNutria.setText("Error, te equivocaste");
         puntos=puntos-1;
         nutriaCerrada.setVisible(true);
         nutriaAbierta.setVisible(false);
       }
       else if(contador==2) {
         preguntasNutria.setText("paa, le erraste");
         puntos=puntos-1;
         nutriaCerrada.setVisible(true);
         nutriaAbierta.setVisible(false);
       }
       else if(contador==3) {
         preguntasNutria.setText("seeee, es verdad");
         puntos=puntos+1;
         nutriaCerrada.setVisible(false);
         nutriaAbierta.setVisible(true);
       }
       else if(contador==4) {
         preguntasNutria.setText("tienes toda la razon");
         puntos=puntos+1;
         nutriaCerrada.setVisible(false);
         nutriaAbierta.setVisible(true);
       }
       else if(contador==5) {
         preguntasNutria.setText("Error, es falso");
         puntos=puntos-1;
         nutriaCerrada.setVisible(true);
         nutriaAbierta.setVisible(false);
         siguientePregunta.setText("Ver puntaje");
         siguientePregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
       }
       verdadero.setVisible(false);
       falso.setVisible(false);
       respuestaTrue.setVisible(false);
       respuestaFalse.setVisible(false);
       
       boton1.setVisible(true);
       boton1.setBounds(582, 400, 133, 50);
       boton1.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton.png")));
       siguientePregunta.setVisible(true);
       contador=contador+1;
       
      }});
    falso.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        if(contador==0) {
          preguntasNutria.setText("error, es verdadero");
          puntos=puntos-1;
          nutriaCerrada.setVisible(true);
          nutriaAbierta.setVisible(false);
        }
        else if(contador==1) {
          preguntasNutria.setText("le embocaste crack");
          puntos=puntos+1;
          nutriaCerrada.setVisible(false);
          nutriaAbierta.setVisible(true);
        }
        else if(contador==2) {
          preguntasNutria.setText("exactooo, sumas otro punto");
          puntos=puntos+1;
          nutriaCerrada.setVisible(false);
          nutriaAbierta.setVisible(true);
        }
        else if(contador==3) {
          preguntasNutria.setText("le erraste, es verdadero");
          puntos=puntos-1;
          nutriaCerrada.setVisible(true);
          nutriaAbierta.setVisible(false);
        }
        else if(contador==4) {
          preguntasNutria.setText("te equivocaste, -1 punto");
          puntos=puntos-1;
          nutriaCerrada.setVisible(true);
          nutriaAbierta.setVisible(false);
        }
        else if(contador==5) {
          preguntasNutria.setText("bieen, sumas un punto");
          puntos=puntos+1;
          nutriaCerrada.setVisible(false);
          nutriaAbierta.setVisible(true);
          siguientePregunta.setText("ver puntaje");
          siguientePregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
        }
        
        verdadero.setVisible(false);
        falso.setVisible(false);
        respuestaTrue.setVisible(false);
        respuestaFalse.setVisible(false);
        boton1.setVisible(true);
        boton1.setBounds(582, 400, 133, 50);
        boton1.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton.png")));
        siguientePregunta.setVisible(true);
        contador=contador+1;
     
        
      }
    });
    
  }
  private void ventanaPrincipal () {
    Principal ventanaPrincipal=new Principal();
    ventanaPrincipal.show();
  }
}
