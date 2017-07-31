package socialnetwork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * @author gourav gandhi
 *
 */
public class Record {
	String name, content, userId, recordId;
	List<Record> recordsList;
	HashMap<String, List<Record>> postOfUsers = new HashMap<String, List<Record>>();

	/**
	 * @return the id
	 */
	public String getUserId() {
		return userId;
	}

	/**
	 * @param id the id to set
	 */
	public void setUserId(String id) {
		this.userId = id;
	}

	/**
	 * @return the id
	 */
	public String getrecordId() {
		return recordId;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setrecordId(String id) {
		this.recordId = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param content
	 *            the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}

	public void createRecord(String recordId, String userId, String content,
			String name) {
		Record record = new Record();
		record.setrecordId(recordId);
		record.setUserId(userId);
		record.setContent(content);
		record.setName(name);

		if (postOfUsers.containsKey(userId)) {
			recordsList = postOfUsers.get(userId);
			boolean flag=true;
			for(Record r : recordsList){
				if(r.getrecordId().equals(recordId)){
					flag=false;
				}
			}	
			if(flag){
				postOfUsers.get(userId).add(record);
			}else{
				System.out.println("This record id already exists");
			}


		} else {
			recordsList = new ArrayList<Record>();
			recordsList.add(record);
			postOfUsers.put(userId, recordsList);
		}
	}

	/**
	 * @param userId
	 * this method will print all the records
	 */
	public void printRecords(String userId) {

		if( !postOfUsers.containsKey(userId) || postOfUsers.get(userId).isEmpty()){
			System.out.println("No records present.");

		}else {

			recordsList = postOfUsers.get(userId);
			for(Record r : recordsList) {
				System.out.println("record ID : " + r.getrecordId()
						+ " title of post : " + r.getName() + " content : "
						+ r.getContent());
			}
		}
	}

	/**
	 * @param recordId
	 * @param userId
	 * this method will delete the required record
	 */
	public void deleteRecord(String recordId,String userId) {
		
		recordsList = postOfUsers.get(userId);
		boolean flag=true;
		for(Record r : recordsList) {
			if (r.getrecordId().equals(recordId)) {
				recordsList.remove(r);
				System.out.println("Record has been deleted");
				flag=false;
				break;
			}
		}
		if(flag){
			System.out.println("Entered record id is not present ");
		}
		
		printRecords(userId);
	}
}
