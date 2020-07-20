package all;

import java.util.Random;

public class minkey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn = new Random();
char[] letters = new char[27];
		
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
		letters[26] = ' '; 

		String big ="A";
		int[] thenums = new int[big.length()];
for (int j = 0; j < big.length(); j++) {
	
	

for (int i = 0; i < letters.length; i++) {

	if(big.charAt(j)== letters[i])
	{
		thenums[j] = i;
		
		
	} 

}

}
//for (int i = 0; i < thenums.length; i++) {
//	System.out.print(thenums[i]);
//
//}

boolean found = false;
int[] g = new int[thenums.length];
int count = 0;
	while (found == false) {
		
		for (int i = 0; i < thenums.length; i++) {
			g[i] = rn.nextInt(27);
			
		}
		
		if(thenums.equals(g)){found = true; }
		
		
		count ++;
		
	}
		
	System.out.print(count);

	}

}















