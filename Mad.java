import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Button;

public class Mad {

	private JFrame Shakespeare_MadLibs;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mad window = new Mad();
					window.Shakespeare_MadLibs.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Shakespeare_MadLibs = new JFrame();
		Shakespeare_MadLibs.getContentPane().setBackground(new Color(102, 153, 153));
		Shakespeare_MadLibs.setBounds(200, 200, 550, 400);
		Shakespeare_MadLibs.setSize(600, 700);
		Shakespeare_MadLibs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Shakespeare_MadLibs.getContentPane().setLayout(null);
		
		JButton btnEnterAPronoun = new JButton("Enter a pronoun (I, he or she):");
		btnEnterAPronoun.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnterAPronoun.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnEnterAPronoun.setBounds(58, 104, 280, 23);
		Shakespeare_MadLibs.getContentPane().add(btnEnterAPronoun);
		
		JButton btnEnterANoun = new JButton("Enter a noun (person, place or thing):");
		btnEnterANoun.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnterANoun.setBounds(58, 138, 280, 23);
		Shakespeare_MadLibs.getContentPane().add(btnEnterANoun);
		
		JButton btnEnterAn = new JButton("Enter a verb (action or state):");
		btnEnterAn.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnterAn.setBounds(58, 172, 280, 23);
		Shakespeare_MadLibs.getContentPane().add(btnEnterAn);
		
		JButton btnEnterAnAdjective = new JButton("Enter an adjective (describes a noun):");
		btnEnterAnAdjective.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnterAnAdjective.setBounds(58, 206, 280, 23);
		Shakespeare_MadLibs.getContentPane().add(btnEnterAnAdjective);
		
		textField_1 = new JTextField();
		textField_1.setBounds(361, 106, 159, 20);
		Shakespeare_MadLibs.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(361, 140, 159, 20);
		Shakespeare_MadLibs.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(361, 174, 159, 20);
		Shakespeare_MadLibs.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(361, 208, 159, 20);
		Shakespeare_MadLibs.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnShakespeareMadlib = new JButton("Shakespeare MadLib");
		btnShakespeareMadlib.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnShakespeareMadlib.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnShakespeareMadlib.setBackground(new Color(245, 245, 220));
		btnShakespeareMadlib.setBounds(190, 24, 209, 50);
		Shakespeare_MadLibs.getContentPane().add(btnShakespeareMadlib);
		
		JButton btnClickToSee = new JButton("Click to see your MadLib");
		btnClickToSee.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnClickToSee.setBounds(199, 260, 186, 29);
		Shakespeare_MadLibs.getContentPane().add(btnClickToSee);
		
		textField = new JTextField();
		textField.setBackground(new Color(245, 245, 220));
		textField.setBounds(116, 306, 361, 244);
		Shakespeare_MadLibs.getContentPane().add(textField);
		textField.setColumns(10);
		
		Button button = new Button("Click to play again");
		button.setFont(new Font("Dialog", Font.PLAIN, 12));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(245, 567, 100, 22);
		Shakespeare_MadLibs.getContentPane().add(button);
	}
}
