 	 package Arrays;

import java.util.HashMap;
import java.util.Map;

public class FindRepeatingElements {

	public static void main(String[] args) {
	  int[] arr = {4, 2, 3, 5, 1, 2, 4};

      Map<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
		// TODO Auto-generated method stub

		
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> repeatedValues:map.entrySet()){
            if(repeatedValues.getValue()>0){
              System.out.println("Key : "+repeatedValues.getKey()+"Value :"+repeatedValues.getValue());
            }
        


        }
	}
        }
	


