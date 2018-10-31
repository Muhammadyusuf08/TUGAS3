public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int yusuf= -1;

	public void insert(Double value) {
		alief++;
		kelase.add(yusuf,value);
	}
	public Double get() {
		Double value = 0.1;
		if(yusuf>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			alief--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+yusuf+" > VARIABLE: "+kelase.toString());
	}
}
