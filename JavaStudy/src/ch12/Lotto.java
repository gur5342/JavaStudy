package ch12;

public class Lotto {
	public static void main(String[] args) {
		NetworkUtill u = new NetworkUtill();
		String data = u.get("https://www.dhlottery.co.kr/gameResult.do?method=byWin");
		// System.out.println(data);  // �뷮�� ������ ���� ���� �����Ǿ� ���
		int sidx = data.indexOf("num win"); // ���� ��ġ
		int eidx = data.indexOf("</p>", sidx); // �� ��ġ
		String lotto = data.substring(sidx, eidx);
		System.out.println(lotto);
		
		
		int pidx = lotto.indexOf("<p>");
		
		lotto = lotto.substring(pidx);
		sidx = 0; //  ������ ã�� ��ġ �ʱ�ȭ
		while(true) {
			sidx = lotto.indexOf("\">", sidx + 1);
			eidx = lotto.indexOf("<", sidx);
			if(eidx == -1) break;
			String num = lotto.substring(sidx + 2, eidx);
			System.out.println(num);
			sidx = eidx;
		}
		
		 //�ִ� �Ͱ� ���� ���� ���̸� Ȯ��
	}

}
