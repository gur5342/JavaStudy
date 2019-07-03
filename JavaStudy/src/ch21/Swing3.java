package ch21;

import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;

import org.json.JSONArray;
import org.json.JSONObject;

public class Swing3 {
	public static void main(String[] args) {
		try {
			URL url = new URL("https://dapi.kakao.com/v2/search/image?query=java");
			URLConnection con = url.openConnection();
			con.addRequestProperty("Authorization", "KakaoAK 0a7c5408897da72ef62213f279237f86");

			InputStream in = con.getInputStream();
			InputStreamReader isr = new InputStreamReader(in, "utf-8");
			BufferedReader reader = new BufferedReader(isr);
			String result = "";
			while (true) {
				String data = reader.readLine();
				if (data == null)
					break;
				result += data;
//				System.out.println(data);
			}
			JFrame j = new JFrame();
			// ��� ��ġ ����
			j.setLayout(new FlowLayout());
			
			MouseListener ml = new MouseListener() { // import�� ���־��  add�� �߻��ȴ�.

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					JButton btn = (JButton)e.getComponent();
					String text = btn.getText();
					
					try {
						Desktop.getDesktop().browse(new URI(text));
					} catch (IOException ee) {
						ee.printStackTrace();
					} catch (URISyntaxException ee) {
						ee.printStackTrace();
					}
					
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
					
				}
				
			};
			
			JSONObject obj = new JSONObject(result);
			JSONArray documents = obj.getJSONArray("documents");
			for (int i = 0; i < documents.length(); i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);
				JButton b1 = new JButton(image_url);
				j.add(b1);
				b1.addMouseListener(ml);
			}
			j.setSize(500, 300);
			j.setVisible(true);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
