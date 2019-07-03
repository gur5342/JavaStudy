package network;

import com.ggoreb.kakao_api.TranslateUtil;
import com.ggoreb.kakao_api.VisionUtil;

public class Network5 {
	public static void main(String[] args) {
		TranslateUtil tu = new TranslateUtil("0a7c5408897da72ef62213f279237f86");
		String r = tu.sendText("kr", "jp", "æ»≥Á«œººø‰");
		System.out.println();
		/*
		VisionUtil vu = new VisionUtil("0a7c5408897da72ef62213f279237f86");
		String result = vu.sendFile("c:/dev/a.jpg");		
		System.out.println(result);
		*/
	}

}
