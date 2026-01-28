Q. implement the producer consumer problem.

Two therad a consumer and a producer, share a common resources.
fixed size buffer as  a queue.

Producer's job is to generate data and put it into the queue., while consumers
job is to read the data from the queue.

The problem is to  make sure that the producer does not try to add data
when buffer is full, and consumer does not try to read data when buffer is empty.



