package test1;

public class BaiJi {
	public static void main(String[] args) {
		int money = 0;
		int chickenNum = 0;
		int kindNum = 0;
		for(int i = 1;i < 100;i++) {
			for(int j = 1;j < 100 ;j++) {
				for(int s = 1;s < 100 ;s++) {
					money = 5 * i + 3 * j + (s / 3);
					chickenNum = i + j + s;
					if((money == 100) && (chickenNum == 100)) {
						kindNum ++;
						System.out.println("100个铜钱可以买" + i + "只公鸡" + j + "只母鸡" + s + "只小鸡");
					}
				}
			}
		}
		System.out.println("共有" + kindNum +"种方法！");
	}
}
