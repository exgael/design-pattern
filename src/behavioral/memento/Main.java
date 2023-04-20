package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());
        editor.setContent("b");
        history.push(editor.createState());
        editor.setContent("c");
        editor.restore(history.pop());
        System.out.println("restore 1 :" + editor.getContent());
        editor.restore(history.pop());
        System.out.println("restore 2 :" + editor.getContent());
    }
}
