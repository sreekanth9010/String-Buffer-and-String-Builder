package stringBuffer;

public class Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb =new StringBuffer();
		System.out.println(sb.capacity());//default capacity is 16
		sb.append("abcdefghijklmnop");
		System.out.println(sb.capacity());//capacity is utilized fully
		sb.append("a");
		System.out.println(sb.capacity());//new capacity = 2*(old capacity +1)
		sb.append("aaaaaaaaaaaaaaaaaaaaaasdfghjlkjhgfds");
		System.out.println(sb.capacity());
	}

}
