package Java_e_commerce.utils;

import static Java_e_commerce.utils.Utils.print;

public class AppInput {

    public static String enterString(String msg) {
        print(msg);
        return AppScanner.getScanner().nextLine();
    }

    public static int enterInt(String msg) throws AppException {
        print(msg);
        int input;
        try {
            input = Integer.parseInt(AppScanner.getScanner().nextLine());
        } catch (Exception ex) {
            throw new AppException(StringUtil.INVALID_CHOICE);
        }
        return input;
    }
}
