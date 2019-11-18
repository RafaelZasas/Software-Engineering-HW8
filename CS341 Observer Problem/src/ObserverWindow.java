import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ObserverWindow  {

	private JLabel label;

	// CONSTRUCTOR
	ObserverWindow() {
		JFrame frame = new JFrame("Observer Window");
		label = new JLabel("   I AM OBSERVING THE SUBJECT WINDOW.");
		frame.add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 150);
		frame.setLocation(200, 200);
		frame.setVisible(true);

		// Make an instance of the bean (an observable), and
		// register a property change listener (observer) with the bean
		message bean = new message();
		bean.addPropertyChangeListener(e ->
				label.setText((String) e.getNewValue())
		);

		// Open the second window
		new ControllerWindow(bean);
	}


}