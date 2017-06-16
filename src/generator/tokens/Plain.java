package generator.tokens;

import generator.editor.Parser;

public class Plain implements Token{

	private String text , htmlText;
	
	public Plain(String text){
		this.text = text;
		htmlText = text;
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
