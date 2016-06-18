package Ch17_fileStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
public class byteStremCopy {

		public static void main(String[] args) {
			try {

				JFileChooser fileChoolser =new JFileChooser();
				fileChoolser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				//int result=fileChoolser.showOpenDialog(fileChoolser);
				//fileChoolser.
				//int test=fileChoolser.showSaveDialog(this);
			
				FileInputStream fis = new FileInputStream(fileChoolser.showOpenDialog(fileChoolser).getSelectedFile());
				BufferedInputStream bis = new BufferedInputStream(fis);
				FileOutputStream fos = new FileOutputStream(fileChoolser.getCurrentDirectory());
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				
				byte input[] = new byte[100000];
				
				long before = System.currentTimeMillis();
				int len;
				int count=0;
				while ((len = bis.read(input)) != -1) {
					bos.write(input, 0, len);
					count++;
				}
				
				int r;
//				while ((r = bis.read()) != -1) {
//					bos.write(r);
//					count++;
//				}
				bis.close();
				bos.close();
				System.out.println(System.currentTimeMillis()-before+"ms");
				System.out.println("∂¡¡À"+count+"¥Œ");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}


