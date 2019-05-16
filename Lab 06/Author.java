class Author{
	private String name;String email;char gender;
	public Author(String name,String email,char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public void setname(String name){
	}
	public String getname(){
		return name;
	}
	public void setemail(String email){
	}
	public String getemail(){
		return email;
	}

	public void setgender(char gender){
	}
	public char getgender(){
		return gender;
	}
	public void tostring(){
		System.out.println("Author[name="+name+",email="+email+",gender="+gender+"]");
	}
}
