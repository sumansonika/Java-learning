MultiThreading 
we use multithreading than multiprocessing because threads use a shared memory area. They don't allocate separate memory area so saves memory, 
and context-switching between the threads takes less time than process.

1) Process-based Multitasking (Multiprocessing)
Each process has an address in memory. In other words, each process allocates a separate memory area.
A process is heavyweight.
Cost of communication between the process is high.
Switching from one process to another requires some time for saving and loading registers, memory maps, updating lists, etc.
2) Thread-based Multitasking (Multithreading)
Threads share the same address space.
A thread is lightweight.
Cost of communication between the thread is low.

The purpose of start() is to create a separate call stack for the thread. A separate call stack is created by it, and then run() is called by JVM.

Each thread starts in a separate call stack.
Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than at the beginning of a new call stack.

If we directly call run method, there is no context-switching because here t1 and t2 will be treated as normal object not thread object.

##Daemon thread : 
It provides services to user threads for background supporting tasks. It has no role in life than to serve user threads.
Its life depends on user threads.
It is a low priority thread.
