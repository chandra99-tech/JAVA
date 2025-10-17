package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBufferedInputStream {

	public static void main(String[] args) {
		File f = new File("myFileCopy.txt");
		BufferedOutputStream bos = null;
		try {
			if(f.exists()) {
				bos = new BufferedOutputStream(new FileOutputStream(f,true));
				System.out.println("Hello");
			}
			else {
				bos = new BufferedOutputStream(new FileOutputStream(f));
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("myFile.txt"));
			BufferedOutputStream bos1 = bos;){
			int i = bis.read();
			while(i!=-1) {
				bos.write(i);
				i=bis.read();
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
