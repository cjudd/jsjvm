/**
  Prints the Available Scripting Engines.
  
  Expects:
   * scriptEngineManager an instance of javax.script.ScriptEngineManager
*/

println("Available Script Engines:");

factories = scriptEngineManager.getEngineFactories().toArray();
for (var i=0; i < factories.length; i++) {
  f = factories[i];
  engName = f.getEngineName();
  engVersion = f.getEngineVersion();
  langName = f.getLanguageName();
  langVersion = f.getLanguageVersion();
  println("\nScript Engine: " + engName + " " + engVersion);
  println("Language: " + langName + " " + langVersion);
  println("Engine Alias:");
  
  engNames = f.getNames().toArray();
  for (var ii=0; ii < engNames.length; ii++) {
    println("\t" + engNames[ii]);
  }
  
  println("Extensions:");
  extensions = f.getExtensions().toArray();
  for (var iii=0; iii < extensions.length; iii++) {
    println("\t" + extensions[iii]);
  }
  
}

println("\nDone");