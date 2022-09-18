package stringBuffer;

public class Capacity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer(19);
		System.out.println(sb.capacity());
		sb.append("asdfghjklpoiuytrewqzxcvbnm");
		System.out.println(sb.capacity());

	}

}
