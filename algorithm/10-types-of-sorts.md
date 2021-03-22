****均以从小到大为例

### O(n²)

bubble sort
冒泡排序中, i决定j循环的长度, j每次循环后,负责将固定长度的最后一位换成最大或最小,每次j循环结束后,**第arr.length - i位(第9,8,7,6...位)**一定是数组中的最大值
```java
for(int i = 1; i < arr.length; i++){
  for(int j = 0; j< arr.length -i; j++){
    if(arr[j] > arr[j+1]){
      swap(arr[j],arr[j+!]);
    }
  }
}
```

selection sort
选择排序中, i记录当前最小的元素,j控制遍历, 每次j遍历完成,前i位一定是有序最小的元素
```java
for(int i = 0; i < arr.length -1 ; i++){
   int min = i;
   for(int j = i + 1; j< arr.length; j++){
      if(arr[j] < tmp)
        min = j;
      
   }
   if(i!=tmp){
    swap(arr[i],arr[tmp]);
   }
}

```


insertation sort
插入排序中, i记录被比较元素, j控制arr[i]和前j个元素比较, 每次j遍历完成,前i个数一定是有序最小元素
```java
for(int i = 1; i < arr.length; i++){
  int tmp = arr[i];
  int j = i;
  while( j > 0 && tmp < arr[j - 1]){
    arr[j] = arr[j-1];
    j--;
  }
  if( j != i){
    arr[j] = tmp;
  }
}
```


hill sort
```java
```


### O(nlogn)
merge sort
```java
```


heapsort
```java
```


quicksort
```java
```




### O(n+k)
counting sort
```java
```


radix sort(基数排序)
```java
```

bucket sort
```java
```
