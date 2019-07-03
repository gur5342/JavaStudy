package ch21;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class ButtonTextHandler implements ActionListener {
	private JTextArea textArea;

	public ButtonTextHandler(JTextArea textArea) {
		this.textArea = textArea;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		textArea.setText("��� �������ϴ�.\n");
		textArea.append("���ϴ� ������ �Է��ϼ���.\n");
	}
}
