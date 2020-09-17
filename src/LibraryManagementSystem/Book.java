package LibraryManagementSystem;

import java.util.Arrays;

public class Book {
    int[] bookId={1,2,3};
    String[] bookName = {"jvm调优指南","java编程思想","C与指针"} ;
    String[] bookAuthor= {"周志明","陈大王","王小二"};
     int[] inventory ={20,1,3};
    public void control_1(){
        System.out.println("1  "+"管理图书");
        System.out.println("2  "+"搜索图书");
        System.out.println("0  "+"退出");
        System.out.println("===============================");
        System.out.println("请输入编号操作(注意输完回车)");
    } //运行界面控制台

    public void control_2(){
        System.out.println("0--返回"+'\t'+"1--新增图书"+'\t'+"2--删除图书");
        System.out.println("===============================");
        System.out.println("请输入编号操作(注意输完回车)");
    }

    public void refer() { //查询方法
        for(int i=0;i<bookId.length;i++){
            System.out.print(bookId[i]+"  ");
            System.out.print(bookName[i]+"  ");
            System.out.print(bookAuthor[i]+"  ");
            System.out.println(inventory[i]);
        }
        System.out.println("0--返回"+'\t'+"1--新增图书"+'\t'+"2--删除图书");
        System.out.println("===============================");
        System.out.println("请输入编号操作(注意输完回车)");

    }

    public void add(int bookId,String bookName,String bookAuthor){ //增加方法
            this.bookId = Arrays.copyOf(this.bookId,this.bookId.length+1); //扩容bookId数组
            this.bookId[this.bookId.length]=bookId; //接收到的数据存入最后一个下标
            this.bookName = Arrays.copyOf(this.bookName,this.bookName.length+1);
            this.bookName[this.bookName.length] = bookName;
            this.bookAuthor = Arrays.copyOf(this.bookAuthor,this.bookAuthor.length+1);
            this.bookAuthor[this.bookAuthor.length] = bookAuthor;
         /*   this.inventory = Arrays.copyOf(this.inventory,this.inventory.length+1);
            this.inventory[this.inventory.length] =inventory[inventory.length-1]+1  ;*/

    }

    public void  delete(){ //删除方法
        bookId = Arrays.copyOf(bookId,bookId.length-1);
        bookName = Arrays.copyOf(bookName,bookName.length-1);
        bookAuthor = Arrays.copyOf(bookAuthor,bookAuthor.length-1);
    }

    public void order_1(int num){
        switch (num) {
            case 1:
                refer();
                break;
            case 2:
                break;
            default:
                System.out.println("指令错误");
        }

        } //输入命令完成操作
}

