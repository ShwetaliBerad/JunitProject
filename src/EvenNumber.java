
public class EvenNumber {
	public boolean isEvenNumber(int number){
        
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
	
	public static void main(String[] args) {
		EvenNumber ev = new EvenNumber();
		System.out.println("Is Even Number? "+ev.isEvenNumber(2));
		
	}
	
}
