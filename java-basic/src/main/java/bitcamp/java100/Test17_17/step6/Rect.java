
package bitcamp.java100.test17.Test17_17.step6;

public class Rect {
	int width;
	int height;
	
	float area() { // static이 붙지 않으면 인스턴스 메서드 : 해당 인스턴스의 변수만 다루는 전용 메서드.
				   // 파라미터 대신 내장 변수 this 사용. 호출 시 메서드 앞에 레퍼런스 지정.
		return (this.width * this.height) / 10000f; 
	}
	
	float pyeong() {
		return (this.width * this.height) / 10000f / 3.3f;
	}
}

