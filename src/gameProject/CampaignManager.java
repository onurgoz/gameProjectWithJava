package gameProject;

public class CampaignManager {

	public void add(Campaign campaign) {
System.out.println("Kampanya eklendi"+campaign.getCampaignName());
	}

	public void update(Campaign campaign) {
		System.out.println("Kampanya güncellendi"+campaign.getCampaignName());
	}

	public void delete(Campaign campaign) {
		
		System.out.println("Kampanya silindi"+campaign.getCampaignName());
	}
	public void useCampaign(Game game,Campaign campaign) {
		game.setPrice(game.getPrice()-(game.getPrice()*campaign.getCampaignRate()/100));
	}
}
