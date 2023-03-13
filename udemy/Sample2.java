
class Staff{
	String name;
	int staffid;
	String email;
	
	public void sayhello() {
		System.out.println("Hello " + this.name);
	}
}

class Member{
	String name;
	int memberid;
}
public class Sample2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Staff yamada = new Staff();
		yamada.name = "Taro Yamada";
		yamada.sayhello();
		Staff hashimoto = new Staff();
		hashimoto.name = "MAsataka Hashimoto";
		hashimoto.sayhello();
    }
}
    