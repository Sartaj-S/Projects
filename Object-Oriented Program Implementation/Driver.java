import java.util.Scanner;
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileIO a1 = new FileIO("C:/Users/Sartaj/Desktop/JAVA36B/assignment336b/src/Salesdat.txt");
		Franchise f = a1.readData();
		Scanner in = new Scanner(System.in);
		//CALCULATE DATA~~~~~~
		f.calc();
		
		int exit=1;
		while (exit>0){
			System.out.printf("\nWhich store would you like to access? (#1-#6), any other number to exit\n");
			int i = in.nextInt();
			i--;
			if (i>=0 && i<=5){
				System.out.printf("What would you like to access? Make the selection via leading character\n");
				System.out.printf("a. Sales by week\n");
				System.out.printf("b. Average for each week\n");
				System.out.printf("c. Aggregate sales\n");
				System.out.printf("d. Average sales per week\n");
				System.out.printf("e. Highest sale week\n");
				System.out.printf("f. Lowest sale week\n");
				System.out.printf("g. All the above\n");
				System.out.printf("x. To return to store selection\n");
				char entry = in.next().charAt(0);
				if(entry != 'x')
					f.getStores(i).print(entry);
			}
			
			else
				exit=0;
			
		}
		
	}

}
