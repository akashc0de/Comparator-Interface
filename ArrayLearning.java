import java.util.Arrays;
import java.util.Comparator;

public class ArrayLearning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names= {"akash","akshya","deepika","ashwini","kavitha"};
		System.out.println("*******Before sort********");
		for(String a:names) {
			
			System.out.println(a);
		}
		
		System.out.println("**********After sort*********");
		
		Arrays.sort(names);
		
		for(String ab:names) {
			System.out.println(ab);
		}
		System.out.println("****** before comparator sort *******");
		for(String aa:names) {
			System.out.println(aa);
		}
		
		Comparator ab=new ComparatorDemo();
		
		Arrays.sort(names,ab);
		System.out.println("********after comparator sort*******");
		
		for(String aa:names) {
			System.out.println(aa);
		}
		
	}

}

