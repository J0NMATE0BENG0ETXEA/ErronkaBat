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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class PantailaDepart extends JFrame {

	private JPanel contentPane;
	private JLabel lblDepartamentu;
	private JLabel lblKudeaketa;
	private JButton btnNabegasioa;
	private JButton btnKargatuDept;
	private JButton btnAtzera;
	private JComboBox comboBox;
	private JLabel lblFormatua;
	private Kontroladorea kontrol;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PantailaDepart frame = new PantailaDepart();
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
	public PantailaDepart() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblDepartamentu = new JLabel("Departamentu");
		lblDepartamentu.setFont(new Font("Source Sans Pro Black", Font.BOLD, 40));
		lblDepartamentu.setBounds(85, 0, 287, 43);
		contentPane.add(lblDepartamentu);
		
		lblKudeaketa = new JLabel("Kudeaketa");
		lblKudeaketa.setFont(new Font("Source Sans Pro", Font.BOLD, 30));
		lblKudeaketa.setBounds(85, 42, 157, 26);
		contentPane.add(lblKudeaketa);
		
		btnNabegasioa = new JButton("Nabegasioa");
		btnNabegasioa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kontrol.bistaratuKudeatuDepartPantaila();
			}
		});
		btnNabegasioa.setBounds(158, 172, 133, 23);
		contentPane.add(btnNabegasioa);
		
		btnKargatuDept = new JButton("Kargatu Dept.");
		btnKargatuDept.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (comboBox.getSelectedItem() == "CSV") {
					kontrol.kargatuDepartamentuCSV();
				}
				else if (comboBox.getSelectedItem() == "XML"){
					kontrol.kargatuDepartamentuXML();
				}
				else if (comboBox.getSelectedItem() == "JSON"){
					  JOptionPane.showMessageDialog(null, "Oier, eres lo mas bello del planeta!");
				}

			}
		});
		btnKargatuDept.setBounds(158, 105, 133, 23);
		contentPane.add(btnKargatuDept);
		
		btnAtzera = new JButton("Atzera");
		btnAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kontrol.bistaratuMenua();
			}
		});
		btnAtzera.setFont(new Font("Source Sans Pro Black", Font.BOLD, 11));
		btnAtzera.setBounds(10, 237, 75, 23);
		contentPane.add(btnAtzera);
		
		comboBox = new JComboBox();
		comboBox.setBounds(362, 106, 58, 20);
		comboBox.addItem("CSV");
		comboBox.addItem("XML");
		comboBox.addItem("JSON");
		contentPane.add(comboBox);
		
		lblFormatua = new JLabel("Formatua:");
		lblFormatua.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblFormatua.setBounds(301, 107, 51, 18);
		contentPane.add(lblFormatua);
	}
	
	public void setcoordinador(Kontroladorea kon) {
		this.kontrol = kon;
	}
}
