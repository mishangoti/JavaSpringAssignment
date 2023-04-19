package com.springtask1;

public class PythonWorld implements PythonLanguage {

	public JavaLanguage javaLanguage;
	
	// constructor
	PythonWorld(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
	}
	
	@Override
	public String learningPython() {
		// TODO Auto-generated method stub
		return "I am learning Python, and Also " + javaLanguage.learningJava();
	}

}
