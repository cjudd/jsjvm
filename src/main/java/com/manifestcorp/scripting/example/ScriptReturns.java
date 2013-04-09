package com.manifestcorp.scripting.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Shows how to return a variable from a script.
 */
public class ScriptReturns {

  /**
   * Main entry point.
   */
  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");
    Object result = jsEngine.eval("5+4");
    System.out.println("Result = " + result);
    System.out.println("Result class = " + result.getClass().getName());
  }
}
