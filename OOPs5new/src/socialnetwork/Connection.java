package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 * @author gourav gandhi
 * this class will drive all the connection action
 *
 */
public class Connection {

	HashMap<String, List<String>> connectionMap = new HashMap<String, List<String>>();

	/**
	 * @param file taking file as a string and 
	 * putting the respected value in the connection map
	 */
	public Connection(String file) {
		String stringOutput[] = file.split("\n");
		String str[] = {};

		for (int index = 0; index < stringOutput.length; index++) {
			List<String> listOfFriends = new ArrayList<String>();
			str = stringOutput[index].split(",");

			for (int jindex = 1; jindex < str.length; jindex++) {
				listOfFriends.add(str[jindex]);
			}

			connectionMap.put(str[0], listOfFriends);
		}
	}

	/**
	 * @param friendId is the id of the user whom you want to add as a friend
	 * @param userID is the id of the user
	 * will add two way connection between 1st user and other user
	 */
	public void addConnection(String friendId, String userID) {
		// TODO Auto-generated method stub

		if (connectionMap.containsKey(userID)) {
			if (connectionMap.get(userID).contains(friendId)) {

				System.out.println("This is already your friend");

			} else {
				connectionMap.get(userID).add(friendId);

				if(connectionMap.containsKey(friendId)){
					connectionMap.get(friendId).add(userID);
				}
				else{
					List<String> list = new ArrayList<String>();
					list.add(userID);
					connectionMap.put(friendId,list);
				}
				System.out.println(friendId + " has been added as your friend");
			}
		} else {
			List<String> list = new ArrayList<String>();
			list.add(friendId);
			connectionMap.put(userID,list);
		}
	}

	/**
	 * @param deleteFriendId is the id which user want to delete from its connnection
	 * @param userID is the id of the user who wants to delete 
	 */
	public void deleteConnection(String deleteFriendId, String userID) {
		// TODO Auto-generated method stub
		if(connectionMap.get(userID).contains(deleteFriendId)){
			connectionMap.get(userID).remove(deleteFriendId);
			connectionMap.get(deleteFriendId).remove(userID);
			System.out.println(deleteFriendId + " has been deleted from your connection");
		}else{
			System.out.println("You are not friend with "+ deleteFriendId);
		}
	}

	/**
	 * @param userID
	 * to print the connection of the given user id
	 */
	public void printConnection(String userID) {

		if(connectionMap.containsKey(userID) && !connectionMap.get(userID).isEmpty()){
			System.out.println("Your Friends are ");
			System.out.println();
			List <String> userFriends= connectionMap.get(userID);
			for(String temp : userFriends){
				System.out.print(temp + " ");
			}
			
		}else{
			System.out.println("you dont have any friend right now");
		}

		System.out.println();
	}

	/**
	 * this method will print all the connection 
	 */
	public void printSocialNetwork() {
		// TODO Auto-generated method stub
		Iterator itr = connectionMap.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry pair = (Map.Entry)itr.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			
		}
	}

}
