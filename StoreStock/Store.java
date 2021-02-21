package StoreStock;
import java.util.Scanner;

public class Store{
	static Articles[] articles = {new Articles("A1001","可口餅乾",5),
			   					  new Articles("A1002","味全鮮乳",10),
			   					  new Articles("A1003","握壽司",20),
			   					  new Articles("A1004","御便當",10),
			   					  new Articles("A1005","脆笛酥",50),
			   					  new Articles("A1006","蘋果西打",0)		  
				};
	
	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		showMenu();
		int inputOption;
		while((inputOption = input())!= 4) {
			
			switch(inputOption){
				case Action.inventory :
					inventory(articles);
					showMenu();break;
				case Action.purchase :
					purchase(articles);
					showMenu();break;
				case Action.sales :
					sales(articles);
					showMenu();break;
			}
			
		}
	}
	public static void sales(Articles[] items) {
		Articles[] articles = items;
		showItem(items);
		int count;
		System.out.printf("\n%s","輸入選項");
		
		switch(input()) {
		case 1 : 
			System.out.printf("%s","輸入出貨數量");
			if((count=input()) > items[0].getStock() ) {
				System.out.printf("%s\n","出貨數量不足");
			}
			else{
				items[0].setStock(items[0].getStock() - count);
			}break;
		case 2 :
			System.out.printf("%s","輸入出貨數量");
			if((count=input()) > items[1].getStock() ) {
				System.out.printf("%s\n","出貨數量不足");
			}
			else{
				items[1].setStock(items[1].getStock() - count);
			}break;
		case 3 :
			System.out.printf("%s","輸入出貨數量");
			if((count=input()) > items[2].getStock() ) {
				System.out.printf("%s\n","出貨數量不足");
			}
			else{
				items[2].setStock(items[2].getStock() - count);
			}break;
		case 4 :
			System.out.printf("%s","輸入出貨數量");
			if((count=input()) > items[3].getStock() ) {
				System.out.printf("%s\n","出貨數量不足");
			}
			else{
				items[3].setStock(items[3].getStock() - count);
			}break;
		case 5 :
			System.out.printf("%s","輸入出貨數量");
			if((count=input()) > items[4].getStock() ) {
				System.out.printf("%s\n","出貨數量不足");
			}
			else{
				items[4].setStock(items[4].getStock() - count);
			}break;
		case 6 :
			System.out.printf("%s","輸入出貨數量");
			if((count=input()) > items[5].getStock() ) {
				System.out.printf("%s\n","出貨數量不足");
			}
			else{
				items[5].setStock(items[5].getStock() - count);
			}break;
		}
		
		
	}
	public static void purchase(Articles[] items) {
		Articles[] articles = items;
		showItem(items);
		System.out.printf("\n%s","輸入選項");
		switch(input()) {
			case 1 : 
				System.out.printf("%s","輸入數量");
				items[0].setStock(input()+items[0].getStock());break;
			case 2 :
				System.out.printf("%s","輸入數量");
				items[1].setStock(input()+items[1].getStock());break;
			case 3 :
				System.out.printf("%s","輸入數量");
				items[2].setStock(input()+items[2].getStock());break;
			case 4 :
				System.out.printf("%s","輸入數量");
				items[3].setStock(input()+items[3].getStock());break;
			case 5 :
				System.out.printf("%s","輸入數量");
				items[4].setStock(input()+items[4].getStock());break;
			case 6 :
				System.out.printf("%s","輸入數量");
				items[5].setStock(input()+items[5].getStock());break;
		}
		
	}
	public static void inventory(Articles[] items) {
		Articles[] articles = items;
		System.out.printf("%s\t%s\t%s%n","產品編號","產品名稱","庫存量");
		for(Articles item : articles) {
			System.out.printf("%s\t%s\t%s%n",item.getID(),item.getName(),item.getStock());
		}
		
		
	}
	public static void showMenu() {
		System.out.printf("%s\t%s\t%s\t%s\n%s","(1)盤點庫存量","(2)進貨登錄系統",
							"(3)出貨管理系統","(4)離開系統","請輸入選項");
	}
	
	public static int input() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
	}
	
	public static void showItem(Articles[] items) {
		Articles[] articles = items;
		int countLine=1;
		for(Articles item : items) {
			if(countLine % 3 == 1 && countLine !=1) {
				System.out.printf("\n%s","("+countLine+")"
						  +item.getName()+"("+item.getID()+")");
			}
			else 
				System.out.printf("%s","("+countLine+")"
						  +item.getName()+"("+item.getID()+")");
			countLine++;
		}
	}
}

