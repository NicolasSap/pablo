import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;

public class Testito extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private int click = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Testito frame = new Testito();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Testito() {
		setTitle("Mi Ventanita");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnHola = new JButton("Click Here");
		btnHola.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				click++;
				textField.setText(String.valueOf(click));
			}
		});
		btnHola.setBounds(167, 57, 101, 20);
		contentPane.add(btnHola);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setBounds(167, 88, 101, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.setText(String.valueOf(0));
		setLocationRelativeTo(null);
	}
}
