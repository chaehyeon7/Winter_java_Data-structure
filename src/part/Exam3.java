package part;

public class Exam3 {
	public static void main(String[] args) {
		Iterator it<Integer> = numbers.iterator();
		while(it.hasNext()){
		    int value = it.next();
		    if(value == 30){
		        it.remove();
		    }                       
		}
		for(int value : numbers){
		    System.out.println(value);
		}
	}
}
