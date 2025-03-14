package hw2;

public class hw2 {
//	•請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	public static void main(String[] args) {
/*		int sum=0;
		for(int i = 2 ; i<=1000 ; i=i+2 ) {
			sum = sum + i;
		}
			System.out.println(sum);
	
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int sum2=1;
		for ( int i2 = 1; i2<=10; i2++) {
			sum2 = sum2*i2;
		}
		System.out.println(sum2);
//	• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int sum3=1;
		int i3=1;
		while (i3 <= 10){
			sum3=sum3*i3;
			i3++;
		}
		System.out.println(sum3);
//	• 請設計一隻Java程式,輸出結果為以下:
//	1 4 9 16 25 36 49 64 81 100
		
		for (int i4=1; i4<=10; i4++) {
			
		System.out.print(i4*i4 + " ");
		System.out.println();
		}
		
//	• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
//	　請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		int count = 0;
		System.out.print("1-49中無'4'的數字為: " );
		for (int i5=0 ; i5<=49 ; i5++) {
			if (i5 /10 != 4 && i5 % 10 != 4 ) {
			System.out.print(i5 + " " );
			count++;
			}
		}
		System.out.println();
		System.out.println("共有" + count + "個");
*/	
/*	• 請設計一隻Java程式,輸出結果為以下:
	1 2 3 4 5 6 7 8 9 10
	1 2 3 4 5 6 7 8 9
	1 2 3 4 5 6 7 8
	1 2 3 4 5 6 7
	1 2 3 4 5 6
	1 2 3 4 5
	1 2 3 4
	1 2 3
	1 2
	1		*/		
		for (int x = 10 ; x>0  ; x--) {
			
			for (int y = 1; y <= x; y++) {
				System.out.print( y + " ");
			}
			System.out.println();
		}							 
	
/*	• 請設計一隻Java程式,輸出結果為以下:
		A
		BB
		CCC
		DDDD
		EEEEE
		FFFFFF		*/
		
		for (char letter = 'A'; letter <= 'F'; letter++) {  // 🔹 控制字母 (從 'A' 到 'F')
			
			for (int j = 0; j < (letter - 'A' + 1); j++) {  // 🔹 根據字母數值決定印出幾次
			System.out.print(letter);
		    
			}
			
		System.out.println(); // 換行
		
		}
		    

	}	
}
