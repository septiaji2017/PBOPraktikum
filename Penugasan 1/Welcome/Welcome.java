public class Welcome
{
	public static void main(String[] args)
	{
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting); //print isi string greeting
		for (int i = 0; i < greeting.length(); i++)
			System.out.print("="); //memberi karakter "=" sepanjang string greeting
		System.out.println();
	}
}