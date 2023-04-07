package output;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.IOException;
public class WriteArrayExam {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C://Users//i7E--047//Desktop//java/sample.db");
			
			byte[] array = {10,20,30,40,50,60};
			
			os.write(array);
			
			os.flush();
			os.close();
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
