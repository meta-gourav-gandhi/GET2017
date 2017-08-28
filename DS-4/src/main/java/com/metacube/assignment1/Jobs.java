package main.java.com.metacube.assignment1;

@SuppressWarnings("rawtypes")
public class Jobs implements Comparable {

	private String designation;
	private int priority;
	private String message;
	int sequencenum;
	static int counter = 0;

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation
	 *            the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority
	 *            the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
		setSequencenum(counter);
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param messsage
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public int compareTo(Object arg0) {
		int priority1 = this.priority;
		int answer = 0;
		Jobs t = (Jobs) arg0;
		int priority2 = t.priority;
		if (priority1 != priority2) {
			if (priority1 > priority2) {
				answer = 1;
			} else if (priority1 < priority2) {
				answer = -1;
			}
		}else{
			if(this.sequencenum<t.sequencenum){
				answer=1;
			}else{
				answer=-1;
			}
		}
		return answer;
	}

	/**
	 * @return the sequencenum
	 */
	public int getSequencenum() {
		return sequencenum;
	}

	/**
	 * @param sequencenum
	 *            the sequencenum to set
	 */
	public void setSequencenum(int sequencenum) {
		this.sequencenum = sequencenum;
		counter++;
	}

}
