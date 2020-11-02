class Solution {
    public List<List<Integer>> generate(int numRows) {
    
        List<List<Integer>> result = new  ArrayList<>();
        if(numRows == 0) return result;
        if(numRows == 1){
            result.add(Arrays.asList(1));
             return  result;
        } 
        if(numRows == 2){
            result.add(Arrays.asList(1));
            result.add(Arrays.asList(1,1));
             return  result;
        }
        result.add(Arrays.asList(1));
        result.add(Arrays.asList(1,1));
        
        for(int i = 2; i < numRows; i++){
            List<Integer> a = new ArrayList<Integer>();
            int low = 0;
            int high = 1;
            
            a.add(1);
            
            
            for(int j = 1; j< i; j++ ){
                a.add(result.get(i - 1).get(low) +  result.get(i - 1).get(high));
                low++;
                high++;
            }
            a.add(1);
            result.add(a);
        }
        
        return result;
        
    }
}