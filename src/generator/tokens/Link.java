package generator.tokens;

public class Link implements Token{

	private String text;
	
	public Link(String text , String src){
		this.text = "["+text+"]"+"("+src+")";
	}
	
	@Override
	public String getText() {
		return text;
	}

}
