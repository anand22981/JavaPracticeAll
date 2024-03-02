package mobileAggandCom;

public class MobileApp {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		Charger c = new Charger("Moto");
		System.out.println(m.os.getName());
		System.out.println(m.hasA(c));
		
		//destroyed check
//		m=null;
//		System.out.println(m.os.getName());
//		System.out.println(m.hasA(c));

	}

}
