package servletsandjsp;
import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
@SuppressWarnings("serial")
public class MyServlet extends GenericServlet {
	public void init(ServletConfig config) throws ServletException{
		super.init(config);
		System.out.println("In init() method...." );
	}

	public void service(ServletRequest request,ServletResponse response) throws ServletException,IOException{
		System.out.println("In init() method...." );
	}
	
	public void destroy() {
		System.out.println("In init() method...." );
	}
}
///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Web Terminology
//Servlet Terminology	        Description
//Website: static vs dynamic	It is a collection of related web pages that may contain text, images, audio and video.
//HTTP	                        It is the data communication protocol used to establish communication between client and server.
//HTTP Requests	                It is the request send by the computer to a web server that contains all sorts of potentially 
//                              interesting information.
//Get vs Post	                It gives the difference between GET and POST request.
//Container	                    It is used in java for dynamically generating the web pages on the server side.
//Server: Web vs Application	It is used to manage the network resources and for running the program or software that provides services.
//Content Type	                It is HTTP header that provides the description about what are you sending to the browser.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//HTTP Request	Description
//GET	            Asks to get the resource at the requested URL.
//POST	        Asks the server to accept the body info attached. 
//                It is like GET request with extra info sent with the request.

//GET and POST
//Two common methods for the request-response between a server and client are:
//
//GET- It requests the data from a specified resource
//POST- It submits the processed data to a specified resource refer coding in screenshot.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Servlet Container
//It provides the runtime environment for JavaEE (j2ee) applications. 
//The client/user can request only a static WebPages from the server.
//If the user wants to read the web pages as per input then the servlet container is used in java.
//
//Servlet Container States
//
//The servlet container is the part of web server which can be run in a separate process. 
//We can classify the servlet container states in three types:
//	
//	Standalone: For example:- Tomcat running by itself
//	In-process: For example:- Tomcat running inside the JBoss.
//	Out-of-process: The web server and servlet container are different programs which are run in a different process. 
//	For performing the communications between them, web server uses the plug-in provided by the servlet container.
//	
//	Address space is the amount of memory allocated for all possible addresses for a computational entity, 
//	such as a device, a file, a server, or a networked computer.
//	A plug-in is a (sometimes essential) piece of software code that enables an application or program to do 
//	something it couldn't by itself.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Server is a device or a computer program that accepts and responds to the request made by other program, known as 
//client. It is used to manage the network resources and for running the program or software that provides services.
//
//There are two types of servers:
//
//Web Server
//Application Server

//Web Server
//
//Web server contains only web or servlet container. It can be used for servlet, jsp, struts, jsf etc.
//Examples of Web Servers are: Apache Tomcat and Resin.

//Application Server
//
//Application server contains Web and EJB containers. It can be used for servlet, jsp, struts, jsf, ejb etc
// Examples of Application Servers are:JBoss: Open-source server from JBoss community,Websphere: Provided by IBM.


///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Content Type
//Content Type is also known as MIME (Multipurpose internet Mail Extension)Type. 
//It is a HTTP header that provides the description about what are you sending to the browser.
//
//MIME is an internet standard that is used for extending the limited capabilities of email by allowing the insertion of sounds, images and text in a message.

//List of Content Types
//There are many content types. The commonly used content types are given below:
//
//
//text/html
//text/plain
//application/msword
//application/vnd.ms-excel
//application/jar
//application/pdf
//application/octet-stream
//application/x-zip
//images/jpeg
//images/png
//images/gif
//audio/mp3
//video/mp4
//video/quicktime etc.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//How Servlet works?
//
//The server checks if the servlet is requested for the first time.

//If yes, web container does the following tasks:
//
//loads the servlet class.
//instantiates the servlet class.
//calls the init method passing the ServletConfig object

//else
//calls the service method passing request and response objects
//The web container calls the destroy method when it needs to remove the servlet such as at time of stopping 
//server or undeploying the project.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////


//A web container is the component of a web server that interacts with Java servlets.
//A web container manages the life cycle of servlets; it maps a URL to a particular servlet
//How web container handles the servlet request?
//The web container is responsible to handle the request. Let's see how it handles the request.
//
//maps the request with the servlet in the web.xml file.
//creates request and response objects for this request
//calls the service method on the thread
//The public service method internally calls the protected service method
//The protected service method calls the doGet method depending on the type of request.
//The doGet method generates the response and it is passed to the client.
//After sending the response, the web container deletes the request and response objects.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Servlet with Annotation
//Annotation represents the metadata. If you use annotation, deployment descriptor (web.xml file) is not required.
//But you should have tomcat7 as it will not run in the previous versions of tomcat.

//Example : @WebServlet("/Simple")  
//@WebServlet annotation is used to map the servlet with the specified name.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Servlet API
//The javax.servlet and javax.servlet.http packages represent interfaces and classes for servlet api.
//
//The javax.servlet package contains many interfaces and classes that are used by the servlet or web container. 
//These are not specific to any protocol.
//
//The javax.servlet.http package contains interfaces and classes that are responsible for http requests only.

//Interfaces in javax.servlet package
//There are many interfaces in javax.servlet package. They are as follows:
//
//Servlet
//ServletRequest
//ServletResponse
//RequestDispatcher
//ServletConfig
//ServletContext
//Filter
//FilterConfig
//FilterChain

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Classes in javax.servlet package
//There are many classes in javax.servlet package. They are as follows:
//
//GenericServlet
//ServletInputStream
//ServletOutputStream

///////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Interfaces in javax.servlet.http package
//There are many interfaces in javax.servlet.http package. They are as follows:
//
//HttpServletRequest
//HttpServletResponse
//HttpSession
//HttpSessionListener

///////////////////////////////////////////////////////////////////////////////////////////////////////////////


//Classes in javax.servlet.http package
//There are many classes in javax.servlet.http package. They are as follows:
//
//HttpServlet
//Cookie
//HttpSessionEvent

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
              ///Interfaces in javax.servlet package
//Servlet interface needs to be implemented for creating any servlet (either directly or indirectly).

//Servlet interface is present in javax.servlet package

//Methods of Servlet interface
//There are 5 methods in Servlet interface. The init, service and destroy are the life cycle methods of servlet. These are invoked by the web container.

//Method	                                                                     Description
//public void init(ServletConfig config)	initializes the servlet.             It is the life cycle method of servlet and invoked by the web container only once.
//public void service(ServletRequest request,ServletResponse response)	     provides response for the incoming request. It is invoked at each request by the web container.
//public void destroy()	                                                     is invoked only once and indicates that servlet is being destroyed.
//public ServletConfig getServletConfig()	                                     returns the object of ServletConfig.
//public String getServletInfo()	                                             returns information about servlet such as writer, copyright, version etc.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//ServletRequest Interface
//An object of ServletRequest is used to provide the client request information to a servlet such as content type, 
//content length, parameter names and values, header informations, attributes etc.

//ServletRequest interface is present in javax.servlet package and passes as an arguement of service() method.


//Methods of ServletRequest interface
//There are many methods defined in the ServletRequest interface. Some of them are as follows:
//
//Method	Description
//public String getParameter(String name)	          is used to obtain the value of a parameter by name.
//public int getContentLength()	                  Returns the size of the request entity data, or -1 if not known.
//public String getContentType()	                  Returns the Internet Media Type of the request entity data, or null if not known.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//ServletResponse interface
//
//The object of ServletResponse interface is used to send the responses to the clients.
//The information send in responses can be a binary or character data.

//ServletResponse interface is present in javax.servlet package and passes as an arguement of service() method.
//
//Methods of ServletResponse
//
//Method & Description
//
//PrintWriter getWriter()
// PrintWriter writing the data on a console and in a text file testout.txt using Java PrintWriter class.
// getWriter() method is used to send character data in response.

//ServletOutputStream	 getOutputStream()
//
//This method is used to send binary data in response.

//void reset()
//
//This method is used to remove the data present in buffer.
//
//void setContentType(String type)
//

//This method is used to set the type of content.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

          //RequestDispatcher in Servlet
//The RequestDispatcher interface provides the facility of dispatching the request to another resource it may be
//html, servlet or jsp
//RequestDispatcher interface is present in javax.servlet package.

//Methods of RequestDispatcher interface
//The RequestDispatcher interface provides two methods. They are:
//
//public void forward(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException:Forwards a request from a servlet to another resource (servlet, JSP file, or HTML file) on the server.
//public void include(ServletRequest request,ServletResponse response)throws ServletException,java.io.IOException:Includes the content of a resource (servlet, JSP page, or HTML file) in the response.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                     //ServletConfig Interface
//An object of ServletConfig is created by the web container for each servlet. 
//This object can be used to get configuration information from web.xml file.
//ServletConfig interface is present in javax.servlet package.

//Advantage of ServletConfig
//The core advantage of ServletConfig is that you don't need to edit the servlet file if information is modified 
//from the web.xml file.

//Methods of ServletConfig interface
//
//public String getServletName():Returns the name of the servlet.
//public ServletContext getServletContext():Returns an object of ServletContext.
//
//How to get the object of ServletConfig
//getServletConfig() method of Servlet interface returns the object of ServletConfig.

//Syntax of getServletConfig() method
//public ServletConfig getServletConfig();  

//Example of getServletConfig() method

//ServletConfig config=getServletConfig();  
////Now we can call the methods of ServletConfig interface  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  //ServletContext Interface
//An object of ServletContext is created by the web container at time of deploying the project. 
//This object can be used to get configuration information from web.xml file. 
//There is only one ServletContext object per web application.
//ServletConfig interface is present in javax.servlet package.


//If any information is shared to many servlet, it is better to 
//provide it from the web.xml file using the <context-param> element.
//
//Advantage of ServletContext
//Easy to maintain if any information is shared to all the servlet, it is 
//better to make it available for all the servlet.
//
//The ServletContext object can be used to get configuration information from the web.xml file.
//The ServletContext object can be used to set, get or remove attribute from the web.xml file.
//
//Commonly used methods of ServletContext interface
//
//public void removeAttribute(String name):Removes the attribute with the given name from the servlet context.
//public Object getAttribute(String name):Returns the attribute for the specified name.


//How to get the object of ServletContext interface
//Example of getServletContext() method
//
//getServletContext() method of ServletConfig interface returns the object of ServletContext.
//We can get the ServletContext object from ServletConfig object  
//ServletContext application=getServletConfig().getServletContext();  

//Another convenient way to get the ServletContext object  
//ServletContext application=getServletContext();  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//Servlet Filter

//A filter is an object that is invoked at the preprocessing and postprocessing of a request.
//
//It is mainly used to perform filtering tasks such as conversion, logging, compression, encryption and decryption, 
//input validation etc.
//
//The servlet filter is pluggable, i.e. its entry is defined in the web.xml file, 
//if we remove the entry of filter from the web.xml file, filter will be removed automatically and 
//we don't need to change the servlet.
//
//So maintenance cost will be less.

//The javax.servlet package contains the three interfaces of Filter API.
//
//Filter
//FilterChain
//FilterConfig
//1) Filter interface
//For creating any filter, you must implement the Filter interface. Filter interface provides the life cycle methods for a filter.
//
//Method	Description
//public void init(FilterConfig config)
//init() method is invoked only once. It is used to initialize the filter.

//public void doFilter(HttpServletRequest request,HttpServletResponse response, FilterChain chain)	
//doFilter() method is invoked every time when user request to any resource, to which the filter is mapped.
//It is used to perform filtering tasks.

//public void destroy()	This is invoked only once when filter is taken out of the service.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//2) FilterChain interface
//The object of FilterChain is responsible to invoke the next filter or resource in the chain.
//This object is passed in the doFilter method of Filter interface.
//The FilterChain interface contains only one method:
//
//public void doFilter(HttpServletRequest request, HttpServletResponse response): it passes the control to the 
//next filter or resource.
//How to define Filter
//We can define filter same as servlet. Let's see the elements of filter and filter-mapping.
//
//<web-app>  
//  
//<filter>  
//<filter-name>...</filter-name>  
//<filter-class>...</filter-class>  
//</filter>  
//   
//<filter-mapping>  
//<filter-name>...</filter-name>  
//<url-pattern>...</url-pattern>  
//</filter-mapping>  
//  
//</web-app>  

//For mapping filter we can use, either url-pattern or servlet-name. 
//The url-pattern elements has an advantage over servlet-name element i.e. it can be applied on servlet, JSP or HTML.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//FilterConfig
//An object of FilterConfig is created by the web container. 
//This object can be used to get the configuration information from the web.xml file.
////FilterConfig interface is present in javax.servlet package.

//
//Methods of FilterConfig interface
//There are following 4 methods in the FilterConfig interface.
//
//public void init(FilterConfig config): init() method is invoked only once it is used to initialize the filter.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//            *****GenericServlet class**************
//            GenericServlet class implements Servlet, ServletConfig and Serializable interfaces. 
//            It provides the implementation of all the methods of these interfaces except the service method. 
//            
//            Methods of GenericServlet class
//            
//            public void init(ServletConfig config) is used to initialize the servlet.
//            public abstract void service(ServletRequest request, ServletResponse response) provides service for 
//            the incoming request. It is invoked at each time when user requests for a servlet.
//            public void destroy() is invoked only once throughout the life cycle and indicates that servlet is 
//            being destroyed.
//            public ServletConfig getServletConfig() returns the object of ServletConfig.
//            public String getServletInfo() returns information about servlet such as writer, copyright, version etc.
//            public void init() it is a convenient method for the servlet programmers, now there is no need to 
//            call super.init(config)
//            public ServletContext getServletContext() returns the object of ServletContext.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

//         ***********ServletInputStream class**********************
//         
//         ServletInputStream class provides a stream to read binary data such as image etc. from the request object.
//         It is an abstract class.
//         ServletInputStream class is present in javax.servlet package.

//
//         The getInputStream() method of ServletRequest interface returns the instance of ServletInputStream class. 
//         So can be get as:
//
//         ServletInputStream sin=request.getInputStream();  
//         Method of ServletInputStream class
//         There are only one method defined in the ServletInputStream class.
//
//         int readLine(byte[] b, int off, int len) it reads the input stream.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

         //***********ServletOutputStream  class**********************

//ServletOutputStream class provides a stream to write binary data into the response.
//It is an abstract class.
//ServletOutputStream class is present in javax.servlet package.

//The getOutputStream() method of ServletResponse interface returns the instance of ServletOutputStream class. 
//It may be get as:
//
//ServletOutputStream out=response.getOutputStream();  
//Methods of ServletOutputStream class
//The ServletOutputStream class provides print() and println() methods that are overloaded.
//
//void print(boolean b){}
//void print(char c){}
//void print(int i){}
//void print(long l){}
//void print(float f){}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Interfaces in javax.servlet.http package

//***********HttpServletRequest  Interface**********************

//HttpServletRequest is an interface that extends the ServletRequest interface to provide request information for 
//HTTP servlets.

//
//
//Object of the HttpServletRequest is created by the Servlet container and, then, it is passed to the service method 
//(doGet(), doPost(), etc.) of the Servlet.

//i. public Cookie [] getCookies ( )

//Returns an array containing all of the cookie objects the client sent with this request.
//
//ii. public String getHeader(String name)

//Returns the value of the specified request header as a string.
///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Interfaces in javax.servlet.http package

//***********HttpServletResponse   Interface**********************

//HttpServletResponse is a predefined interface present in javax.servlet.http package.
//It can be said that it is a mirror image of request object.
//The response object is the object in which the servlet can write information about the data it will send back.
//
//Methods in HttpServletResponse
//
//i. public void addCookie(Cookie cookie)
//Adds the specified cookie to the response. This method can be called multiple times to set more than one cookie.
//
//ii. public void addHeader(String name,String value)
//Adds a response header with the given name and value.

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Interfaces in javax.servlet.http package

//***********HttpSession    Interface**********************

//HttpSession  is an interface present in javax.servlet.http package.
//In such case, container creates a session id for each user.The container uses this id to identify the particular 
//user.An object of HttpSession can be used to perform two tasks:
//
//bind objects
//view and manipulate information about a session, such as the session identifier, creation time, and 
//last accessed time

//How to get the HttpSession object ?
//The HttpServletRequest interface provides two methods to get the object of HttpSession:
//
//public HttpSession getSession():Returns the current session associated with this request, or if the request 
//does not have a session, creates one.
//
//public HttpSession getSession(boolean create):Returns the current HttpSession associated with this request or, 
//if there is no current session and create is true, returns a new session.
//
//Commonly used methods of HttpSession interface
//public String getId():Returns a string containing the unique identifier value.
//
//public long getCreationTime():Returns the time when this session was created, measured in milliseconds since 
//midnight January 1, 1970 GMT.
//
//public long getLastAccessedTime():Returns the last time the client sent a request associated with this session, as 
//the number of milliseconds since midnight January 1, 1970 GMT.
//
//public void invalidate():Invalidates this session then unbinds any objects bound to it.

//Example of using HttpSession
//In this example, we are setting the attribute in the session scope in one servlet and getting that value from the 
//session scope in another servlet. To set the attribute in the session scope, we have used the setAttribute() method
//of HttpSession interface and to get the attribute, we have used the getAttribute method.

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Class & Interface in javax.servlet.http package
//*************************HttpSessionEvent and HttpSessionListener**********************************************

//HttpSessionEvent is the class representing event notifications for changes to sessions within a web application.
//The HttpSessionEvent is notified when session object is changed. The corresponding Listener interface for this event is HttpSessionListener.
//
//We can perform some operations at this event such as counting total and current logged-in users, maintaing a log of user details such as login time, logout time etc.
//Methods of HttpSessionListener interface
//There are two methods declared in the HttpSessionListener interface which must be implemented by the servlet programmer to perform some action.
//public void sessionCreated(HttpSessionEvent e): is invoked when session object is created.
//public void sessionDestroyed(ServletContextEvent e): is invoked when session is invalidated.
//Example of HttpSessionEvent and HttpSessionListener to count total and current logged-in users
//In this example, are counting the total and current logged-in users. For this purpose, we have created three files:
//index.html: to get input from the user.
//MyListener.java: A listener class that counts total and current logged-in users and stores this information in ServletContext object as an attribute.
//First.java: A Servlet class that creates session and prints the total and current logged-in users.
//Logout.java: A Servlet class that invalidates session.
//index.html
//<form action="servlet1">  
//Name:<input type="text" name="username"><br>  
//Password:<input type="password" name="userpass"><br>  
//  
//<input type="submit" value="login"/>  
//</form>  
//MyListener.java
//import javax.servlet.ServletContext;  
//import javax.servlet.http.HttpSessionEvent;  
//import javax.servlet.http.HttpSessionListener;  
//  
//public class CountUserListener implements HttpSessionListener{  
//    ServletContext ctx=null;  
//    static int total=0,current=0;  
//      
//    public void sessionCreated(HttpSessionEvent e) {  
//    total++;  
//    current++;  
//      
//    ctx=e.getSession().getServletContext();  
//    ctx.setAttribute("totalusers", total);  
//    ctx.setAttribute("currentusers", current);  
//      
//    }  
//  
//    public void sessionDestroyed(HttpSessionEvent e) {  
//        current--;  
//        ctx.setAttribute("currentusers",current);  
//    }  
//  
//}  
//First.java
//import java.io.IOException;  
//import java.io.PrintWriter;  
//  
//import javax.servlet.ServletContext;  
//import javax.servlet.ServletException;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//import javax.servlet.http.HttpSession;  
//  
//public class First extends HttpServlet {  
//public void doGet(HttpServletRequest request,  
// HttpServletResponse response)  
//    throws ServletException, IOException {  
//  
//        response.setContentType("text/html");  
//        PrintWriter out = response.getWriter();  
//      
//        String n=request.getParameter("username");  
//        out.print("Welcome "+n);  
//          
//        HttpSession session=request.getSession();  
//        session.setAttribute("uname",n);  
//          
//        //retrieving data from ServletContext object  
//        ServletContext ctx=getServletContext();  
//        int t=(Integer)ctx.getAttribute("totalusers");  
//        int c=(Integer)ctx.getAttribute("currentusers");  
//        out.print("<br>total users= "+t);  
//        out.print("<br>current users= "+c);  
//          
//        out.print("<br><a href='logout'>logout</a>");  
//          
//        out.close();  
//    }  
//  
//}  
//Logout.java
//import java.io.IOException;  
//import java.io.PrintWriter;  
//  
//import javax.servlet.ServletException;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//import javax.servlet.http.HttpSession;  
//  
//  
//public class LogoutServlet extends HttpServlet {  
//public void doGet(HttpServletRequest request,  
// HttpServletResponse response)  
//        throws ServletException, IOException {  
//  
//        response.setContentType("text/html");  
//        PrintWriter out = response.getWriter();  
//      
//        HttpSession session=request.getSession(false);  
//        session.invalidate();//invalidating session  
//          
//        out.print("You are successfully logged out");  
//          
//          
//        out.close();  
//    }  
//  
//}  
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////

////Class in javax.servlet.http package
//***************************************HttpServlet class*****************************************************

//The HttpServlet class extends the GenericServlet class and implements Serializable interface. It provides http 
//specific methods such as doGet, doPost, doHead.
//
//Methods of HttpServlet class
//There are many methods in HttpServlet class. They are as follows:
//
//public void service(ServletRequest req,ServletResponse res) dispatches the request to the protected service method 
//by converting the request and response object into http type.
//
//protected void service(HttpServletRequest req, HttpServletResponse res) receives the request from the service method,
//and dispatches the request to the doXXX() method depending on the incoming http request type.
//
//protected void doGet(HttpServletRequest req, HttpServletResponse res) handles the GET request. 
//It is invoked by the web container.
//
//protected void doPost(HttpServletRequest req, HttpServletResponse res) handles the POST request. 
//It is invoked by the web container.
//
//protected void doHead(HttpServletRequest req, HttpServletResponse res) handles the HEAD request. 
//It is invoked by the web container.

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////Class in javax.servlet.http package
//***************************************Cookies  class*****************************************************

//javax.servlet.http.Cookie class provides the functionality of using cookies. 
//It provides a lot of useful methods for cookies.A cookie is a kind of information that is stored at client side.
//
//Constructor of Cookie class
//Constructor	Description
//Cookie()	constructs a cookie.
//Cookie(String name, String value)	constructs a cookie with a specified name and value.

////Useful Methods of Cookie class
////There are given some commonly used methods of the Cookie class.
////
////Method	Description
////public void setMaxAge(int expiry)	Sets the maximum age of the cookie in seconds.
////public String getName()	Returns the name of the cookie. The name cannot be changed after creation.
////public String getValue()	Returns the value of the cookie.
////public void setName(String name)	changes the name of the cookie.
////public void setValue(String value)	changes the value of the cookie.


////
////Other methods required for using Cookies
////For adding cookie or getting the value from the cookie, we need some methods provided by other interfaces. 
////They are:
////
////public void addCookie(Cookie ck):method of HttpServletResponse interface is used to add cookie in response 
//object.
////
////public Cookie[] getCookies():method of HttpServletRequest interface is used to return all the cookies from the 
////browser.
////How to create Cookie?
////
////	Let's see the simple code to create cookie.
////
////Cookie ck=new Cookie("user","sonoo jaiswal");//creating cookie object  
////response.addCookie(ck);//adding cookie in the response  
////
////How to delete Cookie?
////Let's see the simple code to delete cookie. It is mainly used to logout or signout the user.
////
////Cookie ck=new Cookie("user","");//deleting value of cookie  
////ck.setMaxAge(0);//changing the maximum age to 0 seconds  
////response.addCookie(ck);//adding cookie in the response  
////
////How to get Cookies?
////Let's see the simple code to get all the cookies.
////
////Cookie ck[]=request.getCookies();  
////for(int i=0;i<ck.length;i++){  
////out.print("<br>"+ck[i].getName()+" "+ck[i].getValue());//printing name and value of cookie  
////}  
////
////Simple example of Servlet Cookies
////In this example, we are storing the name of the user in the cookie object and accessing it in another servlet.
////As we know well that session corresponds to the particular user. 
////So if you access it from too many browsers with different values, you will get the different value.


//Servlet Login and Logout Example using Cookies
//A cookie is a kind of information that is stored at client side.
//
//In the previous page, we learned a lot about cookie e.g. how to create cookie, how to delete cookie, how to get
//cookie etc.
//
//Here, we are going to create a login and logout example using servlet cookies.
//
//In this example, we are creating 3 links: login, logout and profile. 
//User can't go to profile page until he/she is logged in. If user is logged out, he need to login again to 
//visit profile.
//
//
//In this application, we have created following files.
//
//index.html
//link.html
//login.html
//LoginServlet.java
//LogoutServlet.java
//ProfileServlet.java
//web.xml
//
//  File: index.html
//<!DOCTYPE html>  
//<html>  
//<head>  
//<meta charset="ISO-8859-1">  
//<title>Servlet Login Example</title>  
//</head>  
//<body>  
//  
//<h1>Welcome to Login App by Cookie</h1>  
//<a href="login.html">Login</a>|  
//<a href="LogoutServlet">Logout</a>|  
//<a href="ProfileServlet">Profile</a>  
//  
//</body>  
//</html>  
//File: link.html
//<a href="login.html">Login</a> |  
//<a href="LogoutServlet">Logout</a> |  
//<a href="ProfileServlet">Profile</a>  
//<hr>  
//File: login.html
//<form action="LoginServlet" method="post">  
//Name:<input type="text" name="name"><br>  
//Password:<input type="password" name="password"><br>  
//<input type="submit" value="login">  
//</form>  
//File: LoginServlet.java
//package com.javatpoint;  
//  
//import java.io.IOException;  
//import java.io.PrintWriter;  
//import javax.servlet.ServletException;  
//import javax.servlet.http.Cookie;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//public class LoginServlet extends HttpServlet {  
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)  
//                           throws ServletException, IOException {  
//        response.setContentType("text/html");  
//        PrintWriter out=response.getWriter();  
//          
//        request.getRequestDispatcher("link.html").include(request, response);  
//          
//        String name=request.getParameter("name");  
//        String password=request.getParameter("password");  
//          
//        if(password.equals("admin123")){  
//            out.print("You are successfully logged in!");  
//            out.print("<br>Welcome, "+name);  
//              
//            Cookie ck=new Cookie("name",name);  
//            response.addCookie(ck);  
//        }else{  
//            out.print("sorry, username or password error!");  
//            request.getRequestDispatcher("login.html").include(request, response);  
//        }  
//          
//        out.close();  
//    }  
//  
//}  
//File: LogoutServlet.java
//package com.javatpoint;  
//  
//import java.io.IOException;  
//import java.io.PrintWriter;  
//import javax.servlet.ServletException;  
//import javax.servlet.http.Cookie;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//public class LogoutServlet extends HttpServlet {  
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
//                        throws ServletException, IOException {  
//        response.setContentType("text/html");  
//        PrintWriter out=response.getWriter();  
//          
//          
//        request.getRequestDispatcher("link.html").include(request, response);  
//          
//        Cookie ck=new Cookie("name","");  
//        ck.setMaxAge(0);  
//        response.addCookie(ck);  
//          
//        out.print("you are successfully logged out!");  
//    }  
//}  
//File: ProfileServlet.java
//package com.javatpoint;  
//  
//import java.io.IOException;  
//import java.io.PrintWriter;  
//import javax.servlet.ServletException;  
//import javax.servlet.http.Cookie;  
//import javax.servlet.http.HttpServlet;  
//import javax.servlet.http.HttpServletRequest;  
//import javax.servlet.http.HttpServletResponse;  
//public class ProfileServlet extends HttpServlet {  
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)  
//                          throws ServletException, IOException {  
//        response.setContentType("text/html");  
//        PrintWriter out=response.getWriter();  
//          
//        request.getRequestDispatcher("link.html").include(request, response);  
//          
//        Cookie ck[]=request.getCookies();  
//        if(ck!=null){  
//         String name=ck[0].getValue();  
//        if(!name.equals("")||name!=null){  
//            out.print("<b>Welcome to Profile</b>");  
//            out.print("<br>Welcome, "+name);  
//        }  
//        }else{  
//            out.print("Please login first");  
//            request.getRequestDispatcher("login.html").include(request, response);  
//        }  
//        out.close();  
//    }  
//}  
//File: web.xml
//<?xml version="1.0" encoding="UTF-8"?>  
//<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"   
//xmlns="http://java.sun.com/xml/ns/javaee" xsi:schemaLocation="http://java.sun.com/xml/ns/javaee   
//http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd" id="WebApp_ID" version="2.5">  
//    
//  <servlet>  
//    <description></description>  
//    <display-name>LoginServlet</display-name>  
//    <servlet-name>LoginServlet</servlet-name>  
//    <servlet-class>com.javatpoint.LoginServlet</servlet-class>  
//  </servlet>  
//  <servlet-mapping>  
//    <servlet-name>LoginServlet</servlet-name>  
//    <url-pattern>/LoginServlet</url-pattern>  
//  </servlet-mapping>  
//  <servlet>  
//    <description></description>  
//    <display-name>ProfileServlet</display-name>  
//    <servlet-name>ProfileServlet</servlet-name>  
//    <servlet-class>com.javatpoint.ProfileServlet</servlet-class>  
//  </servlet>  
//  <servlet-mapping>  
//    <servlet-name>ProfileServlet</servlet-name>  
//    <url-pattern>/ProfileServlet</url-pattern>  
//  </servlet-mapping>  
//  <servlet>  
//    <description></description>  
//    <display-name>LogoutServlet</display-name>  
//    <servlet-name>LogoutServlet</servlet-name>  
//    <servlet-class>com.javatpoint.LogoutServlet</servlet-class>  
//  </servlet>  
//  <servlet-mapping>  
//    <servlet-name>LogoutServlet</servlet-name>  
//    <url-pattern>/LogoutServlet</url-pattern>  
//  </servlet-mapping>  
//</web-app>  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
