/*
 * program for First Come First Serve
 * 
 */
public class Fcfs {
 public int[][] FCFS( int arrival_time[], int job_size[] )
 {
     int[][] output=new int[arrival_time.length][job_size.length];
     
     for(int i=0;i<job_size.length;i++)
     {
         	int j=0;
         
            output[i][j]=arrival_time[i];
            
            if(i==0)
                output[i][j+2]=1;
            else
            {   
            	if(output[i][j]>output[i-1][j+3]+1)
                {
                    output[i][j+2]=output[i][j];
                }
                else{
                    output[i][j+2]=output[i-1][j+3]+1;
                }
            }
            
            if(output[i][j+2]-output[i][j]>=0)
            {
                output[i][j+1]=output[i][j+2]-output[i][j];
            }
            else
            {
                output[i][j+1]=0;
            }  
            output[i][j+3]=output[i][j+2]+job_size[i]-1;
         
     }
     return output;
 }
  
}
