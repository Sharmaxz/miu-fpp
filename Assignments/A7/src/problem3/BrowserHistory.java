package problem3;

public class BrowserHistory {
    private LinkedListStack backStack;
    private LinkedListStack forwardStack;

    private String currentUrl;

    public BrowserHistory(String url) {
        backStack = new LinkedListStack();
        forwardStack = new LinkedListStack();
        currentUrl = url;
    }

    public void visit(String url) {
        if (url == null || url.isEmpty()) return;

        backStack.push(currentUrl);

        currentUrl = url;
        forwardStack.clear();

        System.out.println("Visited: " + currentUrl);
    }

    // Go back to the previous page
    public void back() {
        // If there is no back history
        if (backStack.isEmpty()) {
            System.out.println("No history to go back to.");
            return;
        }

        // Save current page in forward history
        forwardStack.push(currentUrl);

        // Get previous page from back stack
        currentUrl = backStack.pop();

        System.out.println("Back to: " + currentUrl);
    }

    // Go forward to the next page
    public void forward() {
        // If there is no forward history
        if (forwardStack.isEmpty()) {
            System.out.println("No forward history.");
            return;
        }

        // Save current page in back history
        backStack.push(currentUrl);

        // Get next page from forward stack
        currentUrl = forwardStack.pop();

        System.out.println("Forward to: " + currentUrl);
    }
}