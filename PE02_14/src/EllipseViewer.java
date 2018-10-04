		import javax.swing.JFrame;
public class EllipseViewer{
	public static void main(String arg[]){
		JFrame frame = new JFrame();
	       frame.setSize(150, 200);
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	       Eclipse component = new Eclipse ();
	       frame.add(component);

	       frame.setVisible(true);
	}
	}