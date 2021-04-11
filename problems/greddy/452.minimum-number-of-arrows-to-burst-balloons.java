class Solution {
    public int findMinArrowShots(int[][] points) {
     if (points.length == 0) {
            return 0;
        }
      //注意先排序再将边界赋值,如果有负数出现,Lambda函数需要用compare来排列
        Arrays.sort(points, (a,b)-> Integer.compare(a[1],b[1]));
        int count = 1;
        int edge = points[0][1];


        for(int i = 1; i<points.length; i++){
            if(points[i][0] <= edge) continue;
            count++;
            edge = points[i][1];
        }
        return count;
    }
}

