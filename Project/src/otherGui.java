import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class otherGui {
//Note: Typically the main method will be in a
//separate class. As this is a simple one class
//example it's all in the one class.
public static void main(String[] args) {
new otherGui();
}
public otherGui()
{
	JFrame guiFrame = new JFrame();
	//make sure the program exits when the frame closes
	guiFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	guiFrame.setTitle("my GUI");
	guiFrame.setSize(1080,960);
//This will center the JFrame in the middle of the screen
	guiFrame.setLocationRelativeTo(null);
	//Options for the JComboBox

//The first JPanel contains a JLabel and JCombobox
final JPanel MainPanel = new JPanel();
JTextField idInput=new JTextField(20);
JLabel idLable=new JLabel("inputID-before siwpe");
MainPanel.add(idInput);
MainPanel.add(idLable);
JButton Swipebutton = new JButton( "swipe");
//The ActionListener class is used to handle the
//event that happens when the user clicks the button.
//As there is not a lot that needs to happen we can
//define an anonymous inner class to make the code simpler.
Swipebutton.addActionListener(new ActionListener()
{

public void actionPerformed(ActionEvent event)
{
	System.out.println(idInput.getText());
}
});
guiFrame.add(Swipebutton,BorderLayout.SOUTH);
//The JFrame uses the BorderLayout layout manager.
//Put the two JPanels and JButton in different areas.
guiFrame.add(MainPanel, BorderLayout.NORTH);
guiFrame.setVisible(true);
}
}