package jpmorgan.banking.newmodel.ClassTask_TreeSet;

public class Type{
	Object object;
	public Type(){

	}
	public Type(Object object){
		this.object = object;
	}
	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	@Override
	public String toString() {
		return "--"+ object +"";
	}

	@Override
	public int hashCode() {
		return object.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
