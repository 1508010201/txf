/*����˵����ģ�����ж��ڴ��ܡ��������ж��ڴ���˻���DepositAccount��
  ���а������˺ţ���������������������ʵ����ԣ��Ϳ���������ѯ��
  ������Ϣ�ȷ�������ѯ�����㲢��ʾ����Ϣ������Ϣ*/
//Iv.0
//2017��10��12��
//̷�㷼

class DepositAccount{
	static double fit;            //������
	private String name;          //��������
	private String accountNumber; //�˺�
	private double balance;  //���
	//���캯�������ڿ�����
	public DepositAccount(String x,String y,double z,double k){
		name=x;
		accountNumber=y;
		balance=z;
		fit=k;
	}
	//��ѯ����
	public String getName(){
		return name;
	}
	//��ѯ�˺�
	public String getAccount(){
			return accountNumber;
		}
	//���
	public double save(float m){
		balance+=m;
		return balance;
	}
	//����Ϣ
	public double interestYear(){
		return(balance*fit);
	}
	//����Ϣ
	public double interestMonth(){
		return((balance*fit)/12);
	}
}
public class TestDepositAccount {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		DepositAccount saver=new DepositAccount("ZhangSan","1234567890",5000,0.023);
		System.out.println("������"+saver.getName());
		System.out.println("�˺ţ�"+saver.getAccount());
		System.out.println("��"+saver.save(2000));
		System.out.println("����Ϣ��"+saver.interestYear());
		System.out.println("����Ϣ��"+saver.interestMonth());
	}
}
		

