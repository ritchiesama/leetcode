class Solution {
    public int[][] reconstructQueue(int[][] people) {
        //按照身高降序,人数升序排序
        Arrays.sort(people, (a,b)->(a[0] == b[0]? a[1] - b[1]: b[0] - a[0]));
        List<int[]> result=new ArrayList<int[]>();
        //暂时不清楚这是什么意思 ↓
        for(int[] p:people){
            result.add(p[1],p);
        }
        
        return result.toArray(new int[people.length][2]);
    }
    
}
