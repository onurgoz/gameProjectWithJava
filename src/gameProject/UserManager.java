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
			System.out.println("Kayýt Eklendi. "+user.getId());
			Utils.runLoggers(logger, Message.addUserMessage);
		}
		else
		{
			System.out.println("Kayýt Edilemedi.Kullanýcý doðrulama geçilemedi."+user.getId());
			Utils.runLoggers(logger, Message.errorAddUserMessage);
		}
	}
	void update(User user)
	{
		System.out.println("Kayýt Güncellendi. "+user.getId());
		Utils.runLoggers(logger, Message.updateUserMessage);
	}
	void delete(User user)
	{
		
		System.out.println("Kayýt Silindi. "+user.getId());
		Utils.runLoggers(logger, Message.deleteUserMessage);
	}
}
