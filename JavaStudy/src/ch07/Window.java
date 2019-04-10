package ch07;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Window {
	public static void main(String[] args) { // 금요일 평가 때 사용
		
		JFrame frame = new JFrame("윈도우");
		
		JButton button = new JButton();
		button.setText("나는 버튼");
		button.setBackground(Color.RED);
		frame.add(button);

		frame.setSize(200, 200);
		frame.setResizable(false); // 크기 변경 못하게 한다.
		
		frame.setBounds(200, 200, 200, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);
	}
}
