package GUI;
import javax.swing.*;
public class TampilFrame extends JFrame{
    public TampilFrame(){
        super ("membuat frame dengan JFrame");
        setSize(350,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
      TampilFrame frameku = new TampilFrame();
