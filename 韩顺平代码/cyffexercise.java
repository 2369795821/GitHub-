public class cyffexercise{
	public static void main(String[]args){
		AA a =new AA();
		if(a.isOdd(7923894798237498)){
			System.out.println("是奇数");
		}
		else{
			System.out.println("是偶数");
		}
		
	}
}





class AA{
	public boolean isOdd(int num){

		return num % 2 != 0;
	}
}