package logic;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;

import config.Configurations;


public class Encrypt {

	public static void encrypt(OutputStream out, Object o) throws IOException{

		ByteArrayOutputStream baos = new ByteArrayOutputStream(1024);
		ObjectOutputStream oos = new ObjectOutputStream(baos);
		oos.writeObject(o);
		oos.close();
		byte ff = (byte) 0xff;
		byte[] b = baos.toByteArray();
		for (int i=0; i<b.length; i++) b[i] = (byte) (b[i] ^ ff);
		out.write(b);
	}


	public String decrypt(byte[] b)
	{
		Configurations CF = new Configurations();

		String crypKey = CF.getFfcryptkey();
		double gladKo = Double.parseDouble(crypKey);
		
		byte ff = (byte) gladKo;
		for(int i = 0 ; i<b.length ; i++)
		{
			b[i] = (byte)(b[i]^ff);
		}
		String encrypted = new String(b).trim();
		return encrypted;
	}

}