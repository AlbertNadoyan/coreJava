package homeworks.students;

public class StudentStorage {
    private Student[] array = new Student[10];

    private int size = 0;

    void add(Student value) {
        if(size == array.length){
            Student[] tmp = new Student[array.length + 10];
            for (int i = 0; i < size; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
        array[size++] = value;
    }


    void printArray(){
        for (int i = 0; i < size; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public void deleteDyIndex(int index) {
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
        }else {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
    }

    public void printStudentsbyLessonName(String lessonName) {
        for (int i = 0; i < size; i++) {
            if(array[i].getLesson().equals(lessonName)){
                System.out.println(array[i]);
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void replaceLesson(int stIndex, String newLesson) {
        for (int i = stIndex; i < size; i++) {
            if(stIndex == i){
                array[i].setLesson(newLesson);
            }
        }
    }

    public void printStudentGender(String stGender) {
        for (int i = 0; i < size; i++) {
            if(array[i].getGender().equals(stGender)){
                System.out.println(array[i]);
            }
        }
    }
}
