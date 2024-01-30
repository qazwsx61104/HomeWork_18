package hw3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
	//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
	//的號碼與總數，如圖：
public class HW3_3 {

				public static void main(String[] args) {
					Set set = new HashSet();
					Scanner number = new Scanner(System.in);
					System.out.println("請輸入你不要的數字") ;
					int a = number.nextInt();	//假如輸入 3					
											    while (set.size() !=6  )  {
													    int k = ((int)(Math.random()*49)+1);
													    if(k%10 == a ||k/10 == a) {    //排除數字
													    }
													    else 
														   set.add(k);	//隨機6個數字加入k		
									            }							         			
					       	
												Iterator objs = set.iterator();
												while (objs.hasNext())
												System.out.print(objs.next() + " ");		
			    }			
			}					
//						for( int i = 1 ; i < 50 ; i ++ )
//						{
//							if (i%10 == a ||i/10 == a) {								
//							}
//							else	{
//								System.out.print(i+ " " );	
//								sum++;																	
//							}
//				}			
//					System.out.println();
//					System.out.println(sum);
//					System.out.println("==============");

