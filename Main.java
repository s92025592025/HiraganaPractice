import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
class Main{
	static final String ROME[]={"a", "i", "u", "e", "o", 
								"ka", "ki", "ku", "ke", "ko",
								"sa", "shi", "su", "se", "so",
								"ta", "chi", "tsu", "te", "to",
								"na", "ni", "nu", "ne", "no",
								"ha", "hi", "fu", "he", "ho"};
	static final String HIRIGANA[]={"あ", "い", "う", "え", "お",
									"か", "き", "く", "け", "こ",
									"さ", "し", "す", "せ", "そ",
									"た", "ち", "つ", "て", "と",
									"な", "に", "ぬ", "ね", "の",
									"は", "ひ", "ふ", "へ", "ほ"};

	public static void main(String[] args) throws Exception{
		PrintStream ps=new PrintStream(System.out, true, "Shift-JIS");
		System.setOut(ps);
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose game mode: 1 for Hiragana test and 2 for the romenized test!!");
		int mode=sc.nextInt();
		if(mode==1){
			HiraganaGame(ps);
		}else if(mode==2){
			RomeGame();
		}
	}

	public static void HiraganaGame(PrintStream ps) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.setOut(ps);
		for(int i=1;; i++){
			int rand=(int)Math.round(Math.random()*29);
			System.out.println("The "+i+"th problem: "+ROME[rand]);
			System.out.println("Enter any number to see answer, 0 to exit");
			if(sc.nextInt()==0){
				break;
			}else{
				System.out.println("The Hiragana is: "+HIRIGANA[rand]+"\nEnter any number to proceed and 0 to exit.");
				if(sc.nextInt()==0){break;}
			}
		}
	}

	public static void RomeGame() throws Exception{
		Scanner sc=new Scanner(System.in);
		for(int i=1;; i++){
			int rand=(int)Math.round(Math.random()*29);
			System.out.println("The "+i+"th problem: "+HIRIGANA[rand]);
			System.out.println("Enter any number to see answer, 0 to exit");
			if(sc.nextInt()==0){
				break;
			}else{
				System.out.println("The Hiragana is: "+ROME[rand]+"\nEnter any number to proceed and 0 to exit.");
				if(sc.nextInt()==0){break;}
			}
		}
	}
}