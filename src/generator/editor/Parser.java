package generator.editor;

public class Parser {

	private StringBuilder sb = new StringBuilder();
	
	public Parser(){
		sb.append("<html>\n");
		sb.append("<head><link rel = 'stylesheet' href = 'Style.css'></link></head>\n");
		sb.append("<body>\n");
	}
	
	public void addTag(String tag){
		sb.append(tag);
	}
	
	public String getContent(){
		sb.append("</body>\n");
		sb.append("</html>");
		return sb.toString();
	}
	
}
