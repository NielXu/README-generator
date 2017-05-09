package generator.tokens;

public class Strike implements Token{

	private String text;
	
	public Strike(String text){
		this.text += "~~"+text+"~~";
	}
	
	public Strike(Token token){
		this(token.getText());
	}
	
	@Override
	public String getText() {
		return text;
	}

}
