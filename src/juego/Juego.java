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
import java.awt.SystemColor;
import javax.swing.UIManager;

public class Juego extends JFrame { 
  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  public int contador=0;
  public int puntos=0;
  public int preguntaContador;
  public int preguntaContadorBien=0;
  public int preguntaContadorMal=0;
  boolean pantalla;
  Principal p=new Principal();

  public Juego() {
   /* if(p.getFullscreen()==true) {
      fullscreen();
    }
  */setTitle("El agua con Pablo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 1366, 768);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(0, 0, 0));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    
    setContentPane(contentPane);
    contentPane.setLayout(null);
 
    JLabel nutria=new JLabel("");
    nutria.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/cartel-vacio.png")));
    nutria.setBounds(457,266,400,200);
    
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
    
    JLabel lblInicio = new JLabel("inicio");
    lblInicio.setFont(new Font("Courier 10 Pitch", Font.BOLD, 22));
    lblInicio.setHorizontalAlignment(SwingConstants.CENTER);
    lblInicio.setBounds(610, 400, 87, 39);
    contentPane.add(lblInicio);
    lblInicio.setVisible(false);
    
    JButton reiniciar = new JButton("");
    reiniciar.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
        ventanaPrincipal();
      }
    });
    
    JLabel contadorPregunta = new JLabel("");
    contadorPregunta.setForeground(UIManager.getColor("CheckBox.foreground"));
    contadorPregunta.setHorizontalAlignment(SwingConstants.CENTER);
    contadorPregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 14));
    contadorPregunta.setBounds(189, 242, 210, 50);
    contentPane.add(contadorPregunta);
    
    JLabel puntosSistema = new JLabel("");
    puntosSistema.setFont(new Font("Courier 10 Pitch", Font.BOLD, 14));
    puntosSistema.setForeground(UIManager.getColor("CheckBox.foreground"));
    puntosSistema.setHorizontalAlignment(SwingConstants.CENTER);
    puntosSistema.setBounds(167, 271, 252, 60);
    contentPane.add(puntosSistema);
    reiniciar.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton-salida.png")));
    reiniciar.setBounds(1230, 30, 60, 60);
    contentPane.add(reiniciar);
    
    reiniciar.setBorderPainted(false);
    reiniciar.setContentAreaFilled(false);
    
    JLabel nutriaCerrada = new JLabel("");
    nutriaCerrada.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/nutria-boca-cerrada.png")));
    nutriaCerrada.setBounds(-53, 358, 365, 488);
    contentPane.add(nutriaCerrada);
    
    JLabel nutriaAbierta = new JLabel("");
    nutriaAbierta.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/nutria-boca-abierta.png")));
    nutriaAbierta.setBounds(-53, 358, 365, 488);
    contentPane.add(nutriaAbierta);
    
    JLabel siguientePregunta = new JLabel("Siguiente Pregunta");
    siguientePregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 10));
    siguientePregunta.setBounds(596, 412, 158, 27);
    contentPane.add(siguientePregunta);
    siguientePregunta.setVisible(false);
    
    JLabel lblNo = new JLabel("no");
    lblNo.setFont(new Font("Dialog", Font.BOLD, 17));
    lblNo.setBounds(675, 417, 35, 15);
    contentPane.add(lblNo);
    
    JLabel lblSi = new JLabel("si");
    lblSi.setHorizontalAlignment(SwingConstants.CENTER);
    lblSi.setFont(new Font("Dialog", Font.BOLD, 18));
    lblSi.setBounds(596, 417, 25, 15);
    contentPane.add(lblSi);
  
    JButton boton1=new JButton("");
    boton1.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton-si-no.png")));
    boton1.setBorderPainted(false);
    boton1.setContentAreaFilled(false);
    contentPane.add(boton1);
    
    boton1.setBounds(585,400,50, 50);
    JButton boton2=new JButton("");
    boton2.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton-si-no.png")));
    boton2.setBorderPainted(false);
    boton2.setContentAreaFilled(false);
    contentPane.add(boton2);
    boton2.setBounds(662,400 ,50,50);
    boton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
      ventanaPrincipal();
        dispose();
      }
    });
    JLabel lblTextoDeDato = new JLabel("");
    lblTextoDeDato.setBounds(173, 242, 246, 89);
    contentPane.add(lblTextoDeDato);
    lblTextoDeDato.setVisible(false);
    
    JLabel lblDato = new JLabel("");
    lblDato.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/datos.png")));
    lblDato.setBounds(149, 108, 514, 379);
    contentPane.add(lblDato);
    lblDato.setVisible(false);
    
    JLabel preguntasNutria = new JLabel("¿Estas listo para empezar?");
    preguntasNutria.setForeground(UIManager.getColor("CheckBox.foreground"));
    preguntasNutria.setHorizontalAlignment(SwingConstants.CENTER);
    preguntasNutria.setFont(new Font("URW Bookman", preguntasNutria.getFont().getStyle() | Font.BOLD, preguntasNutria.getFont().getSize() + 6));
    preguntasNutria.setBounds(475, 242, 374, 208);
    contentPane.add(preguntasNutria);
    
    JLabel respuestaTrue = new JLabel("Verdadero");
    respuestaTrue.setHorizontalAlignment(SwingConstants.CENTER);
    respuestaTrue.setFont(new Font("Courier 10 Pitch", Font.BOLD, 16));
    respuestaTrue.setBounds(517, 407, 135, 32);
    contentPane.add(respuestaTrue);
    respuestaTrue.setVisible(false);
    
    
    JLabel respuestaFalse = new JLabel("Falso");
    respuestaFalse.setHorizontalAlignment(SwingConstants.CENTER);
    respuestaFalse.setFont(new Font("Courier 10 Pitch", Font.BOLD, 18));
    respuestaFalse.setBounds(653, 407, 135, 32);
    contentPane.add(respuestaFalse);
    respuestaFalse.setVisible(false);
    
    contentPane.add(verdadero);
    contentPane.add(falso);
    contentPane.add(nutria);
    verdadero.setBounds(517, 400, 133, 50);
    falso.setBounds(652, 400, 133, 50);
    verdadero.setBorderPainted(false);
    verdadero.setContentAreaFilled(false);
    falso.setBorderPainted(false);
    falso.setContentAreaFilled(false);
    
   verdadero.setVisible(false);
   falso.setVisible(false);
    

    JLabel fondo = new JLabel("");
    fondo.setIcon(new ImageIcon(Principal.class.getResource("/juego/imgs/fondo-del-todo.png")));
    fondo.setBounds(0, -40, 1368, 841);
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
        lblDato.setVisible(true);
        lblTextoDeDato.setVisible(false);
        siguientePregunta.setVisible(false);
        contadorPregunta.setVisible(true);
        puntosSistema.setVisible(true);
        
        contadorPregunta.setText("<html>Estas en la pregunta "+Integer.toString(getNumeroDePregunta())+"/6 Respondiste "+preguntaContadorBien+" Bien y "+preguntaContadorMal+" mal</html>");
        puntosSistema.setText("Tienes "+puntos+" puntos");
        setNumeroDePregunta(1);  
        if(preguntaContador>=7) {
          preguntaContador=6;
        }
       
       
        
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
          preguntasNutria.setText("Conseguiste "+puntos+" puntos");
          verdadero.setVisible(false);
          falso.setVisible(false);
          respuestaTrue.setVisible(false);
          respuestaFalse.setVisible(false);
          reiniciar.setVisible(true);
          lblInicio.setVisible(true);
          reiniciar.setIcon(new ImageIcon(Juego.class.getResource("/juego/imgs/boton.png")));
          reiniciar.setBounds(582, 390, 145, 60);
        }
      }
    }); 
    verdadero.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        contadorPregunta.setVisible(false);
        puntosSistema.setVisible(false);
       if(contador==0) {
         preguntasNutria.setText("Correcto, sumas un punto");
         puntos=puntos+1;
         nutriaCerrada.setVisible(false);
         nutriaAbierta.setVisible(true);
         lblDato.setVisible(true);
         lblTextoDeDato.setVisible(true);
         lblTextoDeDato.setText("<html>Dejar la canilla abierta 1 minuto puede llegar a consumir 10 litros de agua.</html>");
         preguntaContadorBien=preguntaContadorBien+1;
       }
       else if(contador==1) {
         preguntasNutria.setText("Error, te equivocaste");
         puntos=puntos-1;
         nutriaCerrada.setVisible(true);
         nutriaAbierta.setVisible(false);
         lblDato.setVisible(true);
         lblTextoDeDato.setVisible(true);
         lblTextoDeDato.setText("<html>Aunque pueda parecer que si, se dice que el agua potable en 2050 va a ser muy escasa</html>");
         preguntaContadorMal=preguntaContadorMal+1;
       }
       
       else if(contador==2) {
         preguntasNutria.setText("¡Ups!, le erraste");
         puntos=puntos-1;
         nutriaCerrada.setVisible(true);
         nutriaAbierta.setVisible(false);
         lblDato.setVisible(true);
         lblTextoDeDato.setVisible(true);
         lblTextoDeDato.setText("<html>Lo correcto es tomar un baño de entre 5 y 15 minutos.</html>");
         preguntaContadorMal=preguntaContadorMal+1;
       }
       else if(contador==3) {
         preguntasNutria.setText("Si, es verdad");
         puntos=puntos+1;
         nutriaCerrada.setVisible(false);
         nutriaAbierta.setVisible(true);
         lblDato.setVisible(true);
         lblTextoDeDato.setVisible(true);
         lblTextoDeDato.setText("<html>Todo el mundo sabe que los seres vivos necesitamos del agua para sobrevivir.</html>");
         preguntaContadorBien=preguntaContadorBien+1;
       }
       else if(contador==4) {
         preguntasNutria.setText("Tienes toda la razón");
         puntos=puntos+1;
         nutriaCerrada.setVisible(false);
         nutriaAbierta.setVisible(true);
         lblDato.setVisible(true);
         lblTextoDeDato.setVisible(true);
         lblTextoDeDato.setText("<html>Aproximadamente 13 millones de toneladas de plastico se va al oceano cada año.</html>");
         preguntaContadorBien=preguntaContadorBien+1;
       }
       else if(contador==5) {
         preguntasNutria.setText("Error, es falso");
         puntos=puntos-1;
         nutriaCerrada.setVisible(true);
         nutriaAbierta.setVisible(false);
         lblDato.setVisible(true);
         lblTextoDeDato.setVisible(true);
         lblTextoDeDato.setText("<html>Una sequia es una anomalia climatologica y los humanos no podemos controlar la naturaleza.</html>");
         siguientePregunta.setText("Ver puntaje");
         siguientePregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
         preguntaContadorMal=preguntaContadorMal+1;
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
       
        contadorPregunta.setVisible(false);
        puntosSistema.setVisible(false);
        if(contador==0) {
          preguntasNutria.setText("Error, es verdadero");
          puntos=puntos-1;
          nutriaCerrada.setVisible(true);
          nutriaAbierta.setVisible(false);
          lblDato.setVisible(true);
          lblTextoDeDato.setVisible(true);
          lblTextoDeDato.setText("<html>Dejar la canilla abierta 1 minuto puede llegar a consumir 10 litros de agua.</html>");
          preguntaContadorMal=preguntaContadorMal+1;
        }
        else if(contador==1) {
          preguntasNutria.setText("Le embocaste crack");
          puntos=puntos+1;
          nutriaCerrada.setVisible(false);
          nutriaAbierta.setVisible(true);
          lblDato.setVisible(true);
          lblTextoDeDato.setVisible(true);
          lblTextoDeDato.setText("<html>Aunque pueda parecer que si, se dice que el agua potable en 2050 va a ser muy escasa</html>");
          preguntaContadorBien=preguntaContadorBien+1;
        }
        else if(contador==2) {
          preguntasNutria.setText("Exactooo, sumas un punto");
          puntos=puntos+1;
          nutriaCerrada.setVisible(false);
          nutriaAbierta.setVisible(true);
          lblDato.setVisible(true);
          lblTextoDeDato.setVisible(true);
          lblTextoDeDato.setText("<html>Lo correcto es tomar un baño de entre 5 y 15 minutos.</html>");
          preguntaContadorBien=preguntaContadorBien+1;
        }
        else if(contador==3) {
          preguntasNutria.setText("Le erraste, es verdadero");
          puntos=puntos-1;
          nutriaCerrada.setVisible(true);
          nutriaAbierta.setVisible(false);
          lblDato.setVisible(true);
          lblTextoDeDato.setVisible(true);
          lblTextoDeDato.setText("<html>Todo el mundo sabe que los seres vivos necesitamos del agua para sobrevivir.</html>");
          preguntaContadorMal=preguntaContadorMal+1;
        }
        else if(contador==4) {
          preguntasNutria.setText("Te equivocaste, -1 punto");
          puntos=puntos-1;
          nutriaCerrada.setVisible(true);
          nutriaAbierta.setVisible(false);
          lblDato.setVisible(true);
          lblTextoDeDato.setVisible(true);
          lblTextoDeDato.setText("<html>Aproximadamente 13 millones de toneladas de plastico se va al oceano cada año.</html>");
          preguntaContadorMal=preguntaContadorMal+1;
        }
        else if(contador==5) {
          preguntasNutria.setText("Bieen, sumas un punto");
          puntos=puntos+1;
          nutriaCerrada.setVisible(false);
          nutriaAbierta.setVisible(true);
          lblDato.setVisible(true);
          lblTextoDeDato.setVisible(true);
          lblTextoDeDato.setText("<html>Una sequia es una anomalia climatologica y los humanos no podemos controlar la naturaleza.</html>");
          siguientePregunta.setText("ver puntaje");
          siguientePregunta.setFont(new Font("Courier 10 Pitch", Font.BOLD, 17));
          preguntaContadorBien=preguntaContadorBien+1;
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
    ventanaPrincipal.setVisible(rootPaneCheckingEnabled);
  }
  public int getNumeroDePregunta() {
    return preguntaContador;
  }
  public void setNumeroDePregunta(int a) {
    preguntaContador=preguntaContador+a;
  }
 /* public void fullscreen() {
    super.dispose();
    super.setExtendedState(JFrame.MAXIMIZED_BOTH);
    super.setUndecorated(!super.isUndecorated());
    super.setVisible(rootPaneCheckingEnabled);
  }
*/
  
}