package BotonRadio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.border.LineBorder;

public class BotonRadio {

	private JFrame frmBotonradio;
	private JRadioButton radRojo;
	private JRadioButton radVerde;
	private JRadioButton radAzul;
	private JLabel lblColor;
	private JRadioButton radAzulCieo;
	private JRadioButton radNegro;
	private JRadioButton radNaranja;
	private JRadioButton radMorado;
	private JRadioButton radRosa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BotonRadio window = new BotonRadio();
					window.frmBotonradio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BotonRadio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonradio = new JFrame();
		frmBotonradio.setTitle("BOTONRADIO");
		frmBotonradio.setBounds(100, 100, 673, 329);
		frmBotonradio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonradio.setLocationRelativeTo(null);
		frmBotonradio.getContentPane().setLayout(null);
		
		frmBotonradio.getContentPane().setLayout(null);
		
		radRojo = new JRadioButton("Rojo");
		radRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);
			}
		});
		radRojo.setFont(new Font("Tahoma", Font.BOLD, 13));
		radRojo.setBounds(26, 25, 109, 23);
		frmBotonradio.getContentPane().add(radRojo);
		
		radVerde = new JRadioButton("Verde");
		radVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.green);
			}
		});
		radVerde.setFont(new Font("Tahoma", Font.BOLD, 13));
		radVerde.setBounds(26, 48, 109, 23);
		frmBotonradio.getContentPane().add(radVerde);
		
		radAzul = new JRadioButton("Azul");
		radAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.blue);
			}
		});
		radAzul.setFont(new Font("Tahoma", Font.BOLD, 13));
		radAzul.setBounds(26, 82, 109, 23);
		frmBotonradio.getContentPane().add(radAzul);
		
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		lblColor.setBounds(313, 25, 291, 235);
		frmBotonradio.getContentPane().add(lblColor);
		
		Panel panel = new Panel();
		panel.setBounds(401, 144, 10, 10);
		frmBotonradio.getContentPane().add(panel);
		
		radAzulCieo = new JRadioButton("Azul Cielo");
		radAzulCieo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(27,138,248));
			}
		});
		radAzulCieo.setFont(new Font("Tahoma", Font.BOLD, 13));
		radAzulCieo.setBounds(26, 105, 109, 23);
		frmBotonradio.getContentPane().add(radAzulCieo);
		
		radRosa = new JRadioButton("Rosa");
		radRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.pink);
			}
		});
		radRosa.setFont(new Font("Tahoma", Font.BOLD, 13));
		radRosa.setBounds(26, 131, 109, 23);
		frmBotonradio.getContentPane().add(radRosa);
		
		radMorado = new JRadioButton("Morado");
		radMorado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(101,7,166));
			}
		});
		radMorado.setFont(new Font("Tahoma", Font.BOLD, 13));
		radMorado.setBounds(26, 157, 109, 23);
		frmBotonradio.getContentPane().add(radMorado);
		
		radNaranja = new JRadioButton("Naranja");
		radNaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(245,106,10));
				
			}
		});
		radNaranja.setFont(new Font("Tahoma", Font.BOLD, 13));
		radNaranja.setBounds(26, 190, 109, 23);
		frmBotonradio.getContentPane().add(radNaranja);
		
		radNegro = new JRadioButton("Negro");
		radNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(new Color(2,2,2));
			}
		});
		radNegro.setFont(new Font("Tahoma", Font.BOLD, 13));
		radNegro.setBounds(26, 215, 109, 23);
		frmBotonradio.getContentPane().add(radNegro);
		
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radAzul);
		grupo.add(radVerde);
		grupo.add(radRojo);
		grupo.add(radAzulCieo);
		grupo.add(radRosa);
		grupo.add(radMorado);
		grupo.add(radNaranja);
		grupo.add(radNegro);
	}
}
