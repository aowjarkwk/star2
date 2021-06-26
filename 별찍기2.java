
public class 紺啄奄2 {

	public static void main(String[] args) {
		int n = 5;
//		-----
//		-----
//		-----
//		-----
//		-----
		for(int i = 1; i<=n; i++) {
			for(int j =1; j<=n; j++) {
				System.out.print("+");
			}System.out.println();
		}
		
//		+
//		++
//		+++
//		++++
//		+++++
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("+");
				System.out.print(j);
			}System.out.println();
		}
		
//		xxxxx
//		xxxx
//		xxx
//		xx
//		x
		for(int i=1; i<=n; i++) {
			for(int j =n;j>=i; j--) {
				System.out.print("+");
				System.out.print(j);
			}System.out.println();
		}
		
//		    』
//		   』』
//		  』』』
//		 』』』』
//		』』』』』
		for(int i=1; i<=n; i++) {
			for(int j=n; j>i; j--) {
				System.out.print(" ");
				System.out.print("j:"+j);
			}
			for(int h=1; h<=i; h++) {
				System.out.print("*");
				System.out.print("h:"+h);
			}
			System.out.println();
		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		for(int i=1; i<=n; i++) {
			for(int h=1; h<i; h++) {
				System.out.print(" ");
				System.out.print("h:"+h);
			}
			for(int j=n; j>=i; j--) {
				System.out.print("*");
				System.out.print("j:"+j);
			}System.out.println();
		}
		
		
//		  &
//		 &&&
//		&&&&&
		int mid=n/2+1;
		for(int i=1; i<=mid; i++) {
			for(int j=mid;j>i;j--) {
				System.out.print(" ");
				System.out.print("j:"+j);
			}
			for(int h=3;h<=i*2+1;h++) {
				System.out.print("*");
				System.out.print("h:"+h);
			}
			System.out.println();
		}
		
//		*****
//		*   *
//		*   *
//		*   *
//		*****
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=5; j++) {
				if(i==1||i==n) {
					System.out.print("*");
				}else {
					if(j==1||j==n) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}System.out.println();
		}
	}

}
