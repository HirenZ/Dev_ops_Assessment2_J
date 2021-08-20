package testing;

public class UTesting {
	public int squre(int x) {
		return x*x;
	}
	public int countN(String word){
		int count =0;
		for(int i=0; i <word.length();i++) {
			if(word.charAt(i)=='a' || word.charAt(i)=='A'){
				count++;
				}
		}
		return count;
	}

}
