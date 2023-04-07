package output;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class WriteArrayExam2 {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Users/i7E--047/Desktop/java/sample2.db");
			
			byte[] array = {10,20,30};
			
			os.write(array);
			
				
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
