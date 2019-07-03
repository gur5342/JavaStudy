package ch21;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing1 {
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		// 요소 배치 설정
		j.setLayout(new FlowLayout());
		
		JButton b1 = new JButton("버튼1");
		JButton b2 = new JButton();
		b2.setText("버튼2");
		
		j.add(b1); 
		j.add(b2);
		
		// 크기 지정(w, h)
		j.setSize(200, 100);
		
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 숨길 때 사용, 'x' 버튼을 누르면 실행이 꺼지는 역할
		
		// 보이기
		j.setVisible(true);
	}

}
