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

public class FileTransfer_server {
   public static void main(String[] argv)throws Exception {
            
       ServerSocket s = new ServerSocket(4333);
       Socket sr = s.accept();
       /**Enter your file location below **/
            /**Make sure you Save test.txt in location you give below **/

       FileInputStream fr = new FileInputStream("your File location\\test.txt");
	byte []b = new byte[2000];
        fr.read(b,0,b.length);
       System.out.println("Uploading...."); 
        OutputStream out = sr.getOutputStream();
        out.write(b,0,b.length);
        System.out.println("File Uploaded On server");
        
        }
}
