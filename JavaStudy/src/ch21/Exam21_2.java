package ch21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Exam21_2 {
	public static void main(String[] args) {
		JFrame frm = new JFrame("��縸 ����");
		frm.setBounds(100, 100, 220, 300); // ������ ũ�� ����
		frm.setLayout(new BorderLayout()); // ���Ĺ��

		JLabel label = new JLabel();
		label.setText("TEST");
		/* ������ ���� */
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		frm.add(label, BorderLayout.NORTH);

		/* JPanel1 �߰� */
		
		JPanel panel1 = new JPanel(); // ���ʿ� ���� �г� ù ����
		panel1.setLayout(new GridLayout(3,3));
		MouseListener ml = new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				JButton btn = (JButton)arg0.getComponent(); // getcomponent�� 
				String text = btn.getText(); // ���ڸ� �˾Ƴ��� 
				label.setText(label.getText() + text);
			
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
				
			}};
		
		for(int i = 9 ; i >= 1; i--) {
			JButton btn = new JButton(i + " ");
			btn.addMouseListener(ml);
			panel1.add(btn);
		}
		/*
		panel1.add(new JButton("9"));
		panel1.add(new JButton("8"));
		panel1.add(new JButton("7"));
		panel1.add(new JButton("6"));
		panel1.add(new JButton("5"));
		panel1.add(new JButton("4"));
		panel1.add(new JButton("3"));
		panel1.add(new JButton("2"));
		panel1.add(new JButton("1"));
		*/
		frm.add(panel1, BorderLayout.CENTER);
		
		/* JPanel2 �߰� */
		JPanel panel2 = new JPanel(); // ���Ϳ� ���� �г� �ι���
		panel2.setLayout(new GridLayout(1,4));
		panel2.add(new JButton("+"));
		panel2.add(new JButton("-"));
		panel2.add(new JButton("*"));
		panel2.add(new JButton("/"));
	
		frm.add(panel2, BorderLayout.SOUTH);

		frm.setVisible(true);
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
