import javax.swing.SwingUtilities;

public class TestMain {

	public static void main(String[] args) {

 SwingUtilities.invokeLater(new Runnable(){
			 
			 public void run(){
				 
			 
				 
				 Converter ex = new Converter();
				 ex.setVisible(true);
				 
				 
			 
			 }
			 
		 });
		
	}

}
