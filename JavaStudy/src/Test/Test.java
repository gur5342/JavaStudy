package Test;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Test {
	public static void main(String[] args) {
		JFrame frm = new JFrame("JLabel & JTextField");
		frm.setBounds(120, 120, 180, 80);
		frm.setLayout(new GridLayout(3, 2));

		JLabel idLabel = new JLabel("ID : ", SwingConstants.CENTER);
		JTextField idText = new JTextField(10);
		JLabel pwLabel = new JLabel("Password : ", SwingConstants.CENTER);
		JPasswordField pwText = new JPasswordField(10);
		pwText.setEchoChar('*');
		
		frm.add(idLabel);
		frm.add(idText);
		frm.add(pwLabel);
		frm.add(pwText);

		JButton btn = new JButton("·Î±×ÀÎ");
		btn.addActionListener(new PWHandler(idText, pwText));
		frm.add(btn);

		frm.setVisible(true);

		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
