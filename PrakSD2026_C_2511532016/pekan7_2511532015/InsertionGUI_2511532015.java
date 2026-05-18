package pekan7_2511532015;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class InsertionGUI_2511532015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int[] array_2015;
	private JLabel[] labelArray_2015;
	private JButton stepButton_2015, resetButton_2015, setButton_2015;
	private JTextField inputField_2015;
	private JPanel panelArray_2015;
	private JTextArea stepArea_2015;
	
	private int i_2015 = 1, j_2015;
	private boolean sorting_2015 = false;
	private int stepCount_2015 = 1;


	/**
	 * Create the frame.
	 */
	public InsertionGUI_2511532015() {
		setTitle ("Insertion Sort Langkah per Langkah");
		setSize (750, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo (null);
		setLayout (new BorderLayout());
		
		//Panel Input
		JPanel inputPanel = new JPanel (new FlowLayout());
		inputField_2015 = new JTextField (30);
		setButton_2015 = new JButton ("Set Array");
		inputPanel.add(new JLabel ("Masukkan angka (pisahkan dengan koma): "));
		inputPanel.add(inputField_2015);
		inputPanel.add(setButton_2015);
		
		//Panel array visual
		panelArray_2015 = new JPanel ();
		panelArray_2015.setLayout (new FlowLayout());
		
		//panel kontrol
		JPanel controlPanel = new JPanel();
		setButton_2015 = new JButton ("Langkah selanjutnya");
		resetButton_2015 = new JButton ("Reset");
		stepButton_2015 = new JButton ("Reset");
		controlPanel.add(stepButton_2015);
		controlPanel.add(resetButton_2015);
		
		//area teks untuk log langkah-langkah
		stepArea_2015 = new JTextArea (8, 60);
		stepArea_2015.setEditable (false);
		stepArea_2015.setFont (new Font ("Monospace", Font.PLAIN, 14));
		JScrollPane scrollPane = new JScrollPane (stepArea_2015);
		
		//Tambahkan panel ke frame
		add(inputPanel, BorderLayout.NORTH);
		add(panelArray_2015, BorderLayout.CENTER);
		add(controlPanel, BorderLayout.SOUTH);
		add(scrollPane, BorderLayout.EAST);
		
		//Event Set Array
		setButton_2015.addActionListener (e -> setArrayFromInput());
		
		//Evet Langkah Selanjutnya
		stepButton_2015.addActionListener (e -> performStep());
		
		//Event Reset
		resetButton_2015.addActionListener (e -> reset());
	}
	private void setArrayFromInput() {
		String text = inputField_2015.getText().trim();
		if (text.isEmpty()) return;
		String[] parts = text.split (",");
		array_2015 = new int [parts.length];
		try {
			for (int k = 0; k <parts.length; k++) {
				array_2015 [k] = Integer.parseInt(parts[k].trim());
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Masukkan hanya angka yang dipisahkan "
					+ "dengan koma!", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		i_2015 = 1;
		stepCount_2015 = 1;
		sorting_2015 = true;
		stepButton_2015.setEnabled(true);
		stepArea_2015.setText("");
		panelArray_2015.removeAll();
		labelArray_2015 = new JLabel [array_2015.length];
		for (int k = 0; k < array_2015.length; k++) {
			labelArray_2015[k] = new JLabel (String.valueOf (array_2015[k]));
			labelArray_2015[k].setFont (new Font ("Arial", Font.BOLD, 24));
			labelArray_2015[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
			labelArray_2015[k].setPreferredSize(new Dimension (50, 50));
			labelArray_2015[k].setHorizontalAlignment(SwingConstants.CENTER);
			panelArray_2015.add(labelArray_2015[k]);
		}
		panelArray_2015.revalidate();
		panelArray_2015.repaint();
	}
	private void performStep() {
		if (i_2015 < array_2015.length && sorting_2015) {
			int key = array_2015[i_2015];
			j_2015 = i_2015 - 1;
			
			StringBuilder stepLog =  new StringBuilder();
			stepLog.append("Langkah ").append(stepCount_2015).
			append(": Memasukkan ").append(key).append ("\n");
			
			while (j_2015 >= 0 && array_2015[j_2015] > key) {
				array_2015[j_2015 + 1] = array_2015[j_2015];
				j_2015--;
			}
			array_2015[j_2015 + 1] = key;
			
			updateLabels();
			stepLog.append("Hasil: ").append(arrayToString(array_2015)).
			append("\n\n");
			stepArea_2015.append(stepLog.toString());
			
			i_2015++;
			stepCount_2015++;
			
			if (i_2015 == array_2015.length) {
				sorting_2015 = false;
				stepButton_2015.setEnabled(false);
				JOptionPane.showMessageDialog (this, "Sorting selesai!");
			}
		}
	}
	private void updateLabels() {
		for (int k = 0; k < array_2015.length; k++) {
			labelArray_2015[k].setText(String.valueOf(array_2015[k]));
		}
	}
	private void reset() {
		inputField_2015.setText("");
		panelArray_2015.removeAll();
		panelArray_2015.revalidate();
		panelArray_2015.repaint();
		stepArea_2015.setText("");
		sorting_2015 = false;
		i_2015 = 1;
		stepCount_2015 = 1;
	}
	private String arrayToString (int[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < arr.length; k++) {
			sb.append (arr[k]);
			if (k < arr.length - 1) sb.append (", ");
		}
		return sb.toString();
	}
}
