/*
 * we present the result in increasing order always  
 */

public class CombineArrays {

	int[] join(int a[], int asize, int b[], int bsize) {

		int[] answer = new int[asize + bsize];
		int i = 0, j = 0, k = 0;

		boolean aIsInc = true;
		if (a[0] > a[1]) {
			aIsInc = false;
		}

		boolean bIsInc = true;
		if (b[0] > b[1]) {
			bIsInc = false;
		}

		// joining two sorted array into one

		while (i < a.length && j < b.length) {

			if (((a[i] < b[j]) && aIsInc && bIsInc)
					|| ((a[i] > b[j]) && !aIsInc && !bIsInc)) {
				answer[k] = a[i];
				i++;
			} else {
				answer[k] = b[j];
				j++;
			}
			k++;
		}

		while (i < a.length) {
			answer[k] = a[i];
			i++;
			k++;
		}

		while (j < b.length) {
			answer[k] = b[j];
			j++;
			k++;
		}

		return answer;

	}

}
