public class LinkedListExceptions extends Exception {
    private String reason;
    private String solution;
    private String time_;
    private int start;
    private int end;
    private int index;

    public LinkedListExceptions(String msg, String reason,String solution, String time_, int start, int end, int index){
        super(msg); // getMessage()-ov

        this.reason = reason;
        this.solution = solution;
        this.time_ = time_;
        this.start = start;
        this.end = end;
        this.index = index;
    }

    @Override
    public String toString() {
        return "-------------------------------- \n" +
                "The exception reason is : " + this.reason + "\n" +
                "The solution is : " + this.solution + "\n" +
                "The time of exception is : " + this.time_ + "\n" +
                "Start index : " + this.start + "\n" +
                "End index : " + this.end + "\n" +
                "Requested index : " + this.index + "\n" +
                "---------------------------------";
    }
}