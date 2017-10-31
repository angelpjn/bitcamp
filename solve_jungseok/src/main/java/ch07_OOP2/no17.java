/* 
[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이
클래스를 상속받도록 코드를 변경하시오.
*/

package ch07_OOP2;

class Unit {
    int x, y;
    
    void move(int x, int y) {
        
    }
    
    void stop() {
        
    }
    
}

class Marine extends Unit { // 보병

    void stimPack() {
        
    }
}

class Tank extends Unit { // 탱크

    void stop() {
        
    }
        
    void changeMode() {
    }
}

class Dropship extends Unit { // 수송선

    void load() {
        
    }

    void unload() {
        
    }
}
