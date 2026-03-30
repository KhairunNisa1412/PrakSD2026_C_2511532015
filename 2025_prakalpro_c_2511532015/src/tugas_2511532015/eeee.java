package tugas_2511532015;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eeee extends JFrame {
    private JTextField txtPilihSoal;
    private JTextArea txtSoal;
    private JTextField txtJawaban;
    private JLabel lblNilai;
    private int skor = 0;
    private boolean[] dikerjakan = {false, false, false, false, false}; // 5 soal

    public eeee() {
        setTitle("📚 Mini Bank Soal Alpro");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel Atas: Pilih Soal
        JPanel panelAtas = new JPanel(new FlowLayout());
        panelAtas.add(new JLabel("Pilih Soal (1-5):"));
        txtPilihSoal = new JTextField(5);
        JButton btnTampil = new JButton("Tampilkan");
        panelAtas.add(txtPilihSoal);
        panelAtas.add(btnTampil);

        // Area Soal
        txtSoal = new JTextArea(5, 40);
        txtSoal.setEditable(false);
        txtSoal.setLineWrap(true);
        txtSoal.setWrapStyleWord(true);
        txtSoal.setFont(new Font("Arial", Font.BOLD, 14));

        // Panel Jawaban
        JPanel panelJawab = new JPanel(new FlowLayout());
        panelJawab.add(new JLabel("Jawaban Anda (1-4):"));
        txtJawaban = new JTextField(5);
        JButton btnCek = new JButton("Cek Jawaban");
        panelJawab.add(txtJawaban);
        panelJawab.add(btnCek);

        // Nilai
        lblNilai = new JLabel("Nilai: 0 / 100", JLabel.CENTER);
        lblNilai.setFont(new Font("Arial", Font.BOLD, 16));
        lblNilai.setForeground(Color.BLUE);

        // Tambah ke frame
        add(panelAtas, BorderLayout.NORTH);
        add(new JScrollPane(txtSoal), BorderLayout.CENTER);
        add(panelJawab, BorderLayout.SOUTH);
        add(lblNilai, BorderLayout.EAST);

        // Event: Tampilkan Soal
        btnTampil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int no = Integer.parseInt(txtPilihSoal.getText());
                    if (no < 1 || no > 5) {
                        JOptionPane.showMessageDialog(null, "Pilih 1-5!");
                        return;
                    }
                    if (dikerjakan[no - 1]) {
                        JOptionPane.showMessageDialog(null, "Soal ini sudah dikerjakan!");
                        return;
                    }

                    switch (no) {
                        case 1:
                            txtSoal.setText("Soal 1:\nApa tipe data untuk bilangan bulat di Java?\n1. double\n2. int\n3. boolean\n4. char");
                            break;
                        case 2:
                            txtSoal.setText("Soal 2:\nStruktur mana yang dijalankan minimal 1 kali?\n1. for\n2. while\n3. do-while\n4. if");
                            break;
                        case 3:
                            txtSoal.setText("Soal 3:\nOutput dari: for(int i=1;i<=3;i++) System.out.print(i);\n1. 123\n2. 1 2 3\n3. 321\n4. Error");
                            break;
                        case 4:
                            txtSoal.setText("Soal 4:\nPerintah untuk baca input teks dari keyboard?\n1. nextInt()\n2. nextLine()\n3. read()\n4. inputString()");
                            break;
                        case 5:
                            txtSoal.setText("Soal 5:\nCara benar membandingkan isi dua String?\n1. ==\n2. =\n3. .equals()\n4. .compare()");
                            break;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Masukkan angka 1-5!");
                }
            }
        });

        // Event: Cek Jawaban
        btnCek.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int no = Integer.parseInt(txtPilihSoal.getText());
                    if (no < 1 || no > 5) {
                        JOptionPane.showMessageDialog(null, "Pilih soal dulu!");
                        return;
                    }
                    if (dikerjakan[no - 1]) {
                        JOptionPane.showMessageDialog(null, "Sudah dikerjakan!");
                        return;
                    }

                    int jawab = Integer.parseInt(txtJawaban.getText());
                    boolean benar = false;

                    // Cek jawaban tiap soal
                    if (no == 1 && jawab == 2) benar = true;
                    else if (no == 2 && jawab == 3) benar = true;
                    else if (no == 3 && jawab == 1) benar = true;
                    else if (no == 4 && jawab == 2) benar = true;
                    else if (no == 5 && jawab == 3) benar = true;

                    if (benar) {
                        skor += 20;
                        JOptionPane.showMessageDialog(null, "✅ BENAR! +20 poin");
                    } else {
                        JOptionPane.showMessageDialog(null, "❌ SALAH! Tidak ada poin.");
                    }

                    dikerjakan[no - 1] = true;
                    lblNilai.setText("Nilai: " + skor + " / 100");

                    // Reset input
                    txtJawaban.setText("");
                    txtSoal.setText("Soal selesai. Pilih soal lain.");

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Jawaban harus angka 1-4!");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new eeee().setVisible(true);
            }
        });
    }
}