package generator.tokens;

import generator.editor.Parser;

public class Heading implements Token{
	
	private String text = "" , htmlText;
	
	public Heading(String text , int size){
		//Resize if size is incorrect
		if(size < 1) size = 1;
		else if(size > 6) size = 6;
		
		//Iterate to add #
		for(int i=0;i<size;i++){
			this.text += "#";
		}
		
		this.text += " "+text;
		
		htmlText = "<h"+size+">"+text+"</h"+size+">";
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
