//˼·Ҫ�󣺸����У����ַ���ӡ��eg����ӡ4��4�еľ�
/*����
1.�������ͣ���
2.�������֣�print����Ҫ�Ǵ�ӡ���
3.�������β�,(int row,int col,char c)
4.�����壬ѭ��
*/
public class cyffexercise1{
	 public static void main(String[] args) {
	 	AA a=new AA();
	 	a.print(99,99,'��');
        }
    }
		



class AA{
	public void print(int row,int col,char c){
		for (int i = 0;i < row;i++){
			for (int j = 0;j < col ;j++ ) {//��ӡÿһ��
				System.out.print(c);
				}
		
	
			System.out.println();//����
		}
	}
}
		
	  

		