package gameProject;

public class Main {

	public static void main(String[] args) {
		Logger[] logger= {new SmsLogger() ,new DatabaseLogger()};
		User onur = new User(1, "17462618612", "Onur", "Göz", "10/07/1998");
		UserManager userManager=new UserManager(logger);
		userManager.add(onur);
		Game game1=new Game(1,"oyun1",150);
		GameManager gameManager=new GameManager();
		gameManager.add(game1);
		Campaign campaign1=new Campaign(1,"kampanya 1",10);
		CampaignManager campaignManager=new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.useCampaign(game1, campaign1);
		gameManager.sell(game1, onur);
	}

}
