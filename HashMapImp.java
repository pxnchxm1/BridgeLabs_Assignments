/*
arr = [2,3,4,5,1]
target = 6
o/p - [0,2] (2,4)
 */


import java.util.HashMap;
public class HashMapImp{

    public static void twoSum(int[] arr,int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                System.out.println(map.get(i),i);
            }else{
                map.put(k-arr[i],i);
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1};
        int target = 6;
        twoSum(arr,target);
        
    }
}