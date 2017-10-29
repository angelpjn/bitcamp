/* 
[6-21] Tv클래스를 주어진 로직대로 완성하시오.
완성한 후에 실행해서 주어진 실행결과와 일치하는지 확인하라.
[참고] 코드를 단순히 하기 위해서 유효성검사는 로직에서 제외했다.

[실행결과]
CH:100, VOL:0
CH:99, VOL:0
CH:100, VOL:100
*/

package ch06_OOP;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        if (isPowerOn) {
            isPowerOn = false;
        } else {
            isPowerOn = true;
        }
    }
 
    void volumeUp() {
        if (volume < MAX_VOLUME) {
            volume += 1;
        }
    }

    void volumeDown() {
        if (volume > MIN_VOLUME) {
            volume -= 1;
        }
    }

    void channelUp() {
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel += 1;
        }
    }

    void channelDown() {
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel -= 1;
        }
    }
}

public class no21 {
    public static void main(String args[]) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
    }
}