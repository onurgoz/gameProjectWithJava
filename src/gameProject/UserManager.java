package gameProject;

public class UserManager {

	CheckIfRealPerson checkIfRealPerson =new CheckIfRealPerson();
	private Logger[] logger;
	public UserManager(Logger[] logger)
	{
		this.logger=logger;
	}
	
	void add(User user)
	{
		if(checkIfRealPerson.checkNationalIdentity(user))
		{
			System.out.println("Kay�t Eklendi. "+user.getId());
			Utils.runLoggers(logger, Message.addUserMessage);
		}
		else
		{
			System.out.println("Kay�t Edilemedi.Kullan�c� do�rulama ge�ilemedi."+user.getId());
			Utils.runLoggers(logger, Message.errorAddUserMessage);
		}
	}
	void update(User user)
	{
		System.out.println("Kay�t G�ncellendi. "+user.getId());
		Utils.runLoggers(logger, Message.updateUserMessage);
	}
	void delete(User user)
	{
		
		System.out.println("Kay�t Silindi. "+user.getId());
		Utils.runLoggers(logger, Message.deleteUserMessage);
	}
}
