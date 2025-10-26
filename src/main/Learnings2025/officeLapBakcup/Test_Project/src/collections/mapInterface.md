Set Interface and Implementations
HashSet

Internal Structure: Hash table
Duplicates: Not allowed
Order: No guaranteed order
Null Values: One null allowed
Time Complexity: O(1) average for basic operations

javaSet<String> hashSet = new HashSet<>();
hashSet.add("A");
hashSet.add("B");
hashSet.add("A"); // Duplicate - won't be added
System.out.println(hashSet.size()); // Output: 2
LinkedHashSet

Internal Structure: Hash table + Linked list
Order: Maintains insertion order
Performance: Slightly slower than HashSet

javaSet<String> linkedHashSet = new LinkedHashSet<>();
linkedHashSet.add("Third");
linkedHashSet.add("First");
linkedHashSet.add("Second");
// Order: Third, First, Second
TreeSet

Internal Structure: Red-Black Tree (self-balancing BST)
Order: Sorted order
Null Values: Not allowed
Time Complexity: O(log n) for basic operations
Requirements: Elements must be Comparable or provide Comparator

javaSet<String> treeSet = new TreeSet<>();
treeSet.add("C");
treeSet.add("A");
treeSet.add("B");
// Order: A, B, C (sorted)