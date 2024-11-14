public class BSTExceptions {

    public static class NodeNotFoundException extends RuntimeException {
        public NodeNotFoundException(String message) {
            super(message);
        }
    }

    public static class DuplicateNodeException extends RuntimeException {
        public DuplicateNodeException(String message) {
            super(message);
        }
    }

    public static class EmptyTreeException extends RuntimeException {
        public EmptyTreeException(String message) {
            super(message);
        }
    }
}