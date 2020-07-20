package all;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JCheckBox;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.DropMode;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class main0 {

	private JFrame frame;
	private JTextField txtMotherFucker;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main0 window = new main0();
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
	public main0() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtMotherFucker = new JTextField();
		txtMotherFucker.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				txtMotherFucker.setText("");
			}
		});
		textField = new JTextField();
		txtMotherFucker.setFont(new Font("Letter Gothic Std", Font.BOLD, 20));
		txtMotherFucker.setForeground(Color.BLACK);
		txtMotherFucker.setText("WRITE HERE ..... ");
		txtMotherFucker.setBackground(Color.WHITE);
		txtMotherFucker.setBounds(247, 60, 695, 117);
		frame.getContentPane().add(txtMotherFucker);
		txtMotherFucker.setColumns(5);
		
		final JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//transform
				
				try {
					methods.theend(txtMotherFucker.getText());
					methods.t();
					textField.setText(methods.all);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//textField.setText(methods.all);
				methods.all ="";
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\Untitled-1.png"));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(247, 204, 99, 45);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\Untitled-11.png"));

	}
			@Override
			public void mouseExited(MouseEvent arg0) {
				btnNewButton.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\Untitled-1.png"));

			}
		});

		final JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				try {
					methods.play();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
			}
		});
		button.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\black1.png"));
		button.setBackground(Color.BLACK);
		button.setBounds(547, 204, 99, 45);
		frame.getContentPane().add(button);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				
				
				button.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\Unwwwwwwwwwtitled-1.png"));

				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				
				button.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\black1.png"));

				
			}
		});
		
		
		final JButton button_1 = new JButton("");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtMotherFucker.setText("");
				textField.setText("");
			}
		});
		button_1.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\12.png"));
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\1231.png"));
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				button_1.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\12.png"));

			}
		});
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(843, 204, 99, 45);
		frame.getContentPane().add(button_1);
		
		
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Letter Gothic Std", Font.BOLD, 20));
		textField.setColumns(5);
		textField.setBackground(Color.WHITE);
		textField.setBounds(247, 271, 695, 117);
		frame.getContentPane().add(textField);
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Mohammad\\Desktop\\Untitled-2.png"));
		label.setBounds(0, 0, 992, 568);
		frame.getContentPane().add(label);
	}
}
