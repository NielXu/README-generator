# README-generator
A simple README generator :)
# EXAMPLE 
Create a new editor
```java
Editor editor = new Editor();
``` 
Add a new row on the editor
```java
editor.addRow(Lib.plain('Here is an example'));
``` 
After finished editing, save it to the directory
```java
editor.generate('/your/dir/');
``` 
Please remember that if there's a README file on the directory, the content will be appened to the file
if there's not, a new README file will be generated, **but it is a .txt file, you have to convert it manually.** 
