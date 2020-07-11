package com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter24;


import com.liangIntroductionJavaDataSturctures.liang11ebychapters.chapter23.Heap;

public class MyPriorityQueue<E extends Comparable<E>> {
  private Heap<E> heap = new Heap<E>();

  public void enqueue(E newObject) {
    heap.add(newObject);
  }

  public E dequeue() {
    return heap.remove();
  }

  public int getSize() {
    return heap.getSize();
  }
}
