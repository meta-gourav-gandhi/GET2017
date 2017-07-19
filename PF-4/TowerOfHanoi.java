import java.util.ArrayList;

/**
 * @author gourav gandhi
 * program to return the steps of tranfering of disk from source to destination
 *
 */
public class TowerOfHanoi {
	ArrayList<String> s = new ArrayList<String>();

	/**
	 * @param source the tower from which disk need to shift
	 * @param destination tower on which disk need to be shifted
	 * @param temp tower which is used to transfer from source to destination
	 * @param numOfDisk the total number disk need to be shifted
	 * @return the arrayList containing all the moves
	 */
	public ArrayList<String> towerOfHanoi(String source, String destination,
			String temp, int numOfDisk) {
		if (numOfDisk == 1) {
			s.add("Move disk " + numOfDisk + " from " + source + " to "
					+ destination);
		} else {
			towerOfHanoi(source, temp, destination, numOfDisk - 1);
			s.add("Move disk " + numOfDisk + " from " + source + " to "
					+ destination);
			towerOfHanoi(temp, destination, source, numOfDisk - 1);
		}

		return s;
	}
}
