package Library;

import java.util.Scanner;

public class AddBook implements IOOperation {
	
	@Override
	public void oper(Database database,User user){
		Scanner s=new Scanner(System.in);
		Book book=new Book();
		System.out.println("Enter Book Name:");
		String name=s.next();
		if(database.getBook(name)>-1)
		{
			System.out.println("There is a book with this name");
			user.menu(database, user);
		}
		else {
		book.setName(name);}
		System.out.println("Enter Book Author:");
		book.setAuthor(s.next());
		System.out.println("Enter Book Publisher:");
		book.setPublisher(s.next());
		System.out.println("Enter book collection address:");
		book.setAddress(s.next());
		System.out.println("Enter qty:");
		book.setQty(s.nextInt());
		System.out.println("Enter Price:");
		book.setPrice(s.nextInt());
		System.out.println("Enter Borrowing Copies:");
		book.setBrwcopies(s.nextInt());
		database.AddBook(book);
		user.menu(database,user);
		s.close();
		
	}

	
}
