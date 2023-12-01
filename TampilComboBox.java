package GUI;
import javax.swing.*;

public class TampilComboBox  extends JFrame {
    final static String pilihan [] = {"Pilihan - 1", "Pilihan - 2", "Pilihan - 3"};
    private JPanel panelku = new JPanel ();
    private static JComboBox ComboBox = new JComboBox(pilihan);
    
    TampilComboBox(){
        super ("membuat ComboBox");
        panelku.setLayout(null);
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        ComboBox.setBounds(90,70,150,25);
        panelku.Add(ComboBox);
        getContentPane().add(panelku);
        setVisible(true);
    }
    public static void main(String args[]) {
        TampilComboBox frameku = new TampilComboBox();
        ComboBox.addItem("pilihan tambahan");
        ComboBox.removeItem("Pilihan ke - 2");
    }
}