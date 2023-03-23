package constructor;

import vo.Actor;
public class ActorApp {

	public static void main(String[] args) {
		
		Actor actor = new Actor("손예진", 165, 45);
		
		System.out.println("이름: "+actor.getName());
		System.out.println("키: "+actor.getHeight()+"cm");
		System.out.println("몸무게: "+actor.getWeight()+"kg");
		
		//Actor 객체 선언 후 좋아하는 배우의
		//정보를 세팅 후 출력
		System.out.println("-----------------------");
		
		Actor actor2 = new Actor("공유", 184, 74);
		
		System.out.println("이름: "+actor2.getName());
		System.out.println("키: "+actor2.getHeight()+"cm");
		System.out.println("몸무게: "+actor2.getWeight()+"kg");
	}//main() end
}//ActorApp class end