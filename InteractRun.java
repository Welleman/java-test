import java.util.Scanner;

public class InteractRun{
	public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try{
            Calculator calc = new Calculator();
            String exit = "no";
            
            while(!exit.equals("yes")){                
                System.out.println("Enter first: ");
                String first = reader.next();
                System.out.println("Enter second: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Summ: " + calc.getResult());
                calc.cleanResult();
                exit();
                exit = reader.next();
            }
        }finally{
            reader.close();
        }
    }
    public static void exit(){
        System.out.println("Exit yes/no?");
    }
}