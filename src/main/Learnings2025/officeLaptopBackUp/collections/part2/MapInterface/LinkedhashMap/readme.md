Helps in maintaining insertion order and /access order.

also uses a doubly linked list to maintain the order of elements.


Not thread safe. Need to make this thread safe by adding Collections.TheradSafeMap


Here are some important questions on `LinkedHashMap`:

1. **What is a `LinkedHashMap` and how is it different from `HashMap`?**
    - Explain how `LinkedHashMap` maintains insertion order or access order, while `HashMap` does not.

2. **How does `LinkedHashMap` maintain insertion order?**
    - Discuss the use of a doubly linked list in `LinkedHashMap`.

3. **What is the time complexity of basic operations in `LinkedHashMap`?**
    - Compare the time complexity of `put()`, `get()`, and `remove()` operations with other `Map` implementations.

4. **How can you make a `LinkedHashMap` thread-safe?**
    - Explain the use of `Collections.synchronizedMap()` to make it thread-safe.

5. **What is the difference between insertion order and access order in `LinkedHashMap`?**
    - Discuss how access order can be enabled using the constructor.

6. **How do you create an access-order `LinkedHashMap`?**
    - Provide an example of using the constructor with the `accessOrder` parameter set to `true`.

7. **What happens when you insert a `null` key or value into a `LinkedHashMap`?**
    - Explain the behavior of `LinkedHashMap` regarding `null` keys and values.

8. **How can you implement a Least Recently Used (LRU) Cache using `LinkedHashMap`?**
    - Discuss overriding the `removeEldestEntry()` method to implement an LRU cache.

9. **What are the advantages of using `LinkedHashMap` over `HashMap`?**
    - Discuss scenarios where maintaining order is important.

10. **How does `LinkedHashMap` handle collisions?**
    - Explain how it uses the same hashing mechanism as `HashMap` but maintains order using a linked list.

These questions cover both theoretical and practical aspects of `LinkedHashMap`.