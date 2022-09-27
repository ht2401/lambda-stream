package homework.homework5.lambda_stream.stream;

import java.util.ArrayList;

public class listStudent {
    public static void main(String[] args) {
        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student("thang", 12, 8, 8));
        studentArrayList.add(new Student("hiep", 23, 5, 4));
        studentArrayList.add(new Student("nam", 18, 8, 6));
        studentArrayList.add(new Student("oanh", 23, 9, 9));
        studentArrayList.add(new Student("cong", 27, 3, 3));
        studentArrayList.add(new Student("duc", 35, 7, 5));
        studentArrayList.add(new Student("phu", 14, 4, 8));
        studentArrayList.add(new Student("hanh", 25, 6, 8));

        System.out.println("danh sach sinh vien có diem trung binh thap hon 5 :");
        studentArrayList.stream()
                .filter(st -> (st.getMathScore() + st.getHistoryScore()) / 2 < 5)
                .forEach(st -> System.out.println(st));

        System.out.println("danh sach sinh vien có diem toan lon hon 5 và diem lich su be thua 7 :");
        studentArrayList.stream()
                .filter(st -> st.getMathScore() > 5)
                .filter(st -> st.getHistoryScore() < 7)
                .forEach(st -> System.out.println(st));

        System.out.println("danh sach sinh vien bo qua 2 dau va 2 cuoi :");
        studentArrayList.stream()
                .skip(2)
                .limit(4)
                .forEach(st -> System.out.println(st));

        System.out.println("danh sach sinh bo qua 2 dau 2 cuoi va tuoi lon hon 20 be thua 25 : ");
        studentArrayList.stream()
                .skip(2)
                .limit(4)
                .filter(st -> st.getAge() > 20)
                .filter(st -> st.getAge() < 25)
                .forEach(st -> System.out.println(st));
    }

}
