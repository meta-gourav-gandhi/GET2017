/*
 * program to check if program is sorted or not
 * and if sorted then in which order
 * 
 */
public class SortCheck 
{
			int check(int a[])
			{
				
				
				int flag=-1;                           
				
				for(int i=0;i<a.length-1;i++)
				{
					if((a[i]<=a[i+1]) && flag!=2 )          //for increasing only 
					{
						flag=1;					
					}
					else if((a[i]>=a[i+1]) && flag!=1 ) 	//for decreasing only
					{
						flag=2;					
					}
					else
					{										//for unsorted
						flag=0;
						break;
					}
				}
				
				if(flag == 0)
				{
					System.out.println("Not Sorted");
					return 0;
				}
				else if(flag==1)
				{
				System.out.println("Ascending");
				return 1;
				}
				else
				{
					System.out.println("Descending");
					return 2;
				}
			}

}