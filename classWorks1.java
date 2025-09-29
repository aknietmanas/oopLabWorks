import java.util.Scanner;

public class classWorks1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence: ");
        String sentence = input.nextLine();

        char symbol = sentence.charAt(sentence.length()-1) ;
                
        int code = (int) symbol;
        System.out.println(code);
    }
}
