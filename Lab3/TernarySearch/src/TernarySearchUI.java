import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Objects;


public class TernarySearchUI extends JFrame  {
    public TernarySearchUI() {
        create();
    }

    public void create()
    {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        arrayInput = new JLabel("Введите целочисленный массив (через пробел):");
        panel.add(arrayInput);

        array = new JTextField();
        array.setColumns(23);
        panel.add(array);

        calculation = new JButton("Найти");
        panel.add(calculation);

        JLabel label = new JLabel("Цель");
        panel.add(label);

        targetBox = new JTextField();
        targetBox.setColumns(23);
        panel.add(targetBox);

        Input = new JLabel("Индекс цели:");
        panel.add(Input);

        output = new JLabel();
        panel.add(output);
        calculation.addActionListener(new Action() {public void actionPerformed(ActionEvent e)
        {
            String[] st = array.getText().split(" ");
            int[] arrayInt = new int[st.length];

            for (int i = 0; i < arrayInt.length; i++)
                arrayInt[i] = Integer.parseInt(st[i]);

            int target = Integer.parseInt(targetBox.getText());

            output.setText(String.valueOf(TernarySearch.ternarySearch(arrayInt, target)));
        }});

        getContentPane().add(panel);
        setPreferredSize(new Dimension(700, 300));
    }

    public class Action implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        }
    }
    private JButton calculation;
    private JLabel arrayInput;
    private JLabel Input;
    private JTextField array;
    private JLabel output;
    private JTextField targetBox;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                TernarySearchUI fr = new TernarySearchUI();
                fr.pack();
                fr.setLocationRelativeTo(null);
                fr.setVisible(true);
            }
        });
    }
}
