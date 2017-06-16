package generator.tokens;

import generator.editor.Parser;

public class Bold implements Token{

	private String text , htmlText;
	
	public Bold(String text){
		this.text = "**"+text+"**";
		htmlText = "<b>"+text+"</b>";
	}
	
	public Bold(Token token){
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
