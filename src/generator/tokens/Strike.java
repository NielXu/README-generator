package generator.tokens;

import generator.editor.Parser;

public class Strike implements Token{

	private String text , htmlText;
	
	public Strike(String text){
		this.text += "~~"+text+"~~";
		htmlText = "<i>"+text+"</i>";
	}
	
	public Strike(Token token){
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
