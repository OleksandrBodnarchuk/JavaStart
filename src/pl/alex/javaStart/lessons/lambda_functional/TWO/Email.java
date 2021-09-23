package pl.alex.javaStart.lessons.lambda_functional.TWO;

class Email {
    private String sender;
    private String recipient;
    private String title;
    private String content;
    private boolean sent;

    public Email(String sender, String recipient, String title, String content, boolean sent) {
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
        this.content = content;
        this.sent = sent;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isSent() {
        return sent;
    }

    public void setSent(boolean sent) {
        this.sent = sent;
    }

    @Override
    public String toString() {
        return "Email{" +
                "sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", sent=" + sent +
                '}';
    }
}