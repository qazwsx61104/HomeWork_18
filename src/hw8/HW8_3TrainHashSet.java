package hw8;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class HW8_3TrainHashSet {

	public static void main(String[] args) {

		Set<HW8_2Train> set = new HashSet<HW8_2Train>();
		HW8_2Train t1 = new HW8_2Train(202, "普悠瑪", "樹林", "花蓮", 400);
		HW8_2Train t2 = new HW8_2Train(1254, "區間", "屏東", "基隆", 700);
		HW8_2Train t3 = new HW8_2Train(118, "自強", "高雄", "台北", 500);
		HW8_2Train t4 = new HW8_2Train(1288, "區間", "新竹", "基隆", 400);
		HW8_2Train t5 = new HW8_2Train(122, "自強", "台中", "花蓮", 600);
		HW8_2Train t6 = new HW8_2Train(1222, "區間", "樹林", "七堵", 300);
		HW8_2Train t7 = new HW8_2Train(1254, "區間", "屏東", "基隆", 700);
		
//		Collections.addAll(list,t1,t2,t3,t4,t5,t6,t7);
//		//list.forEach(s->System.out.println(s));
//		list.forEach (s ->
//				System.out.println(s)
//			
//		);

		set.add(t1);
		set.add(t2);
		set.add(t3);
		set.add(t4);
		set.add(t5);
		set.add(t6);
		set.add(t7);

		for (HW8_2Train tinfo : set) {
			System.out.println(tinfo.getNumber() + "-" + tinfo.getType() + "-" + tinfo.getStart() + "-"
					+ tinfo.getDest() + "-" + tinfo.getPrice());
		}

	}

}
