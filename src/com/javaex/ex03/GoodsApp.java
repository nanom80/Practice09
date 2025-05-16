package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	ArrayList<Goods> goodsList = new ArrayList<Goods>();
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	while(true) {
    		String line = sc.nextLine();
    		
    		if(line.equalsIgnoreCase("q")) {
    			System.out.println("[입력완료]");
    			break;
    		}
    		
    		String[] parts = line.split(",");
    		if(parts.length != 3) {
    			System.out.println("입력 형식이 잘못되었습니다");
    			continue;
    		}
    		
    		String name = parts[0].trim();
    		int price;
    		int count;
    		
    		try {
    			price = Integer.parseInt(parts[1].trim());
    			count = Integer.parseInt(parts[2].trim());
    		} catch (NumberFormatException e) {
    			System.out.println("가격과 개수는 숫자여야 합니다");
    			continue;
    		}
    		
    		Goods goods = new Goods(name, price, count);
    		goodsList.add(goods);
    	}
    	
    	System.out.println("===============================");
    	
    	int totalCount = 0;
    	for(Goods g : goodsList) {
    		System.out.println(g.getName() + "(가격:" + g.getPrice() + "원)이" + g.getCount() + " 개 입고 되었습니다.");
    		totalCount += g.getCount();
    	}
    	
    	System.out.println("모든 상품의 갯수는 " + totalCount + "개입니다.");
    	
    	
    	sc.close();
    	
    }

}
