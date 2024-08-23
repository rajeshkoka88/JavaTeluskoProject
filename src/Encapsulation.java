class Book
{
    private int pageNum;

    // setter
    void setPageNum(int pgNo){

        if(pgNo >= 0) {
            pageNum = pgNo;
        } else {
            System.out.println("please enter a whole number");
        }
    }

    // getter
    int getPageNum(){
        return pageNum;
    }

    void display(){
        System.out.println("Java and Inheritance is present in page number " + pageNum);
    }
}

public class Encapsulation {
    public static void main(String[] args){
        Book book = new Book();
//        book.pageNum = 4;
        book.setPageNum(4);
        System.out.println(book.getPageNum());
//        System.out.println(book.pageNum);
        book.display();
    }
}
