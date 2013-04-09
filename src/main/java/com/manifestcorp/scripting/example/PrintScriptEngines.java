package com.manifestcorp.scripting.example;

import java.io.PrintStream;
import java.util.List;

import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

/**
 * Print the available script engines. 
 */
public class PrintScriptEngines {
  
  /**
   * Print script engines to standard out.
   */
  public static void main(String[] args) {
    
    ScriptEngineManager mgr = new ScriptEngineManager();
    List<ScriptEngineFactory> factories = mgr.getEngineFactories();
    
    PrintStream out = System.out;
    
    out.println("Available Script Engines:");
    
    for (ScriptEngineFactory factory: factories) {
      String engName = factory.getEngineName();
      String engVersion = factory.getEngineVersion();
      String langName = factory.getLanguageName();
      String langVersion = factory.getLanguageVersion();
      out.printf("\nScript Engine: %s (%s)\n", engName, engVersion);
      out.printf("Language: %s (%s)\n", langName, langVersion);
      out.println("Engine Alias:");

      List<String> engNames = factory.getNames();
      for(String name: engNames) {
        out.printf("\t%s\n", name);
      }
    }
  }
}
