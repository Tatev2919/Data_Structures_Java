public class LinkedListExceptions {
    public static class EmptyLinkedListException extends RuntimeException {
        public EmptyLinkedListException(String message) {
            super(message);
        }
    }
}