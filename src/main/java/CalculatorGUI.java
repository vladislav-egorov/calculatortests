import javax.swing.*;
import java.awt.*;

class CalculatorGUI extends JFrame{
    private JTextField firstNumberField = new JTextField(6);
    private JLabel firstNumberLabel = new JLabel("A");

    private JLabel secondNumberLabel = new JLabel("B");
    private JTextField secondNumberField = new JTextField(6);

    private JButton runButton = new JButton("=");
    private JLabel resultLabel = new JLabel("C");
    private JTextField resultField = new JTextField(6);

    /**
     * Создание графического интерфейса калькулятора для деления, состоящего из трех полей и кнопки для выполения действия.
     */
    CalculatorGUI(){
        super("Divide Calculator");
        this.setBounds(500, 500, 400, 100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new FlowLayout());

        container.add(firstNumberLabel);
        container.add(firstNumberField);
        container.add(secondNumberLabel);
        container.add(secondNumberField);

        runButton.addActionListener(new DivideOperation(firstNumberField, secondNumberField, resultField));
        container.add(runButton);

        container.add(resultLabel);
        container.add(resultField);
    }
}

