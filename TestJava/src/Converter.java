
import java.awt.*;
import java.awt.event.ActionEvent;


import javax.swing.*;

public class Converter extends JFrame {

    private JLabel      Label;
    private JTextField  textField;
    private JButton     convert;
    private JLabel      resultLabel;

    public Converter() {

        super();
        build();
        addComponents();
    }


    private void build() {

        setTitle("Convert Celsius to Fahrenheit");
        setSize(400, 120);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    

    private void addComponents() {

        JPanel contentPanel = (JPanel)this.getContentPane();

        textField = new JTextField();
        
        Label = new JLabel(" Celsius");
        
        convert = new JButton();
        
        resultLabel     = new JLabel("  - Fahrenheit");

        contentPanel.setLayout(new GridLayout(2, 2));

        contentPanel.add(textField);
        contentPanel.add(Label);
        contentPanel.add(convert);
        contentPanel.add(resultLabel);

        convert.setAction(new fartocelsius("Convert", this));
    }

    public int conversion(int celsius){
        double c = (double)celsius;
        double result = (1.8 * celsius) + 32;
        return (int)result;
    }

    public void setResultLabel(String value){
        resultLabel.setText(value);
    }

    public int getValueFromTextField(){
        return Integer.parseInt(textField.getText());
    }

   

}