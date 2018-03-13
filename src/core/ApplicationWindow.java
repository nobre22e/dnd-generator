package core;
import javax.swing.JFrame;

public class ApplicationWindow {
	public static int WINDOW_WIDTH = 700;
	
	public static int WINDOW_HEIGHT = 500;
	
	public static void main(String[] args) {
		JFrame generator = new JFrame("Generate a new Character Sheet");
		generator.add(new GeneratorView());
		generator.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		generator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		generator.setVisible(true);

	}

}
