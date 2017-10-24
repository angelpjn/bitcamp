/*
   primitive type의 값을 wrapper 클래스를 사용하는 이유
   - 클래스에서 제공하는 다양한 메서드 이용 가능
   - 좀 더 정교하게 값을 다룰 수 있음
   - 값이나 객체의 주소를 구분하지 않고 주고 받고 싶을 때 : 문자와 숫자도 함께 넘길 수 있음
*/
package bitcamp.java100.test19;

// 사용 import 일괄 추가 : ctrl + shift + o
// 미사용 import 일괄 삭제 : ctrl + shift + o

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test19_3 {

    public static void main(String[] args) {
    	ArrayList<java.lang.String> list = new ArrayList<>();
    	HashSet<String> set = new HashSet<>();
    	HashMap<String,Object> map = new HashMap<>();
    	
    	File f;
    	FileInputStream in;
    	FileOutputStream out;
    	
    	Socket s;
    	ServerSocket ss;
    	URL urt;
    }
}


















