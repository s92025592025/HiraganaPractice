import java.util.Scanner;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
class Main{
	static final String ROME[]={"a", "i", "u", "e", "o", 
								"ka", "ki", "ku", "ke", "ko",
								"sa", "shi", "su", "se", "so",
								"ta", "chi", "tsu", "te", "to",
								"na", "ni", "nu", "ne", "no",
								"ha", "hi", "fu", "he", "ho",
								"ma", "mi", "mu", "me", "mo",
								"ya",       "yu",       "yo",
								"ra", "ri", "ru", "re", "ro",
								"wa",                   "wo",
								"N"};
	static final String HIRIGANA[]={"あ", "い", "う", "え", "お",
									"か", "き", "く", "け", "こ",
									"さ", "し", "す", "せ", "そ",
									"た", "ち", "つ", "て", "と",
									"な", "に", "ぬ", "ね", "の",
									"は", "ひ", "ふ", "へ", "ほ",
									"ま", "み", "む", "め", "も",
									"や",      "ゆ",       "よ",
									"ら", "り", "る", "れ", "ろ",
									"わ",                 "を",
									"ん"};

	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Choose game mode: 1 for Hiragana test, 2 for the romenized test, 3 for Harigana combining test, 4 for romenized combining test!!");
			int mode=sc.nextInt();
			if(mode==0){break;}
			switch(mode){
				case 1:
					HiraganaGame(); break;
				case 2:
					RomeGame(); break;
				case 3:
					HiraganaCombine(); break;
				case 4:
					RomeCombine(); break;
			}
		}
		
	}

	public static void HiraganaGame() throws Exception{
		Scanner sc=new Scanner(System.in);
		//System.setOut(ps);
		for(int i=1;; i++){
			int rand=(int)Math.round(Math.random()*(HIRIGANA.length-1));
			System.out.println("The "+i+"th problem: "+ROME[rand]);
			System.out.println("Enter any number to see answer, 0 to exit");
			if(sc.nextInt()==0){
				break;
			}else{
				System.out.println("The Hiragana is: "+HIRIGANA[rand]+"\nEnter any number to proceed and 0 to exit this mode.");
				if(sc.nextInt()==0){break;}
			}
		}
	}

	public static void RomeGame() throws Exception{
		Scanner sc=new Scanner(System.in);
		for(int i=1;; i++){
			int rand=(int)Math.round(Math.random()*(HIRIGANA.length-1));
			System.out.println("The "+i+"th problem: "+HIRIGANA[rand]);
			System.out.println("Enter any number to see answer, 0 to exit");
			if(sc.nextInt()==0){
				break;
			}else{
				System.out.println("The Hiragana is: "+ROME[rand]+"\nEnter any number to proceed and 0 to exit this mode.");
				if(sc.nextInt()==0){break;}
			}
		}
	}

	public static void HiraganaCombine(){
		Scanner sc=new Scanner(System.in);
		int wordlength;
		for(int i=0; ; i++){
			wordlength=(int)Math.round(Math.random()*3)+1;
			int words[]=randomWordsPosition(wordlength);
			System.out.println("The "+i+"th problem: "+longerWords(words, HIRIGANA));
			System.out.println("Enter any number to see answer, 0 to exit");
			if(sc.nextInt()==0){
				break;
			}else{
				System.out.println("The Hiragana is: "+longerWords(words, ROME)+"\nEnter any number to proceed and 0 to exit this mode.");
				if(sc.nextInt()==0){break;}
			}
		}
	}

	public static void RomeCombine(){
		Scanner sc=new Scanner(System.in);
		int wordlength;
		for(int i=0; ; i++){
			wordlength=(int)Math.round(Math.random()*3)+1;
			int words[]=randomWordsPosition(wordlength);
			System.out.println("The "+i+"th problem: "+longerWords(words, ROME));
			System.out.println("Enter any number to see answer, 0 to exit");
			if(sc.nextInt()==0){
				break;
			}else{
				System.out.println("The Hiragana is: "+longerWords(words, HIRIGANA)+"\nEnter any number to proceed and 0 to exit this mode.");
				if(sc.nextInt()==0){break;}
			}
		}
		
	}

	public static int[] randomWordsPosition(int length){
		int words[]=new int[length];
		for(int i=0; i<length; i++){
			words[i]=(int)Math.round(Math.random()*(HIRIGANA.length-1));
		}

		return words;
	}

	public static StringBuilder longerWords(int[] words, String[] J){
		StringBuilder sb=new StringBuilder();
		for(int i=0; i<words.length; i++){
			sb.append(J[words[i]]+"");
		}

		return sb;
	}
}