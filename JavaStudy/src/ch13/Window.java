package ch13;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Window {  // 금요일 시험 자료
	public static void main(String[] args) {
		JFrame j = new JFrame();
		
		JButton btn = new JButton("버튼");
		
		MyMouseListener ml = new MyMouseListener();
		btn.addMouseListener(ml); // 버튼 동작 정의
		
		btn.addMouseListener(new MouseListener( ) {

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}}); // 익명 클래스를 사용한 경우
		
		j.add(btn);
		
		j.setSize(200, 200);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("안녕하세요");
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
