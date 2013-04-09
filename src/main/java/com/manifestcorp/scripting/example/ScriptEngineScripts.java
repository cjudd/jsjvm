package com.manifestcorp.scripting.example;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Class used to execute scripts that
 * poke at ScripEngineManager itself.
 */
public class ScriptEngineScripts {

  /**
   * Main entry point.
   * @param args
   * @throws ScriptException 
   */
  public static void main(String[] args) throws ScriptException {
    Reader reader = null;
    if(args.length > 0) {
      String script = args[0];
      InputStream is = ScriptEngineScripts.class.getResourceAsStream("/" + script);
      reader = new InputStreamReader(is);
    } else {
      System.out.print("Requires a script name be passed as the first parameter on the commandline.");
      System.exit(1);
    }
    
    ScriptEngineManager mgr = new ScriptEngineManager();
    mgr.put("scriptEngineManager", mgr);
    ScriptEngine jsEngine = mgr.getEngineByName("JavaScript");
    
    jsEngine.eval(reader);
  }

}
