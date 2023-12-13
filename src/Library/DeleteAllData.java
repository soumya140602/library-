package Library;

import java.util.Scanner;

public class DeleteAllData implements IOOperation{

	@Override
	public void oper(Database database,User user) {
		System.out.println("\n Are you sure you want to delete the data?\n"+"1. Continue\n 2. Main Menu");
		Scanner s=new Scanner(System.in);
		int i=s.nextInt();
		if(i==1)
		{
			database.deleteAllData();
		}
		else
		{
			user.menu(database,user);
		}
	}

}
