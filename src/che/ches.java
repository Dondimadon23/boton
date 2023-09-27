package che;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ches {

	private JFrame frmRgb;
	private JLabel lblColor;
	private JCheckBox boxAzul;
	private JCheckBox boxRojo;
	private JCheckBox boxVerde;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ches window = new ches();
					window.frmRgb.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ches() {
		initialize();
	}
public void asiColor() {
	int r=(boxRojo.isSelected())?255:0;

	int g=(boxVerde.isSelected())?255:0;

	int b=(boxAzul.isSelected())?255:0;

	lblColor.setBackground(new Color(r,g,b));
}
	
	
	private void initialize() {
		frmRgb = new JFrame();
		frmRgb.getContentPane().setBackground(Color.GREEN);
		frmRgb.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\6.png"));
		frmRgb.setTitle("RGB");
		frmRgb.setBounds(100, 100, 450, 300);
		frmRgb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRgb.getContentPane().setLayout(null);
		
		boxVerde = new JCheckBox("verde");
		boxVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asiColor();
			}
		});
		boxVerde.setFont(new Font("Tahoma", Font.PLAIN, 14));
		boxVerde.setForeground(Color.GREEN);
		boxVerde.setBackground(Color.BLACK);
		boxVerde.setBounds(6, 17, 97, 23);
		frmRgb.getContentPane().add(boxVerde);
		
		boxRojo = new JCheckBox("rojo");
		boxRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asiColor();
			}
		});
		boxRojo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		boxRojo.setForeground(Color.RED);
		boxRojo.setBackground(Color.BLACK);
		boxRojo.setBounds(6, 54, 97, 23);
		frmRgb.getContentPane().add(boxRojo);
		
		boxAzul = new JCheckBox("azul");
		boxAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				asiColor();
			}
		});
		boxAzul.setFont(new Font("Tahoma", Font.PLAIN, 14));
		boxAzul.setForeground(Color.BLUE);
		boxAzul.setBackground(Color.BLACK);
		boxAzul.setBounds(6, 94, 97, 23);
		frmRgb.getContentPane().add(boxAzul);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBorder(new LineBorder(new Color(0, 0, 0), 5, true));
		lblColor.setBounds(171, 21, 181, 145);
		frmRgb.getContentPane().add(lblColor);
	}
}
