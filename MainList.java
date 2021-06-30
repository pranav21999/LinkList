package ds;

public class MainList {
	//main method
	public static void main(String[] args) {	
		LinkList linkedList=new LinkList();
		linkedList.push(56);
		linkedList.push(70);
		linkedList.push(30);
		System.out.println("LinkList:");
		linkedList.print();	
	}

}
