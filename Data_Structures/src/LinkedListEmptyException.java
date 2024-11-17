public class LinkedListEmptyException extends Exception {
    private String reason;
    private String solution;
    private String time_;

    public LinkedListEmptyException(String msg, String reason,String solution, String time_){
        super(msg); // getMessage()-ov

        this.reason = reason;
        this.solution = solution;
        this.time_ = time_;
    }

    @Override
    public String toString() {
        String s = "-------------------------------- \nThe exception reason is : " + this.reason +  "\n" + "The solution is : " + this.solution +
                "\n" + "The time of exception is : " + this.time_ + "\n" + "---------------------------------";
        return s;
    }
}