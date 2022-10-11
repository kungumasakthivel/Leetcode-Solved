class MedianFinder {
    PriorityQueue<Integer> smallNum;
    PriorityQueue<Integer> largeNum;
    public MedianFinder() {
        smallNum = new PriorityQueue<>(Collections.reverseOrder());
        largeNum = new PriorityQueue<>();
    }
    
    public void addNum(int num) {
        smallNum.offer(num);
        
        largeNum.offer(smallNum.poll());
        if(largeNum.size() > smallNum.size())
            smallNum.offer(largeNum.poll());
        
    }
    
    public double findMedian() {
        if(smallNum.size() == largeNum.size())
            return (smallNum.peek() + largeNum.peek()) / 2.0;
        return smallNum.peek();
    }
}
