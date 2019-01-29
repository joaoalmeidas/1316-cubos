import javax.swing.JFrame;

public class CuboTeste {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Cubo cubo = new Cubo();
		frame.add(cubo);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.setResizable(false);
		
	}

}
