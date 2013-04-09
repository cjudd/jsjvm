/**
 * Script is used to insert data into a local derby database.
 */

importPackage(java.sql);

java.lang.Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

var conn = DriverManager.getConnection("jdbc:derby:sample;create=true");
var stmt = conn.createStatement();
var rs = stmt.executeQuery("select * from SYS.SYSTABLES");

println("JavaScript version\n");
println("System Tables:\n");

while(rs.next()) {
  println(rs.getString("tablename"));
}

