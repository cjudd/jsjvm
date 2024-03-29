package com.manifestcorp.scripting.example;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class InvokingScriptMethods {

  public static void main(String[] args) throws ScriptException, NoSuchMethodException {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("js");
    engine.eval("function add(opt1, opt2) {return opt1 + opt2;}");
    Invocable invocable = (Invocable) engine;
    Object result = invocable.invokeFunction("add", new Object[] { 10,15 });
    
    System.out.println("Result = " + result);
  }

}
