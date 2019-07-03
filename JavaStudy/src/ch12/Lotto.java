package ch12;

public class Lotto {
	public static void main(String[] args) {
		NetworkUtill u = new NetworkUtill();
		String data = u.get("https://www.dhlottery.co.kr/gameResult.do?method=byWin");
		// System.out.println(data);  // 대량의 정보가 나와 위가 삭제되어 출력
		int sidx = data.indexOf("num win"); // 시작 위치
		int eidx = data.indexOf("</p>", sidx); // 끝 위치
		String lotto = data.substring(sidx, eidx);
		System.out.println(lotto);
		
		
		int pidx = lotto.indexOf("<p>");
		
		lotto = lotto.substring(pidx);
		sidx = 0; //  위에서 찾은 위치 초기화
		while(true) {
			sidx = lotto.indexOf("\">", sidx + 1);
			eidx = lotto.indexOf("<", sidx);
			if(eidx == -1) break;
			String num = lotto.substring(sidx + 2, eidx);
			System.out.println(num);
			sidx = eidx;
		}
		
		 //있는 것과 없는 것의 차이를 확인
	}

}
