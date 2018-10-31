import java.util.ArrayList;
public class ArrayListObject {

	public static void main(String[] args) {
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("MUHAMMAD YUSUF", "D0217032", "E", "MAMUJU"));
	Data.add(new Mahasiswa("FARHAN HIDAYAT", "D0217375", "E", "MAJENE"));
		
	Data.forEach(data ->{
	System.out.println("NAMA   : "+data.getNama());
	System.out.println("NIM    : "+data.getNim());
	System.out.println("KELAS  : "+data.getKelas());
	System.out.println("ALAMAT : "+data.getAlamat());	
	System.out.println(" ")
	});
	}
}
