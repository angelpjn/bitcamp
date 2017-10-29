/* 
[7-11] 문제7-10에서 작성한 MyTv2클래스에 이전 채널(previous channel)로 이동하는
기능의 메서드를 추가해서 실행결과와 같은 결과를 얻도록 하시오.
[Hint] 이전 채널의 값을 저장할 멤버변수를 정의하라.
메서드명 : gotoPrevChannel
기 능 : 현재 채널을 이전 채널로 변경한다.
반환타입 : 없음
매개변수 : 없음

[실행결과]
CH:10
CH:20
CH:10
CH:20
*/
package ch07_OOP2;

class MyTv3 {
    private boolean isPowerOn;
    private int channel;
    private int prevChannel;
    private int volume;
    
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;
    
    void setChannel(int channel) {
        this.prevChannel = this.channel;
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
    
    void goToPrevChannel() {
        setChannel(this.prevChannel);
    }
}

class no11 {
    public static void main(String args[]) {
        MyTv3 t = new MyTv3();
        t.setChannel(10);
        System.out.println("CH:" + t.getChannel());
        t.setChannel(20);
        System.out.println("CH:" + t.getChannel());
        t.goToPrevChannel();
        System.out.println("CH:" + t.getChannel());
        t.goToPrevChannel();
        System.out.println("CH:" + t.getChannel());
    }
}
