// Problem Number: 56
// Problem Name: Merge Intervals
// Difficulty: Medium
// Topic: Array, Sorting, Quicksort

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Interval> res = new ArrayList<Interval>();
        if(intervals == null || intervals.size() == 0)
            return res;
        
        Collections.sort(intervals, new Comparator<Interval>(){public int compare(Interval a, Interval b){return a.start>b.start?1:(a.start==b.start?0:-1);}});
        
        int i=0;
        while(i < intervals.size()){
            int start = intervals.get(i).start;
            Interval tmp = new Interval(intervals.get(i).start, intervals.get(i).end);
            while(i+1 < intervals.size() && tmp.end >= intervals.get(i+1).start){
                tmp.end = Math.max(tmp.end, intervals.get(i+1).end);
                i++;
            }
            if(tmp.start == start)
                res.add(tmp);
    		i++;
        }
        
        return res;
    }
}