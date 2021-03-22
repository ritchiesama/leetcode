main:
```java
package linkedlist;
public class Linkedlist{
   public static void main(String[] args){
       MyLinkedList list = new MyLinkedList();
       list.add(10);
       list.add(3);
       list.display();
   }
}
```


Node类
```java
package linkedlist;
public class Node {
   public int data;
   public Node next;
   public Node(){
   }
   public Node(int value){
       this.data=value;
   }
}
```



```java
package linkedlist;
public class MyLinkedList{
    private Node first = null;
    private Node current=null;
    //在mylinkedlist中添加元素
    public void add(int value){
        //产生一个新的节点
        Node newNode = new Node(value);
        //情况1.如果没有任何节点存在
        if(first == null){
            first = newNode;
            current = newNode;
        }else{
        //情况2.如果不是第一个节点
            current.next = newNode;
            current = newNode;
        }
    }
    public void display(){
        Node node = first;
        while(node != null){
            int value = node.data;
            System.out.println(value);
            node = node.next;
        }
    }
}
```
