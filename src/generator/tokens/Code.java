package generator.tokens;

public class Code implements Token{

	private String text;
	
	public Code(String text , String lang){
		if(lang == null)
			this.text = "`" + text + "`";
		else
			this.text = "```"+lang+"\n"+text+"\n```";
	}
	
	@Override
	public String getText() {
		return text;
	}
	
}
