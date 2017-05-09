package generator.tokens;

public class Italic implements Token{

	private String text;
	
	public Italic(String text){
		this.text = "_"+text+"_";
	}
	
	public Italic(Token token){
		this(token.getText());
	}
	
	@Override
	public String getText() {
		return text;
	}

}
