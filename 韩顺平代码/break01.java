import java.util.Scanner;
public class break01{
	//��дһ��main����
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i = 1; i<=3;i++){
			System.out.println("��ӭ���������֣��������ɷ����֣�");
			name = myScanner.next();
			System.out.println("�������������֣�");
			passwd = myScanner.next();
			if("".equals(name)&&"".equals(passwd)){
				System.out.println("��ϲ����ԭ�ؽ��~");
				break;
			}
		}	}
}