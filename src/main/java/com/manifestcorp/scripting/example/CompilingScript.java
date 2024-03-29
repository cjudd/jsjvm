package com.manifestcorp.scripting.example;

import javax.script.Bindings;
import javax.script.Compilable;
import javax.script.CompiledScript;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class CompilingScript {
  public static void main(String[] args) throws ScriptException {
    ScriptEngineManager manager = new ScriptEngineManager();
    ScriptEngine engine = manager.getEngineByName("js");
    Compilable compilable = (Compilable) engine;

    CompiledScript script = compilable.compile("op1 + op2");

    Bindings bindings = engine.createBindings();
    bindings.put("op1", 26);
    bindings.put("op2", 100);
    Object result = script.eval(bindings);
    
    System.out.println("Result = " + result);
  }
}
