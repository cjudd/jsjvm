package com.manifestcorp.scripting.example;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Runs scripts passed on the command-line.
 * 
 * com.juddsolutions.scripting.example.ScriptRunner myscript.js.
 */
public class ScriptRunner {

  /**
   * Main entry
   * @param args script to run.
   * @throws ScriptException 
   */
  public static void main(String[] args) throws ScriptException {
    Reader reader = null;
    String script = null;
    if(args.length > 0) {
      script = args[0];
    } else {
      System.out.print("Requires a script name be passed as the first parameter on the commandline.");
      System.exit(1);
    }
    
    InputStream is = ScriptEngineScripts.class.getResourceAsStream("/" + script);
    reader = new InputStreamReader(is);
    
    ScriptEngineManager mgr = new ScriptEngineManager();
    String extension = script.substring(script.lastIndexOf('.') + 1, script.length()); 
    ScriptEngine jsEngine =mgr.getEngineByExtension(extension);   
    jsEngine.eval(reader);
  }

}
