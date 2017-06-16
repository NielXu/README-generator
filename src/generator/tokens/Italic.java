package generator.tokens;

import generator.editor.Parser;

public class Italic implements Token{

	private String text , htmlText;
	
	public Italic(String text){
		this.text = "_"+text+"_";
		htmlText = "<i>"+text+"</i>";
	}
	
	public Italic(Token token){
		this(token.getText());
	}
	
	@Override
	public String getText() {
		return text;
	}

	@Override
	public void parse(Parser p) {
		p.addTag(htmlText);
	}

	@Override
	public String getHtmlText() {
		return htmlText;
	}

}
