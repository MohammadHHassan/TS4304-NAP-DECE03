package day10.chatapplication;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("localhost", 9101);
			
			Scanner scanner = new Scanner(System.in);
			
			DataInputStream fromServer = new DataInputStream(socket.getInputStream());
			DataOutputStream toServer = new DataOutputStream(socket.getOutputStream());
			
			System.out.print("Please enter your chat ID: ");
			String chatID = scanner.nextLine();
			toServer.writeUTF(chatID);
			
			System.out.println("You are connected with " + fromServer.readUTF());
			
			// Implement thread to allow receiving and sending messages simultaneously
			new Thread(new Runnable()
			{
				@Override
				public void run()
				{
					while(true)		// Forever loop to accept multiple messages
					{
						try
						{
							if(fromServer.available()>0)	// If there is any incoming text
							{
								String receivedMsg = fromServer.readUTF();
								System.out.println(">>> " + receivedMsg);
							}
						}
						catch (IOException e)
						{
							e.printStackTrace();
						}
					}
				}
			}).start();
			
			while(true)			// Forever loop to enable writing text anytime
			{
				String msg = scanner.nextLine();
				toServer.writeUTF(msg);
			}
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
