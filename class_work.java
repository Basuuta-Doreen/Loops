package projet;
import java.util.Scanner;
public class class_work {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("science marks:");
		int science = scan.nextInt();
		System.out.println("english marks");
		int english = scan.nextInt();
		System.out.println("math marks");
		int math = scan.nextInt();
		System.out.println("socialstudies marks");
		int socialstudies =scan.nextInt();
		int average=(science+english+math+socialstudies)/4;
		System.out.println("Average:"+average);
		if(average>=80){
			System.out.println("GRADE:A");	
		}else if(average>=60 && average<=79) {
			System.out.println("GRADE:B");
		}else if(average<=60 && average>=40) {
			System.out.println("GRADE:C");
		}else {
			System.out.println("GRADE:D");
		}
		

	}

}
