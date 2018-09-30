package myUtils;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class File{
	public String fileName;
	public String text;

	public void toFile(){
		try{
			FileWriter file = new FileWriter (fileName);
			BufferedWriter tmpFile = new BufferedWriter (file);
			tmpFile.write (text);
			tmpFile.close();
			file.close();
		}
		catch (FileNotFoundException e){ e.printStackTrace(); }
		catch (IOException e){ e.printStackTrace(); }
	}
	public String fromFile(){
		text ="";
		try{
			FileReader file = new FileReader (fileName);
			BufferedReader tmpFile = new BufferedReader (file);
			String tmpLine = tmpFile.readLine();
			while (tmpLine !=null){
				text += tmpLine;
				tmpLine = tmpFile.readLine();
			}
			tmpFile.close();
			file.close();
		}
		catch (FileNotFoundException e){ e.printStackTrace(); }
		catch (IOException e){ e.printStackTrace(); }
		return text;
	}

	public File (String fileName, String text){
		this.fileName = fileName;
		this.text = text;
	}
	public File (String fileName){ this (fileName, null); }
	public File(){ this (null, null); }
}