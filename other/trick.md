三目运算符操作的时候,可以控制指针自增或者自减
```java
n1[c--] = n1[p1] > n2[p2] ? n1[p1--] : n2[p2--];
```


当返回一个数组时,可以不用新建一个变量,return格式如下:
```java
return new int[]{r_pointer, l_pointer}
```

Array.sort 对二维数组排序
```java
Arrays.sort(intervals, (a,b)-> a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
```
其中(a,b)为lambda表达式,comparator(a,b)方法中  默认按升序排序

若结果为负,则不交换(a,b)   
若结果为正,则交换(a,b)  
所以有如下四种情况  

|(a,b)|公式|结果|操作|  
|  ----  | ----  | ---- | ---- |
|a>b|a-b|>0|换|    
|a<b | a-b | <0 |不换 |  
|a>b | b-a | <0 |不换 |  
|a<b | b-a | >0 | 换 |  
