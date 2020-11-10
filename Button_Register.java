char Gender=' ';    
if(R1.isSelected())
Gender='F';
if(R2.isSelected())
Gender='M';
String A=new String(P1.getPassword());
String B=new String(P2.getPassword());
String a=T1.getText();
String b=T2.getText();
String c=T3.getText();
if(A.equals("")||B.equals("")||a.equals("")||b.equals("")||c.equals(""))
{this.setVisible(true);
JOptionPane.showMessageDialog (null,"fill each and every asked thing");}
else{
try{
Class.forName("java.sql.Driver");
Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/war","root","1234");
Statement  stmt =con.createStatement();
String sql="insert into shikha values('"+(T1.getText())+"','"+A+"')";
stmt.executeUpdate(sql);
this.setVisible(false);
new CONTENT().setVisible(true);
String name =T1.getText();
JOptionPane.showMessageDialog(this,"Welcome!\n"+name+"\n"+"To  war and weapons website ");}
 catch (Exception e) {
JOptionPane.showMessageDialog(null,""+ e);}} }        
