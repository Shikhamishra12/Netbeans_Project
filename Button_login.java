String a=t1.getText();
String b=new String(p1.getPassword());
Statement stmt=null;
ResultSet rs=null;
try{
Class.forName("com.mysql.jdbc.Driver");
Connection con =(Connection)
DriverManager.getConnection("jdbc:mysql://localhost:3306/war","root","1234);
stmt=con.createStatement();
String query="SELECT * FROM shikha where name='"+a+"'";
rs= stmt.executeQuery(query);rs.next();
String str=null;
str=rs.getString("password");
rs.close();stmt.close();
con.close();
if(str.equals(b)){
new CONTENT().setVisible(true);
this.setVisible(false);
 String name = t1.getText();
JOptionPane.showMessageDialog(this,"Welcome! "+name+"\n"+"You are now logged in successfully.","war and weapons website ",1); }
else{
JOptionPane.showMessageDialog (this,"wrong  password");}}
catch(Exception e){    
JOptionPane.showMessageDialog (this,e.getMessage());}
