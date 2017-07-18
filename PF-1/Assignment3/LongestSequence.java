/*
 * Program to find the longest increasing sequence.
 */

public class LongestSequence {
		
	public int[] longestSequence(int a[])
	{		
				int maxNow=0,start1=0,end=0,maxPre=0,start2=0,i=0,k=0;
				
				for(i=0;i<a.length-1;i++){
					
					if(a[i]<a[i+1]){
						
						maxNow++;                //counting the current sequence length      
						
					}
					else{
						if(maxNow<maxPre){
							
						    start2=i+1;
						}
						else{					//if current max is not larger then previous one
							start1=start2;
							maxPre=maxNow;
							end=i;
							start2=i+1;
						}
						
					
					maxNow=0;	
					}
				
				}
					if(maxNow<maxPre){
							
						    start2=i+1;
						}
						else{						//for boundary condition
							start1=start2;
							maxPre=maxNow;
							end=i;
							start2=i+1;
						}
				int b[]=new int[end-start1+1];
				
				for(int j=start1;j<=end;j++){
					
					b[k++]=a[j];
				
				}
		return b;
		
	}
}
