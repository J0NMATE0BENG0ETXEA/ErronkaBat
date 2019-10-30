package Leihoak;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Kontroladorea.Kontroladorea;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuNagusi extends JFrame {

	private JPanel contentPane;
	private JLabel lblMenuNagusia;
	private JButton btnDepartamentu;
	private JButton btnEmplegatu;
	private JButton btnTxostenak;
	private Kontroladorea kontrol;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuNagusi frame = new MenuNagusi();
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
	public MenuNagusi() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblMenuNagusia = new JLabel("MENU NAGUSIA");
		lblMenuNagusia.setFont(new Font("Source Code Pro", Font.BOLD, 40));
		lblMenuNagusia.setBounds(76, 11, 297, 39);
		contentPane.add(lblMenuNagusia);
		
		btnDepartamentu = new JButton("Departamentu");
		btnDepartamentu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				kontrol.bistaratuDepartPantaila();
			}
		});
		btnDepartamentu.setBounds(162, 90, 123, 23);
		contentPane.add(btnDepartamentu);
		
		btnEmplegatu = new JButton("Emplegatu");
		btnEmplegatu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				kontrol.bistaratuEmplePantaila();
			}
		});
		btnEmplegatu.setBounds(162, 143, 123, 23);
		contentPane.add(btnEmplegatu);
		
		btnTxostenak = new JButton("Txostenak");
		btnTxostenak.setBounds(162, 196, 123, 23);
		contentPane.add(btnTxostenak);
	}
	
	public void setcoordinador(Kontroladorea kon) {
		this.kontrol = kon;
	}
	
}
