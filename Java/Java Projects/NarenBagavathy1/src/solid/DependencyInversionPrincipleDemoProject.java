package solid;

import java.util.*;

//The principle states that
//
//A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
//B. Abstractions should not depend on details. Details should depend on abstractions.
//
//Let’s get started with some code that violates that principle.
//As a software team and we need to implement a DependencyInversionPrincipleDemoProject. For now the software team consists of:
//	
//	A BackEnd Developer
//
//	
//	public class BackEndDeveloper {
//	 
//	    public void writeJava() {
//	    }
//	}
//	And a FrontEnd developer
//
//	
//	 
//	public class FrontEndDeveloper {
//	 
//	    public void writeJavascript() {
//	    }
//	 
//	}
//	And our DependencyInversionPrincipleDemoProject uses both throughout the development process.
//
//	
//	 
//	public class DependencyInversionPrincipleDemoProject {
//	 
//	    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();
//	    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
//	 
//	    public void implement() {
//	 
//	        backEndDeveloper.writeJava();
//	        frontEndDeveloper.writeJavascript();
//	    }
//	 
//	}
//	
//	So as we can see the DependencyInversionPrincipleDemoProject class is a high level module and it depends on low level modules such as 
//	BackEndDeveloper and FrontEndDeveloper. We are actually violating the first part of the dependency inversion 
//	principle.
//
//	Also by the inspecting the implement function of the DependencyInversionPrincipleDemoProject.class we realise that the methods writeJava and 
//	writeJavascript are methods bound to the corresponding classes. Regarding the DependencyInversionPrincipleDemoProject scope those are details 
//	since in both cases they are forms of development. Thus the second part of the dependency inversion principle 
//	is violated.
//
//	In order to tackle this problem we shall implement and interface called the Developer interface.
//
//	
//	 
interface Developer {

	void develop();
}
//	
//	Therefore we introduce an abstraction.
//
//	The BackEndDeveloper shall be refactored(restructure the code) to

class BackEndDeveloper implements Developer {

	public void develop() {
		writeJava();
	}

	private void writeJava() {
		System.out.println("Back-end developer started writing java");

	}

}

// And the FrontEndDeveloper shall be refactored to

class FrontEndDeveloper implements Developer {

	public void develop() {
		writeJavascript();
	}

	public void writeJavascript() {
		System.out.println("Front-end developer started writing javascript");

	}

}

//The next step in order to tackle the violation of the first part would be to refactor the 
//DependencyInversionPrincipleDemoProject class so that
//it will not depend on the FrontEndDeveloper and the BackendDeveloper class.

//public class DependencyInversionPrincipleDemoProject {
// 
//    private List<Developer> developers;
//     
//    public DependencyInversionPrincipleDemoProject(List<Developer> developers) {
//     
//        this.developers = developers;
//    }
// 
//    public void implement() {
// 
//        developers.forEach(d->d.develop());
//    }
// 
//}
//The outcome is that the DependencyInversionPrincipleDemoProject class does not depend on lower level modules 
//but abstractions. 
//Also low-level modules and their details depend on abstractions.

 class DependencyInversionPrincipleDemoDependencyInversionPrincipleDemoProject {
	public static void main(String[] args) {
			 
//		  List<Developer> developers;
//	     
//		    public DependencyInversionPrincipleDemoProject(List<Developer> developers) {
//		     
//		        this.developers = developers;
//		    }
//		 
//		    public void implement() {
//		 
//		        developers.forEach(d->d.develop());
//		    }


}
}
