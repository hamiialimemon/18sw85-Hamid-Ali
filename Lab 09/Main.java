class invalidage extends Exception{
  invalidage(String s){
super(s);
}
}
class voting{
String[] c;
int []count;
public void Addcandidate(String[] name){
c=name;
count=new int[name.length];
}
public void castvote(String name,int age){	
for(int i=0;i<c.length;i++){
if(name.equals(c[i])){
count[i]++;
}
}	
}
public void showresult(){
for(int i=0;i<c.length;i++){
System.out.println("Votes casted for "+c[i]+" are "+count[i]+".");
}
}
}
class Main{
public static void main(String[] args)throws invalidage {
voting m1=new voting();
String name[]={"Hamii","Ali","Mohsin"};
m1.Addcandidate(name);
int age=18;
try{
if(age<18){
throw new invalidage("age is below 18");
}
else
m1.castvote("Ali",age);

}catch(ArithmeticException e){
System.out.println("");
}

m1.showresult();
}
}