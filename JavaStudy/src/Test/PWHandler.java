package Test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class PWHandler implements ActionListener {
	private JTextField id;
	private JPasswordField pw;

	public PWHandler(JTextField id, JPasswordField pw) {
		this.id = id;
		this.pw = pw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		System.out.println("ID : " + id.getText());
		System.out.println("PW : " + new String(pw.getPassword()));	
	
		for(int count = 0 ; count <= 4 ; count++) { 
			 if(id.getText() != 'ai') 
			 {
				 System.out.println("아이디가 틀렸습니다."); 
				 id.setText("");
				 pw.setText(""); 
			 } 
			 if(pw.getPassword() != (int)1234) 
			 { 
				 System.out.println("비밀번호가 틀렸습니다."); 
				 id.setText(""); 
				 pw.setText(""); 
			 }
			 if(id.getText() != 'ai' && pw.getPassword() != 1234) 
			 { 
				 System.out.println("둘 다 틀렸습니다."); 
				 id.setText(""); 
				 pw.setText(""); 
			 }
		     if(count == 5) 
		     { 
		    	 System.out.println("더 이상 로그인을 할 수 없습니다.");
		    	 break;
		     } 
	}
		id.setText("");
	    pw.setText("");

	}

}
