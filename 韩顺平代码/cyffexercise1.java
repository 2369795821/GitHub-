//思路要求：根据行，列字符打印，eg；打印4行4列的井
/*分析
1.返回类型，无
2.方法名字，print，主要是打印输出
3.方法的形参,(int row,int col,char c)
4.方法体，循环
*/
public class cyffexercise1{
	 public static void main(String[] args) {
	 	AA a=new AA();
	 	a.print(99,99,'吴');
        }
    }
		



class AA{
	public void print(int row,int col,char c){
		for (int i = 0;i < row;i++){
			for (int j = 0;j < col ;j++ ) {//打印每一行
				System.out.print(c);
				}
		
	
			System.out.println();//换行
		}
	}
}
		
	  

		