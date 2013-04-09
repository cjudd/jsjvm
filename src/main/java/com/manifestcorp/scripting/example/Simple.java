package com.manifestcorp.scripting.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Simple example of creating the scripting engine
 * and evaluating a script. 
 */
public class Simple {

  /**
   * Prints "Hello, World!" 
   */
	public static void main(String[] args) {
      ScriptEngineManager mgr = new ScriptEngineManager();
      ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");
      try {
        jsEngine.eval("print('Hello, world!')");
      } catch (ScriptException ex) {
          ex.printStackTrace();
      }    
	}
}
