public class CricketRunner{
	public static void main(String[] args){
		String[] days = {"Monday", "Tuesday", "Wednesday", "Thrusday"};
		String[] names = {"Virat", "ABDe", "Rajat", "Paddikal"};
		int[] totalruns = {10000, 12000, 3500, 4600};
		int[] matches = {500, 360, 250, 280};
		
		Cricket.matchDetails(days, names);
		Cricket.matchDetails(names, matches, totalruns);
		Cricket.matchDetails(names, totalruns, matches);
	}
}