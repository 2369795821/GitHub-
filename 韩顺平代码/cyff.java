public class cyff{
public static void main(String[]args){
    AA a=new AA();
    int[] res=a.getSumAndSub(1,4);
    System.out.println("和="+ res[0]);
    System.out.println("差="+ res[1]);
}
}
class AA{//方法

	public int[] getSumAndSub(int n1,int n2){//定义一个返回差和结果的数组的方法

		int[] resArr = new int[2];//定义一个数组，resArr，有两个元素空间
		resArr[0] = n1+n2;
		resArr[1] = n1-n2;
		return resArr;	}
}