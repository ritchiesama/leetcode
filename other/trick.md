


Floyd判圈法:

对于链表找环路的问题,可以用快慢指针(Floyd判圈法).给定两个指针,分别命名为slow和fast,起始位置在链表的开头.每次fast前进两步,slow前进一步.如果fast可以走到尽头,说明无环;如果fast可以一直走下去,说明有环,**且一定存在在一个时刻slow和fast相遇**. 当slow和fast相遇时,我们将fast重新移动到链表开头,并让slow和fast每次都前进一步. 当slow和fast第二次相遇时, 相遇的节点即为环路的开始点.


三目运算符操作的时候,可以控制指针自增或者自减
```java
n1[c--] = n1[p1] > n2[p2] ? n1[p1--] : n2[p2--];
```


当返回一个数组时,可以不用新建一个变量,return格式如下:
```java
return new int[]{r_pointer, l_pointer}
```

Leetcode406 list.add方法
```java

//可以用此方法和array.sort的lambda表达式来解决lc406
list.add(int index, E element)
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
