package exceptionhandling;

public class CustomException2 {

	public static void main(String[] args) throws AgeException {
		// TODO Auto-generated method stub
		int age=12;
		if(age>=18)
		{
			System.out.println("eligible to vote");
		}
		else {
			throw new AgeException("Age under 18");
		}
			}
	}


