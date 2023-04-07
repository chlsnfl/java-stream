package output;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;

public class CopyExam {
	public static void main(String[] args) throws Exception {
		
		String img1 = "c:/Users/i7E--047/Desktop/java/003.jpg";
		String img2 = "c:/Users/i7E--047/Desktop/java/004.jpg";
		
		//입출력 스트림 생성
		InputStream orImg = new FileInputStream(img1);
		OutputStream newImg = new FileOutputStream(img2);
		
		//읽은 데이터를 저장할 배열 생성
//		byte[] data = new byte[1024]; 
//		
//		while(true) {
//			int num = orImg.read(data);   // 최대 1024바이트를 읽어 배열에 저장, 읽은 베이스는 리
//			if(num==-1)break;			// 파일을 다 읽으면 break;
//			newImg.write(data,0,num);	// 읽은 바이트 수 만큼 출력
//		}
		
		orImg.transferTo(newImg);
		
		newImg.flush();   // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
		newImg.close();   // 읽은 파일을 닫음
		newImg.close();   // 쓴 파일을 닫음

		System.out.println("파일 복사 완료!");
	}
}
