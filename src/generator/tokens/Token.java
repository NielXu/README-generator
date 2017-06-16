package generator.tokens;

import generator.editor.Parser;

public interface Token {

	public String getText();
	
	public void parse(Parser p);
	
	public String getHtmlText();
	
}
