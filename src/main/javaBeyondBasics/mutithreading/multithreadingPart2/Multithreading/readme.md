using a sharedresource class.


producer and consumer threads. Since both threads are working on same 
resource. we have to use synchronized to avoid the conflict.



here we created a producer consumer sample where producer thread
produces data and consumer thread consumes it. The producer thread
produces data and puts it into a shared resource, while the consumer thread
consumes data from that shared resource.

The consumer is started forst and kept waiting to get notfied whe the 
item is produced.