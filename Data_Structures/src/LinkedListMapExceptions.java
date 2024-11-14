public class LinkedListMapExceptions {

    public static class KeyNotFoundException extends RuntimeException {
        public KeyNotFoundException(int key) {
            super("Error: The key '" + key + "' does not exist in the LinkedListMap.");
        }
    }
}