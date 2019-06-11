import java.util.Scanner;
public class FirstOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		StringBuffer str1 = new StringBuffer(str);
		System.out.println("Enter the charcter to be searched:");
		char old = sc.next().charAt(0);
		System.out.println("Enter the charcter to be replace:");
		char new_ = sc.next().charAt(0);
		boolean foundOnce = false;
		for(int i=0;i<str1.length();i++) {
			if( str1.charAt(i) == old  && !foundOnce) {
				str1.insert(i, new_);
				str1.deleteCharAt(i+1);
				foundOnce = true;
			}
		}
		if(!foundOnce) {
			System.out.println("character not found");
		}
		else 
			System.out.println(str1);
	}
}
