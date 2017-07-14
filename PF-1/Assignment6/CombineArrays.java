/*
 * we present the result in increasing order always  
 */

public class CombineArrays 
{

	int[] join (int a[],int asize,int b[],int bsize)
	{
	
		int[] answer = new int[asize + bsize];
	    int i = 0, j = 0, k = 0;
	    
	    //to check if arrays are increasingly sorted or decreasingly sorted and sort them increasingly
	    
	    if(a[0]>=a[1]){
	    	for(int q=0;q<a.length/2;q++){
	    		int temp=a[q];
	    		a[q]=a[a.length-q-1];
	    		a[a.length-q-1]=temp;
	    	}
	    }
	    
	    if(b[0]>=b[1]){
	    	for(int q=0;q<a.length/2;q++){
	    		int temp=b[q];
	    		b[q]=b[b.length-q-1];
	    		b[b.length-q-1]=temp;
	    	}
	    }
	    
	    
	    
	    
	    //joining two sorted array into one	    
	    while (i < a.length && j < b.length){
	        if (a[i] < b[j]){
	            answer[k] = a[i];
	            i++;
	        }
	        else{
	            answer[k] = b[j];
	            j++;
	        }
	        k++;
	    }

	    while (i < a.length){
	        answer[k] = a[i];
	        i++;
	        k++;
	    }

	    while (j < b.length){
	        answer[k] = b[j];
	        j++;
	        k++;
	    }

	    return answer;
		
		
		
		
	}
	
}
