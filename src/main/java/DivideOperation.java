import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DivideOperation implements ActionListener {

    private JTextField firstNumberField;
    private JTextField secondNumberField;

    private JTextField resultField;

    boolean firstNumberIsWrong;
    boolean secondNumberIsWrong;
    boolean divisionByZero;


    DivideOperation(JTextField firstNumberField, JTextField secondNumberField, JTextField resultField) {
        this.firstNumberField = firstNumberField;
        this.secondNumberField = secondNumberField;
        this.resultField = resultField;
    }

    DivideOperation() {}


    /**
     * Используется для проверки передаваемых значений на корректность, и для вычисления их разности.
     * @param firstNumberValue - делимое в формате строки.
     * @param secondNumberValue - делитель в формате строки.
     * @return разность передаваемых значений, если они корректны.
     */

    float operation(String firstNumberValue, String secondNumberValue) {

        firstNumberIsWrong = false;
        secondNumberIsWrong = false;
        divisionByZero = false;

        float firstNumber;
        try {
            firstNumber = Float.parseFloat(firstNumberValue);
        } catch (NumberFormatException error) {
            firstNumberIsWrong = true;
            return 0;
        }

        float secondNumber;
        try {
            secondNumber = Float.parseFloat(secondNumberValue);
        } catch (NumberFormatException error) {
            secondNumberIsWrong = true;
            return 0;
        }

        if (secondNumber == 0) {
            divisionByZero = true;
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    /**
     * Используется для передачи полученного значения разности в результирующее поле и для вывода ошибок в виде сообщений.
     */
    public void actionPerformed(ActionEvent event) {
        resultField.setText(String.valueOf(operation(firstNumberField.getText(), secondNumberField.getText())));

        if (firstNumberIsWrong) JOptionPane.showMessageDialog(null, "Wrong first number");
        if (secondNumberIsWrong) JOptionPane.showMessageDialog(null, "Wrong second number");
        if (divisionByZero) JOptionPane.showMessageDialog(null, "Division by zero!");
    }
}
