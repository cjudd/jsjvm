package com.manifestcorp.scripting.example;

import javax.script.Bindings;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Script show how to pass values using both the and ScriptEngineManager.
 */
public class VariablePassing {

  /**
   * Main entry point.
   */
  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager mgr = new ScriptEngineManager();
    mgr.put("op1", 4);
    
    ScriptEngine engine = mgr.getEngineByName("JavaScript");
    
    Bindings bindings = engine.createBindings();
    bindings.put("op2", 5);
    
    Object result = engine.eval("op1 + op2", bindings);

    System.out.println("Result = " + result);
    System.out.println("Result class = " + result.getClass().getName());
  }

}
