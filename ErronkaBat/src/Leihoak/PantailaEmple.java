package Leihoak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Kontroladorea.Kontroladorea;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PantailaEmple extends JFrame {

	private JPanel contentPane;
	private JLabel lblKudeaketa;
	private JLabel lblEmplegatu; 
	private Kontroladorea kontrol;
	private JButton buttonAtzera;
	private JButton buttonNabegasioa;
	private JButton btnKargatuEmple;
	private JLabel label;
	private JComboBox comboBox;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantailaEmple frame = new PantailaEmple();
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
	public PantailaEmple() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblKudeaketa = new JLabel("Kudeaketa");
		lblKudeaketa.setFont(new Font("Source Sans Pro", Font.BOLD, 30));
		lblKudeaketa.setBounds(96, 42, 157, 26);
		contentPane.add(lblKudeaketa);
		
		lblEmplegatu = new JLabel("Emplegatu");
		lblEmplegatu.setFont(new Font("Source Sans Pro Black", Font.BOLD, 40));
		lblEmplegatu.setBounds(96, 0, 287, 43);
		contentPane.add(lblEmplegatu);
		
		buttonAtzera = new JButton("Atzera");
		buttonAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kontrol.bistaratuMenua();
			}
		});
		buttonAtzera.setFont(new Font("Source Sans Pro Black", Font.BOLD, 11));
		buttonAtzera.setBounds(10, 227, 75, 23);
		contentPane.add(buttonAtzera);
		
		buttonNabegasioa = new JButton("Nabegasioa");
		buttonNabegasioa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kontrol.bistaratuKudeatuEmplePantaila();
			}
		});
		buttonNabegasioa.setBounds(135, 166, 133, 23);
		contentPane.add(buttonNabegasioa);
		
		btnKargatuEmple = new JButton("Kargatu Emple.");
		btnKargatuEmple.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == "CSV") {
					kontrol.kargatuEmplegatuCSV();
				}
				else if (comboBox.getSelectedItem() == "XML"){
					kontrol.kargatuEmplegatuXML();
				}
				else if (comboBox.getSelectedItem() == "JSON"){
					JOptionPane.showMessageDialog(null, "Oier, eres lo mas bello del planeta!");
				}
			}
		});
		btnKargatuEmple.setBounds(135, 99, 133, 23);
		contentPane.add(btnKargatuEmple);
		
		label = new JLabel("Formatua:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 10));
		label.setBounds(278, 101, 51, 18);
		contentPane.add(label);
		
		comboBox = new JComboBox();
		comboBox.setBounds(339, 100, 58, 20);
		comboBox.addItem("CSV");
		comboBox.addItem("XML");
		comboBox.addItem("JSON");
		contentPane.add(comboBox);
	}

	
	public void setcoordinador(Kontroladorea kon) {
		this.kontrol = kon;
	}
	
}
