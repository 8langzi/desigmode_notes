package src.publisher.mid;

public class Message {

    private String content;

    public Message(String a){
        this.content = a;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
