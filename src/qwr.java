import java.awt.EventQueue;
import java.lang.Math;
import javax.swing.JFrame;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
public class qwr {

	public static void main(String[] argv) {
		final JFrame frame = new JFrame("JPassword Usage Demo");
		JLabel jlbPassword = new JLabel("Enter the password: ");
		JPasswordField jpwName = new JPasswordField(10);
		jpwName.setEchoChar('*');
		jpwName.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				JPasswordField input = (JPasswordField) e.getSource();
				char[] password = input.getPassword();
				if (isPasswordCorrect(password)) {
					JOptionPane.showMessageDialog(frame,
							"Correct  password.");
				} else {
					JOptionPane.showMessageDialog(frame,
							"Sorry. Try again.", "Error Message",
							JOptionPane.ERROR_MESSAGE);
				}
			}
		});}}