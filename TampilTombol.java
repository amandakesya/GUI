package GUI;
import javax.swing.*;

public class TampilTombol extends JFrame {
    private JPanel panelku = new JPanel();
    private static JButton Tombol = new JButton("Tombol");

    TampilTombol(){
        super ("membuat tombol");
        panelku.setLayout(null);
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Tombol.setBounds(60,20,160,25);
        panelku.add(Tombol);
        getContentPane().add(panelku);
        setVisible(true);
    }
    public static void main(String[] args) {
        TampilTombol frameku = new TampilTombol();
        //Tombol.setText("sffsf");
    }
  
}
