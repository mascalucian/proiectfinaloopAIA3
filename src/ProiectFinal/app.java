package ProiectFinal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class app {
    private JTabbedPane tabbedPane1;
    private JTextPane clasaTextPane;
    private JTextField textField1;
    private JButton adaugaButton;
    private JTextField textField2;
    private JTextField textField4;
    private JPanel RootPanel;
    private JLabel clase;
    private JTextArea textArea1;
    private JLabel mesaj;
    private JComboBox comboBox1;
    private JTextField textField5;
    public int nrclase=0;
    ArrayList<Clasa> clasee = new ArrayList<Clasa>();

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setTitle("Proiect Final - AIA3 - Masca Lucian, Imre Laszlo");
        f.setSize(400,500);//400 width and 500 height
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);//making the frame visible
        f.setLayout(null);//using no layout managers

        f.pack();f.setContentPane(new app().RootPanel);

    }
    public app() {
        adaugaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean isNumeNumeric=isNumeric(textField1.getText());
                boolean isNreleviNumeric=isNumeric(textField4.getText());

                if(isNumeNumeric==false) {mesaj.setText("Eroare: Numarul clasei nu poate contine litere. SAU campul este gol");}
                else if (isNreleviNumeric==false) {mesaj.setText("Eroare: Numarul de elevi nu poate contine litere. SAU campul este gol");}
                else {

                    boolean b = true;
                    if(textField2.getText().isEmpty()){
                        b = false;
                        JOptionPane.showConfirmDialog(null, "Nu ai completat campul 'litera'",
                                "Atentie",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.ERROR_MESSAGE);
                    }

                    else if(!(textField2.getText().equals("A") || textField2.getText().equals("B") || textField2.getText().equals("C") || textField2.getText().equals("D"))){
                        b = false;
                        JOptionPane.showConfirmDialog(null, "Litera nu este A sau B sau C sau D",
                                "Atentie",
                                JOptionPane.DEFAULT_OPTION,
                                JOptionPane.ERROR_MESSAGE);
                    }

                    if(b){
                    Integer nr = Integer.parseInt(textField4.getText());
                    String nrString = nr.toString();

                    //Singleton
                    Clasa Singleton = Clasa.getInstance();
                    Singleton.setEverything(textField1.getText(), textField2.getText(), comboBox1.getSelectedItem().toString(), nrString);
                    clasee.add(Singleton);
                    textField1.setText("");
                    textField2.setText("");
                    textField4.setText("");
                    String clasa = clasee.get(clasee.size() - 1).getClasa();
                    String litera = clasee.get(clasee.size() - 1).getLitera();
                    String specializare = clasee.get(clasee.size() - 1).getSpecializare();
                    String nrelevi = clasee.get(clasee.size() - 1).getNrelevi();

                    mesaj.setText("Clasa " + clasa + litera + " a fost adaugata cu succes.");
                    System.out.println(clasa + litera);
                    StringBuffer sb = new StringBuffer();
                    sb.append(textArea1.getText());
                    sb.append("\r\n" + clasee.size() + ". " + clasa + litera + " - Specializarea: " + specializare + ", avand un numar de " + nrelevi + " elevi");
                    textArea1.setText(String.valueOf(sb));

                    //creerea si append la textul pentru logging
                    StringBuffer textLogging = new StringBuffer();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                    LocalDateTime now = LocalDateTime.now();
                    System.out.println(dtf.format(now));
                        textLogging.append(dtf.format(now)+": Clasa "+ clasa + litera + " - Specializarea: " + specializare + ", avand un numar de " + nrelevi + " elevi a fost adaugata.");
                    try(FileWriter fw = new FileWriter("logs.txt", true);
                        BufferedWriter bw = new BufferedWriter(fw);
                        PrintWriter out = new PrintWriter(bw))
                    {
                        out.println(textLogging.toString());
                    } catch (IOException f) {
                    }

                    }
                }
            }
        });
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
