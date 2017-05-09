package generator.tokens;

public class Heading implements Token{
	
	private String text = "";
	
	public Heading(String text , int size){
		//Resize if size is incorrect
		if(size < 1) size = 1;
		else if(size > 6) size = 6;
		
		//Iterate to add #
		for(int i=0;i<size;i++){
			this.text += "#";
		}
		
		this.text += " "+text;
	}
	
	@Override
	public String getText() {
		return text;
	}

}
