import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int yusuf = -1;

	public void insert(Float value) {
		alief++;
		kelase.add(yusuf,value);
	}
	public Float get() {
		Float value = 0.1f;
		if(yusuf>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			yusuf--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+yusuf+" > VARIABLE: "+kelase.toString());
	}
}
