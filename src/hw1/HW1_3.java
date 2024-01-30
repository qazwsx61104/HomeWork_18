package hw1;

public class HW1_3 {
		public static void main(String[] args ) {
			
			//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
			
			int total = 256559 ,   hours = 24 , hoursec =3600 ,   min=60 ,   sec = 60 ,   day = hours * min * sec ;
			
			int ttlhrs = total%day  ; int ttlmin = ttlhrs % hoursec;  int ttlsec = ttlmin % 60 ;
			
			System.out.println("256559秒為=" + total/day + "天" + ttlhrs/hoursec + "小時" + ttlmin/min +"分"+ttlsec +" 秒" );
			
			
			
		}
}
