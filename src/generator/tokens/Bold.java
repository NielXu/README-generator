package generator.tokens;

public class Bold implements Token{

	private String text;
	
	public Bold(String text){
		this.text = "**"+text+"**";
	}
	
	public Bold(Token token){
		this(token.getText());
	}

	@Override
	public String getText() {
		return text;
	}
	
}
