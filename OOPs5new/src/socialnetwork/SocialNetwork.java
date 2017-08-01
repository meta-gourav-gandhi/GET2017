package socialnetwork;

import java.util.*;

/**
 * @author gourav gandhi
 * This is the main driving class which will drive the 
 * social network
 */
public class SocialNetwork {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		Record record = new Record();
		FileHandling obj = new FileHandling();
		String file = obj.read("Users.csv");
		Graph node = new Graph(file);
		file = obj.read("Connections.csv");
		Connection con = new Connection(file);
		do {
			System.out.println("1. Login");
			System.out.println("2. SignUp");
			System.out.println("3. Social network");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int input = scan.nextInt();
			String name = "", userId = "";
			boolean flag = true;
			switch (input) {
			case 1:
				System.out.println("enter your userID ");
				userId = scan.next();
				while (!node.checkNode(userId)) {
					System.out.println("enter a valid userID ");
					userId = scan.next();
				}
				System.out.println(" Hello " + node.printName(userId)+ " , Welcome to social network");
				do {
					System.out.println("1. Edit profile");
					System.out.println("2. Delete profile");
					System.out.println("3. Show Profile");
					System.out.println("4. Add Record");
					System.out.println("5. Delete Record");
					System.out.println("6. Print Record");
					System.out.println("7. Add connection");
					System.out.println("8. Delete connection");
					System.out.println("9. Print Connection");
					System.out.println("10. Back");
					input = scan.nextInt();
					switch (input) {
					case 1:
						System.out.println("Edit your name");
						name = scan.next();
						node.editNode(userId, name);
						break;
					case 2:
						node.deleteNode(userId);
						System.out.println("Your profile has been deleted from the network");
						flag = false;
						break;
					case 3:
						node.showProfile(userId);
						System.out.println(" Your Records are");
						record.printRecords(userId);
						System.out.println();
						con.printConnection(userId);
						break;
					case 4:
						System.out.println("Add id of your record");
						String recordId = scan.next();
						System.out.println("Add title of your record");
						name = scan.next();
						System.out.println("Add content of record");
						String content = scan.next();
						record.createRecord(recordId, userId, content, name);
						break;
					case 5:
						record.printRecords(userId);
						System.out.println("Enter id of record you want to delete");
						recordId = scan.next();
						record.deleteRecord(recordId, userId);
						break;
					case 6:
						record.printRecords(userId);
						break;
					case 7:
						System.out.println("Enter id of the connection you want to add as a friend");
						String friendId = scan.next();
						if (node.checkNode(friendId)) {
							con.addConnection(friendId, userId);
						} else {
							System.out
									.println("Entered id is not on social network");
						}
						break;
					case 8:
						System.out
								.println("Enter id of the connection you want to delete : ");
						String deleteFriendId = scan.next();
						con.deleteConnection(deleteFriendId, userId);
						break;
					case 9:
						con.printConnection(userId);
						break;
					case 10:
						flag = false;
						break;
					}
				} while (flag);
				break;
			case 2:
				System.out.println("1. Signup as User");
				System.out.println("2. SignUp as Organization");
				input = scan.nextInt();
				switch (input) {
				case 1:
					System.out.println("enter your name ");
					name = scan.next();
					System.out.println("enter a userID ");
					userId = scan.next();
					node.createNode(new User(), name, userId);
					break;
				case 2:
					System.out.println("enter name of organization ");
					name = scan.next();
					System.out.println("enter a userID ");
					userId = scan.next();
					node.createNode(new Organization(), name, userId);
					break;
				}
				break;
			case 3:
				con.printSocialNetwork();
				break;
			case 4:
				System.exit(0);
			}
		} while (true);
	}
}
