package huawei;

import java.io.*;
/*
* 需求：数据表记录包含表索引和数值，请对表索引相同的记录进行合并，即将相同索引的数值进行求和运算，输出按照key值升序进行输出。
* 输入：先输入键值对的个数然后输入成对的index和value值，以空格隔开
* 输出：输出合并后的键值对（多行）
*/

public class So{
	public static void main(String argn[]) throws IOException{
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String count_str,temp,temp2[];
		int records[];
		while((count_str = bufr.readLine()) != null) {
			int count_int = Integer.parseInt(count_str);
			records = new int[count_int+1];
			while(count_int>0) {
				temp = bufr.readLine();
				temp2 = temp.split(" ");
				records[(Integer.parseInt(temp2[0]))] += Integer.parseInt(temp2[1]);
				count_int--;
			}

			for(int i = 0; i<records.length;i++) {
				if(records[i] != 0) {
					System.out.println(i+" "+records[i]);
				}
			}
		}
	}
}