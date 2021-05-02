package gameProject;

public class EmailLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Email Loglandý : "+ message);
		
	}

}
