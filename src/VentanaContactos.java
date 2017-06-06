import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaContactos extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaContactos frame = new VentanaContactos();
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
	public VentanaContactos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 214, 188);
		contentPane.add(scrollPane);
		
		
		DefaultListModel<String> modelo = new DefaultListModel<String>();
		modelo.addElement("Pepe");
		modelo.addElement("Pepa");
		modelo.addElement("Papo");
		
		JList<String> list = new JList<String>();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(arg0.getClickCount() == 2) {
					MiChat chat = new MiChat();
					chat.setTitle(list.getSelectedValue());
					chat.setVisible(true);
				}
			}
		});
		
		
		list.setModel(modelo);
		scrollPane.setViewportView(list);
		
		JButton botonConectar = new JButton("Conectar");
		botonConectar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				if(list.getSelectedValue() != null) {
//					MiChat chat = new MiChat();
//					chat.setTitle(list.getSelectedValue());
//					chat.setVisible(true);
//				}
				JOptionPane.showMessageDialog(null, "NOT IMPLEMENTED YET ;)");
			}
		});
		botonConectar.setBounds(10, 210, 89, 23);
		contentPane.add(botonConectar);
		
		JButton botonMc = new JButton("Multichat");
		botonMc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MiChat chat = new MiChat();
				chat.setTitle(list.getSelectedValue());
				chat.setTitle("Sala");
				chat.setVisible(true);
			}
		});
		botonMc.setBounds(135, 210, 89, 23);
		contentPane.add(botonMc);
	}
}
