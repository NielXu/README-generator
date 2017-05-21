package generator.editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import generator.tokens.Token;

public class Editor {

	private StringBuilder content;
	
	public Editor(){
		content = new StringBuilder();
	}
	
	public Editor addRow(Token... tokens){
		for(Token token : tokens){
			content.append(token.getText()+" ");
			token = null;
		}
		content.append("\n");
		return this;
	}
	
	public Editor addRow(String text){
		content.append(text+"\n");
		return this;
	}
	
	public Editor newLine(){
		return newLines(1);
	}
	
	public Editor newLines(int lines){
		for(int i=0;i<lines;i++){
			content.append("\n");
		}
		return this;
	}
	
	public void addTable(){
		//TODO
	}
	
	public void addList(){
		//TODO
	}
	
	public String getContent(){
		return content.toString();
	}
	
	public boolean generate(String dir){
		File file = new File(dir+"/README.md");
		if(!file.exists()){
			try{
				file.createNewFile();
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		
		BufferedWriter writer = null;
		try{
			writer = new BufferedWriter(new FileWriter(file , true));
			writer.write(content.toString());
			return true;
		}
		catch(IOException e){
			e.printStackTrace();
			return false;
		}
		finally{
			if(writer != null){
				try{
					writer.close();
				}
				catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
}
