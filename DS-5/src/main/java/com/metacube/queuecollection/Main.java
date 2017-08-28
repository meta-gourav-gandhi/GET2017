package main.java.com.metacube.queuecollection;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;


public class Main {

	public static <E> void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		QueueImp<E> queueObj = new QueueImp<E>();
		do{
			System.out.println("1) Enqueue");
			System.out.println("2) Dequeue");
			System.out.println("3) Peek");
			System.out.println("4) Print");
			
			int input =scan.nextInt();
			
			switch(input){
			case 1:
				System.out.println("Enter element");
				@SuppressWarnings("unchecked")
				E element= (E)scan.next();
				queueObj.enqueue(element);
				break;
			case 2:
				try{
				System.out.println("Dequeue element is : " + queueObj.dequeue());
				}catch(NullPointerException e){
					System.out.println("Queue is empty");
				}
				break;
			case 3:
				try{
					System.out.println("Top element is : " + queueObj.peek());
					}catch(NullPointerException e){
						System.out.println("Queue is empty");
					}
				break;
			}
				
			
			
		}while(true);
	}

}
