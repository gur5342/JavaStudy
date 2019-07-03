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
		textArea.setText("모두 지웠습니다.\n");
		textArea.append("원하는 내용을 입력하세요.\n");
	}
}
