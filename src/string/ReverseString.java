package string;

import java.util.ArrayList;

public class ReverseString {

	public static void main(String[] args) {
		String s =  "My Name is Adit Choudhary";
		
		ArrayList<StringBuffer> arrayList = new ArrayList<>();

		
		char[] content = s.toCharArray();
		
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i<content.length;i++){
		char v = content[i];
			if(v == ' '){
				arrayList.add(buffer);
				buffer = new StringBuffer();
			}
			else{
				buffer = buffer.append(content[i]);
			}
		}
		
		
	Object[] con = arrayList.toArray();
	for (Object object : con) {
		System.out.println(object);
	}
		
		ArrayList<String> newarrayList = new ArrayList<>();
		Object left,right,swap;
		
		int loop = con.length/2;
		System.out.println(loop);
		for(int j=0; j<loop;j++){
			 left = con[j];
			 right = con[con.length-1-j];
			
			 con[j] = right;
			 con[con.length-1-j] = left;
		}
		
		for (Object o : con) {
			System.out.println(o);
		}
	}

}
