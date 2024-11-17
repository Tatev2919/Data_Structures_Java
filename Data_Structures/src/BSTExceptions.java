public class BSTExceptions extends Exception {
    private String reason;
    private String solution;
    private String time_;

    /*public static class EmptyLinkedListException extends RuntimeException {
        public EmptyLinkedListException(String message) {
            super(message);
        }
    } */

    public BSTExceptions(String msg, String reason,String solution, String time_){
        super(msg); // getMessage()-ov

        this.reason = reason;
        this.solution = solution;
        this.time_ = time_;
    }

    @Override
    public String toString() {
        String s = "The exception reason is : " + this.reason +  "\n" + "The solution is : " + this.solution + "\n" + "The time of exception is : " + this.time_ ;
        return s;
    }
}