import javax.swing.*;
public class UI extends JFrame  {


    UI (){
        setSize(1000, 700);
        setLayout( null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JButton  button2 = new MyImage("src/cprite1.png");
        button2.setBounds(100, 200, 100, 120);

        add(button2);

        setVisible(true);

    }


}

