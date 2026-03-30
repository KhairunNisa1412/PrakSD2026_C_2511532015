package pekan8_2511532015;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TugasOperatorRasional_2511532015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBil1;
	private JTextField txtBil2;
	private JTextField textHasil;
	
	private void pesanPeringatan (String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror (String pesan) {
		JOptionPane.showMessageDialog(this, pesan, "Kesalahan", JOptionPane.ERROR_MESSAGE);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TugasOperatorRasional_2511532015 frame = new TugasOperatorRasional_2511532015();
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
	public TugasOperatorRasional_2511532015() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 300);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(210, 193, 217));
		contentPane.setBackground(new Color(255, 221, 238));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel txtJudul = new JLabel("OPERATOR RASIONAL");
		txtJudul.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		txtJudul.setHorizontalAlignment(SwingConstants.CENTER);
		txtJudul.setBounds(68, 11, 152, 14);
		contentPane.add(txtJudul);
		
		JLabel labelBil1 = new JLabel("Bilangan 1");
		labelBil1.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		labelBil1.setBounds(10, 44, 70, 14);
		contentPane.add(labelBil1);
		
		JLabel labelBil2 = new JLabel("Bilangan 2");
		labelBil2.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		labelBil2.setBounds(10, 80, 70, 14);
		contentPane.add(labelBil2);
		
		txtBil1 = new JTextField();
		txtBil1.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil1.setBounds(90, 41, 49, 20);
		contentPane.add(txtBil1);
		txtBil1.setColumns(10);
		
		txtBil2 = new JTextField();
		txtBil2.setHorizontalAlignment(SwingConstants.CENTER);
		txtBil2.setColumns(10);
		txtBil2.setBounds(90, 77, 49, 20);
		contentPane.add(txtBil2);
		
		JLabel OperatorRasional = new JLabel("Operator");
		OperatorRasional.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		OperatorRasional.setBounds(10, 130, 70, 14);
		contentPane.add(OperatorRasional);
		
		JLabel lblHasil = new JLabel("Hasil");
		lblHasil.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		lblHasil.setBounds(10, 170, 70, 14);
		contentPane.add(lblHasil);
		
		textHasil = new JTextField();
		textHasil.setForeground(new Color(0, 0, 0));
		textHasil.setEditable(false);
		textHasil.setHorizontalAlignment(SwingConstants.CENTER);
		textHasil.setColumns(10);
		textHasil.setBounds(90, 167, 49, 20);
		contentPane.add(textHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setBackground(new Color(255, 255, 255));
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {">", "<", ">=", "<=", "==", "!="}));
		cbOperator.setBounds(90, 126, 50, 22);
		contentPane.add(cbOperator);

		
		JButton Bandingkan = new JButton("Bandingkan");
		Bandingkan.setBackground(new Color(255, 106, 181));
		Bandingkan.setForeground(new Color(255, 187, 187));
		Bandingkan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtBil1.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 1 harus diinput");
				} else if (txtBil2.getText().trim().isEmpty()) {
					pesanPeringatan ("Bilangan 2 harus diinput");
				} else {
					try {
						int a1= Integer.valueOf(txtBil1.getText().trim());
						int a2= Integer.valueOf(txtBil2.getText().trim());
						int operator= cbOperator.getSelectedIndex();
						boolean hasil= false;
						
						switch (operator) {
						case 0:
							hasil= a1 > a2;
							break;
						case 1:
							hasil= a1 < a2;
							break;
						case 2:
							hasil= a1 <= a2;
							break;
						case 3:
							hasil= a1 <= a2;
							break;
						case 4:
							hasil= a1 == a2;
							break;
						case 5:
							hasil= a1 != a2;
							break;
						}
						
						textHasil.setText(String.valueOf(hasil));
					} catch (NumberFormatException ex) {
						pesanEror ("Bilangan 2 dan Bilangan 2 harus angka");
					}
				}
			}
		});
		Bandingkan.setBounds(157, 126, 119, 22);
		contentPane.add(Bandingkan);
		
	}
}
