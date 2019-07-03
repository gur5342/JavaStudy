package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONArray;
import org.json.JSONObject;

public class Network3 {
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
			System.out.println(result);
			JSONObject obj = new JSONObject(result);
			JSONArray documents = obj.getJSONArray("documents");
			for(int i = 0 ; i < documents.length() ; i++) {
				JSONObject doc = documents.getJSONObject(i);
				String image_url = doc.getString("image_url");
				System.out.println(image_url);
			}
			
					/*
			// JSON ���ڿ��� JSON ��ü�� ����
			JSONArray arr = new JSONArray(result);
			for (int i = 0; i < arr.length(); i++) {
				JSONObject obj = arr.getJSONObject(i);
				JSONArray address = obj.getJSONArray("address");
				for (int j = 0; j < address.length(); j++) {
					String a = address.getString(j);
					System.out.println(a);
				}

				int age = obj.getInt("age");
				String name = obj.getString("name");
				System.out.println(age + " " + name);
			}
//			JSONObject 
*/
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
