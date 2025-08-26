import Lesson_5.MyArrayDataException;
import Lesson_5.MyArraySizeException;

public class Main {

    public static void main(String[] args) {
        String[][] arr = new String[][]{{"2", "3", "4", "3"}, {"2", "3", "4", "5"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}};
        try {
            try {
                int result = method(arr);
                System.out.println(result);
            } catch (MyArraySizeException e) {
                System.out.println("Превышен размер");
            }
        } catch (MyArrayDataException e) {
            System.out.println("Неправильное значение массива");
            System.out.println("Ошибка в ячейке: " + e.i + "x" + e.j);

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Элеменит выходит за границу мвссива");
        }


    }


    public static int method(String[][] arr) throws MyArrayDataException, MyArraySizeException, ArrayIndexOutOfBoundsException {
        int count = 0;
        if (arr.length != 4) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException();
            }

            for (int j = 0; j < arr.length; j++) {
                try {
                    count = count + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                    throw new MyArrayDataException(i, j);

                }

            }
        }
        return count;
    }


}







