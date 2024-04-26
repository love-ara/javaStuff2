Introduction to Html

hypertext: text(often embedded in images)
Markup:Style guide
Language

Html determines the structure of web pages.
technologies like css and JavaScript help the web page interactive.

Basics:

<!DOCTYPE html> - this tag specifies the language you will write on the page.
<html> - this tag signals that from here on you're writing a html code.
<head> - this is where all the metadata for the page goes especially search engines and other computer programs.
<body> - The content of the page goes here.


rel => relationship(Shows the relationship btw the web page and the external ref or rhef)
for internal styling : use <style>"the style should affect the page"</style> tag
for inline styling : <p style ="you style inside the tag"> </p>
for external : styling is done outside the file and linked with by rhef and rel.<link href="something.css" rel="stylesheet"/>



Tags and Attributes:</> <..../>
tags are used to mark up the start of a html element and enclosed in angle bracket.Opening tag <p>, closing tag</p>
self-closing tags do not have closing tags <self-closing tag/>, they are void element,they can't have child nodes.


div: is a container
Ui: unordered list
Ol: ordered list
p: paragraph tag
li: list
A: anchor tag -> has attribute href that links to an external file.

Attribute provide additional info of how an element behave.  usually found within opening tag
Id attribute: is used to uniquely identify an element within an html pag
e. <p id="html"> This para explains what HTML is</p>

Two type of elements: 
Semantic element:carry meaning about structure and content of the document.
<header>, <nav>, <main>, <article>, <action>, <aside>.

Non-semantic is used for presentational purpose, they focus on the appearance than meaning <div>, <span>, <font>

Block elements: <p> and <div> tags are block level element that occurs the whole space

Inline elements: 
HTML form: is used to collect user input.
label tag: <label >
input tag: has an attribute called type used to specify the type i.e radio <input type="radio">
form tag: <form> 