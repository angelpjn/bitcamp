package java100.app.domain;

public class UploadFile {
    int no;
    String picturename;
    int bookNo;
    
    public UploadFile() {}
    
    public UploadFile(String picturename) {
        this(0, picturename);
    }

    public UploadFile(int no, String picturename) {
        this.no = no;
        this.picturename = picturename;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getPicturename() {
        return picturename;
    }

    public void setPicturename(String picturename) {
        this.picturename = picturename;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }
    
    
}
