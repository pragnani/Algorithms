package com.algorithms.dc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
	 Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        
        // {(1,3)(2,4)(6,8)(9,10)}
        // One by one run for all input test cases
        ArrayList<Intervel> intervlesList=new ArrayList<Intervel>();
        while (t > 0)
        {
            // number of intervels
            int n = sc.nextInt();
 
            // Input the array
            for (int i = 0; i < n; i++){
            	if(sc.hasNext()){
            	int x=sc.nextInt();
            	int y=sc.nextInt();
               intervlesList.add(new Intervel(x,y));
            	}
            }
 
           
            t--;
        }
        sc.close();
        //sort intervels
        merge(intervlesList);
	}
	private static void merge(ArrayList<Intervel> intervlesList) {
		Collections.sort(intervlesList, new Comparator<Intervel>(){
            @Override
            public int compare(Intervel a, Intervel b){
                return a.start-b.start;
            }
        });
        ArrayList<Intervel> mergedIntervels=new ArrayList<Intervel>();
        int prevStart=intervlesList.get(0).start;
        int prevEnd=intervlesList.get(0).end;
        for(int i=1;i<intervlesList.size();i++){
            Intervel current= intervlesList.get(i);
            if(current.start>prevEnd){
                mergedIntervels.add(new Intervel(prevStart, prevEnd));
                prevStart= current.start;
                prevEnd=current.end;
            }
            else{
                prevEnd= Math.max(current.end, prevEnd);
            }
        }
      
        mergedIntervels.add(new Intervel(prevStart, prevEnd));
        System.out.println(mergedIntervels);
	}
	static class Intervel{
	    int start;
	    int end;
	    Intervel(int s, int e){
	        start=s;
	        end=e;
	    }
	    
	    public String toString(){
	    	return start+"->"+end;
	    }
	}
}