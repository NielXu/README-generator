package generator.demo;

import generator.editor.Editor;
import generator.editor.Table;
import generator.tokens.Lib;

public class Demo {
	
	public static void main(String[] args){
		Editor editor = new Editor();
		editor.addRow(Lib.heading("README-generator", 1))
		.addRow("A simple README generator :)")
		.newLine()
		.addRow(Lib.heading("Tokens", 1));
		
		Table table = Lib.table();
		table.head(new String[]{"Token" , "Usage" , "Example"}, null)
		.insertRow(Lib.plain("Bold") , Lib.plain("Make texts bold") , Lib.code("Lib.bold('text');", null))
		.insertRow(Lib.plain("Code") , Lib.plain("Add codes, is the same as highlight if the language is null") , Lib.code("Lib.code('Code' , null);", null))
		.insertRow(Lib.plain("Heading") , Lib.plain("Add heading with the given size") , Lib.code("Lib.heading('heading' , 1);", null))
		.insertRow(Lib.plain("Italic") , Lib.plain("Make texts italic") , Lib.code("Lib.italic('text');", null))
		.insertRow(Lib.plain("Link") , Lib.plain("Add link") , Lib.code("Lib.link('link' , 'src');", null))
		.insertRow(Lib.plain("Strike") , Lib.plain("Strike out the text") , Lib.code("Lib.strike('text');", null))
		.insertRow(Lib.plain("Table") , Lib.plain("Create a new table") , Lib.code("Table t = Lib.table();", null))
		.insertRow(Lib.plain("List") , Lib.plain("Create a new list") , Lib.code("List l = Lib.list();", null));
		
		editor.addTable(table);
		
		//System.out.println(editor.generate("directory", true)); //Generate to the directory
		editor.preview();
	}
	
}
