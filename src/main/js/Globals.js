/**
  Prints the Global Scripting Bindings.
  
  Expects:
   * scriptEngineManager an instance of javax.script.ScriptEngineManager
*/

println("Global Bound Variables:\n");
bindings = scriptEngineManager.getBindings();
keys = bindings.keySet().iterator();
while(keys.hasNext()) {
  key = keys.next();
  println(key + "=" + bindings.get(key));
}

println("\nDone");