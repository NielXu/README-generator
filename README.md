# README-generator 
A simple README generator :)

# Tokens 
|Token|Usage|Example|
|---|---|---|
|Bold|Make texts bold|`Lib.bold('text');`|
|Code|Add codes, is the same as highlight if the language is null|`Lib.code('Code' , null);`|
|Heading|Add heading with the given size|`Lib.heading('heading' , 1);`|
|Italic|Make texts italic|`Lib.italic('text');`|
|Link|Add link|`Lib.link('link' , 'src');`|
|Strike|Strike out the text|`Lib.strike('text');`|
|Table|Create a new table|`Table t = Lib.table();`|
|List|Create a new list|`List l = Lib.list();`|

# Why to use
1. Do not have to rememeber the markdown types, all the keywords are in `Lib` class 
2. Can preview the README file by calling `editor.preview()`
3. Can generate the README file or easily append content to it by calling `editor.generate('dir' , boolean appened)`

# Example
Here is an example of the preview feature:
![Preview example](README-example)
