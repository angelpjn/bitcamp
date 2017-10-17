package bitcamp.java100.ch02.test14;
/* 

# 과제_5
- 사용자 정의 데이터 타입 만들기 Ⅱ

- 인풋값 

도서명, 저자, 출판사, 페이지, 가격($)
  
*/
public class Test14_2 {

    public static void main(String[] args) {

        class BookInformation {
            String title;
            String ath;
            String sto;
            int page;
            float price;
        }

        BookInformation bi;

        bi = new BookInformation();

        bi.title = "Java Basic";
        bi.ath = "강성수";
        bi.sto = "성안당";
        bi.page = 600;
        bi.price = 62.3f;

        System.out.printf("%s %s %s %d %.1f", bi.title, bi.ath, bi.sto, bi.page, bi.price);

    }
}
    