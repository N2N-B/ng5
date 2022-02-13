<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>

</body>
</html>

<!-- ---------------

JSP technology is used to create web application just like Servlet technology. 
It can be thought of as an extension to Servlet because it provides more functionality than servlet such as 
expression language, JSTL, etc.

A JSP page consists of HTML tags and JSP tags. The JSP pages are easier to maintain than Servlet 
because we can separate designing and development. It provides some additional features such as Expression 
Language, Custom Tags, etc.



The Lifecycle of a JSP Page
The JSP pages follow these phases:

Translation of JSP Page
Compilation of JSP Page
Classloading (the classloader loads class file)
Instantiation (Object of the Generated Servlet is created).
Initialization ( the container invokes jspInit() method).
Request processing ( the container invokes _jspService() method).
Destroy ( the container invokes jspDestroy() method).

Let's see the simple example of JSP where we are using the scriptlet tag to put Java code in the JSP page. 
We will learn scriptlet tag later.

<html>  
<body>  
<% out.print(2*5); %>  
</body>  
</html>  


**************************************************************************************************************
                                     JSP API



The JSP API consists of two packages:

javax.servlet.jsp
javax.servlet.jsp.tagext
javax.servlet.jsp package
The javax.servlet.jsp package has two interfaces and classes.The two interfaces are as follows:

JspPage
HttpJspPage
The classes are as follows:

JspWriter
PageContext
JspFactory
JspEngineInfo
JspException
JspError
The JspPage interface
According to the JSP specification, all the generated servlet classes must implement the JspPage interface. 
It extends the Servlet interface. It provides two life cycle methods.

JSP API
Methods of JspPage interface
public void jspInit(): It is invoked only once during the life cycle of the JSP when JSP page is requested firstly.
 It is used to perform initialization. It is same as the init() method of Servlet interface.

public void jspDestroy(): It is invoked only once during the life cycle of the JSP before the JSP page is destroyed.
 It can be used to perform some clean up operation.

The HttpJspPage interface
The HttpJspPage interface provides the one life cycle method of JSP. It extends the JspPage interface.

Method of HttpJspPage interface:
public void _jspService(): It is invoked each time when request for the JSP page comes to the container. 
It is used to process the request. The underscore _ signifies that you cannot override this method.


JSP Scriptlet tag (Scripting elements)

In JSP, java code can be written inside the jsp page using the scriptlet tag. Let's see what are the scripting elements first.

JSP Scripting elements
The scripting elements provides the ability to insert java code inside the jsp. There are three types of scripting elements:

scriptlet tag
expression tag
declaration tag
JSP scriptlet tag
A scriptlet tag is used to execute java source code in JSP. Syntax is as follows:

<%  java source code %>  
Example of JSP scriptlet tag
In this example, we are displaying a welcome message.


<html>  
<body>  
<% out.print("welcome to jsp"); %>  
</body>  
</html>  
Example of JSP scriptlet tag that prints the user name
In this example, we have created two files index.html and welcome.jsp. 
The index.html file gets the username from the user and the welcome.jsp file prints the username with the welcome message.

File: index.html

<html>  
<body>  
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
</body>  
</html>  
File: welcome.jsp

<html>  
<body>  
<%  
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  
</form>  
</body>  
</html>  


JSP expression tag
The code placed within JSP expression tag is written to the output stream of the response. 
So you need not write out.print() to write data. It is mainly used to print the values of variable or method.

Syntax of JSP expression tag
<%=  statement %>  
Example of JSP expression tag
In this example of jsp expression tag, we are simply displaying a welcome message.

<html>  
<body>  
<%= "welcome to jsp" %>  
</body>  
</html>  
Note: Do not end your statement with semicolon in case of expression tag.
Example of JSP expression tag that prints current time
To display the current time, we have used the getTime() method of Calendar class. 
The getTime() is an instance method of Calendar class, so we have called it after getting the instance of 
Calendar class by the getInstance() method.

index.jsp


<html>  
<body>  
Current Time: <%= java.util.Calendar.getInstance().getTime() %>  
</body>  
</html>  
Example of JSP expression tag that prints the user name
In this example, we are printing the username using the expression tag. The index.html file gets the username 
and sends the request to the welcome.jsp file, which displays the username.

File: index.jsp

<html>  
<body>  
<form action="welcome.jsp">  
<input type="text" name="uname"><br/>  
<input type="submit" value="go">  
</form>  
</body>  
</html>  

File: welcome.jsp

<html>  
<body>  
<%= "Welcome "+request.getParameter("uname") %>  
</body>  
</html>  

JSP Declaration Tag

The JSP declaration tag is used to declare fields and methods.

The code written inside the jsp declaration tag is placed outside the service() method of auto generated servlet.

So it doesn't get memory at each request.

Syntax of JSP declaration tag
The syntax of the declaration tag is as follows:


<%!  field or method declaration %>  
Difference between JSP Scriptlet tag and Declaration tag
Jsp Scriptlet Tag	                                                           Jsp Declaration Tag
The jsp scriptlet tag can only declare variables not methods.	               The jsp declaration tag can declare variables as well as methods.
The declaration of scriptlet tag is placed inside the _jspService() method.	   The declaration of jsp declaration tag is placed outside the _jspService() method.

Example of JSP declaration tag that declares field
In this example of JSP declaration tag, we are declaring the field and printing the value of the declared field 
using the jsp expression tag.

index.jsp
<html>  
<body>  
<%! int data=50; %>  
<%= "Value of the variable is:"+data %>  
</body>  
</html>  
Example of JSP declaration tag that declares method
In this example of JSP declaration tag, we are defining the method which returns the cube of given number and 
calling this method from the jsp expression tag. But we can also use jsp scriptlet tag to call the declared method.

index.jsp
<html>  
<body>  
<%!   
int cube(int n){  
return n*n*n*;  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  
</body>  
</html>  


JSP Implicit Objects


There are 9 jsp implicit objects. These objects are created by the web container that are available to all the 
jsp pages.

The available implicit objects are out, request, config, session, application etc.

A list of the 9 implicit objects is given below:

Object	Type
out	JspWriter
request	HttpServletRequest
response	HttpServletResponse
config	ServletConfig
application	ServletContext
session	HttpSession
pageContext	PageContext
page	Object
exception	Throwable

 
1) JSP out implicit object
For writing any data to the buffer, JSP provides an implicit object named out. 
It is the object of JspWriter. In case of servlet you need to write:



PrintWriter out=response.getWriter();  
But in JSP, you don't need to write this code.

Example of out implicit object
In this example we are simply displaying date and time.

index.jsp
<html>  
<body>  
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
</body>  
</html>  


JSP request implicit object
The JSP request is an implicit object of type HttpServletRequest i.e. created for each jsp request by the web
 container. It can be used to get request information such as parameter, header information, remote address, 
 server name, server port, content type, character encoding etc.

It can also be used to set, get and remove attributes from the jsp request scope.

Let's see the simple example of request implicit object where we are printing the name of the user with welcome 
message.

Example of JSP request implicit object
index.html
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  

welcome.jsp
<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);  
%>  


3) JSP response implicit object
In JSP, response is an implicit object of type HttpServletResponse. The instance of HttpServletResponse is created
 by the web container for each jsp request.

It can be used to add or manipulate response such as redirect response to another resource, send error etc.

Let's see the example of response implicit object where we are redirecting the response to the Google.

Example of response implicit object
index.html
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  

welcome.jsp
<%   
response.sendRedirect("http://www.google.com");  
%>  


JSP config implicit object
In JSP, config is an implicit object of type ServletConfig.
 This object can be used to get initialization parameter for a particular JSP page. 
 The config object is created by the web container for each jsp page.

Generally, it is used to get initialization parameter from the web.xml file.

Example of config implicit object:
index.html
<form action="welcome">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
web.xml file
<web-app>  
  
<servlet>  
<servlet-name>sonoojaiswal</servlet-name>  
<jsp-file>/welcome.jsp</jsp-file>  
  
<init-param>  
<param-name>dname</param-name>  
<param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>  
</init-param>  
  
</servlet>  
  
<servlet-mapping>  
<servlet-name>sonoojaiswal</servlet-name>  
<url-pattern>/welcome</url-pattern>  
</servlet-mapping>  
  
</web-app>  

welcome.jsp
<%   
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  
%>  


SP application implicit object
In JSP, application is an implicit object of type ServletContext.

The instance of ServletContext is created only once by the web container when application or project is deployed on the server.

This object can be used to get initialization parameter from configuaration file (web.xml). It can also be used to get, set or remove attribute from the application scope.

This initialization parameter can be used by all jsp pages.


Example of application implicit object:
index.html
<form action="welcome">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
web.xml file
<web-app>  
  
<servlet>  
<servlet-name>sonoojaiswal</servlet-name>  
<jsp-file>/welcome.jsp</jsp-file>  
</servlet>  
  
<servlet-mapping>  
<servlet-name>sonoojaiswal</servlet-name>  
<url-pattern>/welcome</url-pattern>  
</servlet-mapping>  
  
<context-param>  
<param-name>dname</param-name>  
<param-value>sun.jdbc.odbc.JdbcOdbcDriver</param-value>  
</context-param>  
  
</web-app>  
welcome.jsp
<%   
  
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=application.getInitParameter("dname");  
out.print("driver name is="+driver);  
  
%>  


The HREF is an attribute of the anchor tag, which is also used to identify sections within a document. 
The HREF contains two components: the URL, which is the actual link, and the clickable text that appears 
on the page, called the "anchor text."

session implicit object
In JSP, session is an implicit object of type HttpSession.The Java developer can use this object to set,get or 
remove attribute or to get session information.
Example of session implicit object
index.html
<html>  
<body>  
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
</body>  
</html>  
welcome.jsp
<html>  
<body>  
<%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
session.setAttribute("user",name);  
  
<a href="second.jsp">second jsp page</a>  
  
%>  
</body>  
</html>  
second.jsp
<html>  
<body>  
<%   
  
String name=(String)session.getAttribute("user");  
out.print("Hello "+name);  
  
%>  
</body>  
</html>  

 pageContext implicit object
In JSP, pageContext is an implicit object of type PageContext class.The pageContext object can be used to set,
get or remove attribute from one of the following scopes:

page
request
session
application

In JSP, page scope is the default scope.

Example of pageContext implicit object
index.html
<html>  
<body>  
<form action="welcome.jsp">  
<input type="text" name="uname">  
<input type="submit" value="go"><br/>  
</form>  
</body>  
</html>  
welcome.jsp
<html>  
<body>  
<%   
  
String name=request.getParameter("uname");  
out.print("Welcome "+name);  
  
pageContext.setAttribute("user",name,PageContext.SESSION_SCOPE);  
  
<a href="second.jsp">second jsp page</a>  
  
%>  
</body>  
</html>  
second.jsp
<html>  
<body>  
<%   
  
String name=(String)pageContext.getAttribute("user",PageContext.SESSION_SCOPE);  
out.print("Hello "+name);  
  
%>  
</body>  
</html>  


8) page implicit object:
In JSP, page is an implicit object of type Object class.This object is assigned to the reference of auto generated servlet class. It is written as:
Object page=this;
For using this object it must be cast to Servlet type.For example:
<% (HttpServlet)page.log("message"); %>
Since, it is of type Object it is less used because you can use this object directly in jsp.For example:
<% this.log("message"); %>

Exception implicit object
In JSP, exception is an implicit object of type java.lang.Throwable class. This object can be used to print the exception. But it can only be used in error pages.It is better to learn it after page directive. Let's see a simple example:
Example of exception implicit object:
error.jsp
<%@ page isErrorPage="true" %>  
<html>  
<body>  
  
Sorry following exception occured:<%= exception %>  
  
</body>  
</html>  


JSP directives

The jsp directives are messages that tells the web container how to translate a JSP page into the corresponding
 servlet.

There are three types of directives:

page directive
include directive
taglib directive

Syntax of JSP Directive
<%@ directive attribute="value" %>  
JSP page directive
The page directive defines attributes that apply to an entire JSP page.

Syntax of JSP page directive
<%@ page attribute="value" %>  

 
Attributes of JSP page directive
import
contentType
extends
info
buffer
language
isELIgnored
isThreadSafe
autoFlush
session
pageEncoding
errorPage
isErrorPage

1)import
The import attribute is used to import class,interface or all the members of a package.It is similar to import 
keyword in java class or interface.
Example of import attribute
<html>  
<body>  
  
<%@ page import="java.util.Date" %>  
Today is: <%= new Date() %>  
  
</body>  
</html>  
2)contentType
The contentType attribute defines the MIME(Multipurpose Internet Mail Extension) type of the HTTP response.
The default value is "text/html;charset=ISO-8859-1".


Example of contentType attribute
<html>  
<body>  
  
<%@ page contentType=application/msword %>  
Today is: <%= new java.util.Date() %>  
  
</body>  
</html>  
3)extends
The extends attribute defines the parent class that will be inherited by the generated servlet.It is rarely used.

4)info
This attribute simply sets the information of the JSP page which is retrieved later by using getServletInfo() 
method of Servlet interface.

Example of info attribute
<html>  
<body>  
  
<%@ page info="composed by Sonoo Jaiswal" %>  
Today is: <%= new java.util.Date() %>  
  
</body>  
</html>  
The web container will create a method getServletInfo() in the resulting servlet.For example:

public String getServletInfo() {  
  return "composed by Sonoo Jaiswal";   
}  
5)buffer
The buffer attribute sets the buffer size in kilobytes to handle output generated by the JSP page.
The default size of the buffer is 8Kb.

Example of buffer attribute
<html>  
<body>  
  
<%@ page buffer="16kb" %>  
Today is: <%= new java.util.Date() %>  
  
</body>  
</html>  
6)language
The language attribute specifies the scripting language used in the JSP page. The default value is "java".

7)isELIgnored
We can ignore the Expression Language (EL) in jsp by the isELIgnored attribute. By default its value is false 
i.e. Expression Language is enabled by default. We see Expression Language later.
<%@ page isELIgnored="true" %>//Now EL will be ignored  

8)isThreadSafe
Servlet and JSP both are multithreaded.If you want to control this behaviour of JSP page, 
you can use isThreadSafe attribute of page directive.The value of isThreadSafe value is true.
If you make it false, the web container will serialize the multiple requests, i.e. it will wait 
until the JSP finishes responding to a request before passing another request to it.
If you make the value of isThreadSafe attribute like:

<%@ page isThreadSafe="false" %>

The web container in such a case, will generate the servlet as:

public class SimplePage_jsp extends HttpJspBase   
  implements SingleThreadModel{  
.......  
}  
9)errorPage
The errorPage attribute is used to define the error page, if exception occurs in the current page, 
it will be redirected to the error page.


Example of errorPage attribute
//index.jsp  
<html>  
<body>  
  
<%@ page errorPage="myerrorpage.jsp" %>  
  
 <%= 100/0 %>  
  
</body>  
</html>  
10)isErrorPage
The isErrorPage attribute is used to declare that the current page is the error page.

Note: The exception object can only be used in the error page.
Example of isErrorPage attribute
//myerrorpage.jsp  
<html>  
<body>  
  
<%@ page isErrorPage="true" %>  
  
 Sorry an exception occured!<br/>  
The exception is: <%= exception %>  
  
</body>  
</html>


Jsp Include Directive

The include directive is used to include the contents of any resource it may be jsp file, html file or text file. 
The include directive includes the original content of the included resource at page translation time 
(the jsp page is translated only once so it will be better to include static resource).

Advantage of Include directive
Code Reusability

Syntax of include directive
<%@ include file="resourceName" %>  
Example of include directive
In this example, we are including the content of the header.html file. 
To run this example you must create an header.html file.

<html>  
<body>  
  
<%@ include file="header.html" %>  
  
Today is: <%= java.util.Calendar.getInstance().getTime() %>  
  
</body>  
</html>  


What is taglib uri?
The taglib <uri> is just a name, not a location

The <uri> element in the TLD is a unique name for the tag library. That's it.
t does NOT need to represent any actual location (path or URL, for example). 
It simply has to be a name—the same name you use in the taglib directive.


JSP Taglib directive

The JSP taglib directive is used to define a tag library that defines many tags. 
We use the TLD (Tag Library Descriptor) file to define the tags. 
In the custom tag section we will use this tag so it will be better to learn it in custom tag.

Syntax JSP Taglib directive
<%@ taglib uri="uriofthetaglibrary" prefix="prefixoftaglibrary" %>  
Example of JSP Taglib directive
In this example, we are using our tag named currentDate. 
To use this tag we must specify the taglib directive so the container may get information about the tag.

<html>  
<body>  
  
<%@ taglib uri="http://www.javatpoint.com/tags" prefix="mytag" %>  
  
<mytag:currentDate/>  
  
</body>  
</html>


Exception Handling in JSP

The exception is normally an object that is thrown at runtime. Exception Handling is the process to handle the runtime errors. There may occur exception any time in your web application. So handling exceptions is a safer side for the web developer. In JSP, there are two ways to perform exception handling:

By errorPage and isErrorPage attributes of page directive
By <error-page> element in web.xml file
Example of exception handling in jsp by the elements of page directive
In this case, you must define and create a page to handle the exceptions, as in the error.jsp page. The pages where may occur exception, define the errorPage attribute of page directive, as in the process.jsp page.

There are 3 files:

index.jsp for input values
process.jsp for dividing the two numbers and displaying the result
error.jsp for handling the exception
index.jsp
<form action="process.jsp">  
No1:<input type="text" name="n1" /><br/><br/>  
No1:<input type="text" name="n2" /><br/><br/>  
<input type="submit" value="divide"/>  
</form>  
process.jsp
<%@ page errorPage="error.jsp" %>  
<%  
  
String num1=request.getParameter("n1");  
String num2=request.getParameter("n2");  
  
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.print("division of numbers is: "+c);  
  
%>  
error.jsp
<%@ page isErrorPage="true" %>  
  
<h3>Sorry an exception occured!</h3>  
  
Exception is: <%= exception %>  
download this example
Output of this example:
exception handling in jsp exception handling in jsp exception handling in jsp exception handling in jsp

 
Example of exception handling in jsp by specifying the error-page element in web.xml file
This approach is better because you don't need to specify the errorPage attribute in each jsp page. Specifying the single entry in the web.xml file will handle the exception. In this case, either specify exception-type or error-code with the location element. If you want to handle all the exception, you will have to specify the java.lang.Exception in the exception-type element. Let's see the simple example:


There are 4 files:

web.xml file for specifying the error-page element
index.jsp for input values
process.jsp for dividing the two numbers and displaying the result
error.jsp for displaying the exception
1) web.xml file if you want to handle any exception
<web-app>  
  
 <error-page>  
  <exception-type>java.lang.Exception</exception-type>  
  <location>/error.jsp</location>  
  </error-page>  
   
</web-app>  
This approach is better if you want to handle any exception. If you know any specific error code and you want to handle that exception, specify the error-code element instead of exception-type as given below:

1) web.xml file if you want to handle the exception for a specific error code
<web-app>  
  
 <error-page>  
  <error-code>500</error-code>  
  <location>/error.jsp</location>  
  </error-page>  
   
</web-app>  
2) index.jsp file is same as in the above example
3) process.jsp
Now, you don't need to specify the errorPage attribute of page directive in the jsp page.
<%@ page errorPage="error.jsp" %>  
<%  
  
String num1=request.getParameter("n1");  
String num2=request.getParameter("n2");  
  
int a=Integer.parseInt(num1);  
int b=Integer.parseInt(num2);  
int c=a/b;  
out.print("division of numbers is: "+c);  
  
%>  

4) error.jsp file is same as in the above example

JSP Action Tags

There are many JSP action tags or elements. Each JSP action tag is used to perform some specific tasks.

The action tags are used to control the flow between pages and to use Java Bean. 
The Jsp action tags are given below.

JSP Action Tags	Description
jsp:forward	forwards the request and response to another resource.
jsp:include	includes another resource.
jsp:useBean	creates or locates bean object.
jsp:setProperty	sets the value of property in bean object.
jsp:getProperty	prints the value of property of the bean.
jsp:plugin	embeds another components such as applet.
jsp:param	sets the parameter value. It is used in forward and include mostly.
jsp:fallback	can be used to print the message if plugin is working. It is used in jsp:plugin.

 
The jsp:useBean, jsp:setProperty and jsp:getProperty tags are used for bean development. 
So we will see these tags in bean developement.

jsp:forward action tag
The jsp:forward action tag is used to forward the request to another resource it may be jsp, html or 
another resource.

Syntax of jsp:forward action tag without parameter
<jsp:forward page="relativeURL | <%= expression %>" />  
Syntax of jsp:forward action tag with parameter
<jsp:forward page="relativeURL | <%= expression %>">  
<jsp:param name="parametername" value="parametervalue | <%=expression%>" />  
</jsp:forward>  
Example of jsp:forward action tag without parameter
In this example, we are simply forwarding the request to the printdate.jsp file.

index.jsp
<html>  
<body>  
<h2>this is index page</h2>  
  
<jsp:forward page="printdate.jsp" />  
</body>  
</html>  
printdate.jsp
<html>  
<body>  
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
</body>  
</html>  
download this example
Example of jsp:forward action tag with parameter
In this example, we are forwarding the request to the printdate.jsp file with parameter and printdate.jsp file
 prints the parameter value with date and time.

index.jsp
<html>  
<body>  
<h2>this is index page</h2>  
  
<jsp:forward page="printdate.jsp" >  
<jsp:param name="name" value="javatpoint.com" />  
</jsp:forward>  
  
</body>  
</html>  
printdate.jsp
<html>  
<body>  
  
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  
<%= request.getParameter("name") %>  
  
</body>  
</html>  

jsp:include action tag

The jsp:include action tag is used to include the content of another resource it may be jsp, html or servlet.

The jsp include action tag includes the resource at request time so it is better for dynamic pages because 
there might be changes in future.

The jsp:include tag can be used to include static as well as dynamic pages.

Advantage of jsp:include action tag
Code reusability : We can use a page many times such as including header and footer pages in all pages.
 So it saves a lot of time.


Difference between jsp include directive and include action

JSP include directive	JSP include action
includes resource at translation time.	includes resource at request time.
better for static pages.	better for dynamic pages.
includes the original content in the generated servlet.	calls the include method.

Syntax of jsp:include action tag without parameter
<jsp:include page="relativeURL | <%= expression %>" />  
Syntax of jsp:include action tag with parameter
<jsp:include page="relativeURL | <%= expression %>">  
<jsp:param name="parametername" value="parametervalue | <%=expression%>" />  
</jsp:include>  

 
Example of jsp:include action tag without parameter
In this example, index.jsp file includes the content of the printdate.jsp file.

File: index.jsp
<h2>this is index page</h2>  
  
<jsp:include page="printdate.jsp" />  
  
<h2>end section of index page</h2>  
File: printdate.jsp
<% out.print("Today is:"+java.util.Calendar.getInstance().getTime()); %>  


JavaBean
A JavaBean is a Java class that should follow the following conventions:

It should have a no-arg constructor.
It should be Serializable.
It should provide methods to set and get the values of the properties, known as getter and setter methods.

Why use JavaBean?
According to Java white paper, it is a reusable software component.
 A bean encapsulates many objects into one object so that we can access this object from multiple places. 
 Moreover, it provides easy maintenance.

Simple example of JavaBean class
//Employee.java  
  
package mypack;  
public class Employee implements java.io.Serializable{  
private int id;  
private String name;  
public Employee(){}  
public void setId(int id){this.id=id;}  
public int getId(){return id;}  
public void setName(String name){this.name=name;}  
public String getName(){return name;}  
}  
How to access the JavaBean class?
To access the JavaBean class, we should use getter and setter methods.

package mypack;  
public class Test{  
public static void main(String args[]){  
Employee e=new Employee();//object is created  
e.setName("Arjun");//setting value to the object  
System.out.println(e.getName());  
}}  
Note: There are two ways to provide values to the object. One way is by constructor and second is by setter method.
JavaBean Properties
A JavaBean property is a named feature that can be accessed by the user of the object. 
The feature can be of any Java data type, containing the classes that you define.

A JavaBean property may be read, write, read-only, or write-only.
 JavaBean features are accessed through two methods in the JavaBean's implementation class:

1. getPropertyName ()

For example, if the property name is firstName, the method name would be getFirstName() to read that property. 
This method is called the accessor.

2. setPropertyName ()

For example, if the property name is firstName, the method name would be setFirstName() to write that property. 
This method is called the mutator.

Advantages of JavaBean
The following are the advantages of JavaBean:/p>

The JavaBean properties and methods can be exposed to another application.
It provides an easiness to reuse the software components.

Disadvantages of JavaBean
The following are the disadvantages of JavaBean:

JavaBeans are mutable. So, it can't take advantages of immutable objects.
Creating the setter and getter method for each property separately may lead to the boilerplate code.



jsp:useBean action tag

The jsp:useBean action tag is used to locate or instantiate a bean class. 
If bean object of the Bean class is already created, it doesn't create the bean depending on the scope. 
But if object of bean is not created, it instantiates the bean.

Syntax of jsp:useBean action tag
<jsp:useBean id= "instanceName" scope= "page | request | session | application"   
class= "packageName.className" type= "packageName.className"  
beanName="packageName.className | <%= expression >" >  
</jsp:useBean>  
Attributes and Usage of jsp:useBean action tag
id: is used to identify the bean in the specified scope.
scope: represents the scope of the bean. It may be page, request, session or application. 
The default scope is page.

page: specifies that you can use this bean within the JSP page. The default scope is page.

request: specifies that you can use this bean from any JSP page that processes the same request. 
It has wider scope than page.

session: specifies that you can use this bean from any JSP page in the same session whether processes the same 
request or not. It has wider scope than request.

application: specifies that you can use this bean from any JSP page in the same application. 
It has wider scope than session.

class: instantiates the specified bean class (i.e. creates an object of the bean class) 
but it must have no-arg or no constructor and must not be abstract.

type: provides the bean a data type if the bean already exists in the scope.
It is mainly used with class or beanName attribute. If you use it without class or beanName, no bean 
is instantiated.

beanName: instantiates the bean using the java.beans.Beans.instantiate() method.

 
Simple example of jsp:useBean action tag
In this example, we are simply invoking the method of the Bean class.

For the example of setProperty, getProperty and useBean tags, visit next page.
Calculator.java (a simple Bean class)
package com.javatpoint;  
public class Calculator{  
  
public int cube(int n){return n*n*n;}  
  
}  

index.jsp file
<jsp:useBean id="obj" class="com.javatpoint.Calculator"/>  
  
<%  
int m=obj.cube(5);  
out.print("cube of 5 is "+m);  
%>  


jsp:setProperty and jsp:getProperty action tags

The setProperty and getProperty action tags are used for developing web application with Java Bean.
 In web devlopment, bean class is mostly used because it is a reusable software component that represents data.

The jsp:setProperty action tag sets a property value or values in a bean using the setter method.



Syntax of jsp:setProperty action tag

<jsp:setProperty name="instanceOfBean" property= "*"   |   
property="propertyName" param="parameterName"  |   
property="propertyName" value="{ string | <%= expression %>}"   
/>  

Example of jsp:setProperty action tag if you have to set all the values of incoming request in the bean

<jsp:setProperty name="bean" property="*" />  

Example of jsp:setProperty action tag if you have to set value of the incoming specific property

<jsp:setProperty name="bean" property="username" />   

Example of jsp:setProperty action tag if you have to set a specific value in the property

<jsp:setProperty name="bean" property="username" value="Kumar" />  
jsp:getProperty action tag
The jsp:getProperty action tag returns the value of the property.

Syntax of jsp:getProperty action tag
<jsp:getProperty name="instanceOfBean" property="propertyName" />  
Simple example of jsp:getProperty action tag
<jsp:getProperty name="obj" property="name" />  

 
Example of bean development in JSP
In this example there are 3 pages:


index.html for input of values
welocme.jsp file that sets the incoming values to the bean object and prints the one value
User.java bean class that have setter and getter methods
index.html
<form action="process.jsp" method="post">  
Name:<input type="text" name="name"><br>  
Password:<input type="password" name="password"><br>  
Email:<input type="text" name="email"><br>  
<input type="submit" value="register">  
</form>  
process.jsp
<jsp:useBean id="u" class="org.sssit.User"></jsp:useBean>  
<jsp:setProperty property="*" name="u"/>  
  
Record:<br>  
<jsp:getProperty property="name" name="u"/><br>  
<jsp:getProperty property="password" name="u"/><br>  
<jsp:getProperty property="email" name="u" /><br>  
User.java
package org.sssit;  
  
public class User {  
private String name,password,email;  
//setters and getters  
}  


Expression Language (EL) in JSP

The Expression Language (EL) simplifies the accessibility of data stored in the Java Bean component, and other 
objects like request, session, application etc.

There are many implicit objects, operators and reserve words in EL.

It is the newly added feature in JSP technology version 2.0.


Syntax for Expression Language (EL)
${ expression }  
Implicit Objects in Expression Language (EL)
There are many implicit objects in the Expression Language. They are as follows:


Implicit Objects	Usage
pageScope	it maps the given attribute name with the value set in the page scope
requestScope	it maps the given attribute name with the value set in the request scope
sessionScope	it maps the given attribute name with the value set in the session scope
applicationScope	it maps the given attribute name with the value set in the application scope
param	it maps the request parameter to the single value
paramValues	it maps the request parameter to an array of values
header	it maps the request header name to the single value
headerValues	it maps the request header name to an array of values
cookie	it maps the given cookie name to the cookie value
initParam	it maps the initialization parameter
pageContext	it provides access to many objects request, session etc.

 
EL param example
In this example, we have created two files index.jsp and process.jsp. The index.jsp file gets input from the
 user and sends the request to the process.jsp which in turn prints the name of the user using EL.

index.jsp
<form action="process.jsp">  
Enter Name:<input type="text" name="name" /><br/><br/>  
<input type="submit" value="go"/>  
</form>  
process.jsp
Welcome, ${ param.name }  
download this example
EL sessionScope example
In this example, we printing the data stored in the session scope using EL. For this purpose, we have used 
sessionScope object.

index.jsp
<h3>welcome to index page</h3>  
<%  
session.setAttribute("user","sonoo");  
%>  
  
<a href="process.jsp">visit</a>  
process.jsp
Value is ${ sessionScope.user }  
download this example
EL cookie example
index.jsp
<h1>First JSP</h1>  
<%  
Cookie ck=new Cookie("name","abhishek");  
response.addCookie(ck);  
%>  
<a href="process.jsp">click</a>  
process.jsp
Hello, ${cookie.name.value}  
Precedence of Operators in EL
There are many operators that have been provided in the Expression Language. Their precedence are as follows:

[] .
()
-(unary) not ! empty
* / div % mod
+ - (binary)
< <= > >= lt le gt ge
== != eq ne
&& and
|| or
?:
Reserve words in EL
There are many reserve words in the Expression Language. They are as follows:

lt	le	gt	ge
eq	ne	true	false
and	or	not	instanceof
div	mod	empty	null



MVC stands for Model View and Controller. It is a design pattern that separates the business logic, presentation logic and data.

Controller acts as an interface between View and Model. Controller intercepts all the incoming requests.

Model represents the state of the application i.e. data. It can also have business logic.

View represents the presentaion i.e. UI(User Interface).


Advantage of MVC (Model 2) Architecture
Navigation Control is centralized
Easy to maintain the large application
mvc architecture
If you new to MVC, please visit Model1 vs Model2 first.

 
MVC Example in JSP
In this example, we are using servlet as a controller, jsp as a view component, Java Bean class as a model.

In this example, we have created 5 pages:

index.jsp a page that gets input from the user.
ControllerServlet.java a servlet that acts as a controller.
login-success.jsp and login-error.jsp files acts as view components.
web.xml file for mapping the servlet.

File: index.jsp
<form action="ControllerServlet" method="post">  
Name:<input type="text" name="name"><br>  
Password:<input type="password" name="password"><br>  
<input type="submit" value="login">  
</form>  

File: ControllerServlet
package com.javatpoint;  
import java.io.IOException;  
import java.io.PrintWriter;  
import javax.servlet.RequestDispatcher;  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
public class ControllerServlet extends HttpServlet {  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter();  
          
        String name=request.getParameter("name");  
        String password=request.getParameter("password");  
          
        LoginBean bean=new LoginBean();  
        bean.setName(name);  
        bean.setPassword(password);  
        request.setAttribute("bean",bean);  
          
        boolean status=bean.validate();  
          
        if(status){  
            RequestDispatcher rd=request.getRequestDispatcher("login-success.jsp");  
            rd.forward(request, response);  
        }  
        else{  
            RequestDispatcher rd=request.getRequestDispatcher("login-error.jsp");  
            rd.forward(request, response);  
        }  
      
    }  
  
    @Override  
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
            throws ServletException, IOException {  
        doPost(req, resp);  
    }  
}  

File: LoginBean.java
package com.javatpoint;  
public class LoginBean {  
private String name,password;  
  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
public String getPassword() {  
    return password;  
}  
public void setPassword(String password) {  
    this.password = password;  
}  
public boolean validate(){  
    if(password.equals("admin")){  
        return true;  
    }  
    else{  
        return false;  
    }  
}  
}  

File: login-success.jsp
<%@page import="com.javatpoint.LoginBean"%>  
  
<p>You are successfully logged in!</p>  
<%  
LoginBean bean=(LoginBean)request.getAttribute("bean");  
out.print("Welcome, "+bean.getName());  
%>  

File: login-error.jsp
<p>Sorry! username or password error</p>  
<%@ include file="index.jsp" %>  

File: web.xml
<?xml version="1.0" encoding="UTF-8"?>  
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"   
xmlns="http://java.sun.com/xml/ns/javaee" xmlns:web="http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"   
xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_3_0.xsd"   
id="WebApp_ID" version="3.0">  
    
  <servlet>  
  <servlet-name>s1</servlet-name>  
  <servlet-class>com.javatpoint.ControllerServlet</servlet-class>  
  </servlet>  
  <servlet-mapping>  
  <servlet-name>s1</servlet-name>  
  <url-pattern>/ControllerServlet</url-pattern>  
  </servlet-mapping>  
</web-app>  




JSTL (JSP Standard Tag Library)
The JSP Standard Tag Library (JSTL) represents a set of tags to simplify the JSP development.

Advantage of JSTL
Fast Development JSTL provides many tags that simplify the JSP.
Code Reusability We can use the JSTL tags on various pages.
No need to use scriptlet tag It avoids the use of scriptlet tag.
JSTL Tags
There JSTL mainly provides five types of tags:

Tag Name	              Description
Core tags	            The JSTL core tag provide variable support, URL management, flow control, etc. The URL for the core tag is http://java.sun.com/jsp/jstl/core. The prefix of core tag is c.
Function tags	        The functions tags provide support for string manipulation and string length. The URL for the functions tags is http://java.sun.com/jsp/jstl/functions and prefix is fn.
Formatting tags	        The Formatting tags provide support for message formatting, number and date formatting, etc. The URL for the Formatting tags is http://java.sun.com/jsp/jstl/fmt and prefix is fmt.
XML tags	            The XML tags provide flow control, transformation, etc. The URL for the XML tags is http://java.sun.com/jsp/jstl/xml and prefix is x.
SQL tags	            The JSTL SQL tags provide SQL support. The URL for the SQL tags is http://java.sun.com/jsp/jstl/sql and prefix is sql.

The taglib <uri> is just a name, not a location ... 
The <uri> element in the TLD is a unique name for the tag library. That's it

JSTL Core Tags
The JSTL core tag provides variable support, URL management, flow control etc. The syntax used for including JSTL core library in your JSP is:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
JSTL Core Tags List
Tags	                              Description
c:out	                              It display the result of an expression, similar to the way <%=...%> tag work.
c:import	                          It Retrives relative or an absolute URL and display the contents to either a String in 'var',a Reader in 'varReader' or the page.
c:set	                              It sets the result of an expression under evaluation in a 'scope' variable.
c:remove	                          It is used for removing the specified scoped variable from a particular scope.
c:catch	                              It is used for Catches any Throwable exceptions that occurs in the body.
c:if	                              It is conditional tag used for testing the condition and display the body content only if the expression evaluates is true.
c:choose, c:when, c:otherwise	      It is the simple conditional tag that includes its body content if the evaluated condition is true.
c:forEach	                          It is the basic iteration tag. It repeats the nested body content for fixed number of times or over collection.
c:forTokens	                          It iterates over tokens which is separated by the supplied delimeters.
c:param	                              It adds a parameter in a containing 'import' tag's URL.
c:redirect	                          It redirects the browser to a new URL and supports the context-relative URLs.
c:url	                              It creates a URL with optional query parameters.



JSTL Core <c:out> Tag
The <c:out> tag is similar to JSP expression tag, but it can only be used with expression. 
It will display the result of an expression, similar to the way < %=...% > work.

The < c:out > tag automatically escape the XML tags. Hence they aren't evaluated as actual tags.

Let's see the simple example of c:out tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body>  
<c:out value="${'Welcome to javaTpoint'}"/>  
</body>  
</html>  


JSTL Core <c:import> Tag
The <c:import> is similar to jsp 'include', with an additional feature of including the content of any resource
 either within server or outside the server.

This tag provides all the functionality of the <include > action and it also allows the inclusion of absolute URLs.

For example: Using an import tag the content from a different FTP server and website can be accessed.

Let's see the simple example of c:import tag:



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Tag Example</title>  
</head>  
<body>  
<c:import var="data" url="http://www.javatpoint.com"/>  
<c:out value="${data}"/>  
</body>  
</html>  
Above example would fetch the complete content from javatpoint.com and would store in a variable "data" 
which will printed eventually.

JSTL Core <c:set> Tag
It is used to set the result of an expression evaluated in a 'scope'. The <c:set> tag is helpful because it evaluates the expression and use the result to set a value of java.util.Map or JavaBean.

This tag is similar to jsp:setProperty action tag.

Let's see the simple example of <c:set> tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="Income" scope="session" value="${4000*4}"/>  
<c:out value="${Income}"/>  
</body>  
</html>  

Output:


16000  


JSTL Core <c:remove> Tag
It is used for removing the specified variable from a particular scope. 
This action is not particularly helpful, but it can be used for ensuring that 
a JSP can also clean up any scope resources.

The <c:remove > tag removes the variable from either a first scope or a specified scope.

Let's see the simple example of c:remove tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Before Remove Value is: <c:out value="${income}"/></p>  
<c:remove var="income"/>  
<p>After Remove Value is: <c:out value="${income}"/></p>  
</body>  
</html>  

Output:

Before Remove Value is: 16000  
After Remove Value is:  


JSTL Core <c:catch> Tag
It is used for Catches any Throwable exceptions that occurs in the body and optionally exposes it. In general it is used for error handling and to deal more easily with the problem occur in program.

The < c:catch > tag catches any exceptions that occurs in a program body.

Let's see the simple example of c:catch tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
  
<c:catch var ="catchtheException">  
   <% int x = 2/0;%>  
</c:catch>  
  
<c:if test = "${catchtheException != null}">  
   <p>The type of exception is : ${catchtheException} <br />  
   There is an exception: ${catchtheException.message}</p>  
</c:if>  
  
</body>  
</html>  

Output:

The type of exception is : java.lang.ArithmaticException: / by zero  
There is an exception: / by zero  


JSTL Core <c:if> Tag
The < c:if > tag is used for testing the condition and it display the body content,
 if the expression evaluated is true.

It is a simple conditional tag which is used for evaluating the body content, if the supplied condition is true.

Let's see the simple example of c:if tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="income" scope="session" value="${4000*4}"/>  
<c:if test="${income > 8000}">  
   <p>My income is: <c:out value="${income}"/><p>  
</c:if>  
</body>  
</html>  

Output:

My income is: 16000  



JSTL Core <c:choose>, <c:when>, <c:otherwise> Tag
The < c:choose > tag is a conditional tag that establish a context for mutually exclusive conditional operations. It works like a Java switch statement in which we choose between a numbers of alternatives.

The <c:when > is subtag of <choose > that will include its body if the condition evaluated be 'true'.

The < c:otherwise > is also subtag of < choose > it follows &l;twhen > tags and runs only if all the prior condition evaluated is 'false'.

The c:when and c:otherwise works like if-else statement. But it must be placed inside c:choose tag.



JSTL Core <c:choose>, <c:when>, <c:otherwise> Example
Let's see the simple example of < c:choose >, < c:when > < c:otherwise > tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:set var="income" scope="session" value="${4000*4}"/>  
<p>Your income is : <c:out value="${income}"/></p>  
<c:choose>  
    <c:when test="${income <= 1000}">  
       Income is not good.  
    </c:when>  
    <c:when test="${income > 10000}">  
        Income is very good.  
    </c:when>  
    <c:otherwise>  
       Income is undetermined...  
    </c:otherwise>  
</c:choose>  
</body>  
</html>  

This will produce the following result:

Your income is : 16000  
Income is very good.  

JSTL Core <c:forEach> Tag
The <c:for each > is an iteration tag used for repeating the nested body content for fixed number of times or over the collection.

These tag used as a good alternative for embedding a Java while, do-while, or for loop via a scriptlet. The < c:for each > tag is most commonly used tag because it iterates over a collection of object.

Let's see the simple example of tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:forEach var="j" begin="1" end="3">  
   Item <c:out value="${j}"/><p>  
</c:forEach>  
</body>  
</html>  

Output:

Item 1  
Item 2  
Item 3  


JSTL Core <c:forTokens> Tag
The < c:forTokens > tag iterates over tokens which is separated by the supplied delimeters. 
It is used for break a string into tokens and iterate through each of the tokens to generate output.

This tag has similar attributes as < c:forEach > tag except one additional attributes delims which is used for 
specifying the characters to be used as delimiters.

Let's see the simple example of < c:forTokens > tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">  
   <c:out value="${name}"/><p>  
</c:forTokens>  
</body>  
</html>  

Output:

Rahul  
Nakul  
Rajesh  

JSTL Core <c:param> Tag
The < c:param > tag add the parameter in a containing 'import' tag's URL. 
It allow the proper URL request parameter to be specified within URL and it automatically perform any necessary 
URL encoding.

Inside < c:param > tag, the value attribute indicates the parameter value and name attribute indicates the 
parameter name.

Let's see the simple example of tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:url value="/index1.jsp" var="completeURL"/>  
 <c:param name="trackingId" value="786"/>  
 <c:param name="user" value="Nakul"/>  
</c:url>  
${completeURL}  
</body>  
</html>  

Output:

/JSP/index1.jsp?trackingId=786&user=Nakul  



JSTL Core <c:redirect> Tag
The < c:redirect > tag redirects the browser to a new URL.
 It supports the context-relative URLs, and the < c:param > tag.

It is used for redirecting the browser to an alternate URL by using automatic URL rewriting.

Let's see the simple example of < c:redirect > tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
  <c:set var="url" value="0" scope="request"/>  
  <c:if test="${url<1}">  
     <c:redirect url="http://javatpoint.com"/>  
  </c:if>  
  <c:if test="${url>1}">  
     <c:redirect url="http://facebook.com"/>  
  </c:if>  
</body>  
</html>  

Output:

Since the value of the variable 'url' is 0 the page gets directed to the http://javatpoint.com .



JSTL Core <c:url> Tag
The < c:url > tag creates a URL with optional query parameter. It is used for url encoding or url formatting. 
This tag automatically performs the URL rewriting operation.

The JSTL url tag is used as an alternative method of writing call to the response.encodeURL() method. 
The advantage of url tag is proper URL encoding and including the parameters specified by children. param tag.

Let's see the simple example of < c:url > tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<c:url value="/RegisterDao.jsp"/>  
</body>  
</html>  

Output:

/CRUD/RegisterDao.jsp  


JSTL Function Tags
The JSTL function provides a number of standard functions, most of these functions are common string manipulation 
functions. The syntax used for including JSTL function library in your JSP is:

<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
JSTL Function Tags List
JSTL Functions	                      Description
fn:contains()	                      It is used to test if an input string containing the specified substring in a program.
fn:containsIgnoreCase()	              It is used to test if an input string contains the specified substring as a case insensitive way.
fn:endsWith()	                      It is used to test if an input string ends with the specified suffix.
fn:escapeXml()	                      It escapes the characters that would be interpreted as XML markup.
fn:indexOf()	                      It returns an index within a string of first occurrence of a specified substring.
fn:trim()	                          It removes the blank spaces from both the ends of a string.
fn:startsWith()	                      It is used for checking whether the given string is started with a particular string value.
fn:split()	                          It splits the string into an array of substrings.
fn:toLowerCase()	                  It converts all the characters of a string to lower case.
fn:toUpperCase()	                  It converts all the characters of a string to upper case.
fn:substring()	                      It returns the subset of a string according to the given start and end position.
fn:substringAfter()	                  It returns the subset of string after a specific substring.
fn:substringBefore()	              It returns the subset of string before a specific substring.
fn:length()	                          It returns the number of characters inside a string, or the number of items in a collection.
fn:replace()	                      It replaces all the occurrence of a string with another string sequence.


JSTL fn:contains() Function
The fn:contains() is used for testing if the string containing the specified substring. 
If the specified substring is found in the string, it returns true otherwise false.

The syntax used for including the fn:contains() function is:

boolean contains(java.lang.String, java.lang.String)  
Let's see the simple example to understand the functionality of fn:contains() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="String" value="Welcome to javatpoint"/>  
  
<c:if test="${fn:contains(String, 'javatpoint')}">  
   <p>Found javatpoint string<p>  
</c:if>  
  
<c:if test="${fn:contains(String, 'JAVATPOINT')}">  
   <p>Found JAVATPOINT string<p>  
</c:if>  
  
</body>  
</html>  

Output:

Found javatpoint string  




JSTL fn:containsIgnoreCase() Function
The fn:containsIgnoreCase() function is used to test if an input string contains the specified substring as a case insensitive way. During searching the specified substring it ignores the case

The syntax used for including the fn:containsIgnoreCase() function is:

boolean containsIgnoreCase(java.lang.String, java.lang.String)  
Let's see the simple example to understand the functionality of fn:containsIgnoreCase() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="String" value="Welcome to javatpoint"/>  
  
<c:if test="${fn:containsIgnoreCase(String, 'javatpoint')}">  
   <p>Found javatpoint string<p>  
</c:if>  
  
<c:if test="${fn:containsIgnoreCase(String, 'JAVATPOINT')}">  
   <p>Found JAVATPOINT string<p>  
</c:if>  
  
</body>  
</html>  

Output:

Found javatpoint string  
Found JAVATPOINT string  



JSTL fn:endsWith() Function
The fn:endsWith() function is used for testing if an input string ends with the specified suffix. If the string ends with a specified suffix, it returns true otherwise false.

The syntax used for including the fn:endsWith() function is:

boolean endsWith(java.lang.String, java.lang.String)  
Let's see the simple example to understand the functionality of fn:endsWith() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="String" value="Welcome to JSP programming"/>  
  
<c:if test="${fn:endsWith(String, 'programming')}">  
   <p>String ends with programming<p>  
</c:if>  
  
<c:if test="${fn:endsWith(String, 'JSP')}">  
   <p>String ends with JSP<p>  
</c:if>  
  
</body>  
</html>  

Output:

String ends with programming  

JSTL fn:escapeXml() Function


The fn:escapeXml() function escapes the characters that would be interpreted as XML markup. 
It is used for escaping the character in XML markup language.

The syntax used for including the fn:escapeXml() function is:

java.lang.String escapeXml(java.lang.String)  
Let's see the simple example to understand the functionality of fn:escapeXml() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
  
<p>With escapeXml() Function:</p>  
<p>string-1 : ${fn:escapeXml(string1)}</p>  
<p>string-2 : ${fn:escapeXml(string2)}</p>  
  
<p>Without escapeXml() Function:</p>  
<p>string-1 : ${string1}</p>  
<p>string-2 : ${string2}</p>  
  
</body>  
</html>  

Output:

With escapeXml() Function:  
string-1 : It is first String.  
string-2 : It is <xyz>second String.</xyz>  

Without escapeXml() Function:  
string-1 : It is first String.  
string-2 : It is second String.  


JSTL fn:indexOf() Function
The fn:indexOf() function return an index of string. It is used for determining the index of string specified 
in substring.

The syntax used for including the fn:indexOf() function is:

int indexOf(java.lang.String, java.lang.String)  
Let's see the simple example to understand the functionality of fn:indexOf() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="string1" value="It is first String."/>  
<c:set var="string2" value="It is <xyz>second String.</xyz>"/>  
  
<p>Index-1 : ${fn:indexOf(string1, "first")}</p>  
<p>Index-2 : ${fn:indexOf(string2, "second")}</p>  
  
</body>  
</html>  

Output:

Index-1 : 6  
Index-2 : 11  


JSTL fn:trim() Function
The fn:trim() function removes the blank spaces from both the ends of a string. It mainly used for ignoring the blank spaces from both the ends of string.

The syntax used for including the fn:trim() function is:

java.lang.String trim(java.lang.String)  
Let's see the simple example to understand the functionality of fn:trim() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="str1" value="Welcome to JSP        programming         "/>  
<p>String-1 Length is : ${fn:length(str1)}</p>  
  
<c:set var="str2" value="${fn:trim(str1)}" />  
<p>String-2 Length is : ${fn:length(str2)}</p>  
<p>Final value of string is : ${str2}</p>  
  
</body>  
</html>  

Output:


String-1 Length is : 42  
String-2 Length is : 33  
Final value of string is : Welcome to JSP programming  

JSTL fn:startsWith() Function
The fn:startsWith() function test if an input string is started with the specified substring.

The syntax used for including the fn:startsWith() function is:

boolean fn:startsWith(String input, String prefix)  
This function is used for returning a boolean value. It gives the true result when the string is started with the given prefix otherwise it returns a false result.

Let's see the simple example to understand the functionality of fn:startsWith() function:


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function</title>  
</head>  
<body>  
<c:set var="msg" value="The Example of JSTL fn:startsWith() Function"/>  
The string starts with "The": ${fn:startsWith(msg, 'The')}  
<br>The string starts with "Example": ${fn:startsWith(msg, 'Example')}  
</body>  
</html>  

Output:

The string starts with "The": true  
The string starts with "Example": false  



String delimiter
In Java, delimiters are the characters that split (separate) the string into tokens.

JSTL fn:split() Function
The fn:split() function splits the string into an array of substrings. It is used for splitting the string into an array based on a delimiter string.

The syntax used for including the fn:split() function is:

java.lang.String[] split(java.lang.String, java.lang.String)  
Let's see the simple example to understand the functionality of fn:split() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Functions</title>  
</head>  
<body>  
  
<c:set var="str1" value="Welcome-to-JSP-Programming."/>  
<c:set var="str2" value="${fn:split(str1, '-')}" />  
<c:set var="str3" value="${fn:join(str2, ' ')}" />  
  
<p>String-3 : ${str3}</p>  
<c:set var="str4" value="${fn:split(str3, ' ')}" />  
<c:set var="str5" value="${fn:join(str4, '-')}" />  
  
<p>String-5 : ${str5}</p>  
  
</body>  
</html>  

Output:


String-3 : Welcome to JSP Programming.  
String-5 : Welcome-to-JSP-Programming.  


JSTL fn:toLowerCase() Function

The fn:toLowerCase() function converts all the characters of a string to lower case.
 It is used for replacing any upper case character in the input string with the corresponding lowercase character.

The syntax used for including the fn:toLowerCase() function is:

String fn:toLowerCase(String  input)  
Let's see the simple example to understand the functionality of fn:toLowerCase() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title> Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="Welcome to JSP Programming"/>  
${fn:toLowerCase("HELLO,")}  
${fn:toLowerCase(string)}  
</body>  
</html>  

Output:

hello, welcome to jsp programming  


JSTL fn:toUpperCase() Function
The fn:toUpperCase() function converts all the characters of a string to upper case. It is used for replacing any lower case character in the input string with the corresponding upper case character.

The syntax used for including the fn:toUpperCase() function is:

String fn:toUpperCase(String input)  
It returns the string value after converting the input string to uppercase.

Let's see the simple example to understand the functionality of fn:toUpperCase() function:


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
  <c:set var="site" value="javatpoint.com"/>  
  <c:set var="author" value="Sonoo Jaiswal"/>  
  Hi, This is ${fn:toUpperCase(site)} developed by ${fn:toUpperCase(author)}.  
</body>  
</html>  

Output:

Hi, This is JAVATPOINT.COM developed by SONOO JAISWAL.  


JSTL fn:substring() Function
The fn:substring() function returns the subset of a string. 
It is used to return the substring of given input string according to specified start and end position.

The syntax used for including the fn:substring() function is:

String fn:substring(String inputstring, int start, int end)  
start: It is starting position of substring
end: It is end position of substring
inputstring: It is string from which a substring needed to be taken
Return type of the function: String

Let's see the simple example to understand the functionality of fn:substring() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="This is the first string."/>  
${fn:substring(string, 5, 17)}  
</body>  
</html>  

Output:

is the first  

JSTL fn:substringAfter() Function
The fn:substringAfter() function returns the subset of string followed by a specific substring. It returns the part of string which lies after the provided string value.

The syntax used for including the fn:substringAfter() function is:

String fn:substringAfter(String input, String afterstring)  
Let's see the simple example to understand the functionality of fn:substringAfter() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="Nakul Jain"/>  
${fn:substringAfter(string, "Nakul")}  
</body>  
</html>  

Output:

Jain  

JSTL fn:substringBefore() Function
The fn:substringBefore() function returns the subset of string before a specific substring. 
It is used for returning a part of original string which lies before the specified string value.

The syntax used for including the fn:substringBefore() function is:

String fn:substringBefore(String input, String beforestring)  
Let's see the simple example to understand the functionality of fn:substringBefore() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
<c:set var="string" value="Hi, This is JAVATPOINT.COM developed by SONOO JAISWAL."/>  
${fn:substringBefore(string, "developed")}  
</body>  
</html>  

Output:

Hi, This is JAVATPOINT.COM  


JSTL fn:length() Function
The fn:length() function returns the number of characters inside a string, or the number of items in a collection. It is used for calculating the length of string and to find out the number of elements in a collection.

The syntax used for including the fn:length() function is:

int length(java.lang.Object)  
It returns the length of object. The return type of this function is int .

Let's see the simple example to understand the functionality of fn:length() function:


<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>JSTL fn:length() example</title>  
</head>  
<body>  
<c:set var="str1" value="This is first string"/>  
<c:set var="str2" value="Hello"/>  
Length of the String-1 is: ${fn:length(str1)}<br>  
Length of the String-2 is: ${fn:length(str2)}  
</body>  
</html>  

Output:

Length of the String-1 is: 20  
Length of the String-2 is: 5  


JSTL fn:replace() Function
The fn:replace() function replaces all the occurrence of a string with another string sequence. It search in an input string and replace it with the provided string.

The syntax used for including the fn:replace() function is:

String fn:replace(String input, String search_for, String replace_with)  
It searches the search_for string in the input and replaces it with replace_with string. In function three strings argument is used whose return type is also string.

Note: It performs case sensitive processing.


Let's see the simple example to understand the functionality of fn:replace() function:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<html>  
<head>  
<title>Using JSTL Function </title>  
</head>  
<body>  
<c:set var="author" value="Ramesh Kumar"/>  
<c:set var="string" value="pqr xyz abc PQR"/>  
${fn:replace(author, "Ramesh", "Suresh")}  
${fn:replace(string, "pqr", "hello")}  
</body>  
</html>  

Output:

Suresh Kumar hello xyz abc PQR  


JSTL Formatting tags
The formatting tags provide support for message formatting, number and date formatting etc.
 The url for the formatting tags is http://java.sun.com/jsp/jstl/fmt and prefix is fmt.

The JSTL formatting tags are used for internationalized web sites to display and format text, the time, the date
 and numbers. The syntax used for including JSTL formatting library in your JSP is:

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  

Formatting Tags	                          Descriptions
fmt:parseNumber	                          It is used to Parses the string representation of a currency, percentage or number.
fmt:timeZone	                          It specifies a parsing action nested in its body or the time zone for any time formatting.
fmt:formatNumber	                      It is used to format the numerical value with specific format or precision.
fmt:parseDate	                          It parses the string representation of a time and date.
fmt:bundle	                              It is used for creating the ResourceBundle objects which will be used by their tag body.
fmt:setTimeZone	                          It stores the time zone inside a time zone configuration variable.
fmt:setBundle	                          It loads the resource bundle and stores it in a bundle configuration variable or the named scoped variable.
fmt:message	                              It display an internationalized message.
fmt:formatDate	                          It formats the time and/or date using the supplied pattern and styles.



STL Formatting <fmt:parseNumber> Tag
The <fmt:parseNumber> tag is used to Parses the string representation of a currency, percentage, or number. It is based on the customized formatting pattern.

The syntax used for including the <fmt:parseNumber> tag is:

<fmt:parseNumber attributes> body content </fmt:parseNumber>  
Let's see the simple example to understand the formatting <fmt:parseNumber> tag:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<html>  
  <head>  
 <title>fmt:parseNumber tag</title>  
  </head>  
  <body>  
<h3>The fmt:parseNumber tag Example is:</h3>  
  
<c:set var="Amount" value="786.970" />  
  
    <fmt:parseNumber var="j" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  
    <fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}" />  
    <p><i>Amount is:</i>  <c:out value="${j}" /></p>  
  </body>  
</html>  

Output:

The fmt:parseNumber tag Example is:  
Amount is: 786.97  
Amount is: 786  



JSTL Formatting <fmt:timeZone> Tag
The <fmt:timeZone> tag specifies the parsing action nested in its body or the time zone for any time formatting. It is used for specify the time zone information used for time formatting operations.

The syntax used for including the <fmt:timeZone> tag is:

<fmt:timeZone attributes> body content </fmt:timeZone>  
Let's see the simple example to understand the formatting <fmt:timeZone> tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
  <head>  
    <title>fmt:timeZone Tag</title>  
  </head>  
  
  <body>  
    <c:set var="str" value="<%=new java.util.Date()%>" />  
    <table border="2" width="100%">  
      <tr>  
        <td width="100%" colspan="2" bgcolor="#FF7F50">  
          <p align="center">  
            <b>  
              <font color="#000000" size="6">Formatting:  
              <fmt:formatDate value="${str}" type="both"  
              timeStyle="long" dateStyle="long" />  
              </font>  
            </b>  
          </p>  
        </td>  
      </tr>  
  
      <c:forEach var="zone"  
      items="<%=java.util.TimeZone.getAvailableIDs()%>">  
        <tr>  
          <td width="50%"  bgcolor="#C0C0C0">  
            <c:out value="${zone}" />  
          </td>  
          <td width="50%" bgcolor="#FFEBCD">  
            <fmt:timeZone value="${zone}">  
              <fmt:formatDate value="${str}" timeZone="${zn}"  
              type="both"/>  
            </fmt:timeZone>  
          </td>  
        </tr>  
      </c:forEach>  
    </table>  
  </body>  
</html>  




STL Formatting <fmt:formatNumber> Tag
The <fmt:formatNumber> tag is used to format the numerical value using the specific format or precision. It is used to format percentages, currencies, and numbers according to the customized formatting pattern.

The syntax used for including the <fmt:formatNumber> tag is:

<fmt:formatNumber attributes> body content </fmt:formatNumber>  
Let's see the simple example to understand the formatting <fmt:formatNumber> tag:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
  
<html>  
<head>  
<title>fmt:formatNumber Tag</title>  
</head>  
<body>  
  
<h3>Formatting of Number:</h3>  
<c:set var="Amount" value="9850.14115" />  
<p> Formatted Number-1:  
<fmt:formatNumber value="${Amount}" type="currency" /></p>  
<p>Formatted Number-2:  
<fmt:formatNumber type="number" groupingUsed="true" value="${Amount}" /></p>  
<p>Formatted Number-3:  
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${Amount}" /></p>  
<p>Formatted Number-4:  
<fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}" /></p>  
<p>Formatted Number-5:  
<fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}" /></p>  
<p>Formatted Number-6:  
<fmt:formatNumber type="number" pattern="###.###$" value="${Amount}" /></p>  
</body>  
</html>  

Output:

Formatting of Number:  
Formatted Number-1: $9,850.14  
Formatted Number-2: 9,850.141  
Formatted Number-3: 850.141  
Formatted Number-4: 9,850.14115  
Formatted Number-5: 5,014%  
Formatted Number-6: 9850.141$  


JSTL Formatting <fmt:parseDate> Tag
The <fmt:parseDate> tag parses the string representation of a time and date. It is used to format the time and date according to a customized formatting pattern.

The syntax used for including the <fmt:parseDate> tag is:

<fmt:parseDate attributes/>  
Let's see the simple example to understand the formatting <fmt:parseDate> tag:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>  
  
<html>  
<head>  
  <title>fmt:parseDate Tag</title>  
</head>  
<body>  
<h3>Parsed Date:</h3>  
<c:set var="date" value="12-08-2016" />  
  
<fmt:parseDate value="${date}" var="parsedDate"  pattern="dd-MM-yyyy" />  
<p><c:out value="${parsedDate}" /></p>  
  
</body>  
</html>  

Output:

Parsed Date:

Fri Aug 12 00:00:00 IST 2016


JSTL Formatting <fmt:bundle> Tag
The <fmt:bundle> tag loads the resource bundle which is used by its tag body. 
This tag will make the specified bundle available for all <fmt:message> tags that occurs between the boundary 
of <fmt:bundle> and </fmt:bundle> tags.

It is used to create the ResourceBundle objects which will be used by their tag body.

The syntax used for including the <fmt:bundle> tag is:

<fmt:bundle basename="Resource Bundle Name" prefix="msg"> body content </fmt:bundle>  

Let's see the simple example to understand the formatting <fmt:bundle> tag:


Let us define the default resource bundle Simple.java as follows:

package com.javatpoint;  
import java.util.ListResourceBundle;  
public class Simple extends ListResourceBundle {  
    public Object[][] getContents() {  
        return contents;  
    }  
    static final Object[][] contents = { { "colour.Violet", "Violet" },  
            { "colour.Indigo", "Indigo" }, { "colour.Blue", "Blue" }, };  
}  
Now, compile the above class as Simple.class and make it available in CLASSPATH of your Web application folder.

Now you can use the below JSTL tags to display the three colors as follows:

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>fmt:bundle Tag</title>  
</head>  
<body>  
  
<fmt:bundle basename="com.javatpoint.Simple" prefix="colour.">  
   <fmt:message key="Violet"/><br/>  
   <fmt:message key="Indigo"/><br/>  
  <fmt:message key="Blue"/><br/>  
  
</fmt:bundle>  
  
</body>  
</html>  

Output:

Violet  
Indigo  
Blue  

JSTL Formatting <fmt:setTimeZone> Tag
The <fmt:setTimeZone> tag store the time zone inside a time zone configuration variable. It is used for copy a time zone object inside a specified scope variable.

The syntax used for including the <fmt:setTimeZone> tag is:

<fmt:setTimeZone value="value" var="var name" scope="scope"/>  
Let's see the simple example to understand the formatting <fmt:setTimeZone> tag:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>fmt:setTimeZone Tag</title>  
</head>  
<body>  
<c:set var="date" value="<%=new java.util.Date()%>" />  
<p><b>Date and Time in Indian Standard Time(IST) Zone:</b> <fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p>  
<fmt:setTimeZone value="GMT-10" />  
<p><b>Date and Time in GMT-10 time Zone: </b><fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p>  
</body>  
</html>  

Output:

Date and Time in Indian Standard Time(IST) Zone:</strong> August 12, 2016 6:27:04 PM IST  
Date and Time in GMT-10 time Zone:</strong> August 12, 2016 2:57:04 AM GMT-10:00  


JSTL Formatting <fmt:setBundle> Tag
The <fmt:setBundle> tag is used to load the resource bundle and store their value in the bundle configuration 
variable or the name scope variable.

It is used for creating the ResourceBundle object which will be used by tag body.

The syntax used for including the <fmt:setBundle> tag is:

<fmt:setBundle basename="ResourceBundle Name" var="value"/>  
Let's see the simple example to understand the formatting <fmt:setBundle> tag:


Let us define the default resource bundle Main.java as follows:

package com.javatpoint;  
import java.util.ListResourceBundle;  
public class Main extends ListResourceBundle {  
    public Object[][] getContents() {  
        return contents;  
    }  
static final Object[][] contents = { { "vegetable.Potato", "Potato" },  
            { "vegetable.Tomato", "Tomato" }, { "vegetable.Carrot", "Carrot" }, };  
}  
Now, compile the above class as Main.class and make it available in CLASSPATH of your Web application folder.

Now you can use the below JSTL tags to display the three vegetables as follows:

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>fmt:setBundle Tag</title>  
</head>  
<body>  
<fmt:setBundle basename="com.javatpoint.Main" var="lang"/>  
<fmt:message key="vegetable.Potato" bundle="${lang}"/><br/>  
   <fmt:message key="vegetable.Tomato" bundle="${lang}"/><br/>  
  <fmt:message key="vegetable.Carrot" bundle="${lang}"/><br/>  
</body>  
</html>  
Output:

Potato  
Tomato  
Carrot  


JSTL Core <fmt:message> Tag
The <fmt:message> tag is used for displaying an internationalized message. It maps the key of localized message to return the value using a resource bundle specified in the bundle attribute.

The syntax used for including the <fmt:message> tag is:

<fmt:message attributes> body content </fmt:message>  
Let's see the simple example to understand the formatting <fmt:message> tag:

Let us define the default resource bundle Message.java as follows:


package com.javatpoint;  
import java.util.ListResourceBundle;  
public class Message extends ListResourceBundle {  
    public Object[][] getContents() {  
        return contents;  
    }  
    static final Object[][] contents = { { "vegetable.Potato", "Potato" },  
            { "vegetable.Tomato", "Tomato" }, { "vegetable.Carrot", "Carrot" }, };  
}  
Now, compile the above class as Message.class and make it available in CLASSPATH of your Web application folder.

Now you can use the below JSTL tags to display the three vegetables as follows:

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>  
<html>  
<head>  
<title>fmt:message Tag</title>  
</head>  
<body>  
<fmt:setBundle basename="com.javatpoint.Message" var="lang"/>  
<fmt:message key="vegetable.Potato" bundle="${lang}"/><br/>  
   <fmt:message key="vegetable.Tomato" bundle="${lang}"/><br/>  
  <fmt:message key="vegetable.Carrot" bundle="${lang}"/><br/>  
</body>  
</html>  

Output:

Potato  
Tomato  
Carrot  

JSTL Formatting <fmt:formatDate> Tag
The <fmt:formatDate> tag is used for different formats of date and time using the supplied pattern and styles. 
It is used to format the time and date according to the customized formatting pattern.

The syntax used for including the <fmt:formatDate> tag is:

<fmt:formatDate attributes/>  
Let's see the simple example to understand the formatting <fmt:formatDate> tag:


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<html>  
<head>  
<title>fmt:formatDate</title>  
</head>  
<body>  
<h2>Different Formats of the Date</h2>  
<c:set var="Date" value="<%=new java.util.Date()%>" />  
<p>  
Formatted Time :  
<fmt:formatDate type="time" value="${Date}" />  
</p>  
<p>  
Formatted Date :  
<fmt:formatDate type="date" value="${Date}" />  
</p>  
<p>  
Formatted Date and Time :  
<fmt:formatDate type="both" value="${Date}" />  
</p>  
<p>  
Formatted Date and Time in short style :  
<fmt:formatDate type="both" dateStyle="short" timeStyle="short"  
value="${Date}" />  
</p>  
<p>  
Formatted Date and Time in medium style :  
<fmt:formatDate type="both" dateStyle="medium" timeStyle="medium"  
value="${Date}" />  
</p>  
<p>  
Formatted Date and Time in long style :  
<fmt:formatDate type="both" dateStyle="long" timeStyle="long"  
value="${Date}" />  
</p>  
  
</body>  
</html>  

Output:

Different Formats of the Date  
Formatted Time : 4:20:50 PM  
Formatted Date : Aug 13, 2016  
Formatted Date and Time : Aug 13, 2016 4:20:50 PM  
Formatted Date and Time in short style : 8/13/16 4:20 PM  
Formatted Date and Time in medium style : Aug 13, 2016 4:20:50 PM  
Formatted Date and Time in long style : August 


JSTL XML tags
The JSTL XML tags are used for providing a JSP-centric way of manipulating and creating XML documents.

The xml tags provide flow control, transformation etc. The url for the xml tags is http://java.sun.com/jsp/jstl/xml and prefix is x. The JSTL XML tag library has custom tags used for interacting with XML data. The syntax used for including JSTL XML tags library in your JSP is:

<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  
Before you proceed further with the examples, you need to copy the two XML and XPath related libraries into the 
<Tomcat Installation Directory>\lib


JSTL XML tags List
XML Tags	                            Descriptions
x:out	                                Similar to <%= ... > tag, but for XPath expressions.
x:parse	                                It is used for parse the XML data specified either in the tag body or an attribute.
x:set	                                It is used to sets a variable to the value of an XPath expression.
x:choose	                            It is a conditional tag that establish a context for mutually exclusive conditional operations.
x:when	                                It is a subtag of that will include its body if the condition evaluated be 'true'.
x:otherwise	                            It is subtag of that follows tags and runs only if all the prior conditions evaluated be 'false'.
x:if	                                It is used for evaluating the test XPath expression and if it is true, it will processes its body content.
x:transform	                            It is used in a XML document for providing the XSL(Extensible Stylesheet Language) transformation.
x:param	                                It is used along with the transform tag for setting the parameter in the XSLT style sheet.

JSTL XML <x:out> Tag
The <x:out> tag is used for displaying the result of an xml Path expression and writes the result to JSP writer object. It is similar to the scriptlet tag <%= %> used in JSP.

The syntax used for including the <x:out> tag is:

<x:out attributes/>  
Let's see the simple example to understand the xml <x:out> tag:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
 <%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
  
<html>  
<head>  
 <title>XML Tags</title>  
</head>  
<body>  
<h2>Vegetable Information:</h2>  
<c:set var="vegetable">  
<vegetables>  
    <vegetable>  
      <name>onion</name>  
      <price>40/kg</price>  
    </vegetable>  
 <vegetable>  
      <name>Potato</name>  
      <price>30/kg</price>  
    </vegetable>  
 <vegetable>  
      <name>Tomato</name>  
      <price>90/kg</price>  
    </vegetable>  
</vegetables>  
</c:set>  
<x:parse xml="${vegetable}" var="output"/>  
<b>Name of the vegetable is</b>:  
<x:out select="$output/vegetables/vegetable[1]/name" /><br>  
<b>Price of the Potato is</b>:  
<x:out select="$output/vegetables/vegetable[2]/price" />  
</body>  
</html>  

Output:

Vegetable Information:
Name of the vegetable is: onion
Price of the Potato is: 30/kg


JSTL XML <x:parse> Tag
The <x:parse> tag is used for parse the XML data specified either in the tag body or an attribute. 
It is used for parse the xml content and the result will stored inside specified variable.

The syntax used for including the <x:parse> tag is:

<x:parse attributes> body content </x:parse>  
Let's see the simple example to understand the xml <x:parse> tag:

Below examples represent how parse can be used for reading the external XML file and it can be parsed from the 
body of given document.


Let us put the following content in novels.xml file:

<books>  
<book>  
  <name>Three mistakes of my life</name>  
  <author>Chetan Bhagat</author>  
  <price>200</price>  
</book>  
<book>  
  <name>Tomorrow land</name>  
  <author>NUHA</author>  
  <price>2000</price>  
</book>  
</books>  
Now put the following content in index.jsp, keeping in the same directory:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
  
<html>  
<head>  
  <title>x:parse Tag</title>  
</head>  
<body>  
<h2>Books Info:</h2>  
<c:import var="bookInfo" url="novels.xml"/>  
  
<x:parse xml="${bookInfo}" var="output"/>  
<p>First Book title: <x:out select="$output/books/book[1]/name" /></p>  
<p>First Book price: <x:out select="$output/books/book[1]/price" /></p>  
<p>Second Book title: <x:out select="$output/books/book[2]/name" /></p>  
<p>Second Book price: <x:out select="$output/books/book[2]/price" /></p>  
  
</body>  
</html>  

Output:

Books Info:
First Book title: Three mistakes of my life

First Book price: 200

Second Book title: Tomorrow land

Second Book price: 2000


JSTL XML <x:set> Tag
The <x:set> tag is used to set a variable with the value of an XPath expression. 
It is used to store the result of xml path expression in a scoped variable.

The syntax used for including the <x:set> tag is:

<x:set attributes/>  
Let's see the simple example to understand the xml <x:set > tag is:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
<head>  
 <title>x:set Tag</title>  
</head>  
<body>  
<h3>Books Information:</h3>  
<c:set var="book">  
<books>  
<book>  
  <name>Three mistakes of my life</name>  
  <author>Chetan Bhagat</author>  
  <price>200</price>  
</book>  
<book>  
  <name>Tomorrow land</name>  
  <author>Brad Bird</author>  
  <price>2000</price>  
</book>  
</books>  
</c:set>  
<x:parse xml="${book}" var="output"/>  
<x:set var="fragment" select="$output/books/book[2]/price"/>  
<b>The price of the Tomorrow land book</b>:  
<x:out select="$fragment" />  
</body>  
</html>  

Output:

Books Information:
The price of the Tomorrow land book: 2000


JSTL XML <x:choose>, <x:when>, <x:otherwise> Tags
The <x:choose> tag is a conditional tag that establish a context for mutually exclusive conditional operations. It works like a Java switch statement in which we choose between a numbers of alternatives.

The <x:when> is subtag of <x:choose> that will include its body if the condition evaluated be 'true'.

The <x:otherwise> is also subtag of <x:choose> it follows <x:when> tags and runs only if all the prior condition evaluated is 'false'.

The <x:when> and <x:otherwise> works like if-else statement. But it must be placed inside <x:choose> tag.


The syntax used for including the <x:choose;> tag is:

<x:choose> body content </x:choose>  
The syntax used for including the <x:when> tag is:

<x:when attribute> body content </x:when>  
The syntax used for including the < x:otherwise > tag is:

<x:otherwise> body content </x:otherwise>  
Let's see the simple example to understand the xml <x:choose>, <x:when>, <x:otherwise> tag:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
  
<html>  
<head>  
  <title>x:choose Tag</title>  
</head>  
<body>  
<h3>Books Information:</h3>  
  
<c:set var="xmltext">  
<books>  
<book>  
  <name>Three mistakes of my life</name>  
  <author>Chetan Bhagat</author>  
  <price>200</price>  
</book>  
<book>  
  <name>Tomorrow land</name>  
  <author>Brad Bird</author>  
  <price>2000</price>  
</book>  
</books>  
</c:set>  
  
<x:parse xml="${xmltext}" var="output"/>  
<x:choose>  
   <x:when select="$output//book/author = 'Chetan bhagat'">  
      Book is written by Chetan bhagat  
   </x:when>  
   <x:when select="$output//book/author = 'Brad Bird'">  
      Book is written by Brad Bird  
   </x:when>  
   <x:otherwise>  
      The author is unknown...  
   </x:otherwise>  
</x:choose>  
  
</body>  
</html>  

Output:

Books Information:
Book is written by Brad Bird



STL XML <x:if> Tag
The <x:if> tag is used for evaluating the test XPath expression. It is a simple conditional tag which is used for evaluating its body if the supplied condition is true.

The syntax used for including the <x:if> tag is:

<x:if attributes> body content </x:if>  
Let's see the simple example to understand the xml <x:if> tag:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
<head>  
  <title>x:if Tags</title>  
</head>  
<body>  
<h2>Vegetable Information:</h2>  
<c:set var="vegetables">  
<vegetables>  
    <vegetable>  
      <name>onion</name>  
      <price>40</price>  
    </vegetable>  
 <vegetable>  
      <name>Potato</name>  
      <price>30</price>  
    </vegetable>  
 <vegetable>  
      <name>Tomato</name>  
      <price>90</price>  
    </vegetable>  
</vegetables>  
</c:set>  
<x:parse xml="${vegetables}" var="output"/>  
<x:if select="$output/vegetables/vegetable/price < 100">  
   Vegetables prices are very low.  
</x:if>  
</body>  
</html>  

Output:

Vegetable Information:
Vegetables prices are very low.


JSTL XML <x:transform> Tag
The <x:transform> tag is used in a XML document for providing the XSL (Extensible Stylesheet Language) 
transformation. It is used for transforming xml data based on XSLT script.

The syntax used for including the <x:transform> tag is:

<x:transform attributes> body content </x:transform>  
Let's see the simple example to understand the xml <x:transform> tag:

Let us put the following program in transfer.xsl file:


<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">  
<xsl:param name="doc"/>  
<xsl:template match="/">  
<html>  
<body>  
<h2>Company's Employee detail</h2>  
<table border="2">  
<tr>  
<th align="left">Name  
</th>  
<th align="left">Designation  
</th>  
<th align="left">Age  
</th>  
</tr>  
<xsl:for-each select="organisation/company/emp">  
<tr>  
<td>  
<xsl:value-of select="name"/>  
</td>  
<td>  
<xsl:value-of select="designation"/>  
</td>  
<td>  
<xsl:value-of select="age"/>  
</td>  
</tr>  
</xsl:for-each>  
</table>  
</body>  
</html>  
</xsl:template>  
</xsl:stylesheet>  
Now put the following program in transfer.xml, keeping in the same directory:

<?xml version="1.0" encoding="UTF-8"?>  
<organisation>  
<company>  
<emp>  
<name>Rajan Singh</name>  
<designation>Bussiness Developer</designation>  
<age>40</age>  
</emp>  
  
<emp>  
<name>Supriya Gaur</name>  
<designation>HR Executive</designation>  
<age>22</age>  
</emp>  
</company>  
  
<company>  
<emp>  
<name>Shashnak Singhal</name>  
<designation>Sr. Java Programmer</designation>  
<age>26</age>  
</emp>  
  
<emp>  
<name>Hemant Kishor</name>  
<designation>Sr. PHP Programmer</designation>  
<age>23</age>  
</emp></company></organisation>  
Now put the following program in index.jsp, keeping in the same directory:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
<html>  
<head>  
  <title>x:transform Tag</title>  
</head>  
</html>  
<c:import var="xml" url="transfer.xml" />  
<c:import var="xsl" url="transfer.xsl" />  
<x:transform xml="${xml}" xslt="${xsl}" />  


JSTL XML <x:param> Tag
The <x:param> tag is used to set the parameter in the XSLT style sheet.
 It use along with the transform tag for sending parameter along with the value.

The syntax used for including the < x:param > tag is:

<x:param name="name" value="value"></x:param>  
Let's see the simple example to understand the xml < x:param > tag:

Let us put the following program in transfer.xsl file:


<?xml version="1.0"?>  
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">  
<xsl:output method="html" indent="yes"/>  
<xsl:param name="bgColor"/>  
  
<xsl:template match="/">  
  <html>  
  <body>  
   <xsl:apply-templates/>  
  </body>  
  </html>  
</xsl:template>  
  
<xsl:template match="books">  
  <table border="1" width="60%" bgColor="{$bgColor}">  
    <xsl:for-each select="book">  
      <tr>  
        <td>  
          <b><xsl:value-of select="name"/></b>  
        </td>  
        <td>  
          <xsl:value-of select="author"/>  
        </td>  
        <td>  
          <xsl:value-of select="price"/>  
        </td>  
      </tr>  
    </xsl:for-each>  
  </table>  
</xsl:template>  
</xsl:stylesheet>  
Now put the following program in index.jsp , keeping in the same directory:

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>  
  
<html>  
<head>  
  <title>x:transform Tag</title>  
</head>  
<body>  
<h3>Novels Information:</h3>  
<c:set var="xmltext">  
 <books>  
<book>  
  <name>Three mistakes of my life</name>  
  <author>Chetan Bhagat</author>  
  <price>200</price>  
</book>  
<book>  
  <name>Tomorrow land</name>  
  <author>Brad Bird</author>  
  <price>1000</price>  
</book>  
<book>  
  <name>Wings of fire</name>  
  <author>Dr. APJ Abdul Kalam</author>  
  <price>500</price>  
</book>  
</books>  
</c:set>  
  
<c:import url="transfer.xsl" var="xslt"/>  
<x:transform xml="${xmltext}" xslt="${xslt}">  
   <x:param name="bgColor" value="yellow"/>  
</x:transform>  
  
</body>  
</html>  


JSTL SQL Tags
The JSTL sql tags provide SQL support. The url for the sql tags is http://java.sun.com/jsp/jstl/sql and 
prefix is sql.

The SQL tag library allows the tag to interact with RDBMSs (Relational Databases) such as Microsoft SQL Server, 
mySQL, or Oracle. The syntax used for including JSTL SQL tags library in your JSP is:

<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>  
JSTL SQL Tags List
SQL Tags	Descriptions
sql:setDataSource	It is used for creating a simple data source suitable only for prototyping.
sql:query	It is used for executing the SQL query defined in its sql attribute or the body.
sql:update	It is used for executing the SQL update defined in its sql attribute or in the tag body.
sql:param	It is used for sets the parameter in an SQL statement to the specified value.
sql:dateParam	It is used for sets the parameter in an SQL statement to a specified java.util.Date value.
sql:transaction	It is used to provide the nested database action with a common connection.


JSTL SQL <sql:setDataSource> Tag
The <sql:setDataSource> tag is used for creating a simple data source suitable only for prototyping.

It is used to create the data source variable directly from JSP and it is stored inside a scoped variable. It can be used as input for other database actions.

Example:

Consider the below information about your MySQL database setup:


We are using the JDBC MySQL driver
We are using the test database on local machine
We are using the "root" as username and "1234" as password to access the test database.
Let's see the simple example to understand the xml <sql:setDataSource> tag is:

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<html>  
<head>  
<title>sql:setDataSource Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/test"  
     user="root"  password="1234"/>  
</body>  
</html>  
The above code is used as input for other database actions. 
It is used for setting the connection with database server.
 Therefore you will start using the <sql:setDataSource> in subsequent SQL tags.

JSTL SQL <sql:query> Tag
The <sql:query> tag is used for executing the SQL query defined in its sql attribute or the body. It is used to execute an SQL SELECT statement and saves the result in scoped variable.

Example:

<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query>  


Let's see the simple JSP example to understand the use of <sql:query> tag is:

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/test"  
     user="root"  password="1234"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>Student ID</th>  
<th>First Name</th>  
<th>Last Name</th>  
<th>Age</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.First_Name}"/></td>  
<td><c:out value="${table.Last_Name}"/></td>  
<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  




JSTL SQL <sql:update> Tag
The <sql:update> tag is used for executing the SQL DML query defined in its sql attribute or in the tag body.
 It may be SQL UPDATE, INSERT or DELETE statements.

Example:

<sql:update dataSource="${db}" var="count">  
INSERT INTO Students VALUES (154,'Nasreen', 'jaha', 25);  
</sql:update>  


Let's see the simple JSP example to understand the use of <sql:update> tag is:

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:update Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/test"  
     user="root"  password="1234"/>  
<sql:update dataSource="${db}" var="count">  
INSERT INTO Students VALUES (154,'Nasreen', 'jaha', 25);  
</sql:update>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>Student ID</th>  
<th>First Name</th>  
<th>Last Name</th>  
<th>Age</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.First_Name}"/></td>  
<td><c:out value="${table.Last_Name}"/></td>  
<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  

JSTL SQL <sql:param> Tag
The <sql:param> tag sets the parameter value in SQL statement.

It is used as nested tag for <sql:update> and <sql:query> to provide the value in SQL query parameter.
 If null value is provided, the value is set at SQL NULL for value attribute.

Example:

<c:set var="StudentId" value="152"/>  
<sql:update dataSource="${db}" var="count">  
DELETE FROM Students WHERE Id = ?  
<sql:param value="${StudentId}" />  
</sql:update>  

Let's see the simple JSP example to understand the use of < sql:param > tag is:

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:update Tag</title>  
</head>  
<body>  
 <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
 url="jdbc:mysql://localhost/test"  
 user="root"  password="1234"/>  
<c:set var="StudentId" value="152"/>  
<sql:update dataSource="${db}" var="count">  
DELETE FROM Students WHERE Id = ?  
 <sql:param value="${StudentId}" />  
</sql:update>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query>  
 <table border="2" width="100%">  
<tr>  
<th>Student ID</th>  
<th>First Name</th>  
<th>Last Name</th>  
<th>Age</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.id}"/></td>  
<td><c:out value="${table.First_Name}"/></td>  
<td><c:out value="${table.Last_Name}"/></td>  
<td><c:out value="${table.Age}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  

JSTL SQL <sql:dateParam> Tag
The <sql:dateParam> is used to set the specified date for SQL query parameter.

It is used as nested tag for <sql:update> and <sql:query> to provide the date and time value for SQL query 
parameter. If null value is provided, the value is set at SQL NULL.

Example:

<%  
Date DoB = new Date("2000/10/16");  
int studentId = 151;  
%>  
<sql:update dataSource="${db}" var="count">  
   UPDATE Student SET dob = ? WHERE Id = ?  
   <sql:dateParam value="<%=DoB%>" type="DATE" />  
   <sql:param value="<%=studentId%>" />  
</sql:update>  

Let's see the simple JSP example to understand the use of <sql:dateParam> tag:

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ page import="java.util.Date,java.text.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
   
<html>  
<head>  
<title>sql:dateParam Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/test"  
     user="root"  password="1234"/>  
  
<%  
Date DoB = new Date("2000/10/16");  
int studentId = 151;  
%>  
   
<sql:update dataSource="${db}" var="count">  
   UPDATE Student SET dob = ? WHERE Id = ?  
   <sql:dateParam value="<%=DoB%>" type="DATE" />  
   <sql:param value="<%=studentId%>" />  
</sql:update>  
   
<sql:query dataSource="${db}" var="rs">  
   SELECT * from Student;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
   <th>Emp ID</th>  
   <th>First Name</th>  
   <th>Last Name</th>  
   <th>DoB</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
   <td><c:out value="${table.id}"/></td>  
   <td><c:out value="${table.First_Name}"/></td>  
   <td><c:out value="${table.Last_Name}"/></td>  
   <td><c:out value="${table.dob}"/></td>  
</tr>  
</c:forEach>  
</table>  
   
</body>  
</html>  



JSTL SQL <sql:transaction> Tag
The <sql:transaction> tag is used for transaction management. 
It is used to group multiple <sql:update> into common transaction. If you group multiple SQL queries in a 
single transaction, database is hit only once.

It is used for ensuring that the database modifications are performed by the nested actions which can be either 
rolled back or committed.

Example:

<%  
Date DoB = new Date("2000/10/16");  
int studentId = 151;  
%>  
<sql:transaction dataSource="${db}">  
   <sql:update var="count">  
      UPDATE Student SET First_Name = 'Suraj' WHERE Id = 150  
   </sql:update>  
   <sql:update var="count">  
      UPDATE Student SET Last_Name= 'Saifi' WHERE Id = 153  
   </sql:update>  
   <sql:update var="count">  
     INSERT INTO Student   
     VALUES (154,'Supriya', 'Jaiswal', '1995/10/6');  
   </sql:update>  
</sql:transaction>  


Let's see the simple JSP example to understand the use of <sql:transaction> tag:

<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ page import="java.util.Date,java.text.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
   
<html>  
<head>  
<title>sql:transaction Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/test"  
     user="root"  password="1234"/>  
  
<%  
Date DoB = new Date("2000/10/16");  
int studentId = 151;  
%>  
   
<sql:transaction dataSource="${db}">  
   <sql:update var="count">  
      UPDATE Student SET First_Name = 'Suraj' WHERE Id = 150  
   </sql:update>  
   <sql:update var="count">  
      UPDATE Student SET Last_Name= 'Saifi' WHERE Id = 153  
   </sql:update>  
   <sql:update var="count">  
     INSERT INTO Student   
     VALUES (154,'Supriya', 'Jaiswal', '1995/10/6');  
   </sql:update>  
</sql:transaction>  
   
<sql:query dataSource="${db}" var="rs">  
   SELECT * from Student;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
   <th>Emp ID</th>  
   <th>First Name</th>  
   <th>Last Name</th>  
   <th>DoB</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
   <td><c:out value="${table.id}"/></td>  
   <td><c:out value="${table.First_Name}"/></td>  
   <td><c:out value="${table.Last_Name}"/></td>  
   <td><c:out value="${table.dob}"/></td>  
</tr>  
</c:forEach>  
</table>  
   
</body>  
</html>  

Custom Tags in JSP

Custom tags are user-defined tags. They eliminates the possibility of scriptlet tag and separates the business 
logic from the JSP page.

The same business logic can be used many times by the use of custom tag.

Syntax to use custom tag
There are two ways to use the custom tag. They are given below:


<prefix:tagname attr1=value1....attrn=valuen />  
<prefix:tagname attr1=value1....attrn=valuen >  
body code  
</prefix:tagname>  

JSP Custom Tag API
The javax.servlet.jsp.tagext package contains classes and interfaces for JSP custom tag API. 
The JspTag is the root interface in the Custom Tag hierarchy.


JspTag interface
The JspTag is the root interface for all the interfaces and classes used in custom tag. It is a marker interface.

Tag interface
The Tag interface is the sub interface of JspTag interface.
 It provides methods to perform action at the start and end of the tag.

Fields of Tag interface
There are four fields defined in the Tag interface. They are:

Field Name	Description
public static int EVAL_BODY_INCLUDE	it evaluates the body content.
public static int EVAL_PAGE	it evaluates the JSP page content after the custom tag.
public static int SKIP_BODY	it skips the body content of the tag.
public static int SKIP_PAGE	it skips the JSP page content after the custom tag.
Methods of Tag interface
The methods of the Tag interface are as follows:

Method Name	                                               Description
public void setPageContext(PageContext pc)	                it sets the given PageContext object.
public void setParent(Tag t)	                             it sets the parent of the tag handler.
public Tag getParent()	                                it returns the parent tag handler object.
public int doStartTag()throws JspException	                it is invoked by the JSP page implementation object.
 The JSP programmer should override this method and define the business logic to be performed at the start of the tag.
public int doEndTag()throws JspException	                 it is invoked by the JSP page implementation object. 
The JSP programmer should override this method and define the business logic to be performed at the end of the tag.
public void release()	it is invoked by the JSP page implementation object to release the state.

IterationTag interface
The IterationTag interface is the sub interface of the Tag interface. 
It provides an additional method to reevaluate the body.

Field of IterationTag interface
There is only one field defined in the IterationTag interface.

public static int EVAL_BODY_AGAIN it reevaluates the body content.
Method of Tag interface
There is only one method defined in the IterationTag interface.


public int doAfterBody()throws JspException it is invoked by the JSP page implementation object after the 
evaluation of the body.
 If this method returns EVAL_BODY_INCLUDE, body content will be reevaluated, if it returns SKIP_BODY, 
 no more body cotent will be evaluated.

TagSupport class
The TagSupport class implements the IterationTag interface.
 It acts as the base class for new Tag Handlers. It provides some additional methods also.



Pagination in JSP
We can create pagination example in JSP easily. 
It is required if you have to display many records.
 Displaying many records in a single page may take time, so it is better to break the page into parts. 
 To do so, we create pagination application.

In this pagination example, we are using MySQL database to fetch records.

We have created "emp" table in "test" database. The emp table has three fields: id, name and salary. 
Either create table and insert records manually or import our sql file.

index.jsp
<a href="view.jsp?page=1">View Employees</a>  
view.jsp
<%@ page import="java.util.*,com.javatpoint.dao.*,com.javatpoint.beans.*" %>  
<%  
String spageid=request.getParameter("page");  
int pageid=Integer.parseInt(spageid);  
int total=5;  
if(pageid==1){}  
else{  
    pageid=pageid-1;  
    pageid=pageid*total+1;  
}  
List<Emp> list=EmpDao.getRecords(pageid,total);  
  
out.print("<h1>Page No: "+spageid+"</h1>");  
out.print("<table border='1' cellpadding='4' width='60%'>");  
out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");  
for(Emp e:list){  
    out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td>  
<td>"+e.getSalary()+"</td></tr>");  
}  
out.print("</table>");  
%>  
<a href="view.jsp?page=1">1</a>  
<a href="view.jsp?page=2">2</a>  
<a href="view.jsp?page=3">3</a>  

 
Emp.java
package com.javatpoint.beans;  
  
public class Emp {  
private int id;  
private String name;  
private float salary;  
//getters and setters  
}  
EmpDao.java
package com.javatpoint.dao;  
import com.javatpoint.beans.*;  
import java.sql.*;  
import java.util.ArrayList;  
import java.util.List;  
public class EmpDao {  
  
    public static Connection getConnection(){  
        Connection con=null;  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","","");  
        }catch(Exception e){System.out.println(e);}  
        return con;  
    }  
  
    public static List<Emp> getRecords(int start,int total){  
        List<Emp> list=new ArrayList<Emp>();  
        try{  
            Connection con=getConnection();  
            PreparedStatement ps=con.prepareStatement(  
"select * from emp limit "+(start-1)+","+total);  
            ResultSet rs=ps.executeQuery();  
            while(rs.next()){  
                Emp e=new Emp();  
                e.setId(rs.getInt(1));  
                e.setName(rs.getString(2));  
                e.setSalary(rs.getFloat(3));  
                list.add(e);  
            }  
            con.close();  
        }catch(Exception e){System.out.println(e);}  
        return list;  
    }  
}  


















































































































































































































































































































































































































































































































































































































































































































































 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 -->