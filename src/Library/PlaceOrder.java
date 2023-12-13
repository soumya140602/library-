package Library;

import java.util.Scanner;

public class PlaceOrder implements IOOperation {

	@Override
	public void oper(Database database,User user){
		Order order=new Order();
		System.out.println("\n enter book name:");
		Scanner s=new Scanner(System.in);
		String bookname=s.next();
		int i=database.getBook(bookname);
		if(i<=-1) {
			System.out.println("Book doesn't exist");
		}
		else
		{
			order.setBook(database.getBook(i));
			order.setUser(user);
			System.out.println("enter qty");
		}
	}

}
