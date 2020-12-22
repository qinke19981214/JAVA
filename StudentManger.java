package MyStudentMangerSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student1> arry=new ArrayList<>();
        while (true) {
            System.out.println("---------------------欢迎来到学生管理系统--------------------------");
            System.out.println("1添加学生");
            System.out.println("2删除学生");
            System.out.println("3修改学生");
            System.out.println("4查看所有学生");
            System.out.println("5退出");
            System.out.println("请输入你的选择");
            Scanner a = new Scanner(System.in);
            int line = a.nextInt();
            switch (line) {
                case 1:
//                    System.out.println("添加学生");
                    addStudent(arry);

                    break;

                case 2:
//                    System.out.println("删除学生");
                    deleteStudent(arry);
                    break;

                case 3:
//                    System.out.println("修改学生");
                    updateStudent(arry);
                    break;
                case 4:
//                    System.out.println("查看所有学生");
                    findStudent(arry);
                    break;

                case 5:
                    System.out.println("退出");
                    System.exit(0);


            }
        }
    }
    public static void  addStudent(ArrayList<Student1> arry){
        Scanner e=new Scanner(System.in);
        String sid;
                while(true){

        System.out.println("请输入学生学号");
         sid=e.nextLine();
         boolean f=isUse(arry,sid);        //查学号重复方法
         if(f){
             System.out.println("输入学号重复，请重新输入");
         }else{
             break;
         }}

        System.out.println("请输入学生姓名");
        String name=e.nextLine();
        System.out.println("请输入学生年龄");
        String age=e.nextLine();
        System.out.println("请输入学生居住地");
        String address=e.nextLine();
        Student1 s=new Student1();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);
        arry.add(s);
        System.out.println("添加成功");
    }
    public  static void findStudent(ArrayList<Student1> arry){
        if (arry.size()==0){
            System.out.println("没有信息，请先加入信息在查询");
//            加入return可以取代下行else,因为执行return结束方法

        }else{
        System.out.println("学号\t\t\t姓名\t\t年龄\t\t居住地");
        for (int i=0;i<arry.size();i++){
            Student1 n=arry.get(i);
            System.out.println(n.getSid() + "\t\t\t\t" + n.getName() + "\t\t" + n.getAge() + "岁\t\t" + n.getAddress());}
        }
    }
    public  static  void deleteStudent(ArrayList<Student1> arry){
        Scanner  sc=new Scanner(System.in);
        System.out.println("请输入要删除学生学号");
        String sid=sc.nextLine();
        int index=-1;
        for (int i=0;i<arry.size();i++){
            Student1 a=arry.get(i);
                    if(a.getSid().equals(sid)){
                        index=i;
                        break;
                    }}
        if(index==-1){
            System.out.println("信息不存在，请从新输入");
        }else{
            arry.remove(index);
            System.out.println("删除学生信息成功");
        }
    }
    public  static  void  updateStudent(ArrayList<Student1> arry){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要修改学生的学号");
        String sid=sc.nextLine();
        System.out.println("请输入学生新姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生新年龄");
        String age=sc.nextLine();
        System.out.println("请输入学生新居住地");
        String address=sc.nextLine();
        Student1   q=new Student1();
        q.setSid(sid);
        q.setName(name);
        q.setAge(age);
        q.setAddress(address);
        int index=-1;
        for (int i=0;i<arry.size();i++){
            Student1 recive=arry.get(i);
            if (recive.getSid().equals(sid)){
                index=i;
                break;

            }}
            if (index==-1){
                System.out.println("信息不存在，请从新输入");
            }else {
                arry.set(index,q);
                System.out.println("修改学生信息成功");
            }
        }
    public  static  boolean isUse(ArrayList<Student1> arry , String sid){
        boolean  f=false;
        for (int i=0;i<arry.size();i++){
            Student1 stu=arry.get(i);
            if(stu.getSid().equals(sid)){
                f=true;
                break;
            }
        }
        return f;
    }
}