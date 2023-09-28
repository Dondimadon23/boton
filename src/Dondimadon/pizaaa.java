package Dondimadon;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JSlider;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class pizaaa {

	private JFrame frmPizzeriaDondimadon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pizaaa window = new pizaaa();
					window.frmPizzeriaDondimadon.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pizaaa() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPizzeriaDondimadon = new JFrame();
		frmPizzeriaDondimadon.getContentPane().setBackground(Color.BLACK);
		frmPizzeriaDondimadon.getContentPane().setForeground(Color.BLUE);
		frmPizzeriaDondimadon.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\6.png"));
		frmPizzeriaDondimadon.setTitle("Pizzeria Dondimadon");
		frmPizzeriaDondimadon.setBounds(100, 100, 665, 451);
		frmPizzeriaDondimadon.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPizzeriaDondimadon.setLocationRelativeTo(null);
		frmPizzeriaDondimadon.getContentPane().setLayout(null);
		
		JLabel lblDimadon = new JLabel("");
		lblDimadon.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\images.jpg"));
		lblDimadon.setBounds(415, 11, 211, 251);
		frmPizzeriaDondimadon.getContentPane().add(lblDimadon);
		
		JSlider slider = new JSlider();
		slider.setBorder(new LineBorder(Color.YELLOW));
		slider.setForeground(Color.MAGENTA);
		slider.setBackground(Color.GRAY);
		slider.setBounds(6, 38, 277, 26);
		frmPizzeriaDondimadon.getContentPane().add(slider);
		
		JLabel lblNewLabel_2 = new JLabel("Especialidad");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(6, 69, 81, 26);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_2);
		
		JComboBox cmbEspecialidad = new JComboBox();
		cmbEspecialidad.setBackground(Color.WHITE);
		cmbEspecialidad.setForeground(Color.RED);
		cmbEspecialidad.setBounds(6, 89, 277, 22);
		frmPizzeriaDondimadon.getContentPane().add(cmbEspecialidad);
		
		JRadioButton radJr = new JRadioButton("JUMBO         $=150");
		radJr.setForeground(Color.ORANGE);
		radJr.setBackground(Color.LIGHT_GRAY);
		radJr.setBounds(6, 134, 127, 23);
		frmPizzeriaDondimadon.getContentPane().add(radJr);
		
		JRadioButton radDecente = new JRadioButton("FAMILIAR    $=120");
		radDecente.setForeground(Color.YELLOW);
		radDecente.setBackground(Color.LIGHT_GRAY);
		radDecente.setBounds(6, 160, 127, 23);
		frmPizzeriaDondimadon.getContentPane().add(radDecente);
		
		JRadioButton radBatman = new JRadioButton("GRANDE      $=100");
		radBatman.setForeground(Color.GREEN);
		radBatman.setBackground(Color.LIGHT_GRAY);
		radBatman.setBounds(6, 186, 127, 23);
		frmPizzeriaDondimadon.getContentPane().add(radBatman);
		
		JRadioButton radEstandar = new JRadioButton("INDIVIDUAL $=30");
		radEstandar.setForeground(Color.RED);
		radEstandar.setBackground(Color.LIGHT_GRAY);
		radEstandar.setBounds(6, 212, 127, 23);
		frmPizzeriaDondimadon.getContentPane().add(radEstandar);
		
		JLabel lblNewLabel_2_1 = new JLabel("complementos");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setBounds(6, 252, 91, 14);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tamaños");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(6, 113, 81, 14);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_2_1_1);
		
		JCheckBox chkDonas = new JCheckBox("PAPAS A LA FRANCESA $=70");
		chkDonas.setForeground(Color.ORANGE);
		chkDonas.setBackground(Color.LIGHT_GRAY);
		chkDonas.setBounds(6, 272, 177, 23);
		frmPizzeriaDondimadon.getContentPane().add(chkDonas);
		
		JCheckBox chkPapasFrancesas = new JCheckBox("ALITAS                           $=75");
		chkPapasFrancesas.setForeground(Color.YELLOW);
		chkPapasFrancesas.setBackground(Color.LIGHT_GRAY);
		chkPapasFrancesas.setBounds(6, 298, 177, 23);
		frmPizzeriaDondimadon.getContentPane().add(chkPapasFrancesas);
		
		JCheckBox chkPalitosQueso = new JCheckBox("REFRESCO                     $=30");
		chkPalitosQueso.setForeground(Color.GREEN);
		chkPalitosQueso.setBackground(Color.LIGHT_GRAY);
		chkPalitosQueso.setBounds(6, 325, 177, 23);
		frmPizzeriaDondimadon.getContentPane().add(chkPalitosQueso);
		
		JCheckBox chkPaluitosCebolla = new JCheckBox("CERVEZA                        $=50");
		chkPaluitosCebolla.setForeground(Color.RED);
		chkPaluitosCebolla.setBackground(Color.LIGHT_GRAY);
		chkPaluitosCebolla.setBounds(6, 351, 177, 23);
		frmPizzeriaDondimadon.getContentPane().add(chkPaluitosCebolla);
		
		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(209, 134, 147, 33);
		frmPizzeriaDondimadon.getContentPane().add(btnBorrar);
		
		JLabel lblNewLabel_3 = new JLabel("resumen de orden");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setBounds(219, 172, 216, 23);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setBorder(new LineBorder(Color.WHITE, 2, true));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setBackground(Color.MAGENTA);
		lblNewLabel_4.setBounds(189, 196, 198, 178);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_2_2 = new JLabel("Cantidad");
		lblNewLabel_2_2.setForeground(Color.WHITE);
		lblNewLabel_2_2.setBounds(6, 11, 81, 26);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_5 = new JLabel("total a pagar\r\n\r\n\r\n\r\n$");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_5.setForeground(Color.WHITE);
		lblNewLabel_5.setBounds(415, 273, 211, 26);
		frmPizzeriaDondimadon.getContentPane().add(lblNewLabel_5);
		
		JLabel lblPrecio = new JLabel("$ 0.00");
		lblPrecio.setBorder(new LineBorder(Color.GREEN, 4));
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPrecio.setForeground(Color.GREEN);
		lblPrecio.setBounds(415, 310, 211, 57);
		frmPizzeriaDondimadon.getContentPane().add(lblPrecio);
		
		JLabel lblCon = new JLabel("");
		lblCon.setForeground(Color.WHITE);
		lblCon.setBorder(new LineBorder(new Color(153, 51, 255), 3));
		lblCon.setBounds(291, 38, 39, 26);
		frmPizzeriaDondimadon.getContentPane().add(lblCon);
	}
}
