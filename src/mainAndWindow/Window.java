package mainAndWindow;

import java.awt.EventQueue;
import clasesCriatura.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Window {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1350, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.WEST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{151, 163, 179, 175, 163, 158, 0};
		gbl_panel.rowHeights = new int[]{24, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JPanel panel_7 = new JPanel();
		GridBagConstraints gbc_panel_7 = new GridBagConstraints();
		gbc_panel_7.insets = new Insets(0, 0, 5, 5);
		gbc_panel_7.fill = GridBagConstraints.BOTH;
		gbc_panel_7.gridx = 0;
		gbc_panel_7.gridy = 0;
		panel.add(panel_7, gbc_panel_7);
		
		
		//IMPORTANTE
		//Estadisticas de prueba hasta que se implementen los personajes en los ficheros de texto
		Stat pruebaStr = new Stat();
		pruebaStr.setScore(17);
		Stat pruebaDex = new Stat();
		pruebaDex.setScore(7);
		Stat pruebaCon = new Stat();
		pruebaCon.setScore(10);
		Stat pruebaInt = new Stat();
		pruebaInt.setScore(18);
		Stat pruebaWis = new Stat();
		pruebaWis.setScore(8);
		Stat pruebaCar = new Stat();
		pruebaCar.setScore(13);
		
		
		JLabel lFuerzaScore = new JLabel(pruebaStr.scoreToString());
		panel_7.add(lFuerzaScore);
		
		JLabel lFuerzaMod = new JLabel(pruebaStr.modToString());
		panel_7.add(lFuerzaMod);
		
		JLabel lFuerza = new JLabel("Fuerza");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel.add(lFuerza, gbc_lblNewLabel);
		
		JPanel panel_13 = new JPanel();
		GridBagConstraints gbc_panel_13 = new GridBagConstraints();
		gbc_panel_13.insets = new Insets(0, 0, 5, 5);
		gbc_panel_13.fill = GridBagConstraints.BOTH;
		gbc_panel_13.gridx = 0;
		gbc_panel_13.gridy = 2;
		panel.add(panel_13, gbc_panel_13);
		
		JButton btnNewButton = new JButton("+");
		
		//Si el score es 20 no se podra sumar mas
		if (pruebaStr.getScore()<21) {
			btnNewButton.addActionListener(new ActionListener() {		
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
		}
		panel_13.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		panel_13.add(btnNewButton_1);
		
		JPanel panel_8 = new JPanel();
		GridBagConstraints gbc_panel_8 = new GridBagConstraints();
		gbc_panel_8.insets = new Insets(0, 0, 5, 5);
		gbc_panel_8.fill = GridBagConstraints.BOTH;
		gbc_panel_8.gridx = 0;
		gbc_panel_8.gridy = 3;
		panel.add(panel_8, gbc_panel_8);
		
		JLabel lblNewLabel_7 = new JLabel(pruebaDex.scoreToString());
		panel_8.add(lblNewLabel_7);
		
		JLabel lblNewLabel_13 = new JLabel(pruebaDex.modToString());
		panel_8.add(lblNewLabel_13);
		
		JLabel lblNewLabel_1 = new JLabel("Destreza");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 4;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JPanel panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_1.insets = new Insets(0, 0, 5, 5);
		gbc_panel_1.gridx = 1;
		gbc_panel_1.gridy = 5;
		panel.add(panel_1, gbc_panel_1);
		
		JPanel panel_14 = new JPanel();
		GridBagConstraints gbc_panel_14 = new GridBagConstraints();
		gbc_panel_14.insets = new Insets(0, 0, 5, 5);
		gbc_panel_14.fill = GridBagConstraints.BOTH;
		gbc_panel_14.gridx = 0;
		gbc_panel_14.gridy = 6;
		panel.add(panel_14, gbc_panel_14);
		
		JButton btnNewButton_2 = new JButton("+");
		panel_14.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("-");
		panel_14.add(btnNewButton_3);
		
		JPanel panel_9 = new JPanel();
		GridBagConstraints gbc_panel_9 = new GridBagConstraints();
		gbc_panel_9.insets = new Insets(0, 0, 5, 5);
		gbc_panel_9.fill = GridBagConstraints.BOTH;
		gbc_panel_9.gridx = 0;
		gbc_panel_9.gridy = 7;
		panel.add(panel_9, gbc_panel_9);
		
		JLabel lblNewLabel_14 = new JLabel(pruebaCon.scoreToString());
		panel_9.add(lblNewLabel_14);
		
		JLabel lblNewLabel_8 = new JLabel(pruebaCon.modToString());
		panel_9.add(lblNewLabel_8);
		
		JLabel lblNewLabel_4 = new JLabel("Constitucion");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 8;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_2.insets = new Insets(0, 0, 5, 5);
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 9;
		panel.add(panel_2, gbc_panel_2);
		
		JPanel panel_15 = new JPanel();
		GridBagConstraints gbc_panel_15 = new GridBagConstraints();
		gbc_panel_15.insets = new Insets(0, 0, 5, 5);
		gbc_panel_15.fill = GridBagConstraints.BOTH;
		gbc_panel_15.gridx = 0;
		gbc_panel_15.gridy = 10;
		panel.add(panel_15, gbc_panel_15);
		
		JButton btnNewButton_4 = new JButton("+");
		panel_15.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("-");
		panel_15.add(btnNewButton_5);
		
		JPanel panel_10 = new JPanel();
		GridBagConstraints gbc_panel_10 = new GridBagConstraints();
		gbc_panel_10.insets = new Insets(0, 0, 5, 5);
		gbc_panel_10.fill = GridBagConstraints.BOTH;
		gbc_panel_10.gridx = 0;
		gbc_panel_10.gridy = 11;
		panel.add(panel_10, gbc_panel_10);
		
		JLabel lblNewLabel_9 = new JLabel(pruebaInt.scoreToString());
		panel_10.add(lblNewLabel_9);
		
		JLabel lblNewLabel_15 = new JLabel(pruebaInt.modToString());
		panel_10.add(lblNewLabel_15);
		
		JLabel lblNewLabel_5 = new JLabel("Inteligencia");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 12;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_3.insets = new Insets(0, 0, 5, 5);
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 13;
		panel.add(panel_3, gbc_panel_3);
		
		JPanel panel_16 = new JPanel();
		GridBagConstraints gbc_panel_16 = new GridBagConstraints();
		gbc_panel_16.insets = new Insets(0, 0, 5, 5);
		gbc_panel_16.fill = GridBagConstraints.BOTH;
		gbc_panel_16.gridx = 0;
		gbc_panel_16.gridy = 14;
		panel.add(panel_16, gbc_panel_16);
		
		JButton btnNewButton_6 = new JButton("+");
		panel_16.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("-");
		panel_16.add(btnNewButton_7);
		
		JPanel panel_11 = new JPanel();
		GridBagConstraints gbc_panel_11 = new GridBagConstraints();
		gbc_panel_11.insets = new Insets(0, 0, 5, 5);
		gbc_panel_11.fill = GridBagConstraints.BOTH;
		gbc_panel_11.gridx = 0;
		gbc_panel_11.gridy = 15;
		panel.add(panel_11, gbc_panel_11);
		
		JLabel lblNewLabel_10 = new JLabel(pruebaWis.scoreToString());
		panel_11.add(lblNewLabel_10);
		
		JLabel lblNewLabel_16 = new JLabel(pruebaWis.modToString());
		panel_11.add(lblNewLabel_16);
		
		JLabel lblNewLabel_3 = new JLabel("Sabiduria");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 16;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 17;
		panel.add(panel_4, gbc_panel_4);
		
		JPanel panel_17 = new JPanel();
		GridBagConstraints gbc_panel_17 = new GridBagConstraints();
		gbc_panel_17.insets = new Insets(0, 0, 5, 5);
		gbc_panel_17.fill = GridBagConstraints.BOTH;
		gbc_panel_17.gridx = 0;
		gbc_panel_17.gridy = 18;
		panel.add(panel_17, gbc_panel_17);
		
		JButton btnNewButton_8 = new JButton("+");
		panel_17.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("-");
		panel_17.add(btnNewButton_9);
		
		JPanel panel_12 = new JPanel();
		GridBagConstraints gbc_panel_12 = new GridBagConstraints();
		gbc_panel_12.insets = new Insets(0, 0, 5, 5);
		gbc_panel_12.fill = GridBagConstraints.BOTH;
		gbc_panel_12.gridx = 0;
		gbc_panel_12.gridy = 19;
		panel.add(panel_12, gbc_panel_12);
		
		JLabel lblNewLabel_11 = new JLabel(pruebaCar.scoreToString());
		panel_12.add(lblNewLabel_11);
		
		JLabel label = new JLabel(pruebaCar.modToString());
		panel_12.add(label);
		
		JLabel lCarisma = new JLabel("Carisma");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 20;
		panel.add(lCarisma, gbc_lblNewLabel_2);
		
		JPanel panel_5 = new JPanel();
		GridBagConstraints gbc_panel_5 = new GridBagConstraints();
		gbc_panel_5.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_5.insets = new Insets(0, 0, 5, 5);
		gbc_panel_5.gridx = 0;
		gbc_panel_5.gridy = 21;
		panel.add(panel_5, gbc_panel_5);
		
		JPanel panel_18 = new JPanel();
		GridBagConstraints gbc_panel_18 = new GridBagConstraints();
		gbc_panel_18.insets = new Insets(0, 0, 5, 5);
		gbc_panel_18.fill = GridBagConstraints.BOTH;
		gbc_panel_18.gridx = 0;
		gbc_panel_18.gridy = 22;
		panel.add(panel_18, gbc_panel_18);
		
		JButton btnNewButton_10 = new JButton("+");
		panel_18.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		panel_18.add(btnNewButton_11);
		
		JPanel panel_6 = new JPanel();
		GridBagConstraints gbc_panel_6 = new GridBagConstraints();
		gbc_panel_6.insets = new Insets(0, 0, 0, 5);
		gbc_panel_6.anchor = GridBagConstraints.NORTHWEST;
		gbc_panel_6.gridx = 0;
		gbc_panel_6.gridy = 24;
		panel.add(panel_6, gbc_panel_6);
	}
		
}
