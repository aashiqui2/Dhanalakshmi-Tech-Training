package bank.chennai;

public class Lowatt extends RuntimeException {

	public void allowforexam(int percentage)
	{
		if(percentage>=75)
		{
			System.out.println("permitted for exam");
		}
		else {
			try {
				throw new Lowatt();
			}
			catch(Lowatt lw)
			{
				System.out.println("low attendance");
			}
		}
	}
}
