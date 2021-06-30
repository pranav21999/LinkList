package ds;

import java.util.Scanner;

public class MainList {
	//main method
	public static void main(String[] args) {
		LinkList linkedList=new LinkList();
		linkedList.push(56);
		linkedList.push(70);
		linkedList.push(30);
		System.out.println("LinkList:");
		linkedList.print();	
		//insert between index 2  and 3
		linkedList.addAtIndex(78,2);
		linkedList.print();
		linkedList.addAtIndex(90,3);
		linkedList.print();

	}
}


