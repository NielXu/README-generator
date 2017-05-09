package generator.demo;

import generator.editor.Editor;
import generator.tokens.*;

public class Demo {
	
	public static void main(String[] args){
		Editor editor = new Editor();
		editor.addRow(Lib.heading("EXAMPLE", 1))
			  .addRow("Create a new editor")  //.addRow(Lib.plain("Create a new editor")) will do they same job, this is a short version
			  .addRow(Lib.code("Editor editor = new Editor();", "java"))
			  .addRow("Add a new row on the editor")
			  .addRow(Lib.code("editor.addRow(Lib.plain('Here is an example'));", "java"))
			  .addRow("After finished editing, save it to the directory")
			  .addRow(Lib.code("editor.generate('/your/dir/')", "java"))
			  .addRow("Please remember that if there's a README file on the directory, the content will be appened to the file")
			  .addRow(Lib.plain("if there's not, a new README file will be generated,") , Lib.bold("but it is a .txt file, you have to convert it manually"));
			  //In this case, Lib.plain() is necessary to be called
	}
	
}
