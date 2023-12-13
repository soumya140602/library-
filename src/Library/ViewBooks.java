package Library;

import java.util.ArrayList;

public class ViewBooks implements IOOperation {

	@Override
	public void oper(Database database,User user) {
		ArrayList<Book> books=database.getAllBooks();
		System.out.println("Name\t\tAuthor\t\tPublisher\tCLA\tQty\tPrice"+"\tBrw Cps");
		for(Book b:books)
		{
			System.out.println(b.getName()+"\t\t"+b.getAuthor()+"\t\t"+b.getPublisher()+"\t\t"+b.getAddress()+"\t"+b.getQty()+"\t"+b.getPrice()+"\t"+b.getBrwcopies());
			
		}
		System.out.println();
		user.menu(database, user);
	}

}
