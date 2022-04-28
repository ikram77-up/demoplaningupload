package org.demoplaningupload.mesage;

public class ResponseMessage {
    private String Message;

    public ResponseMessage(String message) {
         Message = message;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }
}
