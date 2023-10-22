package InterviewPrograms;


class Emp{
	float salary=400000;
}
public class InheritanceProg extends Emp {
	int bonus=232323;
	public static void main(String[] args) {
		InheritanceProg p=new InheritanceProg();
		System.out.println(p.salary);
		System.out.println(p.bonus);

	}

}
