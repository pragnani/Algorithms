package com.algorithms.dbs;

public class IronMan {

	public static void main(String[] args) {
		int[] levels= {-5,4,-2,3,1,-1,-6,-1,0,5};
		int minPower=0;
		int power=0;
		for(int level:levels){
			if(level<=0){
				if(power+level<1){
					int tempPower=power;
					while(tempPower+level<1){
						tempPower++;
						minPower++;
					}
					power=tempPower;
				}
			}
			power+=level;
		}
		System.out.println(minPower);

	}

}
