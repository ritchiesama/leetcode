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
 public int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    protected int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {
                result[i++] = left[0];
                left = Arrays.copyOfRange(left, 1, left.length);
            } else {
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
    }

}
```


heapsort
```java

```


quicksort  
选出一个pivot来  
设置两个指针,left right,分别指向sub-array的最左边和最右边  
先将right指针的数和pivot比较  
如果比pivot小的放到左边,right向左移  
再将left指针指向的大于pivot的数放到right,left向右移动  
重复操作直到 left= right  
将pivot的值赋给left  

```java
public class QuickSort {
	public static void main(String[] args) {
		int[] arr = { 49, 38, 65, 97, 23, 22, 76, 1, 5, 8, 2, 0, -1, 22 };
		quickSort(arr, 0, arr.length - 1);
		System.out.println("排序后:");
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	private void quickSort(int[] arr, int left, int right){
		if(left<right){//不要忘了有if判断
		int index = getIndex(arr,left,right);
		quickSort(arr,left,index-1);//中间应该是left
		quicksort(arr,index+1,right);
		}
	}
	
	private int getIndex(int[] arr, int left, int right){
		int pivot = arr[left];
		whlie(left<right){
			while(left<right && arr[right] >= pivot){
				right--;
			}
			arr[left] = arr[right];
			while(left<right && arr[left] <= pivot){
				left++;
			}
			arr[right] = arr[left];
		}
		arr[left]= pivot;
		return left;
	}	
}


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
