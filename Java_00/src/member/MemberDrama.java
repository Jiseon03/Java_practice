package member;

public class MemberDrama {
	
	public static void main(String[] args) {

		dramaMemberInfo();
		
	}

	public static void dramaMemberInfo() {
		// 여러명의 멤버 생성 (회원 아이디와 이름으로만 구성)
		// Member(String, String) - 회원 아이디와 이름으로 구성된 생성자
				Member mem1 = new Member("id_1", "이정재");
				Member mem2 = new Member("id_2", "asd");
				Member mem3 = new Member("id_3", "wer");
				Member mem4 = new Member("id_4", "erg");
				Member mem5 = new Member("id_5", "sdf");
				
				System.out.println("회원 1 : "+mem1.getMemberId()+"::"+mem1.getMemberName());
				System.out.println("회원 2 : "+mem2.getMemberId()+"::"+mem2.getMemberName());
				System.out.println("회원 3 : "+mem3.getMemberId()+"::"+mem3.getMemberName());
				System.out.println("회원 4 : "+mem4.getMemberId()+"::"+mem4.getMemberName());
				System.out.println("회원 5 : "+mem5.getMemberId()+"::"+mem5.getMemberName()); 
	}

}