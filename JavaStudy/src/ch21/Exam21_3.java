package ch21;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Exam21_3 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("모양만 채팅창");
		frame.setLayout(new FlowLayout());
		JTextArea area = new JTextArea(10, 20); // 행*열 10*20
		area.setEditable(false); // 수정 불가
		area.setFocusable(false); // 포커싱 불가
		frame.add(area);

		/* JPanel 생성 */
		JPanel panel = new JPanel();

		/* JTextField 생성 */
		JTextField jf = new JTextField(10);
		panel.add(jf);

		/* JButton 생성 */
		
		/* JTextField 및 JButton을 JPanel에 추가 */

		JButton btn = new JButton("전송");
		btn.addMouseListener(new MouseListener() {

			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				String input = jf.getText();
				area.setText(input);
				jf.setText("");
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
				
			}});
		
		panel.add(btn, BorderLayout.EAST);
		frame.add(panel);
		frame.setSize(300, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		/* JButton 클릭 시 입력된 글자를 JTextArea로 출력 */
	}
}
