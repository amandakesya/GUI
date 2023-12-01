package GUI;

import javax.swing.*;
public class TampilTextField extends JFrame{
    private JPanel panelku = new JPanel();
    private static JTextField TxtNama = new JTextField ("Textfield dengan java");
    
    TampilTextField(){
        super ("membuat TextField");
        panelku.setLayout(null);
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        TxtNama.setBounds(60,20,160,25);
        panelku.add(TxtNama);
        getContentPane().add(panelku);
        setVisible(true);
    }
    public static void main(String[] args) {
        TampilTextField frameku = new TampilTextField();
    }
}

