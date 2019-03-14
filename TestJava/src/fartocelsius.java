import javax.swing.*;
import java.awt.event.ActionEvent;

public class fartocelsius extends AbstractAction {

    private Converter convert;

    public fartocelsius(String text, Converter convert){

        super(text);
        this.convert = convert;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    	convert.setResultLabel(convert.conversion(convert.getValueFromTextField()) + " Fahrenheit");
    }
}