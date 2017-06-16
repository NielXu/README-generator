package generator.tokens;

import generator.editor.Parser;

public class Link implements Token{

	private String text , htmlText;
	
	public Link(String text , String src){
		this.text = "["+text+"]"+"("+src+")";
		htmlText = "<a href = "+src+">"+text+"</a>";
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
