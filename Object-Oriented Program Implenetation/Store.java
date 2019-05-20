public class Store {
	private float salesbyweek[][];
	private float totalweeksales[];
	private float avgweeksales[];
	private float totalsales;
	private float avgsales;
	private	int highestweek;
	private int lowestweek;
	
	Store() {
		salesbyweek = new float[5][7];
		totalweeksales = new float[5];
		avgweeksales = new float[5];
		totalsales=0;
		avgsales=0;
	}
	// getter and setters
	public float getsalesbyweek(int week, int day){
		return salesbyweek[week][day];
	}
	public float gettotalweeksales(int week){
		return totalweeksales[week];
	}
	public float getavgweeksales(int week){
		return avgweeksales[week];
	}
	public float gettotalsales(){
		return totalsales;
	}
	public float getavgsales(){
		return avgsales;
	}
	public int gethighestweek(){
		return highestweek;
	}
	public int getlowestweek(){
		return lowestweek;
	}
	public void setsaleforweekdayintersection(int week, int day, float sale) {
		salesbyweek[week][day] = sale;
	}

	public void printdata() {
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 7; j++)
			{
				System.out.print(salesbyweek[i][j] + " ");
			}
			System.out.println("");
		}
	}
	// businessmethod
	// a. totalsalesforweek
	public void totalsalesforweek (int week){
		int total=0;
		for (int i=0;i<7;i++){
			total += salesbyweek[week][i];
		}
		totalweeksales[week] = total;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// b. avgsalesforweek
	public void avgsalesforweek (int week){
		avgweeksales[week] = totalweeksales[week]/7;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// c. totalsalesforallweeks
	public void totalsalesforallweeks(){
		int total=0;
		for (int i=0;i<5;i++){
			total+=totalweeksales[i];
		}
		totalsales=total;
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
	// d. averageweeklysales
	public void averageweeklysales(){
		avgsales=totalsales/5;
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// e. weekwithhighestsaleamt
	public void weekwithhighestsaleamt(){
		float currHigh=0;
		for (int i=0;i<5;i++){
			if(currHigh < totalweeksales[i]){
				currHigh = totalweeksales[i];
				highestweek=i;
			}
		}
	}
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// f. weekwithlowestsaleamt
	public void weekwithlowestsaleamt(){
		float currLow=totalweeksales[0];
		for (int i=1;i<5;i++){
			if (currLow > totalweeksales[i]){
				currLow = totalweeksales[i];
				lowestweek=i;
			}
		}
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	// analyzeresults //call a through f
	public void analyze(){
		for(int i=0;i<5;i++){
			totalsalesforweek(i);
			avgsalesforweek(i);
		}
		totalsalesforallweeks();
		averageweeklysales();
		weekwithhighestsaleamt();
		weekwithlowestsaleamt();
	}
	// print()
	public void print(char choice){
		switch(choice){
		//Get sales for each week
		case 'a':
			System.out.printf("Sales by week:\n");
			for (int i=0;i<5;i++){
				System.out.printf("Week:%4d: %.2f \t",i+1,totalweeksales[i]);
			}
			break;
		///Get average for each week
		case 'b':
			System.out.printf("\nAverage by week:\n");
			for (int i=0;i<5;i++){
				System.out.printf("Week:%4d: %.2f \t",i+1,avgweeksales[i]);
			}
			break;
		///Get total sales
		case 'c':
			System.out.printf("\nAggregate sales: %.2f\n",totalsales);
			break;
		///Get average sales
		case 'd':
			System.out.printf("\nAverage of sales: %.2f\n",avgsales);
			break;
		///Get highest sale week
		case 'e':
			System.out.printf("\nHighest sales week: %d with %.2f\n" ,(highestweek+1),totalweeksales[highestweek]);
			break;
			
		case 'f':
			System.out.printf("\nLowest sales week: %d with %.2f\n",(lowestweek+1),totalweeksales[lowestweek]);
			break;
		case 'g':
			//a
			System.out.printf("Sales by week:\n");
			for (int i=0;i<5;i++){
				System.out.printf("Week:%4d: %.2f \t",i+1,totalweeksales[i]);
			}
			//b
			System.out.printf("\nAverage by week:\n");
			for (int i=0;i<5;i++){
				System.out.printf("Week:%4d: %.2f \t",i+1,avgweeksales[i]);
			}
			//c
			System.out.printf("\nAggregate sales: %.2f\n",totalsales);
			//d
			System.out.printf("\nAverage of sales: %.2f\n",avgsales);
			//e
			System.out.printf("\nHighest sales week: %d with %.2f\n" ,(highestweek+1),totalweeksales[highestweek]);
			//f
			System.out.printf("\nLowest sales week: %d with %.2f\n",(lowestweek+1),totalweeksales[lowestweek]);
			break;
		default:
			System.out.printf("\nImproper selection, please retry...\n");
			break;
		}
	}
}
