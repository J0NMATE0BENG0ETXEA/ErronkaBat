package Leihoak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Kontroladorea.Kontroladorea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class KudeatuDepart extends JFrame {

	private JPanel contentPane;
	private JButton buttonAtzera;
	private Kontroladorea kontrol;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KudeatuDepart frame = new KudeatuDepart();
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
	public KudeatuDepart() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		buttonAtzera = new JButton("Atzera");
		buttonAtzera.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kontrol.bistaratuDepartPantaila();
			}
		});
		buttonAtzera.setFont(new Font("Source Sans Pro Black", Font.BOLD, 11));
		buttonAtzera.setBounds(10, 437, 75, 23);
		contentPane.add(buttonAtzera);
	}
	
	public void setcoordinador(Kontroladorea kon) {
		this.kontrol = kon;
	}

}
