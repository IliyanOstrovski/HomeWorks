package com.company.Homework9;

public class Task3 {
    public void main(String[] args) {
        Range r1 = new Range(5, 3);
        Range r2 = new Range(2, 5);
        r1.merge(r2);
        System.out.println(r1);
    }

    public static class Range {
        private int start;
        private int end;

        public Range(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean contains(int n) {
            return n >= start && n <= end;
        }

        public boolean overlaps(Range r) {
            if (r == null) {
                return false;
            }
            return this.contains(r.start)
                    || this.contains(r.end)
                    || r.contains(this.start)
                    || r.contains(this.end);
        }

        public boolean merge(Range r) {
            if (r == null) {
                return false;
            }
            if (this.overlaps(r)) {
                this.start = Math.min(this.start, r.start);
                this.end = Math.max(this.end, r.end);
                return true;
            }
            return false;
        }

        @Override
        public String toString() {
            return "[" + start + ", " + end + "]";
        }
    }

}
