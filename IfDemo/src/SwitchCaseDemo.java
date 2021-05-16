public class SwitchCaseDemo {
    public static void main(String[] args) {
        char grade='D';
        switch (grade){
            case 'A':
                System.out.println("First");
                break;
            case 'B':
                System.out.println("Second");
                break;
            case 'C':
                System.out.println("Third");
                break;
            default:
                System.out.println("Next time see you...");
                break;
        }
    }
}
