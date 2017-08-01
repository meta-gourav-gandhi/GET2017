package socialnetwork;

import java.util.HashMap;

/**
 * @author gourav gandhi
 * this class is holding all the entity
 *
 */
public class Graph implements Node {

	HashMap<String, Entity> listOfUsers = new HashMap<String, Entity>();

	/**
	 * @param file contais the string of all the data 
	 * and divides them in the respected fields
	 */
	public Graph(String file) {
		String stringOutput[] = file.split("\n");
		Entity entity;
		String str[] = {};
		for (int index = 0; index < stringOutput.length; index++) {
			str = stringOutput[index].split(",");
			if (str[2].equals("user")) {
				entity = new User();
				entity.setType(str[2]);
			} else {
				entity = new Organization();
				entity.setType(str[2]);
			}
			entity.setId(str[0]);
			entity.setName(str[1]);
			listOfUsers.put(str[0], entity);
		}
	}

	/** 
	 * @param obj in the object of type user
	 * @param name is the name of the user
	 * @param id is the id of the user
	 * this method will create a node for the user 
	 */
	public void createNode(User obj, String name, String id) {
		obj.setType("user");
		obj.setName(name);
		obj.setId(id);
		addNode(obj);
	}

	/** 
	 * @param obj in the object of type organization
	 * @param name is the name of the organization
	 * @param id is the id of the organization
	 * this method will create a node for the organization
	 */
	public void createNode(Organization obj, String name, String id) {
		obj.setType("organization");
		obj.setName(name);
		obj.setId(id);
		addNode(obj);
	}

	/**
	 * @param obj take the object of type entity to store it in 
	 * to the hashmap
	 */
	public void addNode(Entity obj) {
		listOfUsers.put(obj.getId(), obj);
	}

	/**
	 * @param id is of type string
	 * this method checks is the given id already present in the 
	 * the hash map of the user
	 */
	public boolean checkNode(String id) {
		if (listOfUsers.containsKey(id)) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * this method chage the name of the user 
	 * of the given id
	 */
	public void editNode(String id, String name) {
		listOfUsers.get(id).setName(name);
	}
	/**
	 * this method will delete the user from the
	 * hash map of the user
	 */
	public void deleteNode(String userid) {
		listOfUsers.remove(userid);
	}

	public String printName(String id) {
		return listOfUsers.get(id).getName();
	}
	/**
	 * @param userID
	 * method will print he user details 
	 */
	public void showProfile(String userID) {
		// TODO Auto-generated method stub
		System.out.println(" User Id :- " + userID);
		System.out.println(" Name    :- "
				+ listOfUsers.get(userID).getName());
	}

}
