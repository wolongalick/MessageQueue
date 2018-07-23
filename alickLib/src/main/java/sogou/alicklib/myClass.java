package sogou.alicklib;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class myClass {
    public static void main(String[] args){

        Queue<String> linkedList = new ArrayBlockingQueue<String>(3);
        linkedList.offer("a");
        linkedList.offer("b");
        linkedList.offer("c");
        linkedList.offer("d");


        Blog.i(linkedList.poll());
        Blog.i(linkedList.poll());
        Blog.i(linkedList.poll());
        Blog.i(linkedList.poll());
        Blog.i(linkedList.poll());





    }


}
