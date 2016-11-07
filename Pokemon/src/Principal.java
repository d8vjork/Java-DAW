// General imports
import javax.swing.*;
import java.awt.*;

// Specific application imports
import java.util.concurrent.ThreadLocalRandom;

class Pokemon {
    int vida;
    int ataque;
}

public class Principal extends javax.swing.JFrame {

	Pokemon Pikachu;
    Pokemon Jigglypuff;

	public Principal() {

		initComponents();
	
		Pikachu = new Pokemon();
        Jigglypuff = new Pokemon();

	}

	private void initComponents() {

		botonLuchar = new JButton();
		pikachuPic = new JLabel();
		jigglypuffPic = new JLabel();
		jLabel3 = new JLabel();
		vidaPikachu = new JProgressBar();
		vidaJigglypuff = new JProgressBar();
		jigglypuffWin = new JLabel();
		pikachuWin = new JLabel();
		jLabel4 = new JLabel();
		jLabel5 = new JLabel();
		ataquePikachu = new JLabel();
		ataqueJigglypuff = new JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
		// Default window decoration
		setDefaultLookAndFeelDecorated(true);

		// Window settings
		setIconImage( Toolkit.getDefaultToolkit().getImage( getClass().getResource("Imagenes/window_icon.png") ) );
		setTitle("Pokemon Simple Project");

		// Not a simple pre-defined cursor image object
		//setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        Cursor c = Toolkit.getDefaultToolkit().createCustomCursor(
            new ImageIcon("Imagenes/cursor.png").getImage(), 
            new Point(0, 0), 
            "custom cursor"
        );
		setCursor(
            Toolkit.getDefaultToolkit().createCustomCursor(
                Toolkit.getDefaultToolkit().getImage( getClass().getResource("Imagenes/cursor.png") ), 
                new Point( getX(), getY() ), 
                "img"
            )
        );

		setForeground(java.awt.Color.white);
		addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

		botonLuchar.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        botonLuchar.setText("L U C H A R");
        //botonLuchar.setBorder(null);
		botonLuchar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonLucharMouseClicked(evt);
            }
        });

		pikachuPic.setIcon(new ImageIcon(getClass().getResource("Imagenes/pikachu.png"))); // NOI18N
        pikachuPic.setToolTipText("");

        jigglypuffPic.setIcon(new ImageIcon(getClass().getResource("Imagenes/jigglypuff.png"))); // NOI18N
        jigglypuffPic.setToolTipText("");

        jLabel3.setIcon(new ImageIcon(getClass().getResource("Imagenes/versus.png"))); // NOI18N
        jLabel3.setToolTipText("");

        vidaPikachu.setForeground(new Color(0, 153, 51));
        vidaPikachu.setToolTipText("");
        vidaPikachu.setValue(100);
        vidaPikachu.setBorderPainted(false);

        vidaJigglypuff.setForeground(new Color(0, 153, 51));
        vidaJigglypuff.setValue(100);
        vidaJigglypuff.setBorderPainted(false);

        jigglypuffWin.setIcon(new ImageIcon(getClass().getResource("Imagenes/trophy-icon.png"))); // NOI18N

        pikachuWin.setIcon(new ImageIcon(getClass().getResource("Imagenes/trophy-icon.png"))); // NOI18N

        jLabel4.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Pikachu");

        jLabel5.setFont(new Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Jigglypuff");

        ataquePikachu.setText("jLabel1");

        ataqueJigglypuff.setText("jLabel1");

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonLuchar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pikachuPic, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(pikachuWin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vidaPikachu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(99, 99, 99))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ataquePikachu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ataqueJigglypuff)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jigglypuffPic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(12, 12, 12)
                            .addComponent(jigglypuffWin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel5))
                        .addComponent(vidaJigglypuff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jigglypuffPic, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pikachuPic)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jigglypuffWin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pikachuWin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(vidaPikachu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vidaJigglypuff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ataquePikachu)
                    .addComponent(ataqueJigglypuff))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(botonLuchar, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

		pack();

	}

	private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jigglypuffWin.setVisible(false);
        pikachuWin.setVisible(false);
        ataqueJigglypuff.setText("Ataque: 1-45");
        ataquePikachu.setText("Ataque: 1-55");
    }

	private void botonLucharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonLucharMouseClicked
        int turno;
        
        vidaPikachu.setToolTipText(100 + " HP");
        vidaJigglypuff.setToolTipText(100 + " HP");
        
        if (botonLuchar.getText().equals("RESET") == true) {
            pikachuWin.setVisible(false);
            jigglypuffWin.setVisible(false);
            vidaPikachu.setValue(100);
            vidaJigglypuff.setValue(100);
            vidaPikachu.setToolTipText(100 + " HP");
            vidaJigglypuff.setToolTipText(100 + " HP");
            //jigglypuffPic.setBackground(Color.WHITE);
            //pikachuPic.setBackground(Color.WHITE);
            botonLuchar.setText("LUCHAR");
            turno = ThreadLocalRandom.current().nextInt(1, 2 + 1);
            
        } else {
            turno = ThreadLocalRandom.current().nextInt(1, 2 + 1);
            Pikachu.ataque = ThreadLocalRandom.current().nextInt(1, 55 + 1);
            Jigglypuff.ataque = ThreadLocalRandom.current().nextInt(1, 40 + 1);
            Jigglypuff.vida = 100;
            Pikachu.vida = 100;

            while (Pikachu.vida > 0 && Jigglypuff.vida > 0) {
                if (turno == 1) {
                    Jigglypuff.vida = Jigglypuff.vida - Pikachu.ataque;
                    vidaJigglypuff.setValue(Jigglypuff.vida);
                    vidaJigglypuff.setToolTipText(Jigglypuff.vida + " HP");
                    turno = 2;
                } else {
                    Pikachu.vida = Pikachu.vida - Jigglypuff.ataque;
                    vidaPikachu.setValue(Pikachu.vida);
                    vidaPikachu.setToolTipText(Pikachu.vida + " HP");
                    turno = 1;
                }
            }

            if (Pikachu.vida > 0) {
                pikachuWin.setVisible(true);
                jigglypuffPic.setBackground(Color.red);
				System.out.println("Log de partida: Pikachu gana con " + Pikachu.vida + " HP.");
            } else {
                jigglypuffWin.setVisible(true);
                pikachuPic.setBackground(Color.red);
				System.out.println("Log de partida: Jigglypuff gana con " + Jigglypuff.vida + " HP.");
            }

            botonLuchar.setText("RESET");

        }
    }

	public static void main( String[] args ) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Principal().setVisible(true);
			}
		});
		
	}

	// Variables declaration
	private JLabel ataqueJigglypuff;
	private JLabel ataquePikachu;
	private JButton botonLuchar;
	private JLabel jLabel3;
	private JLabel jLabel4;
	private JLabel jLabel5;
	private JLabel jigglypuffPic;
	private JLabel jigglypuffWin;
	private JLabel pikachuPic;
	private JLabel pikachuWin;
	private JProgressBar vidaJigglypuff;
	private JProgressBar vidaPikachu;

}