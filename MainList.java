package ds;

import java.util.Scanner;

public class MainList {
	//main method
	public static void main(String[] args) {
		LinkList linkedList=new LinkList();
		/*linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);
		System.out.println("LinkList:");
		linkedList.print();	
		linkedList.popLast();
		linkedList.print();
		int searched=linkedList.search(30);
		System.out.println(searched);
		


	}	
}		
	*/
			
		Scanner sc=new Scanner(System.in);
		while(true) {	
			System.out.println("Enter your choice");
			System.out.println("1)Insert at lastPosition(append)");
			System.out.println("2)Insert at first(push)");
			System.out.println("3)insert at particular index");
			System.out.println("4)Delete at last");
			System.out.println("5)Delete at first");
			System.out.println("6)print list");
			System.out.println("7)search element");
			System.out.println("8)Insert after");
			System.out.println("9)Delete at particular position");
			System.out.println("10)sort LinkList");
			System.out.println("11)exit");
			int choice =sc.nextInt();
		
			switch(choice) {
			case 1:
				System.out.println("enter data to insert(append)");
				int append=sc.nextInt();
				linkedList.insert(append);
				linkedList.print();
				break;
			case 2:
				System.out.println("enter data to insert(push)");
				int insertlast=sc.nextInt();
				linkedList.push(insertlast);
				linkedList.print();
				break;
				
			case 3:
				System.out.println("enter data to insert");
				int insertBetween=sc.nextInt();
				System.out.println("enter the index after which you have to enter data");
				int position=sc.nextInt();
				linkedList.addAtIndex(insertBetween, position);
				linkedList.print();
				break;
			
			case 4:
				System.out.println(" Removing the last element of list");
				linkedList.popLast();
				linkedList.print();
				break;
			
			case 5:
				System.out.println("Removing the first element of list");
				linkedList.pop();
				linkedList.print();
				break;
				
			case 6:
				linkedList.print();
				break;
		
			case 7:
				System.out.println("Enter the element  you want to search");
				int a=sc.nextInt();
				int searched=linkedList.search(a);
				System.out.println(searched);	
				break;
				
			case 8:
				System.out.println("enter element to insert");
				int insertAfter=sc.nextInt();
				System.out.println("enter the index after which you have to enter data");
				int position1=sc.nextInt();
				linkedList.addAtIndex(insertAfter, position1);
				linkedList.print();
				break;
			
			case 9:
				System.out.println("enter the index in which you have to delete element");
				int deletePosition=sc.nextInt();
				linkedList.popAtIndex(deletePosition);
				linkedList.print();
				break;
			
			case 10:
				linkedList.sort();
				linkedList.print();
				break;
			case 11:
				System.exit(0);
		
			default:
				System.out.println("Invalid choice");
				break;
			}
			
			}
			
	
	}		


}
