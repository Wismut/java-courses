public class Calculate{
	public static void main(String[] arg){
		int stepen = 1;
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int proizvedenie = first * second;
		int delenie = first / second;
		int vichitanie = first - second;
		for (int i = 0; i < second; i++)
			stepen = stepen * first;
		System.out.println("Sum " + summ);
		System.out.println("Proizvedenie " + proizvedenie);
		System.out.println("Delenie " + delenie);
		System.out.println("Raznost' " + vichitanie);
		System.out.println("Stepen " + stepen);
}
}