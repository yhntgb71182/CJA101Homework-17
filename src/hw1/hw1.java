package hw1;
public class hw1 {
	
	public static void main(String[] args) {
		
//請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a1=12;
		int a2=6;
		System.out.println("和="+(a1+a2));
		System.out.println("積="+(a1-a2));
		
//• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg1=200%12;
		int egg2=200/12;
		System.out.println(egg2+"打"+egg1+"顆");

//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int sec=256559%60;
		int min=(256559/60)%60;
		int hour=(256559/60/60)%24;
		int day=256559/60/60/24;
		System.out.println(day+"天"+hour+"小時"+min+"分"+sec+"秒");
		
//• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double pi=3.1415;
		System.out.println("圓面積="+5*5*pi);
		System.out.println("圓周長"+2*pi*5);
		
/*• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
	請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google) */
		double money=1500000;
		double a= (1+0.02);
		double ttmoney=money*(Math.pow(a,10));   //公式?: Math.pow(底數,指數)
		System.out.println("共"+(int) ttmoney+"元");
		
//• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:並請用註解各別說明答案的產生原因
//5 + 5
		System.out.println(5+5);  //為整數計算,直接算5+5=10;
		
//5 + ‘5’
		System.out.println(5+'5'); //'5'屬字元轉換unicode值為53,故5+53=58;
		
//5 + “5”
		System.out.println(5+"5"); //"5"數字串(若數值前後為字串則視為字串),兩字串合併為55;
		
	}
}
	