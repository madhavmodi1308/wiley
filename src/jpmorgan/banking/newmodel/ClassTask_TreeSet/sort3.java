package jpmorgan.banking.newmodel.ClassTask_TreeSet;

import java.util.Comparator;

public class sort3 implements Comparator<Type>{
	@Override
	public int compare(Type cur, Type next) {
		if(cur.object == null || next.object == null){
			return -1;
		}
		if(cur.object instanceof String) {
			if(next.object instanceof String) {
				String str1 = (String)cur.object;
				String str2 = (String)next.object;
				return str1.compareTo(str2);
			}
			else if(next.object instanceof User){
				return ((String)cur.object).compareTo(((User) next.object).getName());
			}
			else if(next.object instanceof Integer) {
				return -1;
			}
		}
		else if(cur.object instanceof User) {
			if(next.object instanceof User) {
				return ((User) cur.object).getName().compareTo(((User) next.object).getName());
			}
			else if(next.object instanceof String){
				return ((User) cur.object).getName().compareTo((String)next.object);
			}
			else if(next.object instanceof Integer) {
				return -1;
			}
		}
		else if(cur.object instanceof Integer) {
			if(next.object instanceof Integer) {
				int i = (int)next.object;
				int j = (int)cur.object;
				return j - i;
			}
			else 
				return 1;
		}
		return 0;
	}
}

