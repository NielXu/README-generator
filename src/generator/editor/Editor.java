package generator.editor;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import generator.tokens.Token;

/**
 * The editor of the readme file.
 * @author danielxu
 *
 */
public class Editor {

	/**The content**/
	private StringBuilder content;
	
	/**
	 * Create a new Editor, and ready to append texts
	 */
	public Editor(){
		content = new StringBuilder();
	}
	
	/**
	 * Add a new row with tokens
	 * 
	 * @param tokens - The tokens
	 * @return The Editor instance, for next operation
	 */
	public Editor addRow(Token... tokens){
		for(Token token : tokens){
			content.append(token.getText()+" ");
			token = null;
		}
		content.append("\n");
		return this;
	}
	
	/**
	 * Added a new row of texts
	 * 
	 * @param text - The texts
	 * @return The Editor instance, for next operation
	 */
	public Editor addRow(String text){
		content.append(text+"\n");
		return this;
	}
	
	/**
	 * Append a new line in the text
	 * 
	 * @return The Editor instance, for next operation
	 */
	public Editor newLine(){
		return newLines(1);
	}
	
	/**
	 * Append multiple new lines in the text
	 * 
	 * @param lines - The number of lines
	 * @return The Editor instance, for next operation
	 */
	public Editor newLines(int lines){
		for(int i=0;i<lines;i++){
			content.append("\n");
		}
		return this;
	}
	
	/**
	 * Add a table
	 * 
	 * @param table - The table
	 * @return The Editor instance, for next operation
	 */
	public Editor addTable(Table table){
		content.append(table.getContent());
		return this;
	}
	
	public void addList(){
		
	}
	
	/**
	 * Get all the contents in the editor
	 * 
	 * @return All the contents in the editor
	 */
	public String getContent(){
		return content.toString();
	}
	
	/**
	 * Generate the readme file. If the readme file already exist, then the contents will be appened or replaced the old 
	 * contents base on the given boolean value. If the readme file is not exist, a new one will be generated in the 
	 * given directory
	 * 
	 * @param dir - The directory that the readme file will be generated to
	 * @param append - append to the file or override the file
	 * @return True if the file is succesfully generated, false otherwise 
	 */
	public boolean generate(String dir , boolean append){
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
			writer = new BufferedWriter(new FileWriter(file , append));
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
