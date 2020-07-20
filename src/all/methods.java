package all;

import java.awt.Toolkit;

import java.io.FileInputStream;
import java.io.InputStream;
import java.time.temporal.ValueRange;
import java.util.BitSet;
import java.util.Scanner;
import java.util.function.BinaryOperator;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

public class methods {
	public static String all = "";


public static void main(String[] args) throws InterruptedException{}
public static void tobeep(char text) throws InterruptedException{
	
	
	Scanner sc = new Scanner(System.in);
	AudioPlayer MGP = AudioPlayer.player;
	AudioStream BGM = null;
	AudioStream BGM2 = null;
	try {
		
	
	  InputStream test = new FileInputStream("beep-01a.wav"); //long beep
	  InputStream test2 = new FileInputStream("beep-07.wav"); //short beep
	  BGM = new AudioStream(test);
	  BGM2 = new AudioStream(test2);

//	  System.out.println("Bienvenido al traductor de código Morse.");
//	  System.out.println("Por favor escriba el texto que desea traducir.");
//	  String mensaje = sc.nextLine();
//	  char l;
//
//	  for(int n = 0; n < mensaje.length(); n++){
//	  //here goes the sounds
//	  l = mensaje.charAt(n);
//	  }
	} catch (Exception e) {
		// TODO: handle exception
	}
	// AudioPlayer.player.start(BGM2);
	// Thread.sleep(200);
	
	
	
	
	
	
	

	
	int s = 200;
	
	

		
			
if(text =='0' ){
				
				
				AudioPlayer.player.start(BGM);
			 Thread.sleep(200);
				AudioPlayer.player.stop(BGM);

}

				
			else if (text =='1')
			{
				AudioPlayer.player.start(BGM);
			Thread.sleep(400);
			AudioPlayer.player.stop(BGM);

			
			 }
		
		
		
	
	
	


}public static void play() throws InterruptedException{

char[] finaal = tosinglar(j);
for (int i = 0; i < finaal.length; i++) {
	

tobeep(finaal[i]);
}

}
public static String[] j;
public static void theend(String text) throws InterruptedException {
	

	//Toolkit.getDefaultToolkit().beep();



	

 j = fromtext(text);


tosinglar(j);


	
}
public static char[] num;
public static char[] tosinglar(String[] j ){

	//System.out.print(j[0]);
	int s =0 ;
	//String[] num = new String[5];
	for (int i = 0; i < j.length; i++) {
	for (int b = 0; b < j[i].length(); b++) {
	s++;

	}
	}
	int x= 0;
	 num = new char[s];
	for (int i = 0; i < j.length; i++) {
	for (int b = 0; b < j[i].length(); b++) {

		num[x] = j[i].charAt(b);
	x++;
	}
	}


	return num;
	
}
public static void t(){
	char a = 0;
	for (int k = 0; k < num.length; k++) {
	
		if(num[k] == '1'){a ='-';
			
		}else if(num[k]  == '0'){a = '.';}else if(num[k] == ' ' ){a = '/';}
		all+=a;
	}
	
	
	
	
	
}

public static String[] totext(String text){ 
	char[] letters = new char[39];

	letters[0] = 'A'; 
	letters[1] = 'B'; 
	letters[2] = 'C'; 
	letters[3] = 'D'; 
	letters[4] = 'E'; 
	letters[5] = 'F'; 
	letters[6] = 'G'; 
	letters[7] = 'H'; 
	letters[8] = 'I'; 
	letters[9] = 'J'; 
	letters[10] = 'K'; 
	letters[11] = 'L'; 
	letters[12] = 'M'; 
	letters[13] = 'N'; 
	letters[14] = 'O'; 
	letters[15] = 'P'; 
	letters[16] = 'Q'; 
	letters[17] = 'R'; 
	letters[18] = 'S'; 
	letters[19] = 'T'; 
	letters[20] = 'U'; 
	letters[21] = 'V'; 
	letters[22] = 'W'; 
	letters[23] = 'X'; 
	letters[24] = 'Y'; 
	letters[25] = 'Z'; 
	letters[26] = '0'; 
	letters[27] = '1'; 
	letters[28] = '2'; 
	letters[29] = '3'; 
	letters[30] = '4'; 
	letters[31] = '5'; 
	letters[32] = '6'; 
	letters[33] = '7'; 
	letters[34] = '8'; 
	letters[35] = '9'; 
	letters[36] = '.'; 
	letters[37] = ','; 
	letters[38] = '?'; 
	String[] binery = new String [39];
	binery[0] = "01";
	binery[1] = "1000";
	binery[2] = "1010";
	binery[3] = "100";
	binery[4] = "0";
	binery[5] = "0010";
	binery[6] = "110";
	binery[7] = "0000";
	binery[8] = "00";
	binery[9] = "0111";
	binery[10] ="101";
	binery[11] ="0100";
	binery[12] = "11";

	binery[13] = "10";
	binery[14] = "111";
	binery[15] = "0110";
	binery[16] = "1101";
	binery[17] = "010";
	binery[18] = "000";
	binery[19] = "1";
	binery[20] = "001";
	binery[21] = "0001";
	binery[22] = "011";
	binery[23] = "1001";
	binery[24] = "1011";
	binery[25] = "1100";

	binery[26] = "11111";
	binery[27] = "01111";
	binery[28] = "00111";
	binery[29] = "00011";
	binery[30] = "00001";
	binery[31] = "00000";
	binery[32] = "10000";
	binery[33] = "11000";
	binery[34] = "11100";
	binery[35] = "11110";
	binery[36] = "010101";
	binery[37] = "110011";
	binery[38] = "001100";
	int count=0;
	for (int i = 0; i < text.length(); i++) {
		
		if(text.charAt(i)== '='){count ++;}
	}



	String[] bin = new String [count];
	for (int i = 0; i < bin.length; i++) {
		bin[i]="";
	}
	int[] nmb = new int [count];
	int x = 0 ;

	for (int i = 0; i < text.length(); i++) {
		

	if(text.charAt(i)!= '='){

	bin[x] += Character.toString( text.charAt(i));
	}else if(text.charAt(i)=='='){
		x++;	
	}
	}

for (int i = 0; i < bin.length; i++) {
	for (int j = 0; j < binery.length; j++) {
		
		if(bin[i].equals(binery[j])){
			nmb[i]=j;
		}
		
	if(bin[i].equals("-")){
		nmb[i]=' ';
	}
	}}








	String[] fnmb= new String [bin.length] ;
	for (int i = 0; i < nmb.length; i++) {
	if(nmb[i] ==' ')
	{fnmb[i]=" ";}else{
		fnmb[i] =Character.toString( letters[nmb[i]]);} 
	//System.out.print(fnmb[i]);


	}
	return fnmb;


	
}
public static String[] fromtext(String text){

	char[] letters = new char[39];

	letters[0] = 'A'; 
	letters[1] = 'B'; 
	letters[2] = 'C'; 
	letters[3] = 'D'; 
	letters[4] = 'E'; 
	letters[5] = 'F'; 
	letters[6] = 'G'; 
	letters[7] = 'H'; 
	letters[8] = 'I'; 
	letters[9] = 'J'; 
	letters[10] = 'K'; 
	letters[11] = 'L'; 
	letters[12] = 'M'; 
	letters[13] = 'N'; 
	letters[14] = 'O'; 
	letters[15] = 'P'; 
	letters[16] = 'Q'; 
	letters[17] = 'R'; 
	letters[18] = 'S'; 
	letters[19] = 'T'; 
	letters[20] = 'U'; 
	letters[21] = 'V'; 
	letters[22] = 'W'; 
	letters[23] = 'X'; 
	letters[24] = 'Y'; 
	letters[25] = 'Z'; 
	letters[26] = '0'; 
	letters[27] = '1'; 
	letters[28] = '2'; 
	letters[29] = '3'; 
	letters[30] = '4'; 
	letters[31] = '5'; 
	letters[32] = '6'; 
	letters[33] = '7'; 
	letters[34] = '8'; 
	letters[35] = '9'; 
	letters[36] = '.'; 
	letters[37] = ','; 
	letters[38] = '?'; 
	String[] binery = new String [39];
	binery[0] = "01";
	binery[1] = "1000";
	binery[2] = "1010";
	binery[3] = "100";
	binery[4] = "0";
	binery[5] = "0010";
	binery[6] = "110";
	binery[7] = "0000";
	binery[8] = "00";
	binery[9] = "0111";
	binery[10] ="101";
	binery[11] ="0100";
	binery[12] = "11";

	binery[13] = "10";
	binery[14] = "111";
	binery[15] = "0110";
	binery[16] = "1101";
	binery[17] = "010";
	binery[18] = "000";
	binery[19] = "1";
	binery[20] = "001";
	binery[21] = "0001";
	binery[22] = "011";
	binery[23] = "1001";
	binery[24] = "1011";
	binery[25] = "1100";

	binery[26] = "11111";
	binery[27] = "01111";
	binery[28] = "00111";
	binery[29] = "00011";
	binery[30] = "00001";
	binery[31] = "00000";
	binery[32] = "10000";
	binery[33] = "11000";
	binery[34] = "11100";
	binery[35] = "11110";
	binery[36] = "010101";
	binery[37] = "110011";
	binery[38] = "001100";
	
	
	
	
	char[] ch = new char [text.length()];
	int[] nm = new int [text.length()];
	
	for (int i = 0; i < text.length(); i++) {
		ch[i]= text.charAt(i);
		
	}
	for (int i = 0; i < ch.length; i++) {
		
		
		for (int j = 0; j < letters.length; j++) {
			
			if(ch[i]==letters[j]){
				nm[i]=j;
			}
			
		if(ch[i]==' '){
			nm[i]='-';
		}
		}}


String[] fnm= new String [ch.length] ;
	for (int i = 0; i < nm.length; i++) {
	if(nm[i] =='-')
	{fnm[i]=" ";}else{
		fnm[i] = binery[nm[i]];} 
//	System.out.print(fnm[i]);
//	System.out.print("\n");
	
	}
	return fnm;
	
}

}



















