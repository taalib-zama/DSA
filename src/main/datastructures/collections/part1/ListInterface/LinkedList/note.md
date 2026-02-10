//implements both deque and list interfaces
// LinkedList is a doubly linked list implementation of the List and Deque interfaces
// It allows for efficient insertion and removal of elements at both ends of the list
//supports deque methods like - getFirst, getLast, addFirst, addLast, removeFirst, removeLast
//it also supports index based operations like get(Index), set(Index, Element), add(Index, Element), remove(Index)



Java LinkedList maintains the insertion order of the elements.

LinkedList can have duplicate and null values.

The LinkedList class implements Queue and Deque interfaces. Therefore, It can also be used as a Queue, Deque or Stack.

Java LinkedList is not thread-safe. You must explicitly synchronize concurrent modifications to the LinkedList in a multi-threaded environment.

====================================

Both ArrayList and LinkedList implement the List interface. However, they differ completely in the way they store and link to the elements.

An ArrayList stores the elements sequentially based on their index. However, a LinkedList uses a doubly-linked list to store its elements.



A doubly-linked list consists of a collection of nodes, where each node contains three fields -

The data at that node.
A pointer/reference to the next node in the list.
A pointer/reference to the previous node in the list.



Following are some key differences between LinkedList and ArrayList:

A LinkedList consumes more memory than an ArrayList because it also stores the next and previous references along with the data.

You can access an element in an ArrayList in O(1) time. But it takes O(n) time to access an element in a LinkedList because it needs to traverse to the desired element by following the next/prev references.

Adding or removing elements are usually slower in an ArrayList compared to LinkedList. This is because the elements in the ArrayList needs to be shifted if a new element is added in the middle of the ArrayList. The ArrayList might also need to be resized to accommodate the new element. Similarly, in case of removal, the elements in the ArrayList needs to be shifted to the new positions.