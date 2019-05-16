class Students{
String name;int age;String address;
public Students(){
name="unknown";
age=0;
address="not available";
}
public void setinfo(String name,int age){
	this.name=name;
	this.age=age;
}
public void setinfo(String name,int age,String address){
	System.out.print(name);
	System.out.print(age);
	System.out.print(address);
	System.out.println();
}
}
