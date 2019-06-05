//this is java project that will try to implement various operations on an array.
package arrayOperations;
//this is imported for the input of element from user
import java.util.Scanner;
//the class that contains all the functions 
public class Begin {
	int n;
	Integer[] array;//this steps only tells that array is of type integer and it is an "ARRAY"
	void initialize() {
		array= new Integer[n];//here we initialize the array.
	}
	void addSingle() {
		int opt;
		int item;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the element");
		item=scan.nextInt();
		System.out.println("1.at start\n2.at end\n3.at some particular position");
		opt=scan.nextInt();
		if (opt==1) {
			array[0]=item;
		}
		else if(opt==2) {
			int len=array.length;
			System.out.println(len);
			array[len-1]=item;
		}
		else {
			System.out.println("enter the position");
			int position;
			position=scan.nextInt();
			array[(position)-1]=item;
		}
	}
	
	void addMultiple() {
		int start,end;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the start and the ending position");
		start=scan.nextInt();
		end=scan.nextInt();
		System.out.println("enter the elements");
		for(int i=start-1;i<end-1;i++)
			array[i]=scan.nextInt();
	}
	
	void display() {
		for(Integer element : array)
		System.out.println(element);
	}
	
	public static void main(String[] args) {
		int opt;
		Scanner scan= new Scanner(System.in);
		Begin obj= new Begin();
		do
		{
			System.out.println("********************************************************");
			System.out.println("Choose from the options given below:");
			System.out.println("1.intialize array \n2.insert element \n3.remove element "
					+ "\n4.search for an element \n5.reverse the array"
					+ " \n6.display the array \n10.exit");
			opt= scan.nextInt();
			System.out.println("********************************************************");
			switch(opt)
			{
			case 1:
				System.out.println("enter the number of elements you want to insert");
				obj.n=scan.nextInt();
				obj.initialize();
				break;
			case 2:
				System.out.println("the elements wil get overwrite by the "
						+ "\nnew elements if an elemnt is already present at that position");
				System.out.println("press \n1.to add single element"
						+ " \n2. to add multiple elemnts in one go");
				int optn;
				optn=scan.nextInt();
				if(optn==1)
				{
					obj.addSingle();
				}
				else {
					obj.addMultiple();
				}
				break;
			case 6:
				obj.display();
				break;
			case 10:
				scan.close();
				System.exit(0);
			}
		}while(true);		
	}

}
