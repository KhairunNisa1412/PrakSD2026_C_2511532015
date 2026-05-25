package pekan8_2511532015;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;

public class BubbleSort_2511532015 extends JFrame {
    private static final long serialVersionUID = 1L;
    private int[] array_2015;
    private JLabel[] labelArray_2015;
    private JButton stepButton_2015, resetButton_2015, setButton_2015;
    private JTextField inputField_2015;
    private JPanel panelArray_2015;
    private JTextArea stepArea_2015;
    private int i_2015 = 0, j_2015; // i_2015 diinisialisasi 0 agar sinkron dengan setArrayFromInput
    private boolean sorting_2015 = false;
    private int stepCount_2015 = 1;
    
    /**
     * Create the frame.
     */
    public BubbleSort_2511532015() {
        setTitle("Bubble Sort Langkah per Langkah"); // Disesuaikan dengan logika Bubble Sort di bawah
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel input
        JPanel inputPanel_2015 = new JPanel(new FlowLayout());
        inputField_2015 = new JTextField(30);
        setButton_2015 = new JButton("Set Array");
        inputPanel_2015.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_2015.add(inputField_2015);
        inputPanel_2015.add(setButton_2015);

        // Panel array visual
        panelArray_2015 = new JPanel();
        panelArray_2015.setLayout(new FlowLayout());

        // Panel kontrol
        JPanel controlPanel_2015 = new JPanel();
        stepButton_2015 = new JButton("Langkah Selanjutnya");
        resetButton_2015 = new JButton("Reset");
        stepButton_2015.setEnabled(false);
        controlPanel_2015.add(stepButton_2015);
        controlPanel_2015.add(resetButton_2015);
        
        // Area teks untuk log langkah-langkah
        stepArea_2015 = new JTextArea(8, 60);
        stepArea_2015.setEditable(false);
        stepArea_2015.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_2015 = new JScrollPane(stepArea_2015);

        // Tambahkan panel ke frame
        add(inputPanel_2015, BorderLayout.NORTH);
        add(panelArray_2015, BorderLayout.CENTER);
        add(controlPanel_2015, BorderLayout.SOUTH);
        add(scrollPane_2015, BorderLayout.EAST);
        
        // Event Set Array
        setButton_2015.addActionListener(e -> setArrayFromInput_2015());
        
        // Event Langkah Selanjutnya
        stepButton_2015.addActionListener(e -> performStep_2015());
        
        // Event reset
        resetButton_2015.addActionListener(e -> reset_2015());
    }

    private void setArrayFromInput_2015() {
        String text = inputField_2015.getText().trim();
        if (text.isEmpty()) return;
        String[] parts = text.split(",");
        array_2015 = new int[parts.length];
        try {
            for (int k = 0; k < parts.length; k++) {
                array_2015[k] = Integer.parseInt(parts[k].trim());
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka "
                    + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        i_2015 = 0;
        j_2015 = 0;
        stepCount_2015 = 1;
        sorting_2015 = true;
        stepButton_2015.setEnabled(true);
        stepArea_2015.setText("");
        panelArray_2015.removeAll();
        labelArray_2015 = new JLabel[array_2015.length];
        for (int k = 0; k < array_2015.length; k++) {
            labelArray_2015[k] = new JLabel(String.valueOf(array_2015[k]));
            labelArray_2015[k].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2015[k].setOpaque(true);
            labelArray_2015[k].setBackground(Color.WHITE);
            labelArray_2015[k].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2015[k].setPreferredSize(new Dimension(50, 50));
            labelArray_2015[k].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_2015.add(labelArray_2015[k]);
        }
        panelArray_2015.revalidate();
        panelArray_2015.repaint();
    }

    private void performStep_2015() {
        if (!sorting_2015 || i_2015 >= array_2015.length - 1) {
            sorting_2015 = false;
            stepButton_2015.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
            return;
        }
        
        resetHighlights_2015(); // Perbaikan: Memanggil method pembantu dengan benar
        
        StringBuilder stepLog = new StringBuilder();
        labelArray_2015[j_2015].setBackground(Color.CYAN);
        labelArray_2015[j_2015 + 1].setBackground(Color.CYAN);
        
        if (array_2015[j_2015] > array_2015[j_2015 + 1]) {
            // Swap
            int temp = array_2015[j_2015];
            array_2015[j_2015] = array_2015[j_2015 + 1];
            array_2015[j_2015 + 1] = temp;
            labelArray_2015[j_2015].setBackground(Color.RED);
            labelArray_2015[j_2015 + 1].setBackground(Color.RED);
            stepLog.append("Langkah ").append(stepCount_2015).append(": Menukar elemen ke-")
                    .append(j_2015).append(" (").append(array_2015[j_2015 + 1]).append(") dengan ke-")
                    .append(j_2015 + 1).append(" (").append(array_2015[j_2015]).append(")\n");
        } else {
            stepLog.append("Langkah ").append(stepCount_2015).append(": Tidak ada pertukaran antara ke-")
                    .append(j_2015).append(" (").append(array_2015[j_2015]).append(") dan ke-").append(j_2015 + 1).append("\n");
        }
        
        stepLog.append("Hasil: ").append(arrayToString_2015(array_2015)).append("\n\n");
        stepArea_2015.append(stepLog.toString());
        updateLabels_2015();
        
        j_2015++;
        if (j_2015 >= array_2015.length - i_2015 - 1) {
            j_2015 = 0;
            i_2015++;
        }
        stepCount_2015++;
        
        if (i_2015 >= array_2015.length - 1) {
            sorting_2015 = false;
            stepButton_2015.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai!");
        }
    }

    private void updateLabels_2015() {
        for (int k = 0; k < array_2015.length; k++) {
            labelArray_2015[k].setText(String.valueOf(array_2015[k]));
        }
    }

    private void resetHighlights_2015() { // Perbaikan: Nama method disinkronkan
        for (JLabel label : labelArray_2015) {
            label.setBackground(Color.WHITE);
        }
    }

    private void reset_2015() { // Perbaikan: Nama method disinkronkan
        inputField_2015.setText("");
        panelArray_2015.removeAll();
        panelArray_2015.revalidate();
        panelArray_2015.repaint();
        stepArea_2015.setText("");
        stepButton_2015.setEnabled(false);
        sorting_2015 = false;
        i_2015 = 0;
        j_2015 = 0;
        stepCount_2015 = 1;
    }

    private String arrayToString_2015(int[] arr) { // Perbaikan: Nama method disinkronkan
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < arr.length; k++) {
            sb.append(arr[k]);
            if (k < arr.length - 1) sb.append(", ");
        }
        return sb.toString();
    } 

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> { 
            BubbleSort_2511532015 gui = new BubbleSort_2511532015();
            gui.setVisible(true);
        });
    }
}