class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     HashMap<Integer,Integer> mp=new HashMap<>();
     ArrayList<Integer> list=new ArrayList<>();
     for(int e:nums){
          mp.put(e,mp.getOrDefault(e,0)+1);
        }
        for(var e:mp.entrySet()){
            if(e.getValue()>1){
                list.add(e.getKey());
            }
        }
        return list;
    }
}