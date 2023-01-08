import java.util.Scanner;
public class break01{
	//编写一个main方法
	public static void main(String[]args){
		Scanner myScanner = new Scanner(System.in);
		String name = "";
		String passwd = "";
		int chance = 3;
		for(int i = 1; i<=3;i++){
			System.out.println("欢迎来到民政局，请输入丈夫名字：");
			name = myScanner.next();
			System.out.println("请输入妻子名字：");
			passwd = myScanner.next();
			if("".equals(name)&&"".equals(passwd)){
				System.out.println("恭喜，请原地结婚~");
				break;
			}
		}	}
}