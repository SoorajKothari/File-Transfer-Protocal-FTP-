/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filetransfer;
import java.io.*;
import java.net.*;

/**
 *
 * @author Sooraj
 */
public class FileTransfer_client {
 
	public static void main(String[] argv)throws Exception {
            
            byte []b= new byte[2000];
            Socket sr = new Socket("localhost",4333);
            
            
            InputStream inp = sr.getInputStream();
            /**Enter your file location below **/
            FileOutputStream fr =new FileOutputStream("location to your file\\received.txt");
            System.out.println("Downloading...");
            inp.read(b,0,b.length);
            fr.write(b,0,b.length);
            System.out.println("File Donwloaded By Client");
            
        }
}
