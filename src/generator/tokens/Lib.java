package generator.tokens;

import generator.editor.List;
import generator.editor.Table;

/**
 * Lib class is an alternative way, instead of letting user to create an instance, Lib class lists all the tokens for users to choose which 
 * one they wanna use. User can either using 'new' keyword to create a new token, or using Lib.token_name() to create one. Using 
 * Lib class will be more preferable.
 * @author danielxu
 *
 */
public class Lib {

	private Lib(){
		//Lib is a static class, no instance needed
	}
	
	public static Token heading(String text , int size){
		return new Heading(text , size);
	}
	
	public static Token bold(Token token){
		return bold(token.getText());
	}
	
	public static Token bold(String text){
		return new Bold(text);
	}
	
	public static Token italic(Token token){
		return italic(token.getText());
	}
	
	public static Token italic(String text){
		return new Italic(text);
	}
	
	public static Token strike(Token token){
		return strike(token.getText());
	}
	
	public static Token strike(String text){
		return new Strike(text);
	}
	
	public static Token code(String text , String lang){
		return new Code(text , lang);
	}
	
	public static Token plain(String text){
		return new Plain(text);
	}
	
	public static Token link(String text , String src){
		return new Link(text , src);
	}
	
	public static List list(){
		return new List();
	}
	
	public static Table table(){
		return new Table();
	}
	
}
