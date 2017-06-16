package generator.editor;

import generator.tokens.Token;

/**
 * A table in the readme
 * @author danielxu
 *
 */
public class Table {

	/**The alignments**/
	public static final int CENTER = 0 , LEFT = -1 , RIGHT = 1;
	
	/**The content**/
	private StringBuilder content;
	
	private StringBuilder sb;
	
	/**
	 * Create a new table
	 */
	public Table(){
		content = new StringBuilder();
		sb = new StringBuilder();
		sb.append("<table>\n");
	}
	
	/**
	 * The headers of the table, this should be set before inserting row
	 * 
	 * @param head - The headers
	 * @param alignment - The alignments, -1 is left, 0 is center and 1 is right. null will make it to default which is align left
	 * @return The Table itself, for next operation
	 */
	public Table head(String[] head , int[] alignment){
		sb.append("<tr>");
		for(int i=0;i<head.length;i++){
			content.append("|"+head[i]);
			sb.append("<th>" + head[i] + "</th>\n");
		}
		sb.append("</tr>\n");
		content.append("|\n");
		
		if(alignment == null){
			for(int i=0;i<head.length;i++){
				content.append("|---");
			}
			content.append("|\n");
		}
		else{
			for(int i=0;i<head.length;i++){
				if(alignment[i] == LEFT){
					content.append("|---");
				}
				else if(alignment[i] == CENTER){
					content.append("|:---:");
				}
				else if(alignment[i] == RIGHT){
					content.append("|---:");
				}
			}
			content.append("|\n");
		}
		return this;
	}
	
	public Table head(Token[] tokens , int[] alignment){
		sb.append("<tr>");
		for(int i=0;i<tokens.length;i++){
			content.append("|"+tokens[i].getText());
			sb.append("<th>" + tokens[i].getHtmlText() + "</th>\n");
		}
		sb.append("</tr>\n");
		content.append("|\n");
		
		if(alignment == null){
			for(int i=0;i<tokens.length;i++){
				content.append("|---");
			}
			content.append("|\n");
		}
		else{
			for(int i=0;i<tokens.length;i++){
				if(alignment[i] == LEFT){
					content.append("|---");
				}
				else if(alignment[i] == CENTER){
					content.append("|:---:");
				}
				else if(alignment[i] == RIGHT){
					content.append("|---:");
				}
			}
			content.append("|\n");
		}
		return this;
	}
	
	/**
	 * Insert a new row in the table, the headers should be set before this
	 * 
	 * @param row - The table cells of current row
	 * @return The Table itself, for next operation
	 */
	public Table insertRow(String... row){
		sb.append("<tr>");
		for(int i=0;i<row.length;i++){
			content.append("|"+row[i]);
			sb.append("<td>"+row[i]+"</td>\n");
		}
		sb.append("</tr>\n");
		content.append("|\n");
		return this;
	}
	
	public Table insertRow(Token...tokens){
		sb.append("<tr>");
		for(int i=0;i<tokens.length;i++){
			content.append("|"+tokens[i].getText());
			sb.append("<td>"+tokens[i].getHtmlText()+"</td>\n");
		}
		sb.append("</tr>\n");
		content.append("|\n");
		return this;
	}
	
	public String getHtmlContent(){
		sb.append("</table>\n");
		return sb.toString();
	}
	
	/**
	 * Get all the contents in the table
	 * 
	 * @return All the contents in the table
	 */
	public String getContent(){
		return content.toString();
	}
	
}
