package btnradio;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;

public class boton {

	private JFrame frmBotonRadio;
	private JLabel lblColor;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					boton window = new boton();
					window.frmBotonRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public boton() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonRadio = new JFrame();
		frmBotonRadio.setBackground(new Color(0, 128, 128));
		frmBotonRadio.getContentPane().setForeground(new Color(199, 21, 133));
		frmBotonRadio.setTitle("Boton Radio");
		frmBotonRadio.setIconImage(Toolkit.getDefaultToolkit().getImage(boton.class.getResource("/btnradio/waos.jpg")));
		frmBotonRadio.setBounds(100, 100, 451, 317);
		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.setLocationRelativeTo(null);
		frmBotonRadio.getContentPane().setLayout(null);
		
		JRadioButton radRojo = new JRadioButton("Rojo");
		radRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);
			}
		});
		radRojo.setBounds(6, 230, 109, 41);
		frmBotonRadio.getContentPane().add(radRojo);
		
		JRadioButton radVerde = new JRadioButton("Verde");
		radVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.green);
			}
		});
		radVerde.setBounds(6, 16, 109, 23);
		frmBotonRadio.getContentPane().add(radVerde);
		
		JRadioButton radAzul = new JRadioButton("Azul");
		radAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.blue);
			}
		});
		radAzul.setBounds(6, 51, 67, 23);
		frmBotonRadio.getContentPane().add(radAzul);
		
		
		
		JRadioButton radGris = new JRadioButton("Gris");
		radGris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.gray);
				
			}
		});
		radGris.setBounds(6, 208, 109, 23);
		frmBotonRadio.getContentPane().add(radGris);
		
		JRadioButton radMagenta = new JRadioButton("Magenta");
		radMagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.magenta);
			}
		});
		radMagenta.setBounds(6, 147, 109, 23);
		frmBotonRadio.getContentPane().add(radMagenta);
		
		JRadioButton radCyan = new JRadioButton("Cyan");
		radCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.cyan);
			}
		});
		radCyan.setBounds(6, 77, 109, 23);
		frmBotonRadio.getContentPane().add(radCyan);
		
		JRadioButton radRosa = new JRadioButton("rosa");
		radRosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.pink);
				
			}
		});
		radRosa.setBounds(6, 115, 67, 23);
		frmBotonRadio.getContentPane().add(radRosa);
		
		JRadioButton radNegro = new JRadioButton("Negro");
		radNegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.black);
			}
		});
		radNegro.setBounds(6, 182, 109, 23);
		frmBotonRadio.getContentPane().add(radNegro);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblColor.setBounds(163, 58, 172, 112);
		frmBotonRadio.getContentPane().add(lblColor);
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(radRojo);
		grupo.add(radVerde);
		grupo.add(radAzul);
		grupo.add(radCyan);
		grupo.add(radNegro);
		grupo.add(radRosa);
		grupo.add(radMagenta);
		grupo.add(radGris);
	}
}
