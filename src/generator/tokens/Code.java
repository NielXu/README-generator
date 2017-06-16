package generator.tokens;

import generator.editor.Parser;

public class Code implements Token{

	private String text , htmlText;
	
	public Code(String text , String lang){
		if(lang == null)
			this.text = "`" + text + "`";
		else
			this.text = "```"+lang+"\n"+text+"\n```";
		
		text = text.replaceAll("(\r\n|\n)", "<br>");
		htmlText = "<code>"+text+"</code>";
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
