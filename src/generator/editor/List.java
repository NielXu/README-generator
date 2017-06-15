package generator.editor;

import generator.tokens.Token;

/**
 * A list in the readme
 * @author danielxu
 *
 */
public class List {

	/**The content**/
	private StringBuilder content;
	
	/**
	 * Create a new list
	 */
	public List(){
		content = new StringBuilder();
	}
	
	/**
	 * Add a bullet element in the list
	 * 
	 * @param depth - The depth of the element, if it is a nested list, then the depth will start with 0. And the depth will increase 
	 * if one element is appened on the previous element.
	 * @param text - The text
	 */
	public List bullet(int depth , String text){
		String spaces = "";
		for(int i=0;i<depth*3;i++) spaces += " ";
		
		content.append(spaces+"* "+text+"\n");
		return this;
	}
	
	public List bullet(int depth , Token... tokens){
		if(tokens.length == 0)
			return this;
		String spaces = "";
		for(int i=0;i<depth*3;i++) spaces += " ";
		
		content.append(spaces+"* ");
		for(int i=0;i<tokens.length;i++){
			content.append(tokens[i].getText()+" ");
		}
		content.append("\n");
		return this;
	}
	
	public List bullet(Token... tokens){
		return bullet(0 , tokens);
	}
	
	public List bullet(String element){
		return bullet(0 , element);
	}
	
	public List order(int depth , int index , Token... tokens){
		if(tokens.length == 0)
			return this;
		String spaces = "";
		for(int i=0;i<depth*3;i++) spaces += " ";
		
		content.append(spaces+index+". ");
		for(int i=0;i<tokens.length;i++){
			content.append(tokens[i].getText()+" ");
		}
		content.append("\n");
		return this;
	}
	
	public List order(int index , Token...tokens){
		return order(0 , index , tokens);
	}
	
	public List order(int depth , int index , String element){
		String spaces = "";
		for(int i=0;i<depth*3;i++) spaces += " ";
		
		content.append(spaces+index+". "+element+"\n");
		return this;
	}
	
	public List order(int index , String element){
		return order(index , 0 , element);
	}
	
	public String getContent(){
		return content.toString();
	}
	
}
