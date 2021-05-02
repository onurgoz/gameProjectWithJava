package gameProject;

public class GameManager {
	public GameManager() {

	}
	public void add(Game game) {
		System.out.println("Oyun eklendi "+game.getName()+"\n Fiyatý :"+game.getPrice());
			}

			public void update(Game game) {
				System.out.println("Oyun güncellendi "+game.getName());
			}

			public void delete(Game game) {
				
				System.out.println("Oyun silindi "+game.getName());
			}
	public void sell(Game game, User user) {
		
		System.out.println(game.getName()+" game has been assigned to "+user.getId()+"\n"+game.getPrice());
	}
}
