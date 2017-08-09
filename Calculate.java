public class Calculate{
	public static void main(String[] args){
		System.out.println("Calculate");
		
		int first = Integer.valueOf(args[0]);
		int second = Integer.valueOf(args[2]);
		
		int result;
		
		switch (args[1]){
			// +
            case "\u002B":
                System.out.println("Summ: " + (first + second));
                break;
			// -
            case "\u002D":
                System.out.println("Raznost: " + (first - second));
                break;
			// *
			case "p":
                System.out.println("Proizvedenie: " + (first * second));
                break;
            // /
			case "d":
                System.out.println("Delenie: " + (float)(first / second));
                break;
        }
	}
}