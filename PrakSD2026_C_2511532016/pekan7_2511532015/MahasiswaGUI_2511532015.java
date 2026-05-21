package pekan7_2511532015;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class MahasiswaGUI_2511532015 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField inputNama_2015, inputNim_2015, inputProdi_2015;
	private JButton tambahButton_2015, hapusButton_2015, sortingButton_2015;
	private JComboBox<String> pilihAlgoritma_2015;
	private JTable tableData_2015;
	private DefaultTableModel tableModel_2015;
	private JTextArea logText_2015;
	private ArrayList<Mahasiswa_2511532015> daftarMahasiswa_2015;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MahasiswaGUI_2511532015 frame = new MahasiswaGUI_2511532015();
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
	public MahasiswaGUI_2511532015() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//inisialisasi arraylist
		daftarMahasiswa_2015 = new ArrayList<>();
		contentPane.setLayout(new BorderLayout(10, 10));
		
		//panel input
		JPanel inputPanel_2015 = new JPanel (new FlowLayout());
		inputNama_2015 = new JTextField (15);
		inputNim_2015 = new JTextField (15);
		inputProdi_2015 = new JTextField (15);
		tambahButton_2015 = new JButton ("Tambah");
		hapusButton_2015 = new JButton ("Hapus");
		contentPane.add(inputPanel_2015, BorderLayout.NORTH);
		
		inputPanel_2015.add(new JLabel("Nama:"));
		inputPanel_2015.add(inputNama_2015);

		inputPanel_2015.add(new JLabel("NIM:"));
		inputPanel_2015.add(inputNim_2015);

		inputPanel_2015.add(new JLabel("Prodi:"));
		inputPanel_2015.add(inputProdi_2015);

		inputPanel_2015.add(tambahButton_2015);
		inputPanel_2015.add(hapusButton_2015);
		
		//table
		String[] kolom_2015 = {"Nama", "NIM", "Prodi"};
		tableModel_2015 = new DefaultTableModel (kolom_2015, 0);
		tableData_2015 = new JTable (tableModel_2015);
		tableData_2015.setFillsViewportHeight(true);
		JScrollPane scrollTable_2015 = new JScrollPane (tableData_2015);
		contentPane.add(scrollTable_2015, BorderLayout.CENTER);
		
		//panel kontrol
		JPanel panelKontrol_2015 = new JPanel (new FlowLayout());
		panelKontrol_2015.add(new JLabel ("Algoritma: "));
		pilihAlgoritma_2015 = new JComboBox<>(new String[] {
				"Insertion Sort", "Selection Sort", "Bubble Sort"
		});
		panelKontrol_2015.add(pilihAlgoritma_2015);
		sortingButton_2015 = new JButton ("Mulai Sorting");
		panelKontrol_2015.add(sortingButton_2015);
		contentPane.add(panelKontrol_2015, BorderLayout.SOUTH);
		
		//area log
		logText_2015 = new JTextArea (40, 55);
		logText_2015.setEditable(false);
		logText_2015.setFont(new java.awt.Font("Monospaced", java.awt.Font.PLAIN, 12));
		JScrollPane scrollLog_2015 = new JScrollPane (logText_2015);
		contentPane.add(scrollLog_2015, BorderLayout.EAST);
		
		//tombol tambah
		tambahButton_2015.addActionListener(e-> {
			String nama= inputNama_2015.getText().trim();
			String nim= inputNim_2015.getText().trim();
			String prodi= inputProdi_2015.getText().trim();
			
			if (nama.isEmpty() || nim.isEmpty()||prodi.isEmpty()) {
				javax.swing.JOptionPane.showMessageDialog (this, "Semua field harus diisi!", "Error",
						javax.swing.JOptionPane.ERROR_MESSAGE);
				return;
			}
			Mahasiswa_2511532015 mhsBaru = new Mahasiswa_2511532015(nama, nim, prodi);
			daftarMahasiswa_2015.add(mhsBaru);
			tambahKeTable_2015(mhsBaru);
			inputNama_2015.setText("");
		    inputNim_2015.setText("");
		    inputProdi_2015.setText("");
		    inputNama_2015.requestFocus();
		    tambahLog_2015("Data ditambahkan: "+nama);
		});
		
		//tombol hapus
		hapusButton_2015.addActionListener(e->{
			int selectedRow = tableData_2015.getSelectedRow();
			if (selectedRow == -1) {
				javax.swing.JOptionPane.showMessageDialog(this,"Pilih data yang ingin dihapus!", "Peringatan", 
				javax.swing.JOptionPane.WARNING_MESSAGE);
			}
			daftarMahasiswa_2015.remove(selectedRow);
		    tableModel_2015.removeRow(selectedRow);
		    tambahLog_2015 ("Data dihapus dari baris "+ (selectedRow + 1));
		});
		
		//tombol mulai sorting
		sortingButton_2015.addActionListener(e->{
			if (daftarMahasiswa_2015.isEmpty()) {
				javax.swing.JOptionPane.showMessageDialog(this, "Tamah data terlebih dahulu", "Peringatan",
						javax.swing.JOptionPane.WARNING_MESSAGE);
				return;
			}
			String pilih = (String)pilihAlgoritma_2015.getSelectedItem();
			ArrayList<Mahasiswa_2511532015> dataSorting = new ArrayList<>(daftarMahasiswa_2015);
			logText_2015.setText("");
			tambahLog_2015("Memulai "+pilih);
			
			switch (pilih) {
			case "Insertion Sort":
				insertionSort_2015 (dataSorting);
				break;
			case "Selection Sort":
				selectionSort_2015(dataSorting);
				break;
			case "Bubble Sort":
				bubbleSort_2015(dataSorting);
				break;
			}
			tambahLog_2015 ("Sorting selesai");
		    javax.swing.JOptionPane.showMessageDialog(this, "Sorting selesai!");

		});
	}
	//menambahkan objek mahasiswa ke table
	private void tambahKeTable_2015 (Mahasiswa_2511532015 mhs) {
		tableModel_2015.addRow(new Object[] {
			mhs.getNama_2015(),
			mhs.getNim_2015(),
			mhs.getProdi_2015()
		});
	
	}
	// menambahkan log
	private void tambahLog_2015(String pesan) {
	    logText_2015.append(pesan + "\n");
	    logText_2015.setCaretPosition(logText_2015.getDocument().getLength());
	}
	public void updateTable_2015() {
		tableModel_2015.setRowCount(0);
		for (Mahasiswa_2511532015 mhs : daftarMahasiswa_2015) {
			tambahKeTable_2015(mhs);
		}
	}
	//update table
	private void updateTabelDariList_2015(ArrayList<Mahasiswa_2511532015> data) {
	    tableModel_2015.setRowCount(0);
	    for (Mahasiswa_2511532015 mhs : data) {
	        tableModel_2015.addRow(new Object[]{
	            mhs.getNama_2015(),
	            mhs.getNim_2015(),
	            mhs.getProdi_2015()
	        });
	    }
	}
	//konversi ArrayList ke string untuk log
	private String arrayToString_2015(ArrayList<Mahasiswa_2511532015> data) {
	    StringBuilder sb = new StringBuilder("[");
	    for (int i = 0; i < data.size(); i++) {
	        sb.append(data.get(i).getNama_2015());
	        if (i < data.size() - 1) sb.append(", ");
	    }
	    sb.append("]");
	    return sb.toString();
	}
	//Insertion Sort
	private void insertionSort_2015(ArrayList<Mahasiswa_2511532015> data) {
	    int n = data.size();
	    tambahLog_2015("=== INSERTION SORT ===");
	    
	    for (int i = 1; i < n; i++) {
	        Mahasiswa_2511532015 key = data.get(i);
	        int j = i - 1;
	        
	        // Geser elemen yang lebih besar
	        while (j >= 0 && data.get(j).getNama_2015().compareToIgnoreCase(key.getNama_2015()) > 0) {
	            data.set(j + 1, data.get(j));
	            j--;
	        }
	        data.set(j + 1, key);

	        tableModel_2015.fireTableDataChanged();
	        tableData_2015.repaint();
	        logText_2015.repaint();
	        tambahLog_2015("Langkah " + i + ": " + arrayToString_2015(data));
	    }
	}
	//Selection Sort
	private void selectionSort_2015(ArrayList<Mahasiswa_2511532015> data) {
	    int n = data.size();
	    int pass = 1;
	    tambahLog_2015("=== SELECTION SORT ===");
	    
	    for (int i = 0; i < n - 1; i++) {
	        // Cari indeks elemen terkecil di sisa array
	        int minIndex = i;
	        for (int j = i + 1; j < n; j++) {
	            // Bandingkan menggunakan compareToIgnoreCase()
	            if (data.get(j).getNama_2015().compareToIgnoreCase(
	                data.get(minIndex).getNama_2015()) < 0) {
	                minIndex = j;
	            }
	        }
	        
	        // Tukar elemen terkecil dengan posisi i
	        Mahasiswa_2511532015 temp = data.get(i);
	        data.set(i, data.get(minIndex));
	        data.set(minIndex, temp);
	        tableModel_2015.fireTableDataChanged();
	        tableData_2015.repaint();
	        logText_2015.repaint();
	        tambahLog_2015("Pass " + pass + ": " + arrayToString_2015(data));

	    }
	}
	//Bubble Sort
	private void bubbleSort_2015(ArrayList<Mahasiswa_2511532015> data) {
	    int n = data.size();
	    int pass = 1;
	    tambahLog_2015("=== BUBBLE SORT ===");
	    
	    for (int i = 0; i < n - 1; i++) {
	        // Bandingkan elemen bersebelahan
	        for (int j = 0; j < n - i - 1; j++) {
	            // Jika elemen j > elemen j+1, swap
	            if (data.get(j).getNama_2015().compareToIgnoreCase(
	                data.get(j + 1).getNama_2015()) > 0) {
	                
	                // Swap elemen
	                Mahasiswa_2511532015 temp = data.get(j);
	                data.set(j, data.get(j + 1));
	                data.set(j + 1, temp);
	            }
	        }
	        tableModel_2015.fireTableDataChanged();
	        tableData_2015.repaint();
	        logText_2015.repaint();

	        tambahLog_2015("Pass " + pass + ": " + arrayToString_2015(data));

	    }
	}
}
