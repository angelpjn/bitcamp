
package bitcamp.java100.test17.Test17_17;

public class Test {
	public static void main(String[] args) {
		int width = 390; // 단위 : cm
		int height = 420;
		
		float area = (width * height) / 10000f;
		
		System.out.println(area);
		
		float pyeong = area / 3.3f;
		System.out.println(pyeong);
	}
}

