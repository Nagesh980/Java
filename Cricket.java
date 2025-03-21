public class Cricket{
	public static void matchDetails(String[] dayname, String... playersName){
		for(String day: dayname){
			System.out.println("Days: " + day);
		}
		for(String player: playersName){
			System.out.println("playersName: " + player);
		}
	}
	
	public static void matchDetails(String name, int matches, int totalruns){
		System.out.println("Playername: " + name);
		System.out.println("No of Matches: " + matches);
		System.out.println("total runs: " + totalruns);
		System.out.println("Avg: " + totalruns/matches);
	}
	
	public static void matchDetails(String[] names, int[] scores, int[] noMatches){
		int[] avg = {0, 0, 0, 0};
		for(int i = 0; i < names.length; i++){
			avg[i] = scores[i]/noMatches[i];
			System.out.println("Name: "+ names[i] + "scores: " + scores[i] + "No of Matches: " + noMatches[i] + "Avg: " + avg[i]);
		}
	}
}