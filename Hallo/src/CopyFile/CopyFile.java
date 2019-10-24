package CopyFile;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public class CopyFile {

	public static void copy(File from, File to)
	{
		try(InputStream in = new FileInputStream(from);
				BufferedInputStream puffer = new BufferedInputStream(in);
				OutputStream out = new FileOutputStream(to);
				BufferedOutputStream outpuffer = new BufferedOutputStream(out))
		{
			int c;
			while((c = puffer.read()) != -1)
			{
				outpuffer.write(c);
			}
			
		}catch(FileNotFoundException fnf)
		{
			System.out.println(fnf.getMessage());
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}
	}
	public static void main(String[] args) {
		File from = new File("C:\\Users\\aznyo\\git\\repository2\\Hallo\\src\\CopyFile\\doku.txt");
		File to = new File("C:\\Users\\aznyo\\git\\repository2\\Hallo\\src\\CopyFile\\ziel.txt");
		copy(from, to);
		}
}
		


