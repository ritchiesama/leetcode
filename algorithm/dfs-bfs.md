## DFS
Permutation(n,d)

P(nums, n, d, used, curr, ans)
>
>nums  
n  将要进行全排列元素的个数  
d  递归深度  int
used  是否用过  boolean类型
curr  当前的结果  空数组
ans  将答案追加到ans里面
>
结束条件: d == n

想两个点：  
1.截止条件  
  if(d == p.length+1)  
    return;  
3.遍历候选节点  
  for(int i = 1; 1<p.length+1; i++)  
```python

#Permutation(n,d)
P(nums, n, d, used, curr, ans):
  if d == n:
    ans.append(curr)
    return

for i = 0 to len(nums):
     if used[i]: continue
     used[i] = True
     curr.push(nums[i])
     P(nums, d+1, n, curr, ans)
     curr.pop()
     used[i] = False
    
   }

#Combination C(nd)
C(nums, d, n, s, curr, ans)
  if d==n:
    ans.append(curr)
    return
    
for i = s to len(nums)
  curr.push(nums[i])
  C(nums, d + 1, n, i + 1, curr, ans)
  curr.pop()



#pruning

```
## BFS
