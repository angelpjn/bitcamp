/* 
[7-10] MyTv2클래스의 멤버변수 isPowerOn, channel, volume을 
클래스 외부에서 접근할 수 없도록 제어자를 붙이고 
대신 이 멤버변수들의 값을 어디서나 읽고 변경할 수 있도록 getter와 setter메서드를 추가하라.

[실행결과]
CH:10
VOL:20
*/
package ch07_OOP2;

class MyTv2 {
    private boolean isPowerOn;
    private int channel;
    private int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    void setChannel(int channel) {
        this.channel = channel;
    }
    
    int getChannel() {
        return this.channel;
    }

    void setVolume(int volume) {
        this.volume = volume;
    }
    
    int getVolume() {
        return this.volume;
    }
    
}

class no10 {
    public static void main(String args[]) {
        MyTv2 t = new MyTv2();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setVolume(20);
        System.out.println("VOL:" + t.getVolume());
    }
}
