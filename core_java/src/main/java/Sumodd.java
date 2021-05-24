
public class Sumodd {

	public static void main(String[] args) {
		int n=100,sum=0;
		System.out.println("odd numbers from 1 to 100 ");
		for(int i=1;i<=n;i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
				sum=sum+i;
				
				
			}
			
		}
		System.out.println(" ");
		System.out.println("sum of odd number= "+sum);

	}

}
