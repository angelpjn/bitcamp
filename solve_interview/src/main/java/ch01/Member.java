package ch01;

class Member {

    private String strOri;
    private String strCheck; 
    private char[] chArr;
    private String[] strArr;
    
    public Member() {
        this.strOri = Check.prompt("문자열 1 입력 : ");
        this.strCheck = Check.prompt("문자열 2 입력 : ");
        this.chArr = new char[strOri.length()];
        this.strArr = new String[strOri.length()];
    }

    public String getStrOri() {
        return strOri;
    }

    public void setStrOri(String strOri) {
        this.strOri = strOri;
    }

    public String getStrCheck() {
        return strCheck;
    }

    public void setStrCheck(String strCheck) {
        this.strCheck = strCheck;
    }

    public char[] getChArr() {
        return chArr;
    }

    public void setChArr(char[] chArr) {
        this.chArr = chArr;
    }

    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }
    
    
}
