package newInt;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee implements Externalizable, Cloneable{

	int age;
	String name;
	int id;
	
	 Employee(){
		this.age =0;
		this.name=null;
		this.id=0;
	}

	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		// TODO Auto-generated method stub
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
