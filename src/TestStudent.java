//�ڸ���student�Ļ����϶��������о����ͱ���������������ǵ���Ϣ
//2017��10��15��
//̷�㷼
//Iv.0

class Student{
	public String name;
	public int age;
	public String degree;
	//�������
	void ShowStudent()
	{
		System.out.println(name+"  "+age+" "+degree);
	}
}
//���౾������
class Undergraduate extends Student{
	private String specialty;
	//���캯��
	public Undergraduate(String name,int age,String degree,String specialty)
	{
		this.name=name;
		this.age=age;
		this.degree=degree;
		this.specialty=specialty;
	}
	//�������
	void ShowUndergraduate()
	{
		System.out.println(name+"  "+age+" "+degree+"  "+specialty);
	}
}
//�����о�����
class Graduate extends Student{
	private String direction;
	//���캯��
	public Graduate(String name,int age,String degree,String direction) 
	{
		 this.name=name;
		 this.age=age;
		 this.degree=degree;
		 this.direction=direction;
	}
    //�������
	void ShowGraduate()
	{
		System.out.println(name+"  "+age+" "+degree+"  "+direction);
	}
}
//������
public class TestStudent 
{
	public static void main(String[] args)
	{
		Undergraduate ����=new Undergraduate("����",20,"����","ͨ��");
		Undergraduate ����=new Undergraduate("����",20,"����","����");
		Graduate ����=new Graduate("����",25,"˶ʿ","ͨ��");
		Graduate ����=new Graduate("����",36,"��ʿ","ͨ��");
		����.ShowUndergraduate();
		����.ShowUndergraduate();
		����.ShowGraduate();
		����.ShowGraduate();

	}

}
