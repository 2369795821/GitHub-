public class cyffexercise{
	public static void main(String[]args){
		AA a =new AA();
		if(a.isOdd(7923894798237498)){
			System.out.println("������");
		}
		else{
			System.out.println("��ż��");
		}
		
	}
}





class AA{
	public boolean isOdd(int num){

		return num % 2 != 0;
	}
}