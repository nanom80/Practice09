package com.javaex.ex02;

import java.util.Scanner;
import java.util.ArrayList;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		
		ArrayList<Friend> friendList = new ArrayList<>();
		
		System.out.println("친구를 3명 등록해주세요");
		
		for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");

            if (tokens.length != 3) {
                System.out.println("입력 형식이 잘못되었습니다. 다시 입력해주세요.");
                i--; // 다시 입력받도록 인덱스를 감소
                continue;
            }

            String name = tokens[0];
            String hp = tokens[1];
            String school = tokens[2];

            Friend friend = new Friend(name, hp, school);
            friendList.add(friend);
        }

        sc.close();
        
        for (Friend f : friendList) {
            System.out.println("이름:" + f.getName() + "\t핸드폰:" + f.getHp() + "\t학교:" + f.getSchool());
        }
    }

}
