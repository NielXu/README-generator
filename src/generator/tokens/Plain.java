package generator.tokens;

public class Plain implements Token{

	private String text;
	
	public Plain(String text){
		this.text = text;
	}
	
	@Override
	public String getText() {
		return text;
	}

}
