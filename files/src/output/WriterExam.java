package output;
import java.io.OutputStream;
import java.io.IOException;
import java.io.FileOutputStream;
public class WriterExam {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Users/i7E--047/Desktop/java.sample.db");
			
			byte a = 10;
			byte b = 10;
			byte c = 10;
			
			os.write(a);
			os.write(b);
			os.write(c);
			
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
