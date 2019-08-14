import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JList;

public class DevUI {

	private JFrame frame;
	private JTextField txtDisplayId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DevUI window = new DevUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DevUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		txtDisplayId = new JTextField();
		txtDisplayId.setText("Display ID");
		frame.getContentPane().add(txtDisplayId, BorderLayout.NORTH);
		txtDisplayId.setColumns(10);
		
		JList list = new JList();
		frame.getContentPane().add(list, BorderLayout.WEST);
		String [] listdata = new String[5];
		for (int i = 0; i < listdata.length; i++)
		{
			listdata[i] = "YOOY"+i;
		}
		list.setListData(listdata);
	}

}
