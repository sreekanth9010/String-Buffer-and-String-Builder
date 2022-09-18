package stringBuffer;

public class Capacity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("sachin");
		System.out.println(sb.reverse());
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("asdfghjkloiuytrewqpmnbvcxz");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.insert(1, "CSK");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.delete(1, 2);
		sb.deleteCharAt(0);
		System.out.println(sb);
		sb.setLength(6);
		System.out.println(sb);
		sb.trimToSize();
		System.out.println(sb);
		
		

	}

}
